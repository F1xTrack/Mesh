package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: HO */
/* loaded from: classes.dex */
public final class C0466HO implements InterfaceC6301kS {

    /* renamed from: z */
    public static final C7408Bv0 f4255z = new C7408Bv0(13);

    /* renamed from: a */
    public final C0403GO f4256a;

    /* renamed from: b */
    public final F41 f4257b;

    /* renamed from: c */
    public final C0277EO f4258c;

    /* renamed from: d */
    public final C8539Xo1 f4259d;

    /* renamed from: e */
    public final C7408Bv0 f4260e;

    /* renamed from: f */
    public final C0277EO f4261f;

    /* renamed from: g */
    public final B10 f4262g;

    /* renamed from: h */
    public final B10 f4263h;

    /* renamed from: i */
    public final B10 f4264i;

    /* renamed from: j */
    public final B10 f4265j;

    /* renamed from: k */
    public final AtomicInteger f4266k;

    /* renamed from: l */
    public C0529IO f4267l;

    /* renamed from: m */
    public boolean f4268m;

    /* renamed from: n */
    public boolean f4269n;

    /* renamed from: o */
    public boolean f4270o;

    /* renamed from: p */
    public boolean f4271p;

    /* renamed from: q */
    public InterfaceC10011kS0 f4272q;

    /* renamed from: r */
    public EnumC1460XC f4273r;

    /* renamed from: s */
    public boolean f4274s;

    /* renamed from: t */
    public C11871z10 f4275t;

    /* renamed from: u */
    public boolean f4276u;

    /* renamed from: v */
    public C0592JO f4277v;

    /* renamed from: w */
    public RunnableC0895OD f4278w;

    /* renamed from: x */
    public volatile boolean f4279x;

    /* renamed from: y */
    public boolean f4280y;

    public C0466HO(B10 b10, B10 b102, B10 b103, B10 b104, C0277EO c0277eo, C0277EO c0277eo2, C8539Xo1 c8539Xo1) {
        C7408Bv0 c7408Bv0 = f4255z;
        this.f4256a = new C0403GO(new ArrayList(2));
        this.f4257b = new F41();
        this.f4266k = new AtomicInteger();
        this.f4262g = b10;
        this.f4263h = b102;
        this.f4264i = b103;
        this.f4265j = b104;
        this.f4261f = c0277eo;
        this.f4258c = c0277eo2;
        this.f4259d = c8539Xo1;
        this.f4260e = c7408Bv0;
    }

