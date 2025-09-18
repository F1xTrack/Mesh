package p000;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* renamed from: OD */
/* loaded from: classes.dex */
public final class RunnableC0895OD implements InterfaceC0706LC, Runnable, Comparable, InterfaceC6301kS {

    /* renamed from: A */
    public volatile boolean f8273A;

    /* renamed from: B */
    public volatile boolean f8274B;

    /* renamed from: C */
    public boolean f8275C;

    /* renamed from: D */
    public int f8276D;

    /* renamed from: E */
    public int f8277E;

    /* renamed from: d */
    public final C0214DO f8281d;

    /* renamed from: e */
    public final C8539Xo1 f8282e;

    /* renamed from: h */
    public C11617x10 f8285h;

    /* renamed from: i */
    public InterfaceC7740If0 f8286i;

    /* renamed from: j */
    public EnumC11389vD0 f8287j;

    /* renamed from: k */
    public C0529IO f8288k;

    /* renamed from: l */
    public int f8289l;

    /* renamed from: m */
    public int f8290m;

    /* renamed from: n */
    public AbstractC4046fK f8291n;

    /* renamed from: o */
    public C7830Jy0 f8292o;

    /* renamed from: p */
    public C0466HO f8293p;

    /* renamed from: q */
    public int f8294q;

    /* renamed from: r */
    public boolean f8295r;

    /* renamed from: s */
    public Object f8296s;

    /* renamed from: t */
    public Thread f8297t;

    /* renamed from: u */
    public InterfaceC7740If0 f8298u;

    /* renamed from: v */
    public InterfaceC7740If0 f8299v;

    /* renamed from: w */
    public Object f8300w;

    /* renamed from: x */
    public EnumC1460XC f8301x;

    /* renamed from: y */
    public InterfaceC0643KC f8302y;

    /* renamed from: z */
    public volatile InterfaceC0768MC f8303z;

    /* renamed from: a */
    public final C0832ND f8278a = new C0832ND();

    /* renamed from: b */
    public final ArrayList f8279b = new ArrayList();

    /* renamed from: c */
    public final F41 f8280c = new F41();

    /* renamed from: f */
    public final C10910rT1 f8283f = new C10910rT1(9, false);

    /* renamed from: g */
    public final C6435ma f8284g = new C6435ma();

    public RunnableC0895OD(C0214DO c0214do, C8539Xo1 c8539Xo1) {
        this.f8281d = c0214do;
        this.f8282e = c8539Xo1;
    }

    @Override // p000.InterfaceC0706LC
    /* renamed from: a */
    public final void mo4921a(InterfaceC7740If0 interfaceC7740If0, Exception exc, InterfaceC0643KC interfaceC0643KC, EnumC1460XC enumC1460XC) {
        interfaceC0643KC.mo3255b();
        C11871z10 c11871z10 = new C11871z10("Fetching data failed", Collections.singletonList(exc));
        Class clsMo3254a = interfaceC0643KC.mo3254a();
        c11871z10.f46588b = interfaceC7740If0;
        c11871z10.f46589c = enumC1460XC;
        c11871z10.f46590d = clsMo3254a;
        this.f8279b.add(c11871z10);
        if (Thread.currentThread() != this.f8297t) {
            m5993n(2);
        } else {
            m5994o();
        }
    }

    @Override // p000.InterfaceC6301kS
    /* renamed from: b */
    public final F41 mo3389b() {
        return this.f8280c;
    }

