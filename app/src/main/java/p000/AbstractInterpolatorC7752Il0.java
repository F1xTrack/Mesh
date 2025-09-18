package p000;

import android.view.animation.Interpolator;

/* renamed from: Il0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC7752Il0 implements Interpolator {

    /* renamed from: a */
    public final float[] f5127a;

    /* renamed from: b */
    public final float f5128b;

    public AbstractInterpolatorC7752Il0(float[] fArr) {
        this.f5127a = fArr;
        this.f5128b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f5127a;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f5128b;
        float f3 = (f - (iMin * f2)) / f2;
        float f4 = fArr[iMin];
        return AbstractC1374Vq.m8585d(fArr[iMin + 1], f4, f3, f4);
    }
}
