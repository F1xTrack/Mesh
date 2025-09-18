package com.yandex.metrica.impl.p022ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.qe */
/* loaded from: classes2.dex */
public class C3546qe extends AbstractC3572re {

    /* renamed from: j */
    public static final /* synthetic */ int f24540j = 0;

    /* renamed from: f */
    private final C3754ye f24541f;

    /* renamed from: g */
    private final C3754ye f24542g;

    /* renamed from: h */
    private final C3754ye f24543h;

    /* renamed from: i */
    private final C3754ye f24544i;

    public C3546qe(Context context, String str) {
        super(context, str);
        this.f24541f = new C3754ye("init_event_pref_key", m16691c());
        this.f24542g = new C3754ye("init_event_pref_key");
        this.f24543h = new C3754ye("first_event_pref_key", m16691c());
        this.f24544i = new C3754ye("fitst_event_description_key", m16691c());
    }

    /* renamed from: a */
    private void m16609a(C3754ye c3754ye) {
        this.f24614b.edit().remove(c3754ye.m17234a()).apply();
    }

    @Deprecated
    /* renamed from: b */
    public String m16610b(String str) {
        return this.f24614b.getString(this.f24542g.m17234a(), null);
    }

    /* renamed from: c */
    public String m16611c(String str) {
        return this.f24614b.getString(this.f24543h.m17234a(), null);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3572re
    /* renamed from: d */
    public String mo16612d() {
        return "_initpreferences";
    }

    @Deprecated
    /* renamed from: f */
    public void m16614f() {
        m16609a(this.f24542g);
    }

    /* renamed from: g */
    public void m16615g() {
        m16609a(this.f24544i);
    }

    /* renamed from: h */
    public void m16616h() {
        m16609a(this.f24543h);
    }

    /* renamed from: i */
    public void m16617i() {
        m16609a(this.f24541f);
    }

    /* renamed from: j */
    public void m16618j() {
        m16689a(this.f24541f.m17234a(), "DONE").m16690b();
    }

    /* renamed from: d */
    public String m16613d(String str) {
        return this.f24614b.getString(this.f24541f.m17234a(), null);
    }
}
