package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.cl */
/* loaded from: classes2.dex */
public final class C5055cl extends C4773R5 {

    /* renamed from: d */
    public List f31437d;

    /* renamed from: e */
    public List f31438e;

    /* renamed from: f */
    public String f31439f;

    /* renamed from: g */
    public String f31440g;

    /* renamed from: h */
    public Map f31441h;

    /* renamed from: i */
    public C4556I3 f31442i;

    /* renamed from: j */
    public List f31443j;

    /* renamed from: k */
    public boolean f31444k;

    /* renamed from: l */
    public boolean f31445l;

    /* renamed from: m */
    public String f31446m;

    /* renamed from: n */
    public long f31447n;

    /* renamed from: o */
    public final C4422Cf f31448o;

    /* renamed from: p */
    public final C4488F7 f31449p;

    public C5055cl() {
        this(C5244ka.m20614h().m20633r(), new C4488F7());
    }

    /* renamed from: a */
    public final long m20241a(long j) {
        if (this.f31447n == 0) {
            this.f31447n = j;
        }
        return this.f31447n;
    }

    /* renamed from: c */
    public final C4556I3 m20245c() {
        return this.f31442i;
    }

    /* renamed from: d */
    public final Map<String, String> m20246d() {
        return this.f31441h;
    }

    /* renamed from: e */
    public final String m20247e() {
        return this.f31446m;
    }

    /* renamed from: f */
    public final String m20248f() {
        return this.f31439f;
    }

    /* renamed from: g */
    public final long m20249g() {
        return this.f31447n;
    }

    /* renamed from: h */
    public final String m20250h() {
        return this.f31440g;
    }

    /* renamed from: i */
    public final List<String> m20251i() {
        return this.f31443j;
    }

    /* renamed from: j */
    public final C4422Cf m20252j() {
        return this.f31448o;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> m20253k() {
        /*
            r9 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.List r1 = r9.f31437d
            boolean r1 = io.appmetrica.analytics.impl.AbstractC5182hn.m20513a(r1)
            if (r1 != 0) goto L12
            java.util.List r1 = r9.f31437d
            r0.addAll(r1)
        L12:
            java.util.List r1 = r9.f31438e
            boolean r1 = io.appmetrica.analytics.impl.AbstractC5182hn.m20513a(r1)
            if (r1 != 0) goto L1f
            java.util.List r1 = r9.f31438e
            r0.addAll(r1)
        L1f:
            io.appmetrica.analytics.impl.F7 r1 = r9.f31449p
            io.appmetrica.analytics.impl.Ul r1 = r1.f30125a
            java.lang.Object r1 = r1.m19817a()
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
            boolean r8 = p000.AbstractC11374v51.m25328C(r7)
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
            boolean r7 = p000.AbstractC11374v51.m25328C(r6)
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
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5055cl.m20253k():java.util.List");
    }

    /* renamed from: l */
    public final List<String> m20254l() {
        return this.f31438e;
    }

    /* renamed from: m */
    public final List<String> m20255m() {
        return this.f31437d;
    }

    /* renamed from: n */
    public final boolean m20256n() {
        return this.f31444k;
    }

    /* renamed from: o */
    public final boolean m20257o() {
        return this.f31445l;
    }

    @Override // io.appmetrica.analytics.impl.C4773R5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.f31437d + ", mStartupHostsFromClient=" + this.f31438e + ", mDistributionReferrer='" + this.f31439f + "', mInstallReferrerSource='" + this.f31440g + "', mClidsFromClient=" + this.f31441h + ", mNewCustomHosts=" + this.f31443j + ", mHasNewCustomHosts=" + this.f31444k + ", mSuccessfulStartup=" + this.f31445l + ", mCountryInit='" + this.f31446m + "', mFirstStartupTime=" + this.f31447n + "} " + super.toString();
    }

    public C5055cl(C4422Cf c4422Cf, C4488F7 c4488f7) {
        this.f31442i = new C4556I3(null, EnumC4728P7.f30605c);
        this.f31447n = 0L;
        this.f31448o = c4422Cf;
        this.f31449p = c4488f7;
    }

    /* renamed from: a */
    public final void m20243a(List<String> list) {
        this.f31443j = list;
    }

    /* renamed from: a */
    public final void m20244a(boolean z) {
        this.f31444k = z;
    }

    /* renamed from: a */
    public final void m20242a(String str) {
        this.f31446m = str;
    }
}
