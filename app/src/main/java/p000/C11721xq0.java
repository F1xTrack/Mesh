package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* renamed from: xq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11721xq0 {

    /* renamed from: e */
    public static final int f45845e;

    /* renamed from: a */
    public final Context f45846a;

    /* renamed from: b */
    public final ActivityManager f45847b;

    /* renamed from: c */
    public final C8342Tu0 f45848c;

    /* renamed from: d */
    public final float f45849d;

    static {
        f45845e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public C11721xq0(Context context) {
        this.f45849d = f45845e;
        this.f45846a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f45847b = activityManager;
        this.f45848c = new C8342Tu0(20, context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.f45849d = 0.0f;
    }
}
