package io.appmetrica.analytics.impl;

import defpackage.AbstractC1705Vq;
import defpackage.F91;
import defpackage.O90;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4968x0 {
    public final String a;
    public final String b;
    public final CounterConfigurationReporterType c;
    public final int d;
    public final String e;
    public final String f;

    public C4968x0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = counterConfigurationReporterType;
        this.d = i;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4968x0)) {
            return false;
        }
        C4968x0 c4968x0 = (C4968x0) obj;
        return O90.a(this.a, c4968x0.a) && O90.a(this.b, c4968x0.b) && this.c == c4968x0.c && this.d == c4968x0.d && O90.a(this.e, c4968x0.e) && O90.a(this.f, c4968x0.f);
    }

    public final int hashCode() {
        int iE = AbstractC1705Vq.e((this.d + ((this.c.hashCode() + AbstractC1705Vq.e(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e);
        String str = this.f;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppMetricaNativeCrashMetadata(apiKey=");
        sb.append(this.a);
        sb.append(", packageName=");
        sb.append(this.b);
        sb.append(", reporterType=");
        sb.append(this.c);
        sb.append(", processID=");
        sb.append(this.d);
        sb.append(", processSessionID=");
        sb.append(this.e);
        sb.append(", errorEnvironment=");
        return F91.v(sb, this.f, ')');
    }
}
