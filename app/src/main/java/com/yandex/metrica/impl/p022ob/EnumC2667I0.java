package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.I0 */
/* loaded from: classes2.dex */
public enum EnumC2667I0 {
    NATIVE(0),
    JS(1);


    /* renamed from: a */
    public final int f21387a;

    EnumC2667I0(int i) {
        this.f21387a = i;
    }

    /* renamed from: a */
    public static EnumC2667I0 m14273a(int i) {
        EnumC2667I0[] enumC2667I0ArrValues = values();
        for (int i2 = 0; i2 < 2; i2++) {
            EnumC2667I0 enumC2667I0 = enumC2667I0ArrValues[i2];
            if (enumC2667I0.f21387a == i) {
                return enumC2667I0;
            }
        }
        return NATIVE;
    }
}
