package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.mn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2937mn {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);

    private final int a;

    EnumC2937mn(int i) {
        this.a = i;
    }

    public int a() {
        return this.a;
    }

    public static EnumC2937mn a(Integer num) {
        if (num != null) {
            EnumC2937mn[] enumC2937mnArrValues = values();
            for (int i = 0; i < 3; i++) {
                EnumC2937mn enumC2937mn = enumC2937mnArrValues[i];
                if (enumC2937mn.a == num.intValue()) {
                    return enumC2937mn;
                }
            }
        }
        return NONE;
    }
}
