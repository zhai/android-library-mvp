package com.zhaisoft.lib.mvp.demo.home;

import com.zhaisoft.lib.mvp.BasePresenter;
import com.zhaisoft.lib.mvp.BaseView;

public class MainContract {

    /**
     * 定义跟View相关的操作
     */
    interface View extends BaseView<Presenter> {

        void setTitle(String title);
    }

    /**
     * 定义后台任务
     */
    interface Presenter extends BasePresenter {

        void init();

        void getNetworkData();

        void finish();
    }

}