package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class HO implements InterfaceC5505kS {
    public static final C0162Bv0 z = new C0162Bv0(13);
    public final GO a;
    public final F41 b;
    public final EO c;
    public final C1857Xo1 d;
    public final C0162Bv0 e;
    public final EO f;
    public final B10 g;
    public final B10 h;
    public final B10 i;
    public final B10 j;
    public final AtomicInteger k;
    public IO l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public InterfaceC5506kS0 q;
    public XC r;
    public boolean s;
    public C8283z10 t;
    public boolean u;
    public JO v;
    public OD w;
    public volatile boolean x;
    public boolean y;

    public HO(B10 b10, B10 b102, B10 b103, B10 b104, EO eo, EO eo2, C1857Xo1 c1857Xo1) {
        C0162Bv0 c0162Bv0 = z;
        this.a = new GO(new ArrayList(2));
        this.b = new F41();
        this.k = new AtomicInteger();
        this.g = b10;
        this.h = b102;
        this.i = b103;
        this.j = b104;
        this.f = eo;
        this.c = eo2;
        this.d = c1857Xo1;
        this.e = c0162Bv0;
    }

    public final synchronized void a(J11 j11, Executor executor) {
        try {
            this.b.a();
            GO go = this.a;
            go.getClass();
            go.a.add(new FO(j11, executor));
            if (this.s) {
                e(1);
                executor.execute(new XZ(this, j11, false, 8));
            } else if (this.u) {
                e(1);
                executor.execute(new WZ(this, j11, false, 6));
            } else {
                IL1.a("Cannot add callbacks to a cancelled EngineJob", !this.x);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC5505kS
    public final F41 b() {
        return this.b;
    }

    public final void c() {
        if (f()) {
            return;
        }
        this.x = true;
        OD od = this.w;
        od.B = true;
        MC mc = od.z;
        if (mc != null) {
            mc.cancel();
        }
        EO eo = this.f;
        IO io2 = this.l;
        synchronized (eo) {
            C4332iN c4332iN = eo.a;
            c4332iN.getClass();
            HashMap map = (HashMap) (this.p ? c4332iN.c : c4332iN.b);
            if (equals(map.get(io2))) {
                map.remove(io2);
            }
        }
    }

    public final void d() {
        JO jo;
        synchronized (this) {
            try {
                this.b.a();
                IL1.a("Not yet complete!", f());
                int iDecrementAndGet = this.k.decrementAndGet();
                IL1.a("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    jo = this.v;
                    i();
                } else {
                    jo = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jo != null) {
            jo.c();
        }
    }

    public final synchronized void e(int i) {
        JO jo;
        IL1.a("Not yet complete!", f());
        if (this.k.getAndAdd(i) == 0 && (jo = this.v) != null) {
            jo.b();
        }
    }

    public final boolean f() {
        return this.u || this.s || this.x;
    }

    public final void g() {
        synchronized (this) {
            try {
                this.b.a();
                if (this.x) {
                    i();
                    return;
                }
                if (this.a.a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.u = true;
                IO io2 = this.l;
                GO go = this.a;
                go.getClass();
                ArrayList arrayList = new ArrayList(go.a);
                e(arrayList.size() + 1);
                this.f.d(this, io2, null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    FO fo = (FO) it.next();
                    fo.b.execute(new WZ(this, fo.a, false, 6));
                }
                d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this) {
            try {
                this.b.a();
                if (this.x) {
                    this.q.recycle();
                    i();
                    return;
                }
                if (this.a.a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.s) {
                    throw new IllegalStateException("Already have resource");
                }
                C0162Bv0 c0162Bv0 = this.e;
                InterfaceC5506kS0 interfaceC5506kS0 = this.q;
                boolean z2 = this.m;
                IO io2 = this.l;
                EO eo = this.c;
                c0162Bv0.getClass();
                this.v = new JO(interfaceC5506kS0, z2, true, io2, eo);
                this.s = true;
                GO go = this.a;
                go.getClass();
                ArrayList arrayList = new ArrayList(go.a);
                e(arrayList.size() + 1);
                this.f.d(this, this.l, this.v);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    FO fo = (FO) it.next();
                    fo.b.execute(new XZ(this, fo.a, false, 8));
                }
                d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void i() {
        if (this.l == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.l = null;
        this.v = null;
        this.q = null;
        this.u = false;
        this.x = false;
        this.s = false;
        this.y = false;
        this.w.l();
        this.w = null;
        this.t = null;
        this.r = null;
        this.d.d(this);
    }

    public final synchronized void j(J11 j11) {
        try {
            this.b.a();
            GO go = this.a;
            go.a.remove(new FO(j11, AbstractC8451zu1.c));
            if (this.a.a.isEmpty()) {
                c();
                if (this.s || this.u) {
                    if (this.k.get() == 0) {
                        i();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k(OD od) {
        this.w = od;
        int iH = od.h(1);
        ((iH == 2 || iH == 3) ? this.g : this.n ? this.i : this.o ? this.j : this.h).execute(od);
    }
}
