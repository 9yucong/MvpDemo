package com.example.gyc.mvpdemo.base;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by gaoyucong on 2018-06-04.
 */

public abstract class BasePresenter<V extends BaseView, M extends BaseModel> {
    private Reference<V> mViewRef;
    private M mModel;
    private CompositeSubscription mSubscription;

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

    protected void addSubscribe(Subscription subscription) {
        if (mSubscription == null) {
            mSubscription = new CompositeSubscription();
        }
        mSubscription.add(subscription);
    }

    protected void unSubscribe() {
        if (mSubscription != null && mSubscription.hasSubscriptions()) {
            mSubscription.clear();
        }
    }
}
