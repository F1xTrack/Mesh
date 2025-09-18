package com.huawei.hms.rn.push.utils;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.ReactApplicationContext;

/* loaded from: classes.dex */
public class ActivityUtils {
    private ActivityUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static Context getRealActivity(Activity activity, ReactApplicationContext reactApplicationContext) {
        return activity != null ? activity : reactApplicationContext;
    }
}
