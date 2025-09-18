package io.appmetrica.analytics.impl;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* renamed from: io.appmetrica.analytics.impl.H9 */
/* loaded from: classes2.dex */
public abstract class AbstractC4538H9 {
    /* renamed from: a */
    public static final String m19465a(int i) {
        switch (i) {
            case 1:
                return "APPSFLYER";
            case 2:
                return "ADJUST";
            case 3:
                return "KOCHAVA";
            case 4:
                return "TENJIN";
            case 5:
                return "AIRBRIDGE";
            case 6:
                return "SINGULAR";
            default:
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }
}
