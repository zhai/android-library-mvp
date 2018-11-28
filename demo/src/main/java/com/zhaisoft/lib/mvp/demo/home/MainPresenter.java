package com.zhaisoft.lib.mvp.demo.home;

import android.os.SystemClock;
import android.support.annotation.NonNull;

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

        init();

        getNetworkData();
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

        ThreadsManager.post(new Runnable() {
            @Override
            public void run() {
                mMainView.setTitle("正在加载网络，预计需要5秒钟");
                SystemClock.sleep(5000);
                finish();
            }
        });


    }

    @Override
    public void finish() {
        mMainView.setTitle("finish");
    }
}
