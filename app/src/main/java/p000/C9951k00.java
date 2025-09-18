package p000;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: k00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9951k00 {

    /* renamed from: a */
    public final Runtime f35478a = Runtime.getRuntime();

    /* renamed from: b */
    public final ActivityManager f35479b;

    /* renamed from: c */
    public final ActivityManager.MemoryInfo f35480c;

    static {
        C6989v4.m25319d();
    }

    public C9951k00(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f35479b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f35480c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
