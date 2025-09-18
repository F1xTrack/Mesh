package io.appmetrica.analytics.impl;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes2.dex */
public enum P7 {
    b("UNDEFINED"),
    c(GrsBaseInfo.CountryCodeSource.APP),
    d("SATELLITE"),
    e("RETAIL");

    public final String a;

    P7(String str) {
        this.a = str;
    }
}
