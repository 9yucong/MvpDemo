package com.example.gyc.mvpdemo.net;

import android.content.Context;

import com.example.gyc.mvpdemo.db.DBManager;
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
    private static final String BASE_URL = "http://cwbeta.risinfo.cn/wp-json/";
    private static ApiManager instance;

    private ApiManager(Context context) {
        PersistentCookieJar cookieJar = new PersistentCookieJar(new SetCookieCache(), new SharedPrefsCookiePersistor(context.getApplicationContext()));
        // init okhttp 3 logger
        HttpLoggingInterceptor logInterceptor = new HttpLoggingInterceptor();
        logInterceptor.setLevel(HttpLoggingInterceptor.Level.NONE);
        // init cache
        File cacheFile = new File(context.getApplicationContext().getCacheDir(), "cache");
        Cache cache = new Cache(cacheFile, 1024 * 1024 * 100); //100Mb
        OkHttpClient client = new OkHttpClient.Builder()
                .retryOnConnectionFailure(true)
                .connectTimeout(15, TimeUnit.SECONDS)
                .readTimeout(45, TimeUnit.SECONDS)
                .writeTimeout(55, TimeUnit.SECONDS)
                .addInterceptor(logInterceptor)
                .cookieJar(cookieJar)
                .cache(cache)
                .build();
        ApiClient.create(BASE_URL, client);
    }

    /**
     * 初始化网络访问管理类
     *
     * @param context 上下文
     */
    public static void init(Context context) {
        if (instance == null) {
            synchronized (DBManager.class) {
                if (instance == null) {
                    instance = new ApiManager(context);
                }
            }
        }
    }

    /**
     * 根据retrofit获取ApiService
     *
     * @return
     */
    public static ApiService get() {
        return ApiClient.get(BASE_URL).create(ApiService.class);
    }

}
