package com.example.gyc.mvpdemo.mvp.presenter;

import com.example.gyc.mvpdemo.base.BaseModel;
import com.example.gyc.mvpdemo.mvp.contract.MainContract;
import com.example.gyc.mvpdemo.mvp.model.MainModel;


/**
 * Created by gaoyucong on 2018-06-04.
 */

public class MainPresenter extends MainContract.Presenter {

    @Override
    protected BaseModel initModel() {
        return new MainModel();
    }
}
