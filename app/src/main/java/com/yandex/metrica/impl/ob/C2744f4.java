package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.impl.ob.A;
import com.yandex.metrica.impl.ob.C2719e4;
import com.yandex.metrica.impl.ob.C2856jh;
import com.yandex.metrica.impl.ob.C3144v6;
import com.yandex.metrica.impl.ob.X3;
import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.f4 */
/* loaded from: classes2.dex */
public class C2744f4 implements InterfaceC2918m4, InterfaceC2843j4, Wb, C2856jh.d {
    private final Context a;
    private final C2669c4 b;
    private final G9 c;
    private final I9 d;
    private final E9 e;
    private final C2916m2 f;
    private final C3096t8 g;
    private final C2770g5 h;
    private final C2695d5 i;
    private final A j;
    private final V3 k;
    private final C3144v6 l;
    private final C3092t4 m;
    private final C2771g6 n;
    private final Im o;
    private final C3215xm p;
    private final C3117u4 q;
    private final C2719e4.b r;
    private final Vb s;
    private final Sb t;
    private final Xb u;
    private final P v;
    private final R2 w;
    private final C2667c2 x;
    private final I8 y;

    /* renamed from: com.yandex.metrica.impl.ob.f4$a */
    public class a implements C3144v6.a {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.C3144v6.a
        public void a(C2864k0 c2864k0, C3174w6 c3174w6) {
            C2744f4.this.q.a(c2864k0, c3174w6);
        }
    }

    public C2744f4(Context context, C2669c4 c2669c4, V3 v3, R2 r2, C2769g4 c2769g4) {
        this.a = context.getApplicationContext();
        this.b = c2669c4;
        this.k = v3;
        this.w = r2;
        I8 i8D = c2769g4.d();
        this.y = i8D;
        this.x = P0.i().m();
        C3092t4 c3092t4A = c2769g4.a(this);
        this.m = c3092t4A;
        Im imB = c2769g4.b().b();
        this.o = imB;
        C3215xm c3215xmA = c2769g4.b().a();
        this.p = c3215xmA;
        G9 g9A = c2769g4.c().a();
        this.c = g9A;
        this.e = c2769g4.c().b();
        this.d = P0.i().u();
        A a2 = v3.a(c2669c4, imB, g9A);
        this.j = a2;
        this.n = c2769g4.a();
        C3096t8 c3096t8B = c2769g4.b(this);
        this.g = c3096t8B;
        C2916m2<C2744f4> c2916m2E = c2769g4.e(this);
        this.f = c2916m2E;
        this.r = c2769g4.d(this);
        Xb xbA = c2769g4.a(c3096t8B, c3092t4A);
        this.u = xbA;
        Sb sbA = c2769g4.a(c3096t8B);
        this.t = sbA;
        ArrayList arrayList = new ArrayList();
        arrayList.add(xbA);
        arrayList.add(sbA);
        this.s = c2769g4.a(arrayList, this);
        y();
        C3144v6 c3144v6A = c2769g4.a(this, i8D, new a());
        this.l = c3144v6A;
        if (c3215xmA.c()) {
            c3215xmA.a("Read app environment for component %s. Value: %s", c2669c4.toString(), a2.a().a);
        }
        this.q = c2769g4.a(g9A, i8D, c3144v6A, c3096t8B, a2, c2916m2E);
        C2695d5 c2695d5C = c2769g4.c(this);
        this.i = c2695d5C;
        this.h = c2769g4.a(this, c2695d5C);
        this.v = c2769g4.a(g9A);
        c3096t8B.e();
    }

    private void y() {
        int libraryApiLevel = YandexMetrica.getLibraryApiLevel();
        Integer numI = this.c.i();
        if (numI == null) {
            numI = Integer.valueOf(this.y.e());
        }
        if (numI.intValue() < libraryApiLevel) {
            this.r.a(new C3003pe(new C3028qe(this.a, this.b.a()))).a();
            this.y.b(libraryApiLevel);
        }
    }

    public boolean A() {
        return this.q.d() && m().y();
    }

