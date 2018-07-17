package com.example.gyc.mvpdemo.net;

import android.content.Context;

import com.example.gyc.mvpdemo.db.DBManager;
import com.example.gyc.mvpdemo.utils.Constant;
import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import com.franmontiel.persistentcookiejar.cache.SetCookieCache;
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * 网络访问管理类
 */

public class ApiManager {
    private static ApiManager instance;
    private static String defaultUrl = "";
    private static OkHttpClient okHttpClient;

    private ApiManager(Context context, String defaultUrl) {
        this.defaultUrl = defaultUrl;
        PersistentCookieJar cookieJar = new PersistentCookieJar(new SetCookieCache(), new SharedPrefsCookiePersistor(context.getApplicationContext()));
        // init okhttp 3 logger
        HttpLoggingInterceptor logInterceptor = new HttpLoggingInterceptor();
        logInterceptor.setLevel(HttpLoggingInterceptor.Level.NONE);
        // init cache
        File cacheFile = new File(context.getApplicationContext().getCacheDir(), "cache");
        Cache cache = new Cache(cacheFile, 1024 * 1024 * 100); //100Mb
        okHttpClient = new OkHttpClient.Builder()
                .retryOnConnectionFailure(true)
                .connectTimeout(15, TimeUnit.SECONDS)
                .readTimeout(45, TimeUnit.SECONDS)
                .writeTimeout(55, TimeUnit.SECONDS)
                .addInterceptor(logInterceptor)
                .cookieJar(cookieJar)
                .cache(cache)
                .build();
        ApiClient.create(defaultUrl, okHttpClient);
    }

    /**
     * 根据网络访问路径新增Apiservice
     * @param newUrl url地址
     */
    public static void addUrl(String newUrl){
        ApiClient.create(newUrl, okHttpClient);
    }

    /**
     * 初始化网络访问管理类
     *
     * @param context 上下文
     */
    public static void init(Context context, String defaultUrl) {
        if (instance == null) {
            synchronized (DBManager.class) {
                if (instance == null) {
                    instance = new ApiManager(context, defaultUrl);
                }
            }
        }
    }

    /**
     * 根据url地址获取ApiService
     *
     * @return
     */
    public static ApiService get() {
        return ApiClient.get(defaultUrl).create(ApiService.class);
    }

}
