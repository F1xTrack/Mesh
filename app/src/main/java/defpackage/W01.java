package defpackage;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class W01 implements Interpolator {
    public final float a;

    public W01(float f) {
        this.a = f;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) ((Math.sin((((f - (r5 / 4.0f)) * 3.141592653589793d) * 2.0d) / this.a) * Math.pow(2.0d, (-10.0f) * f)) + 1.0d);
    }
}
