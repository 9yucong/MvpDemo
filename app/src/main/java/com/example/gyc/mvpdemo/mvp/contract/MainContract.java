package com.example.gyc.mvpdemo.mvp.contract;

import com.example.gyc.mvpdemo.base.BaseModel;
import com.example.gyc.mvpdemo.base.BasePresenter;
import com.example.gyc.mvpdemo.base.BaseView;

/**
 * Created by gaoyucong on 2018-06-04.
 */

public interface MainContract {
    interface View extends BaseView {

    }

    interface Model extends BaseModel {
    }

    abstract class Presenter extends BasePresenter<View, Model> {
        public abstract void getPosts();
    }
}
