package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.mn */
/* loaded from: classes2.dex */
public enum EnumC3451mn {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);


    /* renamed from: a */
    private final int f24270a;

    EnumC3451mn(int i) {
        this.f24270a = i;
    }

    /* renamed from: a */
    public int m16436a() {
        return this.f24270a;
    }

    /* renamed from: a */
    public static EnumC3451mn m16435a(Integer num) {
        if (num != null) {
            EnumC3451mn[] enumC3451mnArrValues = values();
            for (int i = 0; i < 3; i++) {
                EnumC3451mn enumC3451mn = enumC3451mnArrValues[i];
                if (enumC3451mn.f24270a == num.intValue()) {
                    return enumC3451mn;
                }
            }
        }
        return NONE;
    }
}
