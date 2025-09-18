package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.SystemClock;
import com.yandex.metrica.impl.ob.R0;
import com.yandex.metrica.impl.ob.Wc;
import java.util.Collection;

/* loaded from: classes2.dex */
public class Pc {
    private final Qc a;
    private final Rc b;
    private final Nm c;
    private Uc d;
    private final M e;
    private final C2643b3 f;
    private final Gd g;
    private final E h;
    private boolean i;
    private final Runnable j;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Pc.this.b();
            Pc.this.c();
        }
    }

    public class b implements Wj {
        final /* synthetic */ Tc a;

        public b(Pc pc, Tc tc) {
            this.a = tc;
        }

        @Override // com.yandex.metrica.impl.ob.Wj
        public void a(Collection<Vj> collection) {
            this.a.a(C3240ym.a(collection));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Pc(Qc qc) {
        Context context = qc.a.a;
        Uc uc = qc.e;
        this(qc, new Gd(context, uc == null ? null : uc.m));
    }

    public void c() {
        Uc uc = this.d;
        if (uc != null) {
            long j = uc.h;
            if (j > 0) {
                this.a.a.b.a(this.j, j);
            }
        }
    }

    public void b() {
        Tc tc = new Tc();
        this.c.getClass();
        tc.b(System.currentTimeMillis());
        this.c.getClass();
        tc.a(SystemClock.elapsedRealtime());
        this.g.b();
        tc.b(Z2.a(this.f.a().a()));
        this.a.b.a(new b(this, tc));
        tc.a(this.e.b());
        tc.a(Wc.a.a(this.h.c()));
        this.b.a(tc);
        this.a.c.a();
        this.a.d.a();
    }

    public void d() {
        a();
    }

    public void e() {
        this.a.a.b.a(this.j);
    }

    private void a() {
        Uc uc = this.d;
        boolean z = uc != null && uc.i;
        if (this.i != z) {
            this.i = z;
            if (z) {
                c();
            } else {
                this.a.a.b.a(this.j);
            }
        }
    }

    private Pc(Qc qc, Gd gd) {
        this(qc, new Rc(qc.a.a), new Nm(), P0.i().d(), P0.i().c(), C2643b3.a(qc.a.a), gd, new R0.c());
    }

    public void a(Uc uc) {
        this.d = uc;
        this.g.a(uc == null ? null : uc.m);
        a();
    }

    public Pc(Qc qc, Rc rc, Nm nm, M m, E e, C2643b3 c2643b3, Gd gd, R0.c cVar) {
        this.j = new a();
        this.a = qc;
        this.b = rc;
        this.c = nm;
        this.d = qc.e;
        this.e = m;
        this.h = e;
        this.f = c2643b3;
        this.g = gd;
        c2643b3.a().a(cVar.a(qc.a.b, gd, c2643b3.a()));
    }
}
