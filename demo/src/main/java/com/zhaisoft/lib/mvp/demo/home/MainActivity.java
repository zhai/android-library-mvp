package com.zhaisoft.lib.mvp.demo.home;

import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.zhaisoft.lib.mvp.demo.R;
import com.zhaisoft.lib.mvp.util.ThreadsManager;

 import java.util.concurrent.TimeUnit;


import static com.google.common.base.Preconditions.checkNotNull;


/**
 * @author zhai
 */
public class MainActivity extends AppCompatActivity implements MainContract.View {

    //1. 定义 Presenter

    MainContract.Presenter mPresenter;

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainPresenter(this);

        mPresenter.init();
        mPresenter.getNetworkData();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mPresenter.finish();
            }
        },5000);






    }


    @Override
    public void setTitle(String title) {
        ((TextView) findViewById(R.id.tv)).setText(title);
    }


    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        mPresenter = checkNotNull(presenter);
    }
}
