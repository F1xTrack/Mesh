package com.yandex.metrica.impl.ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.we, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3182we extends AbstractC3052re {
    private C3232ye f;
    private C3232ye g;
    private C3232ye h;
    private C3232ye i;
    private C3232ye j;
    private C3232ye k;
    private C3232ye l;
    private C3232ye m;
    private C3232ye n;
    private C3232ye o;
    static final C3232ye p = new C3232ye("PREF_KEY_DEVICE_ID_", null);
    static final C3232ye q = new C3232ye("PREF_KEY_UID_", null);
    private static final C3232ye r = new C3232ye("PREF_KEY_HOST_URL_", null);
    private static final C3232ye s = new C3232ye("PREF_KEY_REPORT_URL_", null);
    private static final C3232ye t = new C3232ye("PREF_KEY_GET_AD_URL", null);
    private static final C3232ye u = new C3232ye("PREF_KEY_REPORT_AD_URL", null);
    private static final C3232ye v = new C3232ye("PREF_KEY_STARTUP_OBTAIN_TIME_", null);
    private static final C3232ye w = new C3232ye("PREF_KEY_STARTUP_ENCODED_CLIDS_", null);
    private static final C3232ye x = new C3232ye("PREF_KEY_DISTRIBUTION_REFERRER_", null);
    static final C3232ye y = new C3232ye("STARTUP_CLIDS_MATCH_WITH_APP_CLIDS_", null);
    static final C3232ye z = new C3232ye("PREF_KEY_PINNING_UPDATE_URL", null);
    private static final C3232ye A = new C3232ye("PREF_KEY_EASY_COLLECTING_ENABLED_", null);

    public C3182we(Context context) {
        this(context, null);
    }

    public long a(long j) {
        return this.b.getLong(this.l.a(), j);
    }

    public String b(String str) {
        return this.b.getString(this.f.a(), null);
    }

    public String c(String str) {
        return this.b.getString(this.m.a(), null);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC3052re
    public String d() {
        return "_startupserviceinfopreferences";
    }

    public String e(String str) {
        return this.b.getString(this.h.a(), null);
    }

    public String f(String str) {
        return this.b.getString(this.k.a(), null);
    }

    public String g(String str) {
        return this.b.getString(this.i.a(), null);
    }

    public String h(String str) {
        return this.b.getString(this.g.a(), null);
    }

    public C3182we i(String str) {
        return (C3182we) a(this.f.a(), str);
    }

    public C3182we j(String str) {
        return (C3182we) a(this.g.a(), str);
    }

    public C3182we(Context context, String str) {
        super(context, str);
        this.f = new C3232ye(p.b());
        this.g = new C3232ye(q.b(), c());
        this.h = new C3232ye(r.b(), c());
        this.i = new C3232ye(s.b(), c());
        this.j = new C3232ye(t.b(), c());
        this.k = new C3232ye(u.b(), c());
        this.l = new C3232ye(v.b(), c());
        this.m = new C3232ye(w.b(), c());
        this.n = new C3232ye(x.b(), c());
        this.o = new C3232ye(A.b(), c());
    }

    public static void b(Context context) {
        C2814i.a(context, "_startupserviceinfopreferences").edit().remove(p.b()).apply();
    }

    public String d(String str) {
        return this.b.getString(this.j.a(), null);
    }

    public void f() {
        a(this.f.a()).a(this.g.a()).a(this.h.a()).a(this.i.a()).a(this.j.a()).a(this.k.a()).a(this.l.a()).a(this.o.a()).a(this.m.a()).a(this.n.b()).a(y.b()).a(z.b()).b();
    }
}
