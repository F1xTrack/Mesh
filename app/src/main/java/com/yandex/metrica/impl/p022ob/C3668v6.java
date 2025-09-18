package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.v6 */
/* loaded from: classes2.dex */
public class C3668v6 {

    /* renamed from: a */
    private final C3250f4 f24978a;

    /* renamed from: b */
    private final C3642u6 f24979b;

    /* renamed from: c */
    private final a f24980c;

    /* renamed from: d */
    private final C2717K0 f24981d;

    /* renamed from: e */
    private final InterfaceC3486o6<C3538q6> f24982e;

    /* renamed from: f */
    private final InterfaceC3486o6<C3538q6> f24983f;

    /* renamed from: g */
    private C3512p6 f24984g;

    /* renamed from: h */
    private b f24985h;

    /* renamed from: com.yandex.metrica.impl.ob.v6$a */
    public interface a {
        /* renamed from: a */
        void mo15926a(C3376k0 c3376k0, C3694w6 c3694w6);
    }

    /* renamed from: com.yandex.metrica.impl.ob.v6$b */
    public enum b {
        EMPTY,
        BACKGROUND,
        FOREGROUND
    }

    public C3668v6(C3250f4 c3250f4, C3642u6 c3642u6, a aVar) {
        this(c3250f4, c3642u6, aVar, new C3460n6(c3250f4, c3642u6), new C3434m6(c3250f4, c3642u6), new C2717K0(c3250f4.m15908g()));
    }

    /* renamed from: e */
    private void m16951e(C3376k0 c3376k0) {
        if (this.f24985h == null) {
            C3512p6 c3512p6M16379b = ((AbstractC3408l6) this.f24982e).m16379b();
            if (m16949a(c3512p6M16379b, c3376k0)) {
                this.f24984g = c3512p6M16379b;
                this.f24985h = b.FOREGROUND;
                return;
            }
            C3512p6 c3512p6M16379b2 = ((AbstractC3408l6) this.f24983f).m16379b();
            if (m16949a(c3512p6M16379b2, c3376k0)) {
                this.f24984g = c3512p6M16379b2;
                this.f24985h = b.BACKGROUND;
            } else {
                this.f24984g = null;
                this.f24985h = b.EMPTY;
            }
        }
    }

    /* renamed from: a */
    public synchronized long m16952a() {
        C3512p6 c3512p6;
        c3512p6 = this.f24984g;
        return c3512p6 == null ? 10000000000L : c3512p6.m16565c() - 1;
    }

    /* renamed from: b */
    public C3694w6 m16953b(C3376k0 c3376k0) {
        return m16948a(m16954c(c3376k0), c3376k0.m16235e());
    }

