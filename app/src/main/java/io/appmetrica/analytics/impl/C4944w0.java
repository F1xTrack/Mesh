package io.appmetrica.analytics.impl;

import defpackage.AbstractC1705Vq;
import defpackage.O90;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;

/* renamed from: io.appmetrica.analytics.impl.w0 */
/* loaded from: classes2.dex */
public final class C4944w0 {
    public final NativeCrashSource a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final C4968x0 f;

    public C4944w0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j, C4968x0 c4968x0) {
        this.a = nativeCrashSource;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = c4968x0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4944w0)) {
            return false;
        }
        C4944w0 c4944w0 = (C4944w0) obj;
        return this.a == c4944w0.a && O90.a(this.b, c4944w0.b) && O90.a(this.c, c4944w0.c) && O90.a(this.d, c4944w0.d) && this.e == c4944w0.e && O90.a(this.f, c4944w0.f);
    }

    public final int hashCode() {
        int iE = AbstractC1705Vq.e(AbstractC1705Vq.e(AbstractC1705Vq.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        long j = this.e;
        return this.f.hashCode() + ((((int) (j ^ (j >>> 32))) + iE) * 31);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.a + ", handlerVersion=" + this.b + ", uuid=" + this.c + ", dumpFile=" + this.d + ", creationTime=" + this.e + ", metadata=" + this.f + ')';
    }
}
