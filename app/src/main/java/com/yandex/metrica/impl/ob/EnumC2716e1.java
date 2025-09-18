package com.yandex.metrica.impl.ob;


/* renamed from: com.yandex.metrica.impl.ob.e1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2716e1 {
    OK("OK"),
    IDENTIFIER_PROVIDER_UNAVAILABLE("IDENTIFIER_PROVIDER_UNAVAILABLE"),
    INVALID_ADV_ID("INVALID_ADV_ID"),
    NO_STARTUP("NO_STARTUP"),
    FEATURE_DISABLED("FEATURE_DISABLED"),
    UNKNOWN(GrsBaseInfo.CountryCodeSource.UNKNOWN);

    private final String a;

    EnumC2716e1(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }

    public static EnumC2716e1 a(String str) {
        EnumC2716e1[] enumC2716e1ArrValues = values();
        for (int i = 0; i < 6; i++) {
            EnumC2716e1 enumC2716e1 = enumC2716e1ArrValues[i];
            if (enumC2716e1.a.equals(str)) {
                return enumC2716e1;
            }
        }
        return UNKNOWN;
    }
}