    /* renamed from: a */
    public final synchronized void m3388a(J11 j11, Executor executor) {
        try {
            this.f4257b.m2490a();
            C0403GO c0403go = this.f4256a;
            c0403go.getClass();
            c0403go.f3728a.add(new C0340FO(j11, executor));
            if (this.f4274s) {
                m3392e(1);
                executor.execute(new RunnableC1483XZ(this, j11, false, 8));
            } else if (this.f4276u) {
                m3392e(1);
                executor.execute(new RunnableC1420WZ(this, j11, false, 6));
            } else {
                IL1.m3827a("Cannot add callbacks to a cancelled EngineJob", !this.f4279x);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.InterfaceC6301kS
    /* renamed from: b */
    public final F41 mo3389b() {
        return this.f4257b;
    }

    /* renamed from: c */
    public final void m3390c() {
        if (m3393f()) {
            return;
        }
        this.f4279x = true;
        RunnableC0895OD runnableC0895OD = this.f4278w;
        runnableC0895OD.f8274B = true;
        InterfaceC0768MC interfaceC0768MC = runnableC0895OD.f8303z;
        if (interfaceC0768MC != null) {
            interfaceC0768MC.cancel();
        }
        C0277EO c0277eo = this.f4261f;
        C0529IO c0529io = this.f4267l;
        synchronized (c0277eo) {
            C4238iN c4238iN = c0277eo.f2679a;
            c4238iN.getClass();
            HashMap map = (HashMap) (this.f4271p ? c4238iN.f29114c : c4238iN.f29113b);
            if (equals(map.get(c0529io))) {
                map.remove(c0529io);
            }
        }
    }

    /* renamed from: d */
    public final void m3391d() {
        C0592JO c0592jo;
        synchronized (this) {
            try {
                this.f4257b.m2490a();
                IL1.m3827a("Not yet complete!", m3393f());
                int iDecrementAndGet = this.f4266k.decrementAndGet();
                IL1.m3827a("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    c0592jo = this.f4277v;
                    m3396i();
                } else {
                    c0592jo = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0592jo != null) {
            c0592jo.m4304c();
        }
    }

    /* renamed from: e */
    public final synchronized void m3392e(int i) {
        C0592JO c0592jo;
        IL1.m3827a("Not yet complete!", m3393f());
        if (this.f4266k.getAndAdd(i) == 0 && (c0592jo = this.f4277v) != null) {
            c0592jo.m4303b();
        }
    }

    /* renamed from: f */
    public final boolean m3393f() {
        return this.f4276u || this.f4274s || this.f4279x;
    }

    /* renamed from: g */
    public final void m3394g() {
        synchronized (this) {
            try {
                this.f4257b.m2490a();
                if (this.f4279x) {
                    m3396i();
                    return;
                }
                if (this.f4256a.f3728a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f4276u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f4276u = true;
                C0529IO c0529io = this.f4267l;
                C0403GO c0403go = this.f4256a;
                c0403go.getClass();
                ArrayList arrayList = new ArrayList(c0403go.f3728a);
                m3392e(arrayList.size() + 1);
                this.f4261f.m2205d(this, c0529io, null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0340FO c0340fo = (C0340FO) it.next();
                    c0340fo.f3191b.execute(new RunnableC1420WZ(this, c0340fo.f3190a, false, 6));
                }
                m3391d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: h */
    public final void m3395h() {
        synchronized (this) {
            try {
                this.f4257b.m2490a();
                if (this.f4279x) {
                    this.f4272q.recycle();
                    m3396i();
                    return;
                }
                if (this.f4256a.f3728a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f4274s) {
                    throw new IllegalStateException("Already have resource");
                }
                C7408Bv0 c7408Bv0 = this.f4260e;
                InterfaceC10011kS0 interfaceC10011kS0 = this.f4272q;
                boolean z = this.f4268m;
                C0529IO c0529io = this.f4267l;
                C0277EO c0277eo = this.f4258c;
                c7408Bv0.getClass();
                this.f4277v = new C0592JO(interfaceC10011kS0, z, true, c0529io, c0277eo);
                this.f4274s = true;
                C0403GO c0403go = this.f4256a;
                c0403go.getClass();
                ArrayList arrayList = new ArrayList(c0403go.f3728a);
                m3392e(arrayList.size() + 1);
                this.f4261f.m2205d(this, this.f4267l, this.f4277v);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0340FO c0340fo = (C0340FO) it.next();
                    c0340fo.f3191b.execute(new RunnableC1483XZ(this, c0340fo.f3190a, false, 8));
                }
                m3391d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: i */
    public final synchronized void m3396i() {
        if (this.f4267l == null) {
            throw new IllegalArgumentException();
        }
        this.f4256a.f3728a.clear();
        this.f4267l = null;
        this.f4277v = null;
        this.f4272q = null;
        this.f4276u = false;
        this.f4279x = false;
        this.f4274s = false;
        this.f4280y = false;
        this.f4278w.m5991l();
        this.f4278w = null;
        this.f4275t = null;
        this.f4273r = null;
        this.f4259d.mo4580d(this);
    }

    /* renamed from: j */
    public final synchronized void m3397j(J11 j11) {
        try {
            this.f4257b.m2490a();
            C0403GO c0403go = this.f4256a;
            c0403go.f3728a.remove(new C0340FO(j11, AbstractC11984zu1.f47093c));
            if (this.f4256a.f3728a.isEmpty()) {
                m3390c();
                if (this.f4274s || this.f4276u) {
                    if (this.f4266k.get() == 0) {
                        m3396i();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: k */
    public final synchronized void m3398k(RunnableC0895OD runnableC0895OD) {
        this.f4278w = runnableC0895OD;
        int iM5987h = runnableC0895OD.m5987h(1);
        ((iM5987h == 2 || iM5987h == 3) ? this.f4262g : this.f4269n ? this.f4264i : this.f4270o ? this.f4265j : this.f4263h).execute(runnableC0895OD);
    }
}
