package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* renamed from: xq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8058xq0 {
    public static final int e;
    public final Context a;
    public final ActivityManager b;
    public final C1562Tu0 c;
    public final float d;

    static {
        e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public C8058xq0(Context context) {
        this.d = e;
        this.a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        this.c = new C1562Tu0(20, context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.d = 0.0f;
    }
}
