package com.example.manochrichard.memoryleak;

import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * Created by Manoch Richard on 25-Nov-17.
 */

public class ExampleApplication extends Application {
    private RefWatcher refWatcher;
    //not working

    public static RefWatcher getRefwatcher(Context context) {
        ExampleApplication exampleApplication = (ExampleApplication) context.getApplicationContext();
        return exampleApplication.refWatcher;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        refWatcher = LeakCanary.install(this);
    }
}
