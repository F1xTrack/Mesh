package com.yandex.metrica.impl.p022ob;

import android.annotation.SuppressLint;
import android.content.Context;
import com.yandex.metrica.impl.p022ob.C2769M2;
import com.yandex.metrica.impl.p022ob.C3232ec;
import com.yandex.metrica.impl.p022ob.C3418lg;
import com.yandex.metrica.impl.p022ob.InterfaceC2777Ma;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.P0 */
/* loaded from: classes2.dex */
public final class C2842P0 {

    /* renamed from: y */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C2842P0 f21893y;

    /* renamed from: a */
    private final Context f21894a;

    /* renamed from: b */
    private volatile C2982Ug f21895b;

    /* renamed from: c */
    private volatile C2734Kh f21896c;

    /* renamed from: d */
    private volatile C3418lg f21897d;

    /* renamed from: e */
    private volatile C2853Pb f21898e;

    /* renamed from: f */
    private volatile C2769M2 f21899f;

    /* renamed from: h */
    private volatile C2559Dh f21901h;

    /* renamed from: i */
    private volatile C2767M0 f21902i;

    /* renamed from: k */
    private volatile C3760yk f21904k;

    /* renamed from: l */
    private volatile C2766M f21905l;

    /* renamed from: m */
    private volatile C2544D2 f21906m;

    /* renamed from: n */
    private volatile C2892R1 f21907n;

    /* renamed from: o */
    private volatile C3078Yc f21908o;

    /* renamed from: p */
    private volatile C3232ec f21909p;

    /* renamed from: q */
    private volatile C3336ic f21910q;

    /* renamed from: r */
    private volatile C3170c2 f21911r;

    /* renamed from: s */
    private volatile C2866Q f21912s;

    /* renamed from: t */
    private volatile C2676I9 f21913t;

    /* renamed from: u */
    private volatile C2725K8 f21914u;

    /* renamed from: w */
    private C3481o1 f21916w;

    /* renamed from: x */
    private C3104Zd f21917x;

    /* renamed from: j */
    private volatile C3789zn f21903j = new C3789zn();

    /* renamed from: g */
    private C3687w f21900g = new C3687w();

    /* renamed from: v */
    private C3742y2 f21915v = new C3742y2();

    private C2842P0(Context context) {
        this.f21894a = context;
        this.f21916w = new C3481o1(context, this.f21903j.m17349b());
        this.f21905l = new C2766M(this.f21903j.m17349b(), this.f21916w.m16501b());
    }

