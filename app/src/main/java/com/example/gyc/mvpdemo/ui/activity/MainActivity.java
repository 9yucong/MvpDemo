package com.example.gyc.mvpdemo.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.gyc.mvpdemo.R;
import com.example.gyc.mvpdemo.base.BaseActivity;
import com.example.gyc.mvpdemo.db.DBManager;
import com.example.gyc.mvpdemo.mvp.contract.MainContract;
import com.example.gyc.mvpdemo.mvp.model.MainModel;
import com.example.gyc.mvpdemo.mvp.presenter.MainPresenter;
import com.example.gyc.mvpdemo.net.ApiManager;

/**
 * Created by gaoyucong on 2018-06-05.
 */

public class MainActivity extends BaseActivity<MainModel, MainContract.View, MainPresenter> implements MainContract.View {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApiManager.getInstance();

    }

    @Override
    protected MainPresenter onCreatePresenter() {
        return new MainPresenter();
    }
}
