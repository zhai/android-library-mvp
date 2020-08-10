package com.zhaisoft.lib.mvp.util;


import com.zhaisoft.lib.mvp.base.BaseMultiDexApplication;

public class DataUtil {
    public static void saveKey(String key, String value) {
        SharedPreferencesUtil.setString(SharedPreferencesUtil.getDefaultSharedPreferences(BaseMultiDexApplication.getInstance().getApplicationContext()), key, value);
    }

    public static String getKey(String key) {
        return SharedPreferencesUtil.getDefaultSharedPreferencesString(BaseMultiDexApplication.getInstance().getApplicationContext(), key);
    }

}
