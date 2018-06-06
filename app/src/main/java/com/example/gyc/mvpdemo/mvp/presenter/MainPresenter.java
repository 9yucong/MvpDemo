package com.example.gyc.mvpdemo.mvp.presenter;

import android.util.Log;

import com.example.gyc.mvpdemo.bean.Post;
import com.example.gyc.mvpdemo.mvp.contract.MainContract;
import com.example.gyc.mvpdemo.mvp.model.MainModel;
import com.example.gyc.mvpdemo.net.ApiManager;
import com.example.gyc.mvpdemo.utils.RxSchedulers;

import java.util.List;

import io.reactivex.functions.Consumer;


/**
 * Created by gaoyucong on 2018-06-04.
 */

public class MainPresenter extends MainContract.Presenter {

    @Override
    protected MainContract.Model initModel() {
        return new MainModel();
    }

    @Override
    public void getPosts() {
        addSubscribe(ApiManager.get()
                .getPosts()
                .compose(RxSchedulers.<List<Post>>ioMain())
                .subscribe(new Consumer<List<Post>>() {
                    @Override
                    public void accept(List<Post> posts) throws Exception {
                        Log.d("1111", "accept: " + posts.size());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Log.d("1111", "accept: " + throwable);
                    }
                }));
    }
}
