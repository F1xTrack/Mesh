package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.aa */
/* loaded from: classes2.dex */
public enum EnumC4994aa {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* renamed from: a */
    public final int f31257a;

    EnumC4994aa(int i) {
        this.f31257a = i;
    }

    /* renamed from: a */
    public static EnumC4994aa m20117a(Integer num) {
        if (num != null) {
            for (EnumC4994aa enumC4994aa : values()) {
                if (enumC4994aa.f31257a == num.intValue()) {
                    return enumC4994aa;
                }
            }
        }
        return UNKNOWN;
    }
}