    /* renamed from: c */
    public synchronized C3512p6 m16954c(C3376k0 c3376k0) {
        try {
            m16951e(c3376k0);
            b bVar = this.f24985h;
            b bVar2 = b.EMPTY;
            if (bVar != bVar2 && !m16949a(this.f24984g, c3376k0)) {
                this.f24985h = bVar2;
                this.f24984g = null;
            }
            int iOrdinal = this.f24985h.ordinal();
            if (iOrdinal == 1) {
                this.f24984g.m16566c(c3376k0.m16235e());
                return this.f24984g;
            }
            if (iOrdinal == 2) {
                return this.f24984g;
            }
            this.f24985h = b.BACKGROUND;
            long jM16235e = c3376k0.m16235e();
            C3512p6 c3512p6M16377a = ((AbstractC3408l6) this.f24983f).m16377a(new C3538q6(jM16235e, c3376k0.m16236f()));
            if (this.f24978a.m15923w().m14301m()) {
                this.f24980c.mo15926a(C3376k0.m16211a(c3376k0, this.f24981d), m16948a(c3512p6M16377a, c3376k0.m16235e()));
            } else if (c3376k0.m16244n() == EnumC3377k1.EVENT_TYPE_FIRST_ACTIVATION.m16250b()) {
                this.f24980c.mo15926a(c3376k0, m16948a(c3512p6M16377a, jM16235e));
                this.f24980c.mo15926a(C3376k0.m16211a(c3376k0, this.f24981d), m16948a(c3512p6M16377a, jM16235e));
            }
            this.f24984g = c3512p6M16377a;
            return c3512p6M16377a;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: d */
    public synchronized void m16955d(C3376k0 c3376k0) {
        try {
            m16951e(c3376k0);
            int iOrdinal = this.f24985h.ordinal();
            if (iOrdinal == 0) {
                this.f24984g = m16947a(c3376k0);
            } else if (iOrdinal == 1) {
                m16950b(this.f24984g, c3376k0);
                this.f24984g = m16947a(c3376k0);
            } else if (iOrdinal == 2) {
                if (m16949a(this.f24984g, c3376k0)) {
                    this.f24984g.m16566c(c3376k0.m16235e());
                } else {
                    this.f24984g = m16947a(c3376k0);
                }
            }
        } finally {
        }
    }

    /* renamed from: f */
    public C3694w6 m16956f(C3376k0 c3376k0) {
        C3512p6 c3512p6M16379b;
        if (this.f24985h == null) {
            c3512p6M16379b = ((AbstractC3408l6) this.f24982e).m16379b();
            if (c3512p6M16379b == null ? false : c3512p6M16379b.m16564b(c3376k0.m16235e())) {
                c3512p6M16379b = ((AbstractC3408l6) this.f24983f).m16379b();
                if (c3512p6M16379b != null ? c3512p6M16379b.m16564b(c3376k0.m16235e()) : false) {
                    c3512p6M16379b = null;
                }
            }
        } else {
            c3512p6M16379b = this.f24984g;
        }
        if (c3512p6M16379b != null) {
            return new C3694w6().m17124c(c3512p6M16379b.m16565c()).m17119a(c3512p6M16379b.m16568e()).m17122b(c3512p6M16379b.m16567d()).m17120a(c3512p6M16379b.m16569f());
        }
        long jM16236f = c3376k0.m16236f();
        long jM16901a = this.f24979b.m16901a();
        C3618t8 c3618t8M15910i = this.f24978a.m15910i();
        EnumC3772z6 enumC3772z6 = EnumC3772z6.BACKGROUND;
        c3618t8M15910i.m16834a(jM16901a, enumC3772z6, jM16236f);
        return new C3694w6().m17124c(jM16901a).m17120a(enumC3772z6).m17119a(0L).m17122b(0L);
    }

    /* renamed from: g */
    public synchronized void m16957g(C3376k0 c3376k0) {
        try {
            m16954c(c3376k0).m16562a(false);
            b bVar = this.f24985h;
            b bVar2 = b.EMPTY;
            if (bVar != bVar2) {
                m16950b(this.f24984g, c3376k0);
            }
            this.f24985h = bVar2;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    private C3512p6 m16947a(C3376k0 c3376k0) {
        long jM16235e = c3376k0.m16235e();
        C3512p6 c3512p6M16377a = ((AbstractC3408l6) this.f24982e).m16377a(new C3538q6(jM16235e, c3376k0.m16236f()));
        this.f24985h = b.FOREGROUND;
        this.f24978a.m15913l().m15305c();
        this.f24980c.mo15926a(C3376k0.m16211a(c3376k0, this.f24981d), m16948a(c3512p6M16377a, jM16235e));
        return c3512p6M16377a;
    }

    /* renamed from: b */
    private void m16950b(C3512p6 c3512p6, C3376k0 c3376k0) {
        if (c3512p6.m16570h()) {
            this.f24980c.mo15926a(C3376k0.m16209a(c3376k0), new C3694w6().m17124c(c3512p6.m16565c()).m17120a(c3512p6.m16569f()).m17119a(c3512p6.m16568e()).m17122b(c3512p6.m16563b()));
            c3512p6.m16562a(false);
        }
        c3512p6.m16571i();
    }

    public C3668v6(C3250f4 c3250f4, C3642u6 c3642u6, a aVar, InterfaceC3486o6<C3538q6> interfaceC3486o6, InterfaceC3486o6<C3538q6> interfaceC3486o62, C2717K0 c2717k0) {
        this.f24985h = null;
        this.f24978a = c3250f4;
        this.f24980c = aVar;
        this.f24982e = interfaceC3486o6;
        this.f24983f = interfaceC3486o62;
        this.f24979b = c3642u6;
        this.f24981d = c2717k0;
    }

    /* renamed from: a */
    private boolean m16949a(C3512p6 c3512p6, C3376k0 c3376k0) {
        if (c3512p6 == null) {
            return false;
        }
        if (c3512p6.m16564b(c3376k0.m16235e())) {
            return true;
        }
        m16950b(c3512p6, c3376k0);
        return false;
    }

    /* renamed from: a */
    private C3694w6 m16948a(C3512p6 c3512p6, long j) {
        return new C3694w6().m17124c(c3512p6.m16565c()).m17119a(c3512p6.m16568e()).m17122b(c3512p6.m16561a(j)).m17120a(c3512p6.m16569f());
    }
}
