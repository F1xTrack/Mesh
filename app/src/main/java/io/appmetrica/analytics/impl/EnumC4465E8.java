package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.E8 */
/* loaded from: classes2.dex */
public enum EnumC4465E8 {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);


    /* renamed from: a */
    public final int f30059a;

    EnumC4465E8(int i) {
        this.f30059a = i;
    }

    /* renamed from: a */
    public static EnumC4465E8 m19340a(Integer num) {
        if (num != null) {
            for (EnumC4465E8 enumC4465E8 : values()) {
                if (enumC4465E8.f30059a == num.intValue()) {
                    return enumC4465E8;
                }
            }
        }
        return NONE;
    }
}
