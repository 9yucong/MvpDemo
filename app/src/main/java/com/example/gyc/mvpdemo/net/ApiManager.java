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
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 网络访问管理类
 */

public class ApiManager {
    public static final String BASE_URL = "https://github.com";
    private static ApiManager instance;
    private PersistentCookieJar mCookieJar;
    private Retrofit mApiRetrofit;

    private ApiManager(Context context) {
        mCookieJar = new PersistentCookieJar(new SetCookieCache(), new SharedPrefsCookiePersistor(context.getApplicationContext()));
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
                .cookieJar(mCookieJar)
                .cache(cache)
                .build();
        mApiRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    public static void init(Context context) {
        if (instance == null) {
            synchronized (DBManager.class) {
                if (instance == null) {
                    instance = new ApiManager(context);
                }
            }
        }
    }

    public static ApiManager getInstance() {
        if (instance == null) {
            throw new RuntimeException("please init ApiManager first");
        }
        return instance;
    }

    public Retrofit getRetrofit() {
        return mApiRetrofit;
    }

}
