package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.N0 */
/* loaded from: classes2.dex */
public enum EnumC2792N0 {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* renamed from: a */
    public final int f21760a;

    EnumC2792N0(int i) {
        this.f21760a = i;
    }

    /* renamed from: a */
    public static EnumC2792N0 m14635a(Integer num) {
        if (num != null) {
            EnumC2792N0[] enumC2792N0ArrValues = values();
            for (int i = 0; i < 3; i++) {
                EnumC2792N0 enumC2792N0 = enumC2792N0ArrValues[i];
                if (enumC2792N0.f21760a == num.intValue()) {
                    return enumC2792N0;
                }
            }
        }
        return UNKNOWN;
    }
}
