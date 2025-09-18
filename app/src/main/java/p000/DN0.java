package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class DN0 implements InterfaceC6843sl {

    /* renamed from: a */
    public final C10585ox0 f1980a;

    /* renamed from: b */
    public final C10777qR0 f1981b;

    /* renamed from: c */
    public final boolean f1982c;

    /* renamed from: d */
    public final C0974PT f1983d;

    /* renamed from: e */
    public final CN0 f1984e;

    /* renamed from: f */
    public final AtomicBoolean f1985f;

    /* renamed from: g */
    public Object f1986g;

    /* renamed from: h */
    public C1536YP f1987h;

    /* renamed from: i */
    public FN0 f1988i;

    /* renamed from: j */
    public boolean f1989j;

    /* renamed from: k */
    public C4198hk f1990k;

    /* renamed from: l */
    public boolean f1991l;

    /* renamed from: m */
    public boolean f1992m;

    /* renamed from: n */
    public boolean f1993n;

    /* renamed from: o */
    public volatile boolean f1994o;

    /* renamed from: p */
    public volatile C4198hk f1995p;

    /* renamed from: q */
    public volatile FN0 f1996q;

    public DN0(C10585ox0 c10585ox0, C10777qR0 c10777qR0, boolean z) {
        O90.m5968f(c10585ox0, "client");
        O90.m5968f(c10777qR0, "originalRequest");
        this.f1980a = c10585ox0;
        this.f1981b = c10777qR0;
        this.f1982c = z;
        this.f1983d = (C0974PT) c10585ox0.f39372b.f7393b;
        c10585ox0.f39375e.getClass();
        CN0 cn0 = new CN0(this);
        cn0.mo1730g(c10585ox0.f39394x, TimeUnit.MILLISECONDS);
        this.f1984e = cn0;
        this.f1985f = new AtomicBoolean();
        this.f1993n = true;
    }

    /* renamed from: a */
    public static final String m1665a(DN0 dn0) {
        StringBuilder sb = new StringBuilder();
        sb.append(dn0.f1994o ? "canceled " : "");
        sb.append(dn0.f1982c ? "web socket" : "call");
        sb.append(" to ");
        sb.append(dn0.f1981b.f40870a.m1534g());
        return sb.toString();
    }

    /* renamed from: b */
    public final void m1666b(FN0 fn0) {
        byte[] bArr = AbstractC7433Ch1.f1577a;
        if (this.f1988i != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f1988i = fn0;
        fn0.f3188p.add(new BN0(this, this.f1986g));
    }

    /* renamed from: c */
    public final IOException m1667c(IOException iOException) throws IOException {
        IOException interruptedIOException;
        Socket socketM1675m;
        byte[] bArr = AbstractC7433Ch1.f1577a;
        FN0 fn0 = this.f1988i;
        if (fn0 != null) {
            synchronized (fn0) {
                socketM1675m = m1675m();
            }
            if (this.f1988i == null) {
                if (socketM1675m != null) {
                    AbstractC7433Ch1.m1276e(socketM1675m);
                }
            } else if (socketM1675m != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f1989j && this.f1984e.m25370j()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            O90.m5965c(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new DN0(this.f1980a, this.f1981b, this.f1982c);
    }

    /* renamed from: e */
    public final void m1668e() {
        Socket socket;
        if (this.f1994o) {
            return;
        }
        this.f1994o = true;
        C4198hk c4198hk = this.f1995p;
        if (c4198hk != null) {
            ((InterfaceC1473XP) c4198hk.f28556d).cancel();
        }
        FN0 fn0 = this.f1996q;
        if (fn0 == null || (socket = fn0.f3175c) == null) {
            return;
        }
        AbstractC7433Ch1.m1276e(socket);
    }

    /* renamed from: f */
    public final void m1669f(InterfaceC0111Bl interfaceC0111Bl) {
        AN0 an0;
        if (!this.f1985f.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        C10745qB0 c10745qB0 = C10745qB0.f40658a;
        this.f1986g = C10745qB0.f40658a.mo23950g();
        C10919rY0 c10919rY0 = this.f1980a.f39371a;
        AN0 an02 = new AN0(this, interfaceC0111Bl);
        c10919rY0.getClass();
        synchronized (c10919rY0) {
            ((ArrayDeque) c10919rY0.f41731e).add(an02);
            if (!this.f1982c) {
                String str = this.f1981b.f40870a.f1831d;
                Iterator it = ((ArrayDeque) c10919rY0.f41729c).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = ((ArrayDeque) c10919rY0.f41731e).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                an0 = null;
                                break;
                            } else {
                                an0 = (AN0) it2.next();
                                if (O90.m5963a(an0.f179c.f1981b.f40870a.f1831d, str)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        an0 = (AN0) it.next();
                        if (O90.m5963a(an0.f179c.f1981b.f40870a.f1831d, str)) {
                            break;
                        }
                    }
                }
                if (an0 != null) {
                    an02.f178b = an0.f178b;
                }
            }
        }
        c10919rY0.m24406E();
    }

    /* renamed from: h */
    public final HS0 m1670h() {
        if (!this.f1985f.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f1984e.m25369i();
        C10745qB0 c10745qB0 = C10745qB0.f40658a;
        this.f1986g = C10745qB0.f40658a.mo23950g();
        try {
            C10919rY0 c10919rY0 = this.f1980a.f39371a;
            synchronized (c10919rY0) {
                ((ArrayDeque) c10919rY0.f41730d).add(this);
            }
            return m1672j();
        } finally {
            C10919rY0 c10919rY02 = this.f1980a.f39371a;
            c10919rY02.getClass();
            c10919rY02.m24422u((ArrayDeque) c10919rY02.f41730d, this);
        }
    }

    /* renamed from: i */
    public final void m1671i(boolean z) {
        C4198hk c4198hk;
        synchronized (this) {
            if (!this.f1993n) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (c4198hk = this.f1995p) != null) {
            ((InterfaceC1473XP) c4198hk.f28556d).cancel();
            ((DN0) c4198hk.f28554b).m1673k(c4198hk, true, true, null);
        }
        this.f1990k = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.HS0 m1672j() throws java.lang.Throwable {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            ox0 r0 = r11.f1980a
            java.util.List r0 = r0.f39373c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            p000.AbstractC0246Du.m1920m(r2, r0)
            gl r0 = new gl
            ox0 r1 = r11.f1980a
            r0.<init>(r1)
            r2.add(r0)
            gl r0 = new gl
            ox0 r1 = r11.f1980a
            hz r1 = r1.f39380j
            r0.<init>(r1)
            r2.add(r0)
            gl r0 = new gl
            ox0 r1 = r11.f1980a
            Yk r1 = r1.f39381k
            r3 = 0
            r0.<init>(r3, r1)
            r2.add(r0)
            nx r0 = p000.C6521nx.f38618a
            r2.add(r0)
            boolean r0 = r11.f1982c
            if (r0 != 0) goto L43
            ox0 r0 = r11.f1980a
            java.util.List r0 = r0.f39374d
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            p000.AbstractC0246Du.m1920m(r2, r0)
        L43:
            ul r0 = new ul
            boolean r1 = r11.f1982c
            r0.<init>(r1)
            r2.add(r0)
            GN0 r9 = new GN0
            qR0 r5 = r11.f1981b
            ox0 r0 = r11.f1980a
            int r6 = r0.f39395y
            int r7 = r0.f39396z
            int r8 = r0.f39368A
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            qR0 r2 = r11.f1981b     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
            HS0 r2 = r9.m3055b(r2)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
            boolean r3 = r11.f1994o     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
            if (r3 != 0) goto L70
            r11.m1674l(r0)
            return r2
        L70:
            p000.AbstractC7433Ch1.m1275d(r2)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
            throw r2     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
        L7b:
            r2 = move-exception
            goto L8d
        L7d:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r11.m1674l(r1)     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            p000.O90.m5966d(r1, r3)     // Catch: java.lang.Throwable -> L89
            throw r1     // Catch: java.lang.Throwable -> L89
        L89:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
        L8d:
            if (r1 != 0) goto L92
            r11.m1674l(r0)
        L92:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.DN0.m1672j():HS0");
    }

    /* renamed from: k */
    public final IOException m1673k(C4198hk c4198hk, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        O90.m5968f(c4198hk, "exchange");
        if (!c4198hk.equals(this.f1995p)) {
            return iOException;
        }
        synchronized (this) {
            z3 = false;
            if (z) {
                try {
                    if (!this.f1991l) {
                        if (z2 || !this.f1992m) {
                            z4 = false;
                        }
                    }
                    if (z) {
                        this.f1991l = false;
                    }
                    if (z2) {
                        this.f1992m = false;
                    }
                    boolean z5 = this.f1991l;
                    boolean z6 = (z5 || this.f1992m) ? false : true;
                    if (!z5 && !this.f1992m) {
                        if (!this.f1993n) {
                            z3 = true;
                        }
                    }
                    z4 = z3;
                    z3 = z6;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z2) {
                }
                z4 = false;
            }
        }
        if (z3) {
            this.f1995p = null;
            FN0 fn0 = this.f1988i;
            if (fn0 != null) {
                fn0.m2612h();
            }
        }
        return z4 ? m1667c(iOException) : iOException;
    }

    /* renamed from: l */
    public final IOException m1674l(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f1993n) {
                this.f1993n = false;
                if (!this.f1991l) {
                    if (!this.f1992m) {
                        z = true;
                    }
                }
            }
        }
        return z ? m1667c(iOException) : iOException;
    }

    /* renamed from: m */
    public final Socket m1675m() {
        FN0 fn0 = this.f1988i;
        O90.m5965c(fn0);
        byte[] bArr = AbstractC7433Ch1.f1577a;
        ArrayList arrayList = fn0.f3188p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (O90.m5963a(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.f1988i = null;
        if (arrayList.isEmpty()) {
            fn0.f3189q = System.nanoTime();
            C0974PT c0974pt = this.f1983d;
            c0974pt.getClass();
            byte[] bArr2 = AbstractC7433Ch1.f1577a;
            boolean z = fn0.f3182j;
            C8689a91 c8689a91 = (C8689a91) c0974pt.f9079c;
            if (z) {
                fn0.f3182j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c0974pt.f9081e;
                concurrentLinkedQueue.remove(fn0);
                if (concurrentLinkedQueue.isEmpty()) {
                    c8689a91.m9677a();
                }
                Socket socket = fn0.f3176d;
                O90.m5965c(socket);
                return socket;
            }
            c8689a91.m9679c((C6610pK) c0974pt.f9080d, 0L);
        }
        return null;
    }
}
