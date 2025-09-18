package com.yandex.metrica.impl.p022ob;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.E9 */
/* loaded from: classes2.dex */
public class C2576E9 extends AbstractC2651H9 {

    /* renamed from: c */
    private final C3754ye f21081c;

    /* renamed from: d */
    private final C3754ye f21082d;

    public C2576E9(InterfaceC3774z8 interfaceC3774z8) {
        super(interfaceC3774z8);
        this.f21081c = new C3754ye("init_event_pref_key");
        this.f21082d = new C3754ye("first_event_pref_key");
    }

    @Deprecated
    /* renamed from: e */
    public boolean m14037e() {
        return m14248a(this.f21082d.m17234a(), (String) null) != null;
    }

    @Deprecated
    /* renamed from: f */
    public String m14038f(String str) {
        return m14248a(this.f21081c.m17234a(), (String) null);
    }

    @Deprecated
    /* renamed from: g */
    public C2576E9 m14040g() {
        return (C2576E9) m14261e(this.f21082d.m17234a());
    }

    @Deprecated
    /* renamed from: h */
    public C2576E9 m14041h() {
        return (C2576E9) m14261e(this.f21081c.m17234a());
    }

    @Deprecated
    /* renamed from: i */
    public void m14042i() {
        m14253b(this.f21082d.m17234a(), "DONE").m14258c();
    }

    @Deprecated
    /* renamed from: j */
    public void m14043j() {
        m14253b(this.f21081c.m17234a(), "DONE").m14258c();
    }

    @Deprecated
    /* renamed from: f */
    public boolean m14039f() {
        return m14248a(this.f21081c.m17234a(), (String) null) != null;
    }
}
