package com.huawei.hms.adapter.sysobs;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.log.HMSLog;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ApkResolutionFailedManager {

    /* renamed from: c */
    private static final ApkResolutionFailedManager f18763c = new ApkResolutionFailedManager();

    /* renamed from: a */
    private final Handler f18764a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final Map<String, Runnable> f18765b = new HashMap(2);

    private ApkResolutionFailedManager() {
    }

    public static ApkResolutionFailedManager getInstance() {
        return f18763c;
    }

    public void postTask(String str, Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HMSLog.m12620e("ApkResolutionFailedManager", "postTask is not in main thread");
        } else {
            this.f18765b.put(str, runnable);
            this.f18764a.postDelayed(runnable, 2000L);
        }
    }

    public void removeTask(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HMSLog.m12620e("ApkResolutionFailedManager", "removeTask is not in main thread");
            return;
        }
        Runnable runnableRemove = this.f18765b.remove(str);
        if (runnableRemove == null) {
            HMSLog.m12620e("ApkResolutionFailedManager", "cancel runnable is null");
        } else {
            this.f18764a.removeCallbacks(runnableRemove);
        }
    }

    public void removeValueOnly(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HMSLog.m12620e("ApkResolutionFailedManager", "removeValueOnly is not in main thread");
        } else {
            this.f18765b.remove(str);
        }
    }
}
