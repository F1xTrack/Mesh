package defpackage;

import android.animation.TypeEvaluator;

/* renamed from: o5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6200o5 implements TypeEvaluator {
    public C7361uA0[] a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        C7361uA0[] c7361uA0Arr = (C7361uA0[]) obj;
        C7361uA0[] c7361uA0Arr2 = (C7361uA0[]) obj2;
        if (!AbstractC7963xK1.a(c7361uA0Arr, c7361uA0Arr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!AbstractC7963xK1.a(this.a, c7361uA0Arr)) {
            this.a = AbstractC7963xK1.e(c7361uA0Arr);
        }
        for (int i = 0; i < c7361uA0Arr.length; i++) {
            C7361uA0 c7361uA0 = this.a[i];
            C7361uA0 c7361uA02 = c7361uA0Arr[i];
            C7361uA0 c7361uA03 = c7361uA0Arr2[i];
            c7361uA0.getClass();
            c7361uA0.a = c7361uA02.a;
            int i2 = 0;
            while (true) {
                float[] fArr = c7361uA02.b;
                if (i2 < fArr.length) {
                    c7361uA0.b[i2] = (c7361uA03.b[i2] * f) + ((1.0f - f) * fArr[i2]);
                    i2++;
                }
            }
        }
        return this.a;
    }
}
