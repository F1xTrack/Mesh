package p000;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: n5 */
/* loaded from: classes.dex */
public abstract class AbstractC6467n5 {

    /* renamed from: a */
    public static final LinearInterpolator f38090a = new LinearInterpolator();

    /* renamed from: b */
    public static final C0092BS f38091b = new C0092BS(1);

    /* renamed from: c */
    public static final C0092BS f38092c = new C0092BS(0);

    /* renamed from: d */
    public static final C0092BS f38093d = new C0092BS(C0092BS.f822e);

    /* renamed from: e */
    public static final DecelerateInterpolator f38094e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m23073a(float f, float f2, float f3) {
        return AbstractC1374Vq.m8585d(f2, f, f3, f);
    }

    /* renamed from: b */
    public static float m23074b(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : m23073a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: c */
    public static int m23075c(int i, float f, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }
}
