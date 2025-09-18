package com.facebook.react.bridge;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class UiThreadUtil {
    private static volatile Handler sMainHandler;

    public static void assertNotOnUiThread() {
    }

    public static void assertOnUiThread() {
    }

    public static Handler getUiThreadHandler() {
        if (sMainHandler == null) {
            synchronized (UiThreadUtil.class) {
                try {
                    if (sMainHandler == null) {
                        sMainHandler = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return sMainHandler;
    }

    public static boolean isOnUiThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void removeOnUiThread(Runnable runnable) {
        getUiThreadHandler().removeCallbacks(runnable);
    }

    public static boolean runOnUiThread(Runnable runnable) {
        return getUiThreadHandler().postDelayed(runnable, 0L);
    }

    public static boolean runOnUiThread(Runnable runnable, long j) {
        return getUiThreadHandler().postDelayed(runnable, j);
    }
}
