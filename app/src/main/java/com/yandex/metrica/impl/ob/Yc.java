package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.E;
import com.yandex.metrica.impl.ob.M;
import com.yandex.metrica.impl.ob.Qi;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class Yc implements M.c, E.b {
    private List<Wc> a;
    private final M b;
    private final C2703dd c;
    private final E d;
    private volatile Uc e;
    private final Set<Vc> f;
    private final Object g;

    public Yc(Context context) {
        this(P0.i().d(), C2703dd.a(context), new Qi.b(context), P0.i().c());
    }

    private void d() {
        Uc ucA = a();
        if (U2.a(this.e, ucA)) {
            return;
        }
        this.c.a(ucA);
        this.e = ucA;
        Uc uc = this.e;
        Iterator<Vc> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().a(uc);
        }
    }

    public synchronized void a(Vc vc) {
        this.f.add(vc);
    }

    public void b() {
        synchronized (this.g) {
            this.b.a(this);
            this.d.a(this);
        }
    }

    public synchronized void c() {
        d();
    }

    public synchronized void a(Qi qi) {
        this.a = qi.x();
        this.e = a();
        this.c.a(qi, this.e);
        Uc uc = this.e;
        Iterator<Vc> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().a(uc);
        }
    }

    public Yc(M m, C2703dd c2703dd, Qi.b bVar, E e) {
        this.f = new HashSet();
        this.g = new Object();
        this.b = m;
        this.c = c2703dd;
        this.d = e;
        this.a = bVar.a().x();
    }

    @Override // com.yandex.metrica.impl.ob.E.b
    public synchronized void a(E.a aVar) {
        d();
    }

    @Override // com.yandex.metrica.impl.ob.M.c
    public synchronized void a(M.b.a aVar) {
        d();
    }

    private Uc a() {
        E.a aVarC = this.d.c();
        M.b.a aVarB = this.b.b();
        for (Wc wc : this.a) {
            if (wc.b.a.contains(aVarB) && wc.b.b.contains(aVarC)) {
                return wc.a;
            }
        }
        return null;
    }
}
