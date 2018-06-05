package com.example.gyc.mvpdemo.db;

import android.content.Context;

import com.example.gyc.mvpdemo.greendaodemo.db.DaoMaster;
import com.example.gyc.mvpdemo.greendaodemo.db.DaoSession;

/**
 * 数据库管理类
 */

public class DBManager {
    //数据库名字
    private static final String DB_NAME = "gyc.db";
    private Context mContext;
    private DaoMaster mDaoMaster;
    private static DaoSession mDaoSession;


    private DBManager(Context context) {
        mContext = context;
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(mContext, DB_NAME);
        mDaoMaster = new DaoMaster(helper.getWritableDb());
        mDaoSession = mDaoMaster.newSession();
    }

    private static volatile DBManager instance = null;


    public static void init(Context context) {
        if (instance == null) {
            synchronized (DBManager.class) {
                if (instance == null) {
                    instance = new DBManager(context);
                }
            }
        }
    }


    public DaoSession getDaoSession() {
        if (instance == null) {
            throw new RuntimeException("please init DBManager first");
        }
        return mDaoSession;
    }

}
