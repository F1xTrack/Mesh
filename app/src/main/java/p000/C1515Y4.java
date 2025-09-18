package p000;

import android.animation.TimeInterpolator;

/* renamed from: Y4 */
/* loaded from: classes.dex */
public final class C1515Y4 implements TimeInterpolator {

    /* renamed from: a */
    public int[] f14137a;

    /* renamed from: b */
    public int f14138b;

    /* renamed from: c */
    public int f14139c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i = (int) ((f * this.f14139c) + 0.5f);
        int i2 = this.f14138b;
        int[] iArr = this.f14137a;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = iArr[i3];
            if (i < i4) {
                break;
            }
            i -= i4;
            i3++;
        }
        return (i3 / i2) + (i3 < i2 ? i / this.f14139c : 0.0f);
    }
}
