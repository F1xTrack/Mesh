package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.cl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4485cl extends R5 {
    public List d;
    public List e;
    public String f;
    public String g;
    public Map h;
    public I3 i;
    public List j;
    public boolean k;
    public boolean l;
    public String m;
    public long n;
    public final Cf o;
    public final F7 p;

    public C4485cl() {
        this(C4667ka.h().r(), new F7());
    }

    public final long a(long j) {
        if (this.n == 0) {
            this.n = j;
        }
        return this.n;
    }

    public final I3 c() {
        return this.i;
    }

    public final Map<String, String> d() {
        return this.h;
    }

    public final String e() {
        return this.m;
    }

    public final String f() {
        return this.f;
    }

    public final long g() {
        return this.n;
    }

    public final String h() {
        return this.g;
    }

    public final List<String> i() {
        return this.j;
    }

    public final Cf j() {
        return this.o;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> k() {
        /*
            r9 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.List r1 = r9.d
            boolean r1 = io.appmetrica.analytics.impl.hn.a(r1)
            if (r1 != 0) goto L12
            java.util.List r1 = r9.d
            r0.addAll(r1)
        L12:
            java.util.List r1 = r9.e
            boolean r1 = io.appmetrica.analytics.impl.hn.a(r1)
            if (r1 != 0) goto L1f
            java.util.List r1 = r9.e
            r0.addAll(r1)
        L1f:
            io.appmetrica.analytics.impl.F7 r1 = r9.p
            io.appmetrica.analytics.impl.Ul r1 = r1.a
            java.lang.Object r1 = r1.a()
            java.lang.String[] r1 = (java.lang.String[]) r1
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L55
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r1.length
            r6 = r2
        L34:
            if (r6 >= r5) goto L4a
            r7 = r1[r6]
            if (r7 == 0) goto L41
            boolean r8 = defpackage.AbstractC7538v51.C(r7)
            if (r8 != 0) goto L41
            goto L42
        L41:
            r7 = r3
        L42:
            if (r7 == 0) goto L47
            r4.add(r7)
        L47:
            int r6 = r6 + 1
            goto L34
        L4a:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L51
            goto L52
        L51:
            r4 = r3
        L52:
            if (r4 == 0) goto L55
            goto L73
        L55:
            java.lang.String[] r1 = io.appmetrica.analytics.BuildConfig.DEFAULT_HOSTS
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r1.length
        L5d:
            if (r2 >= r5) goto L73
            r6 = r1[r2]
            if (r6 == 0) goto L6a
            boolean r7 = defpackage.AbstractC7538v51.C(r6)
            if (r7 != 0) goto L6a
            goto L6b
        L6a:
            r6 = r3
        L6b:
            if (r6 == 0) goto L70
            r4.add(r6)
        L70:
            int r2 = r2 + 1
            goto L5d
        L73:
            r0.addAll(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4485cl.k():java.util.List");
    }

    public final List<String> l() {
        return this.e;
    }

    public final List<String> m() {
        return this.d;
    }

    public final boolean n() {
        return this.k;
    }

    public final boolean o() {
        return this.l;
    }

    @Override // io.appmetrica.analytics.impl.R5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.d + ", mStartupHostsFromClient=" + this.e + ", mDistributionReferrer='" + this.f + "', mInstallReferrerSource='" + this.g + "', mClidsFromClient=" + this.h + ", mNewCustomHosts=" + this.j + ", mHasNewCustomHosts=" + this.k + ", mSuccessfulStartup=" + this.l + ", mCountryInit='" + this.m + "', mFirstStartupTime=" + this.n + "} " + super.toString();
    }

    public C4485cl(Cf cf, F7 f7) {
        this.i = new I3(null, P7.c);
        this.n = 0L;
        this.o = cf;
        this.p = f7;
    }

    public final void a(List<String> list) {
        this.j = list;
    }

    public final void a(boolean z) {
        this.k = z;
    }

    public final void a(String str) {
        this.m = str;
    }
}
