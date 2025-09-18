package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: k00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5418k00 {
    public final Runtime a = Runtime.getRuntime();
    public final ActivityManager b;
    public final ActivityManager.MemoryInfo c;

    static {
        C7533v4.d();
    }

    public C5418k00(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
