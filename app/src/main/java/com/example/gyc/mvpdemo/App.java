package com.example.gyc.mvpdemo;

import android.app.Application;

import com.example.gyc.mvpdemo.db.DBManager;
import com.example.gyc.mvpdemo.net.ApiManager;
import com.example.gyc.mvpdemo.utils.Constant;

/**
 * Created by gaoyucong on 2018-06-05.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ApiManager.init(this, Constant.CWBETA_URL);
        DBManager.init(this);
    }
}
