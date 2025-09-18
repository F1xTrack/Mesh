package com.yandex.metrica.impl.p022ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.we */
/* loaded from: classes2.dex */
public class C3702we extends AbstractC3572re {

    /* renamed from: f */
    private C3754ye f25191f;

    /* renamed from: g */
    private C3754ye f25192g;

    /* renamed from: h */
    private C3754ye f25193h;

    /* renamed from: i */
    private C3754ye f25194i;

    /* renamed from: j */
    private C3754ye f25195j;

    /* renamed from: k */
    private C3754ye f25196k;

    /* renamed from: l */
    private C3754ye f25197l;

    /* renamed from: m */
    private C3754ye f25198m;

    /* renamed from: n */
    private C3754ye f25199n;

    /* renamed from: o */
    private C3754ye f25200o;

    /* renamed from: p */
    static final C3754ye f25180p = new C3754ye("PREF_KEY_DEVICE_ID_", null);

    /* renamed from: q */
    static final C3754ye f25181q = new C3754ye("PREF_KEY_UID_", null);

    /* renamed from: r */
    private static final C3754ye f25182r = new C3754ye("PREF_KEY_HOST_URL_", null);

    /* renamed from: s */
    private static final C3754ye f25183s = new C3754ye("PREF_KEY_REPORT_URL_", null);

    /* renamed from: t */
    private static final C3754ye f25184t = new C3754ye("PREF_KEY_GET_AD_URL", null);

    /* renamed from: u */
    private static final C3754ye f25185u = new C3754ye("PREF_KEY_REPORT_AD_URL", null);

    /* renamed from: v */
    private static final C3754ye f25186v = new C3754ye("PREF_KEY_STARTUP_OBTAIN_TIME_", null);

    /* renamed from: w */
    private static final C3754ye f25187w = new C3754ye("PREF_KEY_STARTUP_ENCODED_CLIDS_", null);

    /* renamed from: x */
    private static final C3754ye f25188x = new C3754ye("PREF_KEY_DISTRIBUTION_REFERRER_", null);

    /* renamed from: y */
    static final C3754ye f25189y = new C3754ye("STARTUP_CLIDS_MATCH_WITH_APP_CLIDS_", null);

    /* renamed from: z */
    static final C3754ye f25190z = new C3754ye("PREF_KEY_PINNING_UPDATE_URL", null);

    /* renamed from: A */
    private static final C3754ye f25179A = new C3754ye("PREF_KEY_EASY_COLLECTING_ENABLED_", null);

    public C3702we(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public long m17132a(long j) {
        return this.f24614b.getLong(this.f25197l.m17234a(), j);
    }

    /* renamed from: b */
    public String m17133b(String str) {
        return this.f24614b.getString(this.f25191f.m17234a(), null);
    }

    /* renamed from: c */
    public String m17134c(String str) {
        return this.f24614b.getString(this.f25198m.m17234a(), null);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3572re
    /* renamed from: d */
    public String mo16612d() {
        return "_startupserviceinfopreferences";
    }

    /* renamed from: e */
    public String m17136e(String str) {
        return this.f24614b.getString(this.f25193h.m17234a(), null);
    }

    /* renamed from: f */
    public String m17137f(String str) {
        return this.f24614b.getString(this.f25196k.m17234a(), null);
    }

    /* renamed from: g */
    public String m17139g(String str) {
        return this.f24614b.getString(this.f25194i.m17234a(), null);
    }

    /* renamed from: h */
    public String m17140h(String str) {
        return this.f24614b.getString(this.f25192g.m17234a(), null);
    }

    /* renamed from: i */
    public C3702we m17141i(String str) {
        return (C3702we) m16689a(this.f25191f.m17234a(), str);
    }

    /* renamed from: j */
    public C3702we m17142j(String str) {
        return (C3702we) m16689a(this.f25192g.m17234a(), str);
    }

    public C3702we(Context context, String str) {
        super(context, str);
        this.f25191f = new C3754ye(f25180p.m17236b());
        this.f25192g = new C3754ye(f25181q.m17236b(), m16691c());
        this.f25193h = new C3754ye(f25182r.m17236b(), m16691c());
        this.f25194i = new C3754ye(f25183s.m17236b(), m16691c());
        this.f25195j = new C3754ye(f25184t.m17236b(), m16691c());
        this.f25196k = new C3754ye(f25185u.m17236b(), m16691c());
        this.f25197l = new C3754ye(f25186v.m17236b(), m16691c());
        this.f25198m = new C3754ye(f25187w.m17236b(), m16691c());
        this.f25199n = new C3754ye(f25188x.m17236b(), m16691c());
        this.f25200o = new C3754ye(f25179A.m17236b(), m16691c());
    }

    /* renamed from: b */
    public static void m17131b(Context context) {
        C3323i.m16061a(context, "_startupserviceinfopreferences").edit().remove(f25180p.m17236b()).apply();
    }

    /* renamed from: d */
    public String m17135d(String str) {
        return this.f24614b.getString(this.f25195j.m17234a(), null);
    }

    /* renamed from: f */
    public void m17138f() {
        m16688a(this.f25191f.m17234a()).m16688a(this.f25192g.m17234a()).m16688a(this.f25193h.m17234a()).m16688a(this.f25194i.m17234a()).m16688a(this.f25195j.m17234a()).m16688a(this.f25196k.m17234a()).m16688a(this.f25197l.m17234a()).m16688a(this.f25200o.m17234a()).m16688a(this.f25198m.m17234a()).m16688a(this.f25199n.m17236b()).m16688a(f25189y.m17236b()).m16688a(f25190z.m17236b()).m16690b();
    }
}
