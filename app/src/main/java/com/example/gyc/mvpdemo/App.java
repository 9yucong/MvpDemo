package com.example.gyc.mvpdemo;

import android.app.Application;

import com.example.gyc.mvpdemo.db.DBManager;
import com.example.gyc.mvpdemo.net.ApiManager;

/**
 * Created by gaoyucong on 2018-06-05.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ApiManager.init(this);
        DBManager.init(this);
    }
}
