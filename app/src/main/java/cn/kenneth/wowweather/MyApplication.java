package cn.kenneth.wowweather;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by Kenneth on 2016/2/22.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext(), Constants.BUGLY_APP_ID, false);
    }
}
