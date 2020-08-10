package com.zhaisoft.lib.mvp.base;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;

import androidx.multidex.MultiDexApplication;


public class BaseMultiDexApplication extends MultiDexApplication {
    private static BaseMultiDexApplication instance2;
    private static Handler mHandler;
    private static String apiKey = "";

    public static BaseMultiDexApplication getInstance() {
        return instance2;
    }

    public static void init(Context applicationContext, String apiKey) {


    }


    @Override
    public void onCreate() {
        super.onCreate();
        instance2 = this;
    }

    //得到包名

    private static synchronized String getPackageName(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(
                    context.getPackageName(), 0);
            return packageInfo.packageName;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
