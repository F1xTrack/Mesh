package p000;

import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: EO */
/* loaded from: classes.dex */
public final class C0277EO {

    /* renamed from: i */
    public static final boolean f2678i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    public final C4238iN f2679a;

    /* renamed from: b */
    public final C7460Cv0 f2680b;

    /* renamed from: c */
    public final C7494Dm0 f2681c;

    /* renamed from: d */
    public final C1002Pv f2682d;

    /* renamed from: e */
    public final C0926Oi f2683e;

    /* renamed from: f */
    public final C0214DO f2684f;

    /* renamed from: g */
    public final C1356VY f2685g;

    /* renamed from: h */
    public final C7176y2 f2686h;

    public C0277EO(C7494Dm0 c7494Dm0, C7391Bm1 c7391Bm1, B10 b10, B10 b102, B10 b103, B10 b104) {
        this.f2681c = c7494Dm0;
        C0214DO c0214do = new C0214DO(c7391Bm1);
        this.f2684f = c0214do;
        C7176y2 c7176y2 = new C7176y2();
        this.f2686h = c7176y2;
        synchronized (this) {
            synchronized (c7176y2) {
                c7176y2.f46041d = this;
            }
        }
        this.f2680b = new C7460Cv0(13);
        this.f2679a = new C4238iN(18, (byte) 0);
        C1002Pv c1002Pv = new C1002Pv();
        c1002Pv.f9357g = AbstractC8137Pv1.m6489b(150, new C8342Tu0(13, c1002Pv));
        c1002Pv.f9351a = b10;
        c1002Pv.f9352b = b102;
        c1002Pv.f9353c = b103;
        c1002Pv.f9354d = b104;
        c1002Pv.f9355e = this;
        c1002Pv.f9356f = this;
        this.f2682d = c1002Pv;
        this.f2685g = new C1356VY(c0214do);
        this.f2683e = new C0926Oi(10);
        c7494Dm0.f2235d = this;
    }

