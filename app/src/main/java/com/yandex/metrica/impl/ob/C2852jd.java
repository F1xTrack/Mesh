package com.yandex.metrica.impl.ob;

import android.location.Location;
import com.yandex.metrica.impl.ob.R0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.jd */
/* loaded from: classes2.dex */
public class C2852jd implements T0 {
    private C3206xd a;
    private C2877kd b;
    private final List<C2927md<?>> c;
    private final Xc<Ec> d;
    private final Xc<Ec> e;
    private final Xc<Ec> f;
    private final Xc<Jc> g;
    private final R0 h;
    private boolean i;

    public C2852jd(C2877kd c2877kd, C3206xd c3206xd) {
        this(c2877kd, c3206xd, P0.i().u());
    }

    @Override // com.yandex.metrica.impl.ob.T0
    public void a() {
        if (this.i) {
            Iterator<C2927md<?>> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }
    }

    public Location b() {
        if (this.i) {
            return this.a.a();
        }
        return null;
    }

    public void c() {
        if (this.i) {
            this.h.a();
            Iterator<C2927md<?>> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void d() {
        this.h.c();
        Iterator<C2927md<?>> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private C2852jd(C2877kd c2877kd, C3206xd c3206xd, I9 i9) {
        this(c2877kd, c3206xd, new Mc(c2877kd, i9), new Sc(c2877kd, i9), new C3101td(c2877kd), new Lc(c2877kd, i9, c3206xd), new R0.c());
    }

    public C2852jd(C2877kd c2877kd, C3206xd c3206xd, AbstractC3180wc abstractC3180wc, AbstractC3180wc abstractC3180wc2, C3101td c3101td, Lc lc, R0.c cVar) {
        Ec ec;
        Jc jc;
        Ec ec2;
        Ec ec3;
        this.b = c2877kd;
        Uc uc = c2877kd.c;
        if (uc != null) {
            this.i = uc.g;
            ec = uc.n;
            ec2 = uc.o;
            ec3 = uc.p;
            jc = uc.q;
        } else {
            ec = null;
            jc = null;
            ec2 = null;
            ec3 = null;
        }
        this.a = c3206xd;
        C2927md<Ec> c2927mdA = abstractC3180wc.a(c3206xd, ec2);
        C2927md<Ec> c2927mdA2 = abstractC3180wc2.a(c3206xd, ec);
        C2927md<Ec> c2927mdA3 = c3101td.a(c3206xd, ec3);
        C2927md<Jc> c2927mdA4 = lc.a(jc);
        this.c = Arrays.asList(c2927mdA, c2927mdA2, c2927mdA3, c2927mdA4);
        this.d = c2927mdA2;
        this.e = c2927mdA;
        this.f = c2927mdA3;
        this.g = c2927mdA4;
        R0 r0A = cVar.a(this.b.a.b, this, this.a.b());
        this.h = r0A;
        this.a.b().a(r0A);
    }

    public void a(Qi qi) {
        this.a.a(qi);
    }

    public void a(Uc uc) {
        this.i = uc != null && uc.g;
        this.a.a(uc);
        ((C2927md) this.d).a(uc == null ? null : uc.n);
        ((C2927md) this.e).a(uc == null ? null : uc.o);
        ((C2927md) this.f).a(uc == null ? null : uc.p);
        ((C2927md) this.g).a(uc != null ? uc.q : null);
        a();
    }
}
