package io.appmetrica.analytics.impl;


/* loaded from: classes2.dex */
public abstract class H9 {
    public static final String a(int i) {
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