    /* renamed from: f */
    public static void m2201f(InterfaceC10011kS0 interfaceC10011kS0) {
        if (!(interfaceC10011kS0 instanceof C0592JO)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C0592JO) interfaceC10011kS0).m4304c();
    }

    /* renamed from: a */
    public final C10189lr0 m2202a(C11617x10 c11617x10, Object obj, InterfaceC7740If0 interfaceC7740If0, int i, int i2, Class cls, Class cls2, EnumC11389vD0 enumC11389vD0, AbstractC4046fK abstractC4046fK, Map map, boolean z, boolean z2, C7830Jy0 c7830Jy0, boolean z3, boolean z4, boolean z5, boolean z6, J11 j11, Executor executor) {
        long jElapsedRealtimeNanos;
        if (f2678i) {
            int i3 = AbstractC10433nl0.f38500a;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        long j = jElapsedRealtimeNanos;
        this.f2680b.getClass();
        C0529IO c0529io = new C0529IO(obj, interfaceC7740If0, i, i2, map, cls, cls2, c7830Jy0);
        synchronized (this) {
            try {
                C0592JO c0592joM2204c = m2204c(c0529io, z3, j);
                if (c0592joM2204c == null) {
                    return m2208h(c11617x10, obj, interfaceC7740If0, i, i2, cls, cls2, enumC11389vD0, abstractC4046fK, map, z, z2, c7830Jy0, z3, z4, z5, z6, j11, executor, c0529io, j);
                }
                j11.m4127l(c0592joM2204c, EnumC1460XC.f13618e, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final C0592JO m2203b(C0529IO c0529io) {
        Object obj;
        C7494Dm0 c7494Dm0 = this.f2681c;
        synchronized (c7494Dm0) {
            C7390Bm0 c7390Bm0 = (C7390Bm0) ((LinkedHashMap) c7494Dm0.f46987c).remove(c0529io);
            if (c7390Bm0 == null) {
                obj = null;
            } else {
                c7494Dm0.f46986b -= c7390Bm0.f1019b;
                obj = c7390Bm0.f1018a;
            }
        }
        InterfaceC10011kS0 interfaceC10011kS0 = (InterfaceC10011kS0) obj;
        C0592JO c0592jo = interfaceC10011kS0 != null ? interfaceC10011kS0 instanceof C0592JO ? (C0592JO) interfaceC10011kS0 : new C0592JO(interfaceC10011kS0, true, true, c0529io, this) : null;
        if (c0592jo != null) {
            c0592jo.m4303b();
            this.f2686h.m26034a(c0529io, c0592jo);
        }
        return c0592jo;
    }

    /* renamed from: c */
    public final C0592JO m2204c(C0529IO c0529io, boolean z, long j) {
        C0592JO c0592jo;
        if (!z) {
            return null;
        }
        C7176y2 c7176y2 = this.f2686h;
        synchronized (c7176y2) {
            C7113x2 c7113x2 = (C7113x2) c7176y2.f46039b.get(c0529io);
            if (c7113x2 == null) {
                c0592jo = null;
            } else {
                c0592jo = (C0592JO) c7113x2.get();
                if (c0592jo == null) {
                    c7176y2.m26035b(c7113x2);
                }
            }
        }
        if (c0592jo != null) {
            c0592jo.m4303b();
        }
        if (c0592jo != null) {
            if (f2678i) {
                int i = AbstractC10433nl0.f38500a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(c0529io);
            }
            return c0592jo;
        }
        C0592JO c0592joM2203b = m2203b(c0529io);
        if (c0592joM2203b == null) {
            return null;
        }
        if (f2678i) {
            int i2 = AbstractC10433nl0.f38500a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(c0529io);
        }
        return c0592joM2203b;
    }

    /* renamed from: d */
    public final synchronized void m2205d(C0466HO c0466ho, C0529IO c0529io, C0592JO c0592jo) {
        if (c0592jo != null) {
            try {
                if (c0592jo.f5502a) {
                    this.f2686h.m26034a(c0529io, c0592jo);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C4238iN c4238iN = this.f2679a;
        c4238iN.getClass();
        HashMap map = (HashMap) (c0466ho.f4271p ? c4238iN.f29114c : c4238iN.f29113b);
        if (c0466ho.equals(map.get(c0529io))) {
            map.remove(c0529io);
        }
    }

    /* renamed from: e */
    public final void m2206e(C0529IO c0529io, C0592JO c0592jo) {
        C7176y2 c7176y2 = this.f2686h;
        synchronized (c7176y2) {
            C7113x2 c7113x2 = (C7113x2) c7176y2.f46039b.remove(c0529io);
            if (c7113x2 != null) {
                c7113x2.f45279c = null;
                c7113x2.clear();
            }
        }
        if (c0592jo.f5502a) {
        } else {
            this.f2683e.m6126l(c0592jo, false);
        }
    }

    /* renamed from: g */
    public final void m2207g() {
        C1002Pv c1002Pv = this.f2682d;
        AbstractC11984zu1.m26589c((B10) c1002Pv.f9351a);
        AbstractC11984zu1.m26589c((B10) c1002Pv.f9352b);
        AbstractC11984zu1.m26589c((B10) c1002Pv.f9353c);
        AbstractC11984zu1.m26589c((B10) c1002Pv.f9354d);
        C0214DO c0214do = this.f2684f;
        synchronized (c0214do) {
            if (((InterfaceC1593ZJ) c0214do.f1997a) != null) {
                ((InterfaceC1593ZJ) c0214do.f1997a).clear();
            }
        }
        C7176y2 c7176y2 = this.f2686h;
        c7176y2.f46042e = true;
        ExecutorService executorService = c7176y2.f46038a;
        if (executorService instanceof ExecutorService) {
            AbstractC11984zu1.m26589c(executorService);
        }
    }

    /* renamed from: h */
    public final C10189lr0 m2208h(C11617x10 c11617x10, Object obj, InterfaceC7740If0 interfaceC7740If0, int i, int i2, Class cls, Class cls2, EnumC11389vD0 enumC11389vD0, AbstractC4046fK abstractC4046fK, Map map, boolean z, boolean z2, C7830Jy0 c7830Jy0, boolean z3, boolean z4, boolean z5, boolean z6, J11 j11, Executor executor, C0529IO c0529io, long j) {
        C4238iN c4238iN = this.f2679a;
        C0466HO c0466ho = (C0466HO) ((HashMap) (z6 ? c4238iN.f29114c : c4238iN.f29113b)).get(c0529io);
        if (c0466ho != null) {
            c0466ho.m3388a(j11, executor);
            if (f2678i) {
                int i3 = AbstractC10433nl0.f38500a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(c0529io);
            }
            return new C10189lr0(this, j11, c0466ho);
        }
        C0466HO c0466ho2 = (C0466HO) ((C8539Xo1) this.f2682d.f9357g).mo4581i();
        synchronized (c0466ho2) {
            c0466ho2.f4267l = c0529io;
            c0466ho2.f4268m = z3;
            c0466ho2.f4269n = z4;
            c0466ho2.f4270o = z5;
            c0466ho2.f4271p = z6;
        }
        C1356VY c1356vy = this.f2685g;
        RunnableC0895OD runnableC0895OD = (RunnableC0895OD) ((C8539Xo1) c1356vy.f12613d).mo4581i();
        int i4 = c1356vy.f12611b;
        c1356vy.f12611b = i4 + 1;
        C0832ND c0832nd = runnableC0895OD.f8278a;
        c0832nd.f7553c = c11617x10;
        c0832nd.f7554d = obj;
        c0832nd.f7564n = interfaceC7740If0;
        c0832nd.f7555e = i;
        c0832nd.f7556f = i2;
        c0832nd.f7566p = abstractC4046fK;
        c0832nd.f7557g = cls;
        c0832nd.f7558h = runnableC0895OD.f8281d;
        c0832nd.f7561k = cls2;
        c0832nd.f7565o = enumC11389vD0;
        c0832nd.f7559i = c7830Jy0;
        c0832nd.f7560j = map;
        c0832nd.f7567q = z;
        c0832nd.f7568r = z2;
        runnableC0895OD.f8285h = c11617x10;
        runnableC0895OD.f8286i = interfaceC7740If0;
        runnableC0895OD.f8287j = enumC11389vD0;
        runnableC0895OD.f8288k = c0529io;
        runnableC0895OD.f8289l = i;
        runnableC0895OD.f8290m = i2;
        runnableC0895OD.f8291n = abstractC4046fK;
        runnableC0895OD.f8295r = z6;
        runnableC0895OD.f8292o = c7830Jy0;
        runnableC0895OD.f8293p = c0466ho2;
        runnableC0895OD.f8294q = i4;
        runnableC0895OD.f8277E = 1;
        runnableC0895OD.f8296s = obj;
        C4238iN c4238iN2 = this.f2679a;
        c4238iN2.getClass();
        ((HashMap) (c0466ho2.f4271p ? c4238iN2.f29114c : c4238iN2.f29113b)).put(c0529io, c0466ho2);
        c0466ho2.m3388a(j11, executor);
        c0466ho2.m3398k(runnableC0895OD);
        if (f2678i) {
            int i5 = AbstractC10433nl0.f38500a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(c0529io);
        }
        return new C10189lr0(this, j11, c0466ho2);
    }
}
