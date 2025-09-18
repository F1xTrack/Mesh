package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public enum N0 {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);

    public final int a;

    N0(int i) {
        this.a = i;
    }

    public static N0 a(Integer num) {
        if (num != null) {
            N0[] n0ArrValues = values();
            for (int i = 0; i < 3; i++) {
                N0 n0 = n0ArrValues[i];
                if (n0.a == num.intValue()) {
                    return n0;
                }
            }
        }
        return UNKNOWN;
    }
}
