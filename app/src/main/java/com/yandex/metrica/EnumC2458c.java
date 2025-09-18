package com.yandex.metrica;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

/* renamed from: com.yandex.metrica.c */
/* loaded from: classes2.dex */
public enum EnumC2458c {
    MAIN("main"),
    MANUAL("manual"),
    APPMETRICA("appmetrica"),
    COMMUTATION("commutation"),
    SELF_DIAGNOSTIC_MAIN("self_diagnostic_main"),
    SELF_DIAGNOSTIC_MANUAL("self_diagnostic_manual"),
    CRASH(CrashHianalyticsData.EVENT_ID_CRASH);


    /* renamed from: a */
    public final String f20784a;

    EnumC2458c(String str) {
        this.f20784a = str;
    }

    /* renamed from: a */
    public static EnumC2458c m13801a(String str) {
        EnumC2458c[] enumC2458cArrValues = values();
        for (int i = 0; i < 7; i++) {
            EnumC2458c enumC2458c = enumC2458cArrValues[i];
            if (enumC2458c.f20784a.equals(str)) {
                return enumC2458c;
            }
        }
        return MAIN;
    }
}
