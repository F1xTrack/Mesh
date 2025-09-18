package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public enum I0 {
    NATIVE(0),
    JS(1);

    public final int a;

    I0(int i) {
        this.a = i;
    }

    public static I0 a(int i) {
        I0[] i0ArrValues = values();
        for (int i2 = 0; i2 < 2; i2++) {
            I0 i0 = i0ArrValues[i2];
            if (i0.a == i) {
                return i0;
            }
        }
        return NATIVE;
    }
}
