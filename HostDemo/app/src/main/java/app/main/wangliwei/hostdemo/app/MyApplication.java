package app.main.wangliwei.hostdemo.app;


import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.util.Log;

import com.didi.virtualapk.PluginManager;

import java.io.File;

public class MyApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        PluginManager.getInstance(base).init();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        PluginManager pluginManager = PluginManager.getInstance(this);
        File apk = new File(Environment.getExternalStorageDirectory(),"PluginDemo.apk");
        if(apk.exists()) {
            try {
                pluginManager.loadPlugin(apk);
                Log.d("MyApplication","load plugin");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