    @Override // p000.InterfaceC0706LC
    /* renamed from: c */
    public final void mo4922c(InterfaceC7740If0 interfaceC7740If0, Object obj, InterfaceC0643KC interfaceC0643KC, EnumC1460XC enumC1460XC, InterfaceC7740If0 interfaceC7740If02) {
        this.f8298u = interfaceC7740If0;
        this.f8300w = obj;
        this.f8302y = interfaceC0643KC;
        this.f8301x = enumC1460XC;
        this.f8299v = interfaceC7740If02;
        this.f8275C = interfaceC7740If0 != this.f8278a.m5583a().get(0);
        if (Thread.currentThread() != this.f8297t) {
            m5993n(3);
        } else {
            m5985f();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RunnableC0895OD runnableC0895OD = (RunnableC0895OD) obj;
        int iOrdinal = this.f8287j.ordinal() - runnableC0895OD.f8287j.ordinal();
        return iOrdinal == 0 ? this.f8294q - runnableC0895OD.f8294q : iOrdinal;
    }

    /* renamed from: d */
    public final InterfaceC10011kS0 m5983d(InterfaceC0643KC interfaceC0643KC, Object obj, EnumC1460XC enumC1460XC) {
        if (obj == null) {
            interfaceC0643KC.mo3255b();
            return null;
        }
        try {
            int i = AbstractC10433nl0.f38500a;
            SystemClock.elapsedRealtimeNanos();
            InterfaceC10011kS0 interfaceC10011kS0M5984e = m5984e(obj, enumC1460XC);
            if (Log.isLoggable("DecodeJob", 2)) {
                interfaceC10011kS0M5984e.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.f8288k);
                Thread.currentThread().getName();
            }
            return interfaceC10011kS0M5984e;
        } finally {
            interfaceC0643KC.mo3255b();
        }
    }

