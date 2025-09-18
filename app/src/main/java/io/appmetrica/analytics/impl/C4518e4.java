package io.appmetrica.analytics.impl;

import defpackage.AbstractC1705Vq;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.e4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4518e4 {
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final CounterConfigurationReporterType e;

    public C4518e4(String str, String str2, Integer num, String str3, CounterConfigurationReporterType counterConfigurationReporterType) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
        this.e = counterConfigurationReporterType;
    }

    public static C4518e4 a(Y3 y3) {
        return new C4518e4(y3.b.getApiKey(), y3.a.a.getAsString("PROCESS_CFG_PACKAGE_NAME"), y3.a.a.getAsInteger("PROCESS_CFG_PROCESS_ID"), y3.a.a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), y3.b.getReporterType());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4518e4.class != obj.getClass()) {
            return false;
        }
        C4518e4 c4518e4 = (C4518e4) obj;
        String str = this.a;
        if (str == null ? c4518e4.a != null : !str.equals(c4518e4.a)) {
            return false;
        }
        if (!this.b.equals(c4518e4.b)) {
            return false;
        }
        Integer num = this.c;
        if (num == null ? c4518e4.c != null : !num.equals(c4518e4.c)) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null ? c4518e4.d == null : str2.equals(c4518e4.d)) {
            return this.e == c4518e4.e;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iE = AbstractC1705Vq.e((str != null ? str.hashCode() : 0) * 31, 31, this.b);
        Integer num = this.c;
        int iHashCode = (iE + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClientDescription{mApiKey='" + this.a + "', mPackageName='" + this.b + "', mProcessID=" + this.c + ", mProcessSessionID='" + this.d + "', mReporterType=" + this.e + '}';
    }
}
