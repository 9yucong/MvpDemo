package com.example.gyc.mvpdemo.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by gaoyucong on 2018-06-04.
 */

public abstract class BaseFragement<V extends BaseView, M extends BaseModel, P extends BasePresenter<V, M>> extends Fragment {
    protected P mPresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        initView(view, savedInstanceState);
        initEvent();
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (onCreatePresenter() != null) {
            mPresenter = onCreatePresenter();
            mPresenter.attachView((V) this);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (mPresenter != null) {
            mPresenter.unSubscribe();
        }
    }


    protected abstract P onCreatePresenter();

    protected abstract void initView(View view, Bundle bundle);

    protected abstract void initEvent();

    protected abstract int getLayoutId();

}
