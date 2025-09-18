package com.yandex.metrica.impl.p022ob;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.U */
/* loaded from: classes2.dex */
public class C2965U {

    /* renamed from: a */
    private final C3273g1 f22415a;

    /* renamed from: b */
    private final C3273g1 f22416b;

    /* renamed from: c */
    private final C3273g1 f22417c;

    /* renamed from: d */
    private final C3273g1 f22418d;

    /* renamed from: e */
    private final C3273g1 f22419e;

    /* renamed from: f */
    private final C3273g1 f22420f;

    /* renamed from: g */
    private final C3273g1 f22421g;

    /* renamed from: h */
    private final C3273g1 f22422h;

    /* renamed from: i */
    private final C3273g1 f22423i;

    /* renamed from: j */
    private final C3273g1 f22424j;

    /* renamed from: k */
    private final C3273g1 f22425k;

    /* renamed from: l */
    private final long f22426l;

    /* renamed from: m */
    private final C2688Il f22427m;

    /* renamed from: n */
    private final C3051Xa f22428n;

    /* renamed from: o */
    private final long f22429o;

    /* renamed from: p */
    private final C3732xi f22430p;

    public C2965U(C2885Qi c2885Qi, C3284gc c3284gc, Map<String, String> map) {
        this(m15204a(c2885Qi.m14873V()), m15204a(c2885Qi.m14883i()), m15204a(c2885Qi.m14885k()), m15204a(c2885Qi.m14858G()), m15204a(c2885Qi.m14891q()), m15204a(C3762ym.m17272a(C3762ym.m17274a(c2885Qi.m14889o()))), m15204a(C3762ym.m17272a(map)), new C3273g1(c3284gc.m15990a().f23129a == null ? null : c3284gc.m15990a().f23129a.f23041b, c3284gc.m15990a().f23130b, c3284gc.m15990a().f23131c), new C3273g1(c3284gc.m15991b().f23129a == null ? null : c3284gc.m15991b().f23129a.f23041b, c3284gc.m15991b().f23130b, c3284gc.m15991b().f23131c), new C3273g1(c3284gc.m15992c().f23129a != null ? c3284gc.m15992c().f23129a.f23041b : null, c3284gc.m15992c().f23130b, c3284gc.m15992c().f23131c), m15204a(C3762ym.m17286b(c2885Qi.m14882h())), new C2688Il(c2885Qi), c2885Qi.m14887m(), C3323i.m16059a(), c2885Qi.m14854C() + c2885Qi.m14866O().m15198a(), m15206a(c2885Qi.m14880f().f24732y));
    }

    /* renamed from: a */
    public C3273g1 m15209a() {
        return this.f22421g;
    }

    /* renamed from: b */
    public C3273g1 m15210b() {
        return this.f22425k;
    }

    /* renamed from: c */
    public C3273g1 m15211c() {
        return this.f22416b;
    }

    /* renamed from: d */
    public C3273g1 m15213d() {
        return this.f22417c;
    }

    /* renamed from: e */
    public C3051Xa m15214e() {
        return this.f22428n;
    }

    /* renamed from: f */
    public C3732xi m15215f() {
        return this.f22430p;
    }

    /* renamed from: g */
    public C3273g1 m15216g() {
        return this.f22422h;
    }

    /* renamed from: h */
    public C3273g1 m15217h() {
        return this.f22419e;
    }

    /* renamed from: i */
    public C3273g1 m15218i() {
        return this.f22423i;
    }

    /* renamed from: j */
    public long m15219j() {
        return this.f22429o;
    }

    /* renamed from: k */
    public C3273g1 m15220k() {
        return this.f22418d;
    }

    /* renamed from: l */
    public C3273g1 m15221l() {
        return this.f22420f;
    }

    /* renamed from: m */
    public long m15222m() {
        return this.f22426l;
    }

    /* renamed from: n */
    public C2688Il m15223n() {
        return this.f22427m;
    }

    /* renamed from: o */
    public C3273g1 m15224o() {
        return this.f22415a;
    }

    /* renamed from: p */
    public C3273g1 m15225p() {
        return this.f22424j;
    }

