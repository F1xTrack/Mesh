package defpackage;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: vL1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7586vL1 {
    public static final C4125hH1 a = new C4125hH1(3);

    public static final float a(float f) {
        return f / XZ1.d().density;
    }

    public static final float b(float f) {
        return TypedValue.applyDimension(1, f, XZ1.d());
    }

    public static final float c(float f, float f2) {
        DisplayMetrics displayMetricsD = XZ1.d();
        float fApplyDimension = TypedValue.applyDimension(2, f, displayMetricsD);
        return f2 >= 1.0f ? Math.min(fApplyDimension, f * displayMetricsD.density * f2) : fApplyDimension;
    }
}
