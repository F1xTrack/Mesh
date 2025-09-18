package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import p000.AbstractC1374Vq;
import p000.F91;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.x0 */
/* loaded from: classes2.dex */
public final class C5559x0 {

    /* renamed from: a */
    public final String f32787a;

    /* renamed from: b */
    public final String f32788b;

    /* renamed from: c */
    public final CounterConfigurationReporterType f32789c;

    /* renamed from: d */
    public final int f32790d;

    /* renamed from: e */
    public final String f32791e;

    /* renamed from: f */
    public final String f32792f;

    public C5559x0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i, String str3, String str4) {
        this.f32787a = str;
        this.f32788b = str2;
        this.f32789c = counterConfigurationReporterType;
        this.f32790d = i;
        this.f32791e = str3;
        this.f32792f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5559x0)) {
            return false;
        }
        C5559x0 c5559x0 = (C5559x0) obj;
        return O90.m5963a(this.f32787a, c5559x0.f32787a) && O90.m5963a(this.f32788b, c5559x0.f32788b) && this.f32789c == c5559x0.f32789c && this.f32790d == c5559x0.f32790d && O90.m5963a(this.f32791e, c5559x0.f32791e) && O90.m5963a(this.f32792f, c5559x0.f32792f);
    }

    public final int hashCode() {
        int iM8586e = AbstractC1374Vq.m8586e((this.f32790d + ((this.f32789c.hashCode() + AbstractC1374Vq.m8586e(this.f32787a.hashCode() * 31, 31, this.f32788b)) * 31)) * 31, 31, this.f32791e);
        String str = this.f32792f;
        return iM8586e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppMetricaNativeCrashMetadata(apiKey=");
        sb.append(this.f32787a);
        sb.append(", packageName=");
        sb.append(this.f32788b);
        sb.append(", reporterType=");
        sb.append(this.f32789c);
        sb.append(", processID=");
        sb.append(this.f32790d);
        sb.append(", processSessionID=");
        sb.append(this.f32791e);
        sb.append(", errorEnvironment=");
        return F91.m2539v(sb, this.f32792f, ')');
    }
}
