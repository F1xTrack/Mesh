package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public final class OD implements LC, Runnable, Comparable, InterfaceC5505kS {
    public volatile boolean A;
    public volatile boolean B;
    public boolean C;
    public int D;
    public int E;
    public final DO d;
    public final C1857Xo1 e;
    public C7903x10 h;
    public InterfaceC0660If0 i;
    public EnumC7561vD0 j;
    public IO k;
    public int l;
    public int m;
    public AbstractC3750fK n;
    public C0795Jy0 o;
    public HO p;
    public int q;
    public boolean r;
    public Object s;
    public Thread t;
    public InterfaceC0660If0 u;
    public InterfaceC0660If0 v;
    public Object w;
    public XC x;
    public KC y;
    public volatile MC z;
    public final ND a = new ND();
    public final ArrayList b = new ArrayList();
    public final F41 c = new F41();
    public final C6846rT1 f = new C6846rT1(9, false);
    public final C5911ma g = new C5911ma();

    public OD(DO r4, C1857Xo1 c1857Xo1) {
        this.d = r4;
        this.e = c1857Xo1;
    }

    @Override // defpackage.LC
    public final void a(InterfaceC0660If0 interfaceC0660If0, Exception exc, KC kc, XC xc) {
        kc.b();
        C8283z10 c8283z10 = new C8283z10("Fetching data failed", Collections.singletonList(exc));
        Class clsA = kc.a();
        c8283z10.b = interfaceC0660If0;
        c8283z10.c = xc;
        c8283z10.d = clsA;
        this.b.add(c8283z10);
        if (Thread.currentThread() != this.t) {
            n(2);
        } else {
            o();
        }
    }

    @Override // defpackage.InterfaceC5505kS
    public final F41 b() {
        return this.c;
    }

    @Override // defpackage.LC
    public final void c(InterfaceC0660If0 interfaceC0660If0, Object obj, KC kc, XC xc, InterfaceC0660If0 interfaceC0660If02) {
        this.u = interfaceC0660If0;
        this.w = obj;
        this.y = kc;
        this.x = xc;
        this.v = interfaceC0660If02;
        this.C = interfaceC0660If0 != this.a.a().get(0);
        if (Thread.currentThread() != this.t) {
            n(3);
        } else {
            f();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        OD od = (OD) obj;
        int iOrdinal = this.j.ordinal() - od.j.ordinal();
        return iOrdinal == 0 ? this.q - od.q : iOrdinal;
    }

    public final InterfaceC5506kS0 d(KC kc, Object obj, XC xc) {
        if (obj == null) {
            kc.b();
            return null;
        }
        try {
            int i = AbstractC6136nl0.a;
            SystemClock.elapsedRealtimeNanos();
            InterfaceC5506kS0 interfaceC5506kS0E = e(obj, xc);
            if (Log.isLoggable("DecodeJob", 2)) {
                interfaceC5506kS0E.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.k);
                Thread.currentThread().getName();
            }
            return interfaceC5506kS0E;
        } finally {
            kc.b();
        }
    }

    public final InterfaceC5506kS0 e(Object obj, XC xc) {
        Class<?> cls = obj.getClass();
        ND nd = this.a;
        C4211hk0 c4211hk0C = nd.c(cls);
        C0795Jy0 c0795Jy0 = this.o;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = xc == XC.d || nd.r;
            C8272yy0 c8272yy0 = C3562eL.j;
            Boolean bool = (Boolean) c0795Jy0.c(c8272yy0);
            if (bool == null || (bool.booleanValue() && !z)) {
                c0795Jy0 = new C0795Jy0();
                C0795Jy0 c0795Jy02 = this.o;
                C6135nl c6135nl = c0795Jy0.b;
                c6135nl.j(c0795Jy02.b);
                c6135nl.put(c8272yy0, Boolean.valueOf(z));
            }
        }
        C0795Jy0 c0795Jy03 = c0795Jy0;
        TC tcH = this.h.a().h(obj);
        try {
            return c4211hk0C.a(this.l, this.m, tcH, c0795Jy03, new ES1(this, 8, xc));
        } finally {
            tcH.b();
        }
    }

    public final void f() {
        InterfaceC5506kS0 interfaceC5506kS0D;
        if (Log.isLoggable("DecodeJob", 2)) {
            String str = "data: " + this.w + ", cache key: " + this.u + ", fetcher: " + this.y;
            int i = AbstractC6136nl0.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.k);
            if (str != null) {
                ", ".concat(str);
            }
            Thread.currentThread().getName();
        }
        C3641el0 c3641el0 = null;
        try {
            interfaceC5506kS0D = d(this.y, this.w, this.x);
        } catch (C8283z10 e) {
            InterfaceC0660If0 interfaceC0660If0 = this.v;
            XC xc = this.x;
            e.b = interfaceC0660If0;
            e.c = xc;
            e.d = null;
            this.b.add(e);
            interfaceC5506kS0D = null;
        }
        if (interfaceC5506kS0D == null) {
            o();
            return;
        }
        XC xc2 = this.x;
        boolean z = this.C;
        if (interfaceC5506kS0D instanceof InterfaceC6210o80) {
            ((InterfaceC6210o80) interfaceC5506kS0D).initialize();
        }
        boolean z2 = true;
        if (((C3641el0) this.f.d) != null) {
            c3641el0 = (C3641el0) C3641el0.e.i();
            c3641el0.d = false;
            c3641el0.c = true;
            c3641el0.b = interfaceC5506kS0D;
            interfaceC5506kS0D = c3641el0;
        }
        q();
        HO ho = this.p;
        synchronized (ho) {
            ho.q = interfaceC5506kS0D;
            ho.r = xc2;
            ho.y = z;
        }
        ho.h();
        this.D = 5;
        try {
            C6846rT1 c6846rT1 = this.f;
            if (((C3641el0) c6846rT1.d) == null) {
                z2 = false;
            }
            if (z2) {
                DO r2 = this.d;
                C0795Jy0 c0795Jy0 = this.o;
                c6846rT1.getClass();
                try {
                    r2.b().d((InterfaceC0660If0) c6846rT1.b, new C5772lr0((InterfaceC6842rS0) c6846rT1.c, (C3641el0) c6846rT1.d, c0795Jy0, 9));
                    ((C3641el0) c6846rT1.d).c();
                } catch (Throwable th) {
                    ((C3641el0) c6846rT1.d).c();
                    throw th;
                }
            }
            j();
        } finally {
            if (c3641el0 != null) {
                c3641el0.c();
            }
        }
    }

    public final MC g() {
        int iX = AbstractC8235ym.x(this.D);
        ND nd = this.a;
        if (iX == 1) {
            return new C5697lS0(nd, this);
        }
        if (iX == 2) {
            return new BC(nd.a(), nd, this);
        }
        if (iX == 3) {
            return new X21(nd, this);
        }
        if (iX == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(AbstractC1705Vq.t(this.D)));
    }

    public final int h(int i) {
        int iX = AbstractC8235ym.x(i);
        if (iX == 0) {
            if (this.n.b()) {
                return 2;
            }
            return h(2);
        }
        if (iX == 1) {
            if (this.n.a()) {
                return 3;
            }
            return h(3);
        }
        if (iX == 2) {
            return this.r ? 6 : 4;
        }
        if (iX == 3 || iX == 5) {
            return 6;
        }
        throw new IllegalArgumentException("Unrecognized stage: ".concat(AbstractC1705Vq.t(i)));
    }

    public final void i() {
        q();
        C8283z10 c8283z10 = new C8283z10("Failed to load resource", new ArrayList(this.b));
        HO ho = this.p;
        synchronized (ho) {
            ho.t = c8283z10;
        }
        ho.g();
        k();
    }

    public final void j() {
        boolean zB;
        C5911ma c5911ma = this.g;
        synchronized (c5911ma) {
            c5911ma.b = true;
            zB = c5911ma.b();
        }
        if (zB) {
            m();
        }
    }

    public final void k() {
        boolean zB;
        C5911ma c5911ma = this.g;
        synchronized (c5911ma) {
            c5911ma.c = true;
            zB = c5911ma.b();
        }
        if (zB) {
            m();
        }
    }

    public final void l() {
        boolean zB;
        C5911ma c5911ma = this.g;
        synchronized (c5911ma) {
            c5911ma.a = true;
            zB = c5911ma.b();
        }
        if (zB) {
            m();
        }
    }

    public final void m() {
        C5911ma c5911ma = this.g;
        synchronized (c5911ma) {
            c5911ma.b = false;
            c5911ma.a = false;
            c5911ma.c = false;
        }
        C6846rT1 c6846rT1 = this.f;
        c6846rT1.b = null;
        c6846rT1.c = null;
        c6846rT1.d = null;
        ND nd = this.a;
        nd.c = null;
        nd.d = null;
        nd.n = null;
        nd.g = null;
        nd.k = null;
        nd.i = null;
        nd.o = null;
        nd.j = null;
        nd.p = null;
        nd.a.clear();
        nd.l = false;
        nd.b.clear();
        nd.m = false;
        this.A = false;
        this.h = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.k = null;
        this.p = null;
        this.D = 0;
        this.z = null;
        this.t = null;
        this.u = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.B = false;
        this.b.clear();
        this.e.d(this);
    }

    public final void n(int i) {
        this.E = i;
        HO ho = this.p;
        (ho.n ? ho.i : ho.o ? ho.j : ho.h).execute(this);
    }

    public final void o() {
        this.t = Thread.currentThread();
        int i = AbstractC6136nl0.a;
        SystemClock.elapsedRealtimeNanos();
        boolean zB = false;
        while (!this.B && this.z != null && !(zB = this.z.b())) {
            this.D = h(this.D);
            this.z = g();
            if (this.D == 4) {
                n(2);
                return;
            }
        }
        if ((this.D == 6 || this.B) && !zB) {
            i();
        }
    }

    public final void p() {
        int iX = AbstractC8235ym.x(this.E);
        if (iX == 0) {
            this.D = h(1);
            this.z = g();
            o();
        } else if (iX == 1) {
            o();
        } else if (iX == 2) {
            f();
        } else {
            int i = this.E;
            throw new IllegalStateException("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
        }
    }

    public final void q() {
        this.c.a();
        if (this.A) {
            throw new IllegalStateException("Already notified", this.b.isEmpty() ? null : (Throwable) AbstractC8235ym.e(1, this.b));
        }
        this.A = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        KC kc = this.y;
        try {
            try {
                try {
                    if (this.B) {
                        i();
                        if (kc != null) {
                            kc.b();
                            return;
                        }
                        return;
                    }
                    p();
                    if (kc != null) {
                        kc.b();
                    }
                } catch (Throwable th) {
                    if (this.D != 5) {
                        this.b.add(th);
                        i();
                    }
                    if (!this.B) {
                        throw th;
                    }
                    throw th;
                }
            } catch (C0209Cl e) {
                throw e;
            }
        } catch (Throwable th2) {
            if (kc != null) {
                kc.b();
            }
            throw th2;
        }
    }
}
