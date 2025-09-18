package p000;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: vL1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11406vL1 {

    /* renamed from: a */
    public static final C9606hH1 f44343a = new C9606hH1(3);

    /* renamed from: a */
    public static final float m25402a(float f) {
        return f / XZ1.m9088d().density;
    }

    /* renamed from: b */
    public static final float m25403b(float f) {
        return TypedValue.applyDimension(1, f, XZ1.m9088d());
    }

    /* renamed from: c */
    public static final float m25404c(float f, float f2) {
        DisplayMetrics displayMetricsM9088d = XZ1.m9088d();
        float fApplyDimension = TypedValue.applyDimension(2, f, displayMetricsM9088d);
        return f2 >= 1.0f ? Math.min(fApplyDimension, f * displayMetricsM9088d.density * f2) : fApplyDimension;
    }
}
