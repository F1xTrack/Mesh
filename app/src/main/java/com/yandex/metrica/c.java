package com.yandex.metrica;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

/* loaded from: classes2.dex */
public enum c {
    MAIN("main"),
    MANUAL("manual"),
    APPMETRICA("appmetrica"),
    COMMUTATION("commutation"),
    SELF_DIAGNOSTIC_MAIN("self_diagnostic_main"),
    SELF_DIAGNOSTIC_MANUAL("self_diagnostic_manual"),
    CRASH(CrashHianalyticsData.EVENT_ID_CRASH);

    public final String a;

    c(String str) {
        this.a = str;
    }

    public static c a(String str) {
        c[] cVarArrValues = values();
        for (int i2 = 0; i2 < 7; i2++) {
            c cVar = cVarArrValues[i2];
            if (cVar.a.equals(str)) {
                return cVar;
            }
        }
        return MAIN;
    }
}
