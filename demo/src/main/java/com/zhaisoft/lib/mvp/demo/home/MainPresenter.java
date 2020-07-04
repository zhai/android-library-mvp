package com.zhaisoft.lib.mvp.demo.home;

import android.os.SystemClock;

import androidx.annotation.NonNull;

import com.zhaisoft.lib.mvp.demo.BuildConfig;
import com.zhaisoft.lib.mvp.util.ThreadsManager;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author zhai
 */
public class MainPresenter implements MainContract.Presenter {


    @NonNull
    private final MainContract.View mMainView;


    public MainPresenter(
            @NonNull MainContract.View _view) {
        mMainView = checkNotNull(_view);
        mMainView.setPresenter(this);


    }


    @Override
    public void start() {


    }

    @Override
    public void init() {

        mMainView.setTitle("init");

    }

    @Override
    public void getNetworkData() {


        mMainView.setTitle("正在加载网络，预计需要5秒钟");


    }

    @Override
    public void finish() {
        mMainView.setTitle("finish");

        mMainView.setTitle(BuildConfig.VERSION_NAME);
    }
}
