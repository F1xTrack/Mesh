package com.vk.push.core.remote.config.omicron.util;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public class UiThread {
    public static final Handler a = new Handler(Looper.getMainLooper());

    public static boolean isUi() {
        return Looper.myLooper() == a.getLooper();
    }

    public static void runOnUi(Runnable runnable) {
        if (isUi()) {
            runnable.run();
        } else {
            a.post(runnable);
        }
    }
}
