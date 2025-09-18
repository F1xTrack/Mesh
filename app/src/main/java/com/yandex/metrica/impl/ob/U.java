package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public class U {
    private final C2766g1 a;
    private final C2766g1 b;
    private final C2766g1 c;
    private final C2766g1 d;
    private final C2766g1 e;
    private final C2766g1 f;
    private final C2766g1 g;
    private final C2766g1 h;
    private final C2766g1 i;
    private final C2766g1 j;
    private final C2766g1 k;
    private final long l;
    private final Il m;
    private final Xa n;
    private final long o;
    private final C3211xi p;

    public U(Qi qi, C2777gc c2777gc, Map<String, String> map) {
        this(a(qi.V()), a(qi.i()), a(qi.k()), a(qi.G()), a(qi.q()), a(C3240ym.a(C3240ym.a(qi.o()))), a(C3240ym.a(map)), new C2766g1(c2777gc.a().a == null ? null : c2777gc.a().a.b, c2777gc.a().b, c2777gc.a().c), new C2766g1(c2777gc.b().a == null ? null : c2777gc.b().a.b, c2777gc.b().b, c2777gc.b().c), new C2766g1(c2777gc.c().a != null ? c2777gc.c().a.b : null, c2777gc.c().b, c2777gc.c().c), a(C3240ym.b(qi.h())), new Il(qi), qi.m(), C2814i.a(), qi.C() + qi.O().a(), a(qi.f().y));
    }

    public C2766g1 a() {
        return this.g;
    }

    public C2766g1 b() {
        return this.k;
    }

    public C2766g1 c() {
        return this.b;
    }

    public C2766g1 d() {
        return this.c;
    }

    public Xa e() {
        return this.n;
    }

    public C3211xi f() {
        return this.p;
    }

    public C2766g1 g() {
        return this.h;
    }

    public C2766g1 h() {
        return this.e;
    }

    public C2766g1 i() {
        return this.i;
    }

    public long j() {
        return this.o;
    }

    public C2766g1 k() {
        return this.d;
    }

    public C2766g1 l() {
        return this.f;
    }

    public long m() {
        return this.l;
    }

    public Il n() {
        return this.m;
    }

    public C2766g1 o() {
        return this.a;
    }

    public C2766g1 p() {
        return this.j;
    }

    public String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.a + ", mDeviceIdData=" + this.b + ", mDeviceIdHashData=" + this.c + ", mReportAdUrlData=" + this.d + ", mGetAdUrlData=" + this.e + ", mResponseClidsData=" + this.f + ", mClientClidsForRequestData=" + this.g + ", mGaidData=" + this.h + ", mHoaidData=" + this.i + ", yandexAdvIdData=" + this.j + ", customSdkHostsData=" + this.k + ", customSdkHosts=" + this.k + ", mServerTimeOffset=" + this.l + ", mUiAccessConfig=" + this.m + ", diagnosticsConfigsHolder=" + this.n + ", nextStartupTime=" + this.o + ", features=" + this.p + '}';
    }

    private static Bundle a(Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("value", parcelable);
        return bundle;
    }

    private static Il b(Bundle bundle) {
        return (Il) a(bundle.getBundle("UiAccessConfig"), Il.class.getClassLoader());
    }

    public void c(Bundle bundle) {
        bundle.putBundle("Uuid", a(this.a));
        bundle.putBundle("DeviceId", a(this.b));
        bundle.putBundle("DeviceIdHash", a(this.c));
        bundle.putBundle("AdUrlReport", a(this.d));
        bundle.putBundle("AdUrlGet", a(this.e));
        bundle.putBundle("Clids", a(this.f));
        bundle.putBundle("RequestClids", a(this.g));
        bundle.putBundle("GAID", a(this.h));
        bundle.putBundle("HOAID", a(this.i));
        bundle.putBundle("YANDEX_ADV_ID", a(this.j));
        bundle.putBundle("CUSTOM_SDK_HOSTS", a(this.k));
        bundle.putBundle("UiAccessConfig", a(this.m));
        bundle.putBundle("DiagnosticsConfigsHolder", a(this.n));
        bundle.putLong("ServerTimeOffset", this.l);
        bundle.putLong("NextStartupTime", this.o);
        bundle.putBundle("features", a(this.p));
    }

    private static Parcelable a(Bundle bundle, ClassLoader classLoader) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return bundle.getParcelable("value");
    }

    private static C2766g1 b(Bundle bundle, String str) {
        C2766g1 c2766g1 = (C2766g1) a(bundle.getBundle(str), C2766g1.class.getClassLoader());
        return c2766g1 == null ? new C2766g1(null, EnumC2716e1.UNKNOWN, "bundle serialization error") : c2766g1;
    }

    private static Xa a(Bundle bundle) {
        Xa xa = (Xa) a(bundle.getBundle("DiagnosticsConfigsHolder"), Xa.class.getClassLoader());
        return xa == null ? new Xa() : xa;
    }

    private static C3211xi a(Bundle bundle, String str) {
        C3211xi c3211xi = (C3211xi) a(bundle.getBundle(str), C3211xi.class.getClassLoader());
        return c3211xi == null ? new C3211xi(null, EnumC2716e1.UNKNOWN, "bundle serialization error") : c3211xi;
    }

    private static C2766g1 a(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        return new C2766g1(str, zIsEmpty ? EnumC2716e1.UNKNOWN : EnumC2716e1.OK, zIsEmpty ? "no identifier in startup state" : null);
    }

    private static C3211xi a(Boolean bool) {
        boolean z = bool != null;
        return new C3211xi(bool, z ? EnumC2716e1.OK : EnumC2716e1.UNKNOWN, z ? null : "no identifier in startup state");
    }

    public U(Bundle bundle) {
        this(b(bundle, "Uuid"), b(bundle, "DeviceId"), b(bundle, "DeviceIdHash"), b(bundle, "AdUrlReport"), b(bundle, "AdUrlGet"), b(bundle, "Clids"), b(bundle, "RequestClids"), b(bundle, "GAID"), b(bundle, "HOAID"), b(bundle, "YANDEX_ADV_ID"), b(bundle, "CUSTOM_SDK_HOSTS"), b(bundle), a(bundle), bundle.getLong("ServerTimeOffset"), bundle.getLong("NextStartupTime"), a(bundle, "features"));
    }

    public U(C2766g1 c2766g1, C2766g1 c2766g12, C2766g1 c2766g13, C2766g1 c2766g14, C2766g1 c2766g15, C2766g1 c2766g16, C2766g1 c2766g17, C2766g1 c2766g18, C2766g1 c2766g19, C2766g1 c2766g110, C2766g1 c2766g111, Il il, Xa xa, long j, long j2, C3211xi c3211xi) {
        this.a = c2766g1;
        this.b = c2766g12;
        this.c = c2766g13;
        this.d = c2766g14;
        this.e = c2766g15;
        this.f = c2766g16;
        this.g = c2766g17;
        this.h = c2766g18;
        this.i = c2766g19;
        this.j = c2766g110;
        this.k = c2766g111;
        this.m = il;
        this.n = xa;
        this.l = j;
        this.o = j2;
        this.p = c3211xi;
    }
}
