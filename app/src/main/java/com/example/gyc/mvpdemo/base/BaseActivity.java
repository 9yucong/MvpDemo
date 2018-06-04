package com.example.gyc.mvpdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by gaoyucong on 2018-06-04.
 */

public abstract class BaseActivity<V extends BaseView, M extends BaseModel, P extends BasePresenter> extends AppCompatActivity {
    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (onCreatePresenter() != null) {
            mPresenter = onCreatePresenter();
            mPresenter.attachView((V) this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (onCreatePresenter() != null) {
            mPresenter.unSubscribe();
            mPresenter.detachView();
        }
    }

    protected abstract P onCreatePresenter();
}
