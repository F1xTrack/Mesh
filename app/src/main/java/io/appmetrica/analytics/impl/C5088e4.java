package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import p000.AbstractC1374Vq;

/* renamed from: io.appmetrica.analytics.impl.e4 */
/* loaded from: classes2.dex */
public final class C5088e4 {

    /* renamed from: a */
    public final String f31524a;

    /* renamed from: b */
    public final String f31525b;

    /* renamed from: c */
    public final Integer f31526c;

    /* renamed from: d */
    public final String f31527d;

    /* renamed from: e */
    public final CounterConfigurationReporterType f31528e;

    public C5088e4(String str, String str2, Integer num, String str3, CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f31524a = str;
        this.f31525b = str2;
        this.f31526c = num;
        this.f31527d = str3;
        this.f31528e = counterConfigurationReporterType;
    }

    /* renamed from: a */
    public static C5088e4 m20302a(C4939Y3 c4939y3) {
        return new C5088e4(c4939y3.f31090b.getApiKey(), c4939y3.f31089a.f30696a.getAsString("PROCESS_CFG_PACKAGE_NAME"), c4939y3.f31089a.f30696a.getAsInteger("PROCESS_CFG_PROCESS_ID"), c4939y3.f31089a.f30696a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), c4939y3.f31090b.getReporterType());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5088e4.class != obj.getClass()) {
            return false;
        }
        C5088e4 c5088e4 = (C5088e4) obj;
        String str = this.f31524a;
        if (str == null ? c5088e4.f31524a != null : !str.equals(c5088e4.f31524a)) {
            return false;
        }
        if (!this.f31525b.equals(c5088e4.f31525b)) {
            return false;
        }
        Integer num = this.f31526c;
        if (num == null ? c5088e4.f31526c != null : !num.equals(c5088e4.f31526c)) {
            return false;
        }
        String str2 = this.f31527d;
        if (str2 == null ? c5088e4.f31527d == null : str2.equals(c5088e4.f31527d)) {
            return this.f31528e == c5088e4.f31528e;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f31524a;
        int iM8586e = AbstractC1374Vq.m8586e((str != null ? str.hashCode() : 0) * 31, 31, this.f31525b);
        Integer num = this.f31526c;
        int iHashCode = (iM8586e + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f31527d;
        return this.f31528e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClientDescription{mApiKey='" + this.f31524a + "', mPackageName='" + this.f31525b + "', mProcessID=" + this.f31526c + ", mProcessSessionID='" + this.f31527d + "', mReporterType=" + this.f31528e + '}';
    }
}
