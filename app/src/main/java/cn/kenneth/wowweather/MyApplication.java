package cn.kenneth.wowweather;

import android.app.Application;
import android.content.Context;

import com.joanzapata.iconify.Iconify;
import com.joanzapata.iconify.fonts.WeathericonsModule;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;
import com.tencent.bugly.crashreport.CrashReport;

/**
 * Application
 * Created by Kenneth on 2016/2/22.
 */
public class MyApplication extends Application {

    private RefWatcher watcher;

    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext(), Constants.BUGLY_APP_ID, false);
        Iconify.with(new WeathericonsModule());
        watcher = LeakCanary.install(this);
    }

    public static RefWatcher getRefWatcher(Context context) {
        MyApplication application = (MyApplication) context.getApplicationContext();
        return application.watcher;
    }
}