    public String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.f22415a + ", mDeviceIdData=" + this.f22416b + ", mDeviceIdHashData=" + this.f22417c + ", mReportAdUrlData=" + this.f22418d + ", mGetAdUrlData=" + this.f22419e + ", mResponseClidsData=" + this.f22420f + ", mClientClidsForRequestData=" + this.f22421g + ", mGaidData=" + this.f22422h + ", mHoaidData=" + this.f22423i + ", yandexAdvIdData=" + this.f22424j + ", customSdkHostsData=" + this.f22425k + ", customSdkHosts=" + this.f22425k + ", mServerTimeOffset=" + this.f22426l + ", mUiAccessConfig=" + this.f22427m + ", diagnosticsConfigsHolder=" + this.f22428n + ", nextStartupTime=" + this.f22429o + ", features=" + this.f22430p + '}';
    }

    /* renamed from: a */
    private static Bundle m15201a(Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("value", parcelable);
        return bundle;
    }

    /* renamed from: b */
    private static C2688Il m15207b(Bundle bundle) {
        return (C2688Il) m15202a(bundle.getBundle("UiAccessConfig"), C2688Il.class.getClassLoader());
    }

    /* renamed from: c */
    public void m15212c(Bundle bundle) {
        bundle.putBundle("Uuid", m15201a(this.f22415a));
        bundle.putBundle("DeviceId", m15201a(this.f22416b));
        bundle.putBundle("DeviceIdHash", m15201a(this.f22417c));
        bundle.putBundle("AdUrlReport", m15201a(this.f22418d));
        bundle.putBundle("AdUrlGet", m15201a(this.f22419e));
        bundle.putBundle("Clids", m15201a(this.f22420f));
        bundle.putBundle("RequestClids", m15201a(this.f22421g));
        bundle.putBundle("GAID", m15201a(this.f22422h));
        bundle.putBundle("HOAID", m15201a(this.f22423i));
        bundle.putBundle("YANDEX_ADV_ID", m15201a(this.f22424j));
        bundle.putBundle("CUSTOM_SDK_HOSTS", m15201a(this.f22425k));
        bundle.putBundle("UiAccessConfig", m15201a(this.f22427m));
        bundle.putBundle("DiagnosticsConfigsHolder", m15201a(this.f22428n));
        bundle.putLong("ServerTimeOffset", this.f22426l);
        bundle.putLong("NextStartupTime", this.f22429o);
        bundle.putBundle("features", m15201a(this.f22430p));
    }

    /* renamed from: a */
    private static Parcelable m15202a(Bundle bundle, ClassLoader classLoader) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return bundle.getParcelable("value");
    }

    /* renamed from: b */
    private static C3273g1 m15208b(Bundle bundle, String str) {
        C3273g1 c3273g1 = (C3273g1) m15202a(bundle.getBundle(str), C3273g1.class.getClassLoader());
        return c3273g1 == null ? new C3273g1(null, EnumC3221e1.UNKNOWN, "bundle serialization error") : c3273g1;
    }

    /* renamed from: a */
    private static C3051Xa m15203a(Bundle bundle) {
        C3051Xa c3051Xa = (C3051Xa) m15202a(bundle.getBundle("DiagnosticsConfigsHolder"), C3051Xa.class.getClassLoader());
        return c3051Xa == null ? new C3051Xa() : c3051Xa;
    }

    /* renamed from: a */
    private static C3732xi m15205a(Bundle bundle, String str) {
        C3732xi c3732xi = (C3732xi) m15202a(bundle.getBundle(str), C3732xi.class.getClassLoader());
        return c3732xi == null ? new C3732xi(null, EnumC3221e1.UNKNOWN, "bundle serialization error") : c3732xi;
    }

    /* renamed from: a */
    private static C3273g1 m15204a(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        return new C3273g1(str, zIsEmpty ? EnumC3221e1.UNKNOWN : EnumC3221e1.OK, zIsEmpty ? "no identifier in startup state" : null);
    }

    /* renamed from: a */
    private static C3732xi m15206a(Boolean bool) {
        boolean z = bool != null;
        return new C3732xi(bool, z ? EnumC3221e1.OK : EnumC3221e1.UNKNOWN, z ? null : "no identifier in startup state");
    }

    public C2965U(Bundle bundle) {
        this(m15208b(bundle, "Uuid"), m15208b(bundle, "DeviceId"), m15208b(bundle, "DeviceIdHash"), m15208b(bundle, "AdUrlReport"), m15208b(bundle, "AdUrlGet"), m15208b(bundle, "Clids"), m15208b(bundle, "RequestClids"), m15208b(bundle, "GAID"), m15208b(bundle, "HOAID"), m15208b(bundle, "YANDEX_ADV_ID"), m15208b(bundle, "CUSTOM_SDK_HOSTS"), m15207b(bundle), m15203a(bundle), bundle.getLong("ServerTimeOffset"), bundle.getLong("NextStartupTime"), m15205a(bundle, "features"));
    }

    public C2965U(C3273g1 c3273g1, C3273g1 c3273g12, C3273g1 c3273g13, C3273g1 c3273g14, C3273g1 c3273g15, C3273g1 c3273g16, C3273g1 c3273g17, C3273g1 c3273g18, C3273g1 c3273g19, C3273g1 c3273g110, C3273g1 c3273g111, C2688Il c2688Il, C3051Xa c3051Xa, long j, long j2, C3732xi c3732xi) {
        this.f22415a = c3273g1;
        this.f22416b = c3273g12;
        this.f22417c = c3273g13;
        this.f22418d = c3273g14;
        this.f22419e = c3273g15;
        this.f22420f = c3273g16;
        this.f22421g = c3273g17;
        this.f22422h = c3273g18;
        this.f22423i = c3273g19;
        this.f22424j = c3273g110;
        this.f22425k = c3273g111;
        this.f22427m = c2688Il;
        this.f22428n = c3051Xa;
        this.f22426l = j;
        this.f22429o = j2;
        this.f22430p = c3732xi;
    }
}
