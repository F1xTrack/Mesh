package com.yandex.metrica.impl.p022ob;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* renamed from: com.yandex.metrica.impl.ob.e1 */
/* loaded from: classes2.dex */
public enum EnumC3221e1 {
    OK("OK"),
    IDENTIFIER_PROVIDER_UNAVAILABLE("IDENTIFIER_PROVIDER_UNAVAILABLE"),
    INVALID_ADV_ID("INVALID_ADV_ID"),
    NO_STARTUP("NO_STARTUP"),
    FEATURE_DISABLED("FEATURE_DISABLED"),
    UNKNOWN(GrsBaseInfo.CountryCodeSource.UNKNOWN);


    /* renamed from: a */
    private final String f23291a;

    EnumC3221e1(String str) {
        this.f23291a = str;
    }

    /* renamed from: a */
    public String m15811a() {
        return this.f23291a;
    }

    /* renamed from: a */
    public static EnumC3221e1 m15810a(String str) {
        EnumC3221e1[] enumC3221e1ArrValues = values();
        for (int i = 0; i < 6; i++) {
            EnumC3221e1 enumC3221e1 = enumC3221e1ArrValues[i];
            if (enumC3221e1.f23291a.equals(str)) {
                return enumC3221e1;
            }
        }
        return UNKNOWN;
    }
}