    /* renamed from: A */
    private void m14726A() {
        if (this.f21911r == null) {
            synchronized (this) {
                try {
                    if (this.f21911r == null) {
                        C2876Q9 c2876q9Mo14606a = InterfaceC2777Ma.b.m14608a(C2506Be.class).mo14606a(this.f21894a);
                        C2506Be c2506Be = (C2506Be) c2876q9Mo14606a.m14814b();
                        Context context = this.f21894a;
                        C2681Ie c2681Ie = new C2681Ie();
                        C2481Ae c2481Ae = new C2481Ae(c2506Be);
                        C2806Ne c2806Ne = new C2806Ne();
                        C2656He c2656He = new C2656He(this.f21894a);
                        C2842P0 c2842p0M14728i = m14728i();
                        O90.m5967e(c2842p0M14728i, "GlobalServiceLocator.getInstance()");
                        C2676I9 c2676i9M14750u = c2842p0M14728i.m14750u();
                        O90.m5967e(c2676i9M14750u, "GlobalServiceLocator.get…ance().servicePreferences");
                        this.f21911r = new C3170c2(context, c2876q9Mo14606a, c2681Ie, c2481Ae, c2806Ne, c2656He, new C2706Je(c2676i9M14750u), new C2531Ce(), c2506Be, "[PreloadInfoStorage]");
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m14727a(Context context) {
        if (f21893y == null) {
            synchronized (C2842P0.class) {
                try {
                    if (f21893y == null) {
                        f21893y = new C2842P0(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: i */
    public static C2842P0 m14728i() {
        return f21893y;
    }

    /* renamed from: b */
    public C3336ic m14732b() {
        if (this.f21910q == null) {
            synchronized (this) {
                try {
                    if (this.f21910q == null) {
                        this.f21910q = new C3336ic(this.f21894a, C3362jc.m16118a());
                    }
                } finally {
                }
            }
        }
        return this.f21910q;
    }

    /* renamed from: c */
    public C2566E m14733c() {
        return this.f21916w.m16499a();
    }

    /* renamed from: d */
    public C2766M m14734d() {
        return this.f21905l;
    }

    /* renamed from: e */
    public C2866Q m14735e() {
        if (this.f21912s == null) {
            synchronized (this) {
                try {
                    if (this.f21912s == null) {
                        C2876Q9 c2876q9Mo14606a = InterfaceC2777Ma.b.m14608a(C2845P3.class).mo14606a(this.f21894a);
                        this.f21912s = new C2866Q(this.f21894a, c2876q9Mo14606a, new C2870Q3(), new C2745L3(), new C2919S3(), new C3638u2(this.f21894a), new C2894R3(m14750u()), new C2770M3(), (C2845P3) c2876q9Mo14606a.m14814b(), "[ClidsInfoStorage]");
                    }
                } finally {
                }
            }
        }
        return this.f21912s;
    }

    /* renamed from: f */
    public Context m14736f() {
        return this.f21894a;
    }

    /* renamed from: g */
    public C2853Pb m14737g() {
        if (this.f21898e == null) {
            synchronized (this) {
                try {
                    if (this.f21898e == null) {
                        this.f21898e = new C2853Pb(this.f21916w.m16499a(), new C2803Nb());
                    }
                } finally {
                }
            }
        }
        return this.f21898e;
    }

    /* renamed from: h */
    public C2767M0 m14738h() {
        if (this.f21902i == null) {
            synchronized (this) {
                try {
                    if (this.f21902i == null) {
                        this.f21902i = new C2767M0();
                    }
                } finally {
                }
            }
        }
        return this.f21902i;
    }

    /* renamed from: j */
    public C3481o1 m14739j() {
        return this.f21916w;
    }

    /* renamed from: k */
    public C3078Yc m14740k() {
        C3078Yc c3078Yc = this.f21908o;
        if (c3078Yc == null) {
            synchronized (this) {
                try {
                    c3078Yc = this.f21908o;
                    if (c3078Yc == null) {
                        c3078Yc = new C3078Yc(this.f21894a);
                        this.f21908o = c3078Yc;
                    }
                } finally {
                }
            }
        }
        return c3078Yc;
    }

    /* renamed from: l */
    public C2892R1 m14741l() {
        return this.f21907n;
    }

    /* renamed from: m */
    public C3170c2 m14742m() {
        m14726A();
        return this.f21911r;
    }

    /* renamed from: n */
    public C3418lg m14743n() {
        if (this.f21897d == null) {
            synchronized (this) {
                try {
                    if (this.f21897d == null) {
                        Context context = this.f21894a;
                        C2876Q9 c2876q9Mo14606a = InterfaceC2777Ma.b.m14608a(C3418lg.e.class).mo14606a(this.f21894a);
                        C2769M2 c2769m2M14751v = m14751v();
                        if (this.f21896c == null) {
                            synchronized (this) {
                                if (this.f21896c == null) {
                                    this.f21896c = new C2734Kh();
                                }
                            }
                        }
                        this.f21897d = new C3418lg(context, c2876q9Mo14606a, c2769m2M14751v, this.f21896c, this.f21903j.m17356h(), new C3580rm());
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            }
        }
        return this.f21897d;
    }

    /* renamed from: o */
    public C2982Ug m14744o() {
        if (this.f21895b == null) {
            synchronized (this) {
                try {
                    if (this.f21895b == null) {
                        this.f21895b = new C2982Ug(this.f21894a);
                    }
                } finally {
                }
            }
        }
        return this.f21895b;
    }

    /* renamed from: p */
    public C3742y2 m14745p() {
        return this.f21915v;
    }

    /* renamed from: q */
    public C2559Dh m14746q() {
        if (this.f21901h == null) {
            synchronized (this) {
                try {
                    if (this.f21901h == null) {
                        this.f21901h = new C2559Dh(this.f21894a, this.f21903j.m17356h());
                    }
                } finally {
                }
            }
        }
        return this.f21901h;
    }

    /* renamed from: r */
    public synchronized C2544D2 m14747r() {
        return this.f21906m;
    }

    /* renamed from: s */
    public C3789zn m14748s() {
        return this.f21903j;
    }

    /* renamed from: t */
    public C3232ec m14749t() {
        if (this.f21909p == null) {
            synchronized (this) {
                try {
                    if (this.f21909p == null) {
                        this.f21909p = new C3232ec(new C3232ec.h(), new C3232ec.d(), new C3232ec.c(), this.f21903j.m17349b(), "ServiceInternal");
                    }
                } finally {
                }
            }
        }
        return this.f21909p;
    }

    /* renamed from: u */
    public C2676I9 m14750u() {
        if (this.f21913t == null) {
            synchronized (this) {
                try {
                    if (this.f21913t == null) {
                        this.f21913t = new C2676I9(C2877Qa.m14815a(this.f21894a).m14833i());
                    }
                } finally {
                }
            }
        }
        return this.f21913t;
    }

    /* renamed from: v */
    public C2769M2 m14751v() {
        if (this.f21899f == null) {
            synchronized (this) {
                try {
                    if (this.f21899f == null) {
                        this.f21899f = new C2769M2(new C2769M2.b(m14750u()));
                    }
                } finally {
                }
            }
        }
        return this.f21899f;
    }

    /* renamed from: w */
    public C3760yk m14752w() {
        if (this.f21904k == null) {
            synchronized (this) {
                try {
                    if (this.f21904k == null) {
                        this.f21904k = new C3760yk(this.f21894a, this.f21903j.m17358j());
                    }
                } finally {
                }
            }
        }
        return this.f21904k;
    }

    /* renamed from: x */
    public synchronized C3104Zd m14753x() {
        try {
            if (this.f21917x == null) {
                this.f21917x = new C3104Zd(this.f21894a, new C3079Yd(), new C3054Xd());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f21917x;
    }

    /* renamed from: y */
    public synchronized C2725K8 m14754y() {
        try {
            if (this.f21914u == null) {
                this.f21914u = new C2725K8(this.f21894a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f21914u;
    }

    /* renamed from: z */
    public synchronized void m14755z() {
        try {
            m14743n().m16399a();
            m14726A();
            if (this.f21907n == null) {
                C2892R1 c2892r1 = new C2892R1(this.f21894a, this.f21903j.m17357i(), m14750u());
                c2892r1.setName(ThreadFactoryC3711wn.m17152a("YMM-NC"));
                this.f21916w.m16500a(c2892r1);
                c2892r1.start();
                this.f21907n = c2892r1;
            }
            m14740k().m15484b();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public C3687w m14729a() {
        return this.f21900g;
    }

    /* renamed from: a */
    public synchronized void m14731a(C2885Qi c2885Qi) {
        try {
            if (this.f21909p != null) {
                this.f21909p.m15841a(c2885Qi);
            }
            if (this.f21901h != null) {
                this.f21901h.m14010b(c2885Qi);
            }
            if (this.f21902i != null) {
                this.f21902i.m14571a(c2885Qi);
            }
            if (this.f21898e != null) {
                this.f21898e.m14767b(c2885Qi);
            }
            C3104Zd c3104Zd = this.f21917x;
            if (c3104Zd != null) {
                c3104Zd.m15541a(c2885Qi);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public synchronized void m14730a(C2569E2 c2569e2) {
        this.f21906m = new C2544D2(this.f21894a, c2569e2);
    }
}
