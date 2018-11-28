package com.zhaisoft.lib.mvp.demo.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.zhaisoft.lib.mvp.demo.R;

import static com.google.common.base.Preconditions.checkNotNull;


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
