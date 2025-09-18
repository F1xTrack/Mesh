package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Collection;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Eg */
/* loaded from: classes2.dex */
public final class C4473Eg extends C4773R5 {

    /* renamed from: d */
    public boolean f30080d;

    /* renamed from: e */
    public Location f30081e;

    /* renamed from: f */
    public boolean f30082f;

    /* renamed from: g */
    public int f30083g;

    /* renamed from: h */
    public int f30084h;

    /* renamed from: i */
    public boolean f30085i;

    /* renamed from: j */
    public int f30086j;

    /* renamed from: k */
    public Boolean f30087k;

    /* renamed from: l */
    public InterfaceC4398Bg f30088l;

    /* renamed from: m */
    public final InterfaceC4448Dg f30089m;

    /* renamed from: n */
    public String f30090n;

    /* renamed from: o */
    public boolean f30091o;

    /* renamed from: p */
    public boolean f30092p;

    /* renamed from: q */
    public String f30093q;

    /* renamed from: r */
    public List f30094r;

    /* renamed from: s */
    public int f30095s;

    /* renamed from: t */
    public long f30096t;

    /* renamed from: u */
    public long f30097u;

    /* renamed from: v */
    public boolean f30098v;

    /* renamed from: w */
    public long f30099w;

    /* renamed from: x */
    public List f30100x;

    public C4473Eg(C5139g5 c5139g5) {
        this.f30089m = c5139g5;
    }

    /* renamed from: a */
    public final void m19362a(Location location) {
        this.f30081e = location;
    }

    /* renamed from: b */
    public final void m19368b(List<String> list) {
        this.f30094r = list;
    }

    /* renamed from: c */
    public final String m19370c() {
        return this.f30090n;
    }

    /* renamed from: d */
    public final void m19376d(boolean z) {
        this.f30080d = z;
    }

    /* renamed from: e */
    public final void m19378e(boolean z) {
        this.f30085i = z;
    }

    /* renamed from: f */
    public final void m19379f(boolean z) {
        this.f30091o = z;
    }

    /* renamed from: g */
    public final String m19381g() {
        return (String) WrapUtils.getOrDefault(this.f30093q, "");
    }

    /* renamed from: h */
    public final boolean m19382h() {
        return this.f30088l.mo19204a(this.f30087k);
    }

    /* renamed from: i */
    public final int m19383i() {
        return this.f30084h;
    }

    /* renamed from: j */
    public final Location m19384j() {
        return this.f30081e;
    }

    /* renamed from: k */
    public final long m19385k() {
        return this.f30099w;
    }

    /* renamed from: l */
    public final int m19386l() {
        return this.f30086j;
    }

    /* renamed from: m */
    public final long m19387m() {
        return this.f30096t;
    }

    /* renamed from: n */
    public final long m19388n() {
        return this.f30097u;
    }

    /* renamed from: o */
    public final List<String> m19389o() {
        return this.f30094r;
    }

    /* renamed from: p */
    public final int m19390p() {
        return this.f30083g;
    }

    /* renamed from: q */
    public final boolean m19391q() {
        return this.f30092p;
    }

    /* renamed from: r */
    public final boolean m19392r() {
        return this.f30082f;
    }

    /* renamed from: s */
    public final boolean m19393s() {
        return this.f30080d;
    }

    /* renamed from: t */
    public final boolean m19394t() {
        return this.f30091o;
    }

    @Override // io.appmetrica.analytics.impl.C4773R5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "ReportRequestConfig{mLocationTracking=" + this.f30080d + ", mManualLocation=" + this.f30081e + ", mFirstActivationAsUpdate=" + this.f30082f + ", mSessionTimeout=" + this.f30083g + ", mDispatchPeriod=" + this.f30084h + ", mLogEnabled=" + this.f30085i + ", mMaxReportsCount=" + this.f30086j + ", dataSendingEnabledFromArguments=" + this.f30087k + ", dataSendingStrategy=" + this.f30088l + ", mPreloadInfoSendingStrategy=" + this.f30089m + ", mApiKey='" + this.f30090n + "', mPermissionsCollectingEnabled=" + this.f30091o + ", mFeaturesCollectingEnabled=" + this.f30092p + ", mClidsFromStartupResponse='" + this.f30093q + "', mReportHosts=" + this.f30094r + ", mAttributionId=" + this.f30095s + ", mPermissionsCollectingIntervalSeconds=" + this.f30096t + ", mPermissionsForceSendIntervalSeconds=" + this.f30097u + ", mClidsFromClientMatchClidsFromStartupRequest=" + this.f30098v + ", mMaxReportsInDbCount=" + this.f30099w + ", mCertificates=" + this.f30100x + "} " + super.toString();
    }

    /* renamed from: u */
    public final boolean m19395u() {
        return isIdentifiersValid() && !AbstractC5182hn.m20513a((Collection) this.f30094r) && this.f30098v;
    }

    /* renamed from: v */
    public final boolean m19396v() {
        return ((C5139g5) this.f30089m).m20410B();
    }

    /* renamed from: a */
    public final void m19360a(int i) {
        this.f30095s = i;
    }

    /* renamed from: b */
    public final void m19367b(long j) {
        this.f30096t = j;
    }

    /* renamed from: c */
    public final void m19372c(long j) {
        this.f30097u = j;
    }

    /* renamed from: d */
    public final void m19375d(int i) {
        this.f30083g = i;
    }

    /* renamed from: e */
    public final List<String> m19377e() {
        return this.f30100x;
    }

    /* renamed from: f */
    public final boolean m19380f() {
        return this.f30098v;
    }

    /* renamed from: a */
    public final void m19361a(long j) {
        this.f30099w = j;
    }

    /* renamed from: b */
    public final void m19369b(boolean z) {
        this.f30092p = z;
    }

    /* renamed from: c */
    public final void m19373c(boolean z) {
        this.f30082f = z;
    }

    /* renamed from: d */
    public final int m19374d() {
        return this.f30095s;
    }

    /* renamed from: a */
    public final void m19364a(List<String> list) {
        this.f30100x = list;
    }

    /* renamed from: b */
    public final void m19366b(int i) {
        this.f30084h = i;
    }

    /* renamed from: c */
    public final void m19371c(int i) {
        this.f30086j = i;
    }

    /* renamed from: a */
    public final void m19363a(Boolean bool, InterfaceC4398Bg interfaceC4398Bg) {
        this.f30087k = bool;
        this.f30088l = interfaceC4398Bg;
    }

    /* renamed from: a */
    public final void m19365a(boolean z) {
        this.f30098v = z;
    }
}
