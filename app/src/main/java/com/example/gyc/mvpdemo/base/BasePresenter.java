package com.example.gyc.mvpdemo.base;


import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;


/**
 * Created by gaoyucong on 2018-06-04.
 */

public abstract class BasePresenter<V extends BaseView, M extends BaseModel> {
    private Reference<V> mViewRef;
    private M mModel;
    private CompositeDisposable mCompositeDisposable;

    public BasePresenter() {
        if (initModel() != null) {
            mModel = initModel();
        }
    }

    protected abstract M initModel();

    public void attachView(V view) {
        mViewRef = new WeakReference<V>(view);
    }

    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }

    protected V getView() {
        return mViewRef.get();
    }

    protected M getModel() {
        return mModel;
    }

    public boolean isViewAttach() {
        return mViewRef != null && mViewRef.get() != null;
    }

    protected void addSubscribe(Disposable disposable) {
        if (mCompositeDisposable == null) {
            mCompositeDisposable = new CompositeDisposable();
        }
        mCompositeDisposable.add(disposable);
    }

    protected void unSubscribe() {
        if (mCompositeDisposable != null) {
            mCompositeDisposable.dispose();
            mCompositeDisposable = null;
        }
    }
}