    /* renamed from: e */
    public final InterfaceC10011kS0 m5984e(Object obj, EnumC1460XC enumC1460XC) {
        Class<?> cls = obj.getClass();
        C0832ND c0832nd = this.f8278a;
        C9663hk0 c9663hk0M5585c = c0832nd.m5585c(cls);
        C7830Jy0 c7830Jy0 = this.f8292o;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = enumC1460XC == EnumC1460XC.f13617d || c0832nd.f7568r;
            C11864yy0 c11864yy0 = C3984eL.f26667j;
            Boolean bool = (Boolean) c7830Jy0.m4482c(c11864yy0);
            if (bool == null || (bool.booleanValue() && !z)) {
                c7830Jy0 = new C7830Jy0();
                C7830Jy0 c7830Jy02 = this.f8292o;
                C6509nl c6509nl = c7830Jy0.f5819b;
                c6509nl.mo4828j(c7830Jy02.f5819b);
                c6509nl.put(c11864yy0, Boolean.valueOf(z));
            }
        }
        C7830Jy0 c7830Jy03 = c7830Jy0;
        InterfaceC1208TC interfaceC1208TCM17934h = this.f8285h.m25734a().m17934h(obj);
        try {
            return c9663hk0M5585c.m18870a(this.f8289l, this.f8290m, interfaceC1208TCM17934h, c7830Jy03, new ES1(this, 8, enumC1460XC));
        } finally {
            interfaceC1208TCM17934h.mo2895b();
        }
    }

    /* renamed from: f */
    public final void m5985f() {
        InterfaceC10011kS0 interfaceC10011kS0M5983d;
        if (Log.isLoggable("DecodeJob", 2)) {
            String str = "data: " + this.f8300w + ", cache key: " + this.f8298u + ", fetcher: " + this.f8302y;
            int i = AbstractC10433nl0.f38500a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.f8288k);
            if (str != null) {
                ", ".concat(str);
            }
            Thread.currentThread().getName();
        }
        C9281el0 c9281el0 = null;
        try {
            interfaceC10011kS0M5983d = m5983d(this.f8302y, this.f8300w, this.f8301x);
        } catch (C11871z10 e) {
            InterfaceC7740If0 interfaceC7740If0 = this.f8299v;
            EnumC1460XC enumC1460XC = this.f8301x;
            e.f46588b = interfaceC7740If0;
            e.f46589c = enumC1460XC;
            e.f46590d = null;
            this.f8279b.add(e);
            interfaceC10011kS0M5983d = null;
        }
        if (interfaceC10011kS0M5983d == null) {
            m5994o();
            return;
        }
        EnumC1460XC enumC1460XC2 = this.f8301x;
        boolean z = this.f8275C;
        if (interfaceC10011kS0M5983d instanceof InterfaceC10483o80) {
            ((InterfaceC10483o80) interfaceC10011kS0M5983d).initialize();
        }
        boolean z2 = true;
        if (((C9281el0) this.f8283f.f41680d) != null) {
            c9281el0 = (C9281el0) C9281el0.f26822e.mo4581i();
            c9281el0.f26826d = false;
            c9281el0.f26825c = true;
            c9281el0.f26824b = interfaceC10011kS0M5983d;
            interfaceC10011kS0M5983d = c9281el0;
        }
        m5996q();
        C0466HO c0466ho = this.f8293p;
        synchronized (c0466ho) {
            c0466ho.f4272q = interfaceC10011kS0M5983d;
            c0466ho.f4273r = enumC1460XC2;
            c0466ho.f4280y = z;
        }
        c0466ho.m3395h();
        this.f8276D = 5;
        try {
            C10910rT1 c10910rT1 = this.f8283f;
            if (((C9281el0) c10910rT1.f41680d) == null) {
                z2 = false;
            }
            if (z2) {
                C0214DO c0214do = this.f8281d;
                C7830Jy0 c7830Jy0 = this.f8292o;
                c10910rT1.getClass();
                try {
                    c0214do.m1677b().mo5744d((InterfaceC7740If0) c10910rT1.f41678b, new C10189lr0((InterfaceC10907rS0) c10910rT1.f41679c, (C9281el0) c10910rT1.f41680d, c7830Jy0, 9));
                    ((C9281el0) c10910rT1.f41680d).m18030c();
                } catch (Throwable th) {
                    ((C9281el0) c10910rT1.f41680d).m18030c();
                    throw th;
                }
            }
            m5989j();
        } finally {
            if (c9281el0 != null) {
                c9281el0.m18030c();
            }
        }
    }

    /* renamed from: g */
    public final InterfaceC0768MC m5986g() {
        int iM26247x = AbstractC7222ym.m26247x(this.f8276D);
        C0832ND c0832nd = this.f8278a;
        if (iM26247x == 1) {
            return new C10139lS0(c0832nd, this);
        }
        if (iM26247x == 2) {
            return new C0076BC(c0832nd.m5583a(), c0832nd, this);
        }
        if (iM26247x == 3) {
            return new X21(c0832nd, this);
        }
        if (iM26247x == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(AbstractC1374Vq.m8601t(this.f8276D)));
    }

    /* renamed from: h */
    public final int m5987h(int i) {
        int iM26247x = AbstractC7222ym.m26247x(i);
        if (iM26247x == 0) {
            if (this.f8291n.mo17908b()) {
                return 2;
            }
            return m5987h(2);
        }
        if (iM26247x == 1) {
            if (this.f8291n.mo17907a()) {
                return 3;
            }
            return m5987h(3);
        }
        if (iM26247x == 2) {
            return this.f8295r ? 6 : 4;
        }
        if (iM26247x == 3 || iM26247x == 5) {
            return 6;
        }
        throw new IllegalArgumentException("Unrecognized stage: ".concat(AbstractC1374Vq.m8601t(i)));
    }

    /* renamed from: i */
    public final void m5988i() {
        m5996q();
        C11871z10 c11871z10 = new C11871z10("Failed to load resource", new ArrayList(this.f8279b));
        C0466HO c0466ho = this.f8293p;
        synchronized (c0466ho) {
            c0466ho.f4275t = c11871z10;
        }
        c0466ho.m3394g();
        m5990k();
    }

    /* renamed from: j */
    public final void m5989j() {
        boolean zM22901b;
        C6435ma c6435ma = this.f8284g;
        synchronized (c6435ma) {
            c6435ma.f37777b = true;
            zM22901b = c6435ma.m22901b();
        }
        if (zM22901b) {
            m5992m();
        }
    }

    /* renamed from: k */
    public final void m5990k() {
        boolean zM22901b;
        C6435ma c6435ma = this.f8284g;
        synchronized (c6435ma) {
            c6435ma.f37778c = true;
            zM22901b = c6435ma.m22901b();
        }
        if (zM22901b) {
            m5992m();
        }
    }

    /* renamed from: l */
    public final void m5991l() {
        boolean zM22901b;
        C6435ma c6435ma = this.f8284g;
        synchronized (c6435ma) {
            c6435ma.f37776a = true;
            zM22901b = c6435ma.m22901b();
        }
        if (zM22901b) {
            m5992m();
        }
    }

    /* renamed from: m */
    public final void m5992m() {
        C6435ma c6435ma = this.f8284g;
        synchronized (c6435ma) {
            c6435ma.f37777b = false;
            c6435ma.f37776a = false;
            c6435ma.f37778c = false;
        }
        C10910rT1 c10910rT1 = this.f8283f;
        c10910rT1.f41678b = null;
        c10910rT1.f41679c = null;
        c10910rT1.f41680d = null;
        C0832ND c0832nd = this.f8278a;
        c0832nd.f7553c = null;
        c0832nd.f7554d = null;
        c0832nd.f7564n = null;
        c0832nd.f7557g = null;
        c0832nd.f7561k = null;
        c0832nd.f7559i = null;
        c0832nd.f7565o = null;
        c0832nd.f7560j = null;
        c0832nd.f7566p = null;
        c0832nd.f7551a.clear();
        c0832nd.f7562l = false;
        c0832nd.f7552b.clear();
        c0832nd.f7563m = false;
        this.f8273A = false;
        this.f8285h = null;
        this.f8286i = null;
        this.f8292o = null;
        this.f8287j = null;
        this.f8288k = null;
        this.f8293p = null;
        this.f8276D = 0;
        this.f8303z = null;
        this.f8297t = null;
        this.f8298u = null;
        this.f8300w = null;
        this.f8301x = null;
        this.f8302y = null;
        this.f8274B = false;
        this.f8279b.clear();
        this.f8282e.mo4580d(this);
    }

    /* renamed from: n */
    public final void m5993n(int i) {
        this.f8277E = i;
        C0466HO c0466ho = this.f8293p;
        (c0466ho.f4269n ? c0466ho.f4264i : c0466ho.f4270o ? c0466ho.f4265j : c0466ho.f4263h).execute(this);
    }

    /* renamed from: o */
    public final void m5994o() {
        this.f8297t = Thread.currentThread();
        int i = AbstractC10433nl0.f38500a;
        SystemClock.elapsedRealtimeNanos();
        boolean zMo555b = false;
        while (!this.f8274B && this.f8303z != null && !(zMo555b = this.f8303z.mo555b())) {
            this.f8276D = m5987h(this.f8276D);
            this.f8303z = m5986g();
            if (this.f8276D == 4) {
                m5993n(2);
                return;
            }
        }
        if ((this.f8276D == 6 || this.f8274B) && !zMo555b) {
            m5988i();
        }
    }

    /* renamed from: p */
    public final void m5995p() {
        int iM26247x = AbstractC7222ym.m26247x(this.f8277E);
        if (iM26247x == 0) {
            this.f8276D = m5987h(1);
            this.f8303z = m5986g();
            m5994o();
        } else if (iM26247x == 1) {
            m5994o();
        } else if (iM26247x == 2) {
            m5985f();
        } else {
            int i = this.f8277E;
            throw new IllegalStateException("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
        }
    }

    /* renamed from: q */
    public final void m5996q() {
        this.f8280c.m2490a();
        if (this.f8273A) {
            throw new IllegalStateException("Already notified", this.f8279b.isEmpty() ? null : (Throwable) AbstractC7222ym.m26228e(1, this.f8279b));
        }
        this.f8273A = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0643KC interfaceC0643KC = this.f8302y;
        try {
            try {
                try {
                    if (this.f8274B) {
                        m5988i();
                        if (interfaceC0643KC != null) {
                            interfaceC0643KC.mo3255b();
                            return;
                        }
                        return;
                    }
                    m5995p();
                    if (interfaceC0643KC != null) {
                        interfaceC0643KC.mo3255b();
                    }
                } catch (Throwable th) {
                    if (this.f8276D != 5) {
                        this.f8279b.add(th);
                        m5988i();
                    }
                    if (!this.f8274B) {
                        throw th;
                    }
                    throw th;
                }
            } catch (C0174Cl e) {
                throw e;
            }
        } catch (Throwable th2) {
            if (interfaceC0643KC != null) {
                interfaceC0643KC.mo3255b();
            }
            throw th2;
        }
    }
}
