package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import p000.AbstractC1374Vq;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.w0 */
/* loaded from: classes2.dex */
public final class C5534w0 {

    /* renamed from: a */
    public final NativeCrashSource f32746a;

    /* renamed from: b */
    public final String f32747b;

    /* renamed from: c */
    public final String f32748c;

    /* renamed from: d */
    public final String f32749d;

    /* renamed from: e */
    public final long f32750e;

    /* renamed from: f */
    public final C5559x0 f32751f;

    public C5534w0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j, C5559x0 c5559x0) {
        this.f32746a = nativeCrashSource;
        this.f32747b = str;
        this.f32748c = str2;
        this.f32749d = str3;
        this.f32750e = j;
        this.f32751f = c5559x0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5534w0)) {
            return false;
        }
        C5534w0 c5534w0 = (C5534w0) obj;
        return this.f32746a == c5534w0.f32746a && O90.m5963a(this.f32747b, c5534w0.f32747b) && O90.m5963a(this.f32748c, c5534w0.f32748c) && O90.m5963a(this.f32749d, c5534w0.f32749d) && this.f32750e == c5534w0.f32750e && O90.m5963a(this.f32751f, c5534w0.f32751f);
    }

    public final int hashCode() {
        int iM8586e = AbstractC1374Vq.m8586e(AbstractC1374Vq.m8586e(AbstractC1374Vq.m8586e(this.f32746a.hashCode() * 31, 31, this.f32747b), 31, this.f32748c), 31, this.f32749d);
        long j = this.f32750e;
        return this.f32751f.hashCode() + ((((int) (j ^ (j >>> 32))) + iM8586e) * 31);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.f32746a + ", handlerVersion=" + this.f32747b + ", uuid=" + this.f32748c + ", dumpFile=" + this.f32749d + ", creationTime=" + this.f32750e + ", metadata=" + this.f32751f + ')';
    }
}
