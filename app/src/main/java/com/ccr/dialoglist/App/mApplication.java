package com.ccr.dialoglist.App;

import android.app.Application;

import com.ccr.dialoglist.util.ToastUtils;


/**
 * 在此写用途
 *
 * @Author: Acheng
 * @Email: 345887272@qq.com
 * @Date: 2017-04-12 11:02
 * @Version: V1.0 <描述当前版本功能>
 */

public class mApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initConfig();
    }
    //初始化配置
    private void initConfig(){
        ToastUtils.init(getApplicationContext());
    }
}
