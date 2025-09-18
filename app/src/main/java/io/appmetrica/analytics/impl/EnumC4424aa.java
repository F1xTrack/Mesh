package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.aa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4424aa {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);

    public final int a;

    EnumC4424aa(int i) {
        this.a = i;
    }

    public static EnumC4424aa a(Integer num) {
        if (num != null) {
            for (EnumC4424aa enumC4424aa : values()) {
                if (enumC4424aa.a == num.intValue()) {
                    return enumC4424aa;
                }
            }
        }
        return UNKNOWN;
    }
}
