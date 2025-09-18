package com.p019vk.push.core.remote.config.omicron.util;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public class UiThread {

    /* renamed from: a */
    public static final Handler f20577a = new Handler(Looper.getMainLooper());

    public static boolean isUi() {
        return Looper.myLooper() == f20577a.getLooper();
    }

    public static void runOnUi(Runnable runnable) {
        if (isUi()) {
            runnable.run();
        } else {
            f20577a.post(runnable);
        }
    }
}