    public boolean B() {
        return this.q.c() && m().P() && m().y();
    }

    public void C() {
        this.m.e();
    }

    public boolean D() {
        C2856jh c2856jhM = m();
        return c2856jhM.S() && this.w.b(this.q.a(), c2856jhM.M(), "should force send permissions");
    }

    public boolean E() {
        return !(this.x.a().d && this.m.d().N());
    }

    public void F() {
    }

    @Override // com.yandex.metrica.impl.ob.Li
    public synchronized void a(Hi hi, Qi qi) {
    }

    public void b(C2864k0 c2864k0) {
        this.j.a(c2864k0.b());
        A.a aVarA = this.j.a();
        V3 v3 = this.k;
        G9 g9 = this.c;
        synchronized (v3) {
            if (aVarA.b > g9.e().b) {
                g9.a(aVarA).c();
                if (this.o.c()) {
                    this.o.a("Save new app environment for %s. Value: %s", this.b, aVarA.a);
                }
            }
        }
    }

    public synchronized void c() {
        this.f.d();
    }

    public P d() {
        return this.v;
    }

    public C2669c4 e() {
        return this.b;
    }

    public G9 f() {
        return this.c;
    }

    public Context g() {
        return this.a;
    }

    public String h() {
        return this.c.m();
    }

    public C3096t8 i() {
        return this.g;
    }

    public C2771g6 j() {
        return this.n;
    }

    public C2695d5 k() {
        return this.i;
    }

    public Vb l() {
        return this.s;
    }

    public C2856jh m() {
        return (C2856jh) this.m.b();
    }

    @Deprecated
    public final C3028qe n() {
        return new C3028qe(this.a, this.b.a());
    }

    public E9 o() {
        return this.e;
    }

    public String p() {
        return this.c.l();
    }

    public Im q() {
        return this.o;
    }

    public C3117u4 r() {
        return this.q;
    }

    public com.yandex.metrica.c s() {
        return com.yandex.metrica.c.MANUAL;
    }

    public I9 t() {
        return this.d;
    }

    public C3144v6 u() {
        return this.l;
    }

    public Qi v() {
        return this.m.d();
    }

    public I8 w() {
        return this.y;
    }

    public void x() {
        this.q.b();
    }

    public boolean z() {
        C2856jh c2856jhM = m();
        return c2856jhM.S() && c2856jhM.y() && this.w.b(this.q.a(), c2856jhM.L(), "need to check permissions");
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2918m4
    public void a(C2864k0 c2864k0) {
        if (this.o.c()) {
            Im im = this.o;
            im.getClass();
            if (J0.c(c2864k0.n())) {
                StringBuilder sb = new StringBuilder("Event received on service: ");
                sb.append(c2864k0.g());
                if (J0.e(c2864k0.n()) && !TextUtils.isEmpty(c2864k0.p())) {
                    sb.append(" with value ");
                    sb.append(c2864k0.p());
                }
                im.b(sb.toString());
            }
        }
        String strA = this.b.a();
        if (TextUtils.isEmpty(strA) || ResultCode.ERROR.equals(strA)) {
            return;
        }
        this.h.a(c2864k0);
    }

    public void b() {
        this.j.b();
        V3 v3 = this.k;
        A.a aVarA = this.j.a();
        G9 g9 = this.c;
        synchronized (v3) {
            g9.a(aVarA).c();
        }
    }

    public void b(String str) {
        this.c.h(str).c();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2918m4
    public synchronized void a(X3.a aVar) {
        try {
            C3092t4 c3092t4 = this.m;
            synchronized (c3092t4) {
                c3092t4.a((C3092t4) aVar);
            }
            if (Boolean.TRUE.equals(aVar.k)) {
                this.o.e();
            } else {
                if (Boolean.FALSE.equals(aVar.k)) {
                    this.o.d();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.yandex.metrica.impl.ob.Li
    public synchronized void a(Qi qi) {
        this.m.a(qi);
        this.g.b(qi);
        this.s.c();
    }

    public void a(String str) {
        this.c.i(str).c();
    }
}
