package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public enum E8 {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);

    public final int a;

    E8(int i) {
        this.a = i;
    }

    public static E8 a(Integer num) {
        if (num != null) {
            for (E8 e8 : values()) {
                if (e8.a == num.intValue()) {
                    return e8;
                }
            }
        }
        return NONE;
    }
}
