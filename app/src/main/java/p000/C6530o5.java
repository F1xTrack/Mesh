package p000;

import android.animation.TypeEvaluator;

/* renamed from: o5 */
/* loaded from: classes.dex */
public final class C6530o5 implements TypeEvaluator {

    /* renamed from: a */
    public C11255uA0[] f38789a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        C11255uA0[] c11255uA0Arr = (C11255uA0[]) obj;
        C11255uA0[] c11255uA0Arr2 = (C11255uA0[]) obj2;
        if (!AbstractC11658xK1.m25837a(c11255uA0Arr, c11255uA0Arr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!AbstractC11658xK1.m25837a(this.f38789a, c11255uA0Arr)) {
            this.f38789a = AbstractC11658xK1.m25841e(c11255uA0Arr);
        }
        for (int i = 0; i < c11255uA0Arr.length; i++) {
            C11255uA0 c11255uA0 = this.f38789a[i];
            C11255uA0 c11255uA02 = c11255uA0Arr[i];
            C11255uA0 c11255uA03 = c11255uA0Arr2[i];
            c11255uA0.getClass();
            c11255uA0.f43543a = c11255uA02.f43543a;
            int i2 = 0;
            while (true) {
                float[] fArr = c11255uA02.f43544b;
                if (i2 < fArr.length) {
                    c11255uA0.f43544b[i2] = (c11255uA03.f43544b[i2] * f) + ((1.0f - f) * fArr[i2]);
                    i2++;
                }
            }
        }
        return this.f38789a;
    }
}
