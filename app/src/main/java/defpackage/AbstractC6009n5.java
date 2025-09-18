package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: n5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6009n5 {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final BS b = new BS(1);
    public static final BS c = new BS(0);
    public static final BS d = new BS(BS.e);
    public static final DecelerateInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return AbstractC1705Vq.d(f2, f, f3, f);
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int c(int i, float f, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }
}
