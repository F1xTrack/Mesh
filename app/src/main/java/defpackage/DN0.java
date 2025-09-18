package defpackage;

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
public final class DN0 implements InterfaceC7089sl {
    public final C6363ox0 a;
    public final C6649qR0 b;
    public final boolean c;
    public final PT d;
    public final CN0 e;
    public final AtomicBoolean f;
    public Object g;
    public YP h;
    public FN0 i;
    public boolean j;
    public C4210hk k;
    public boolean l;
    public boolean m;
    public boolean n;
    public volatile boolean o;
    public volatile C4210hk p;
    public volatile FN0 q;

    public DN0(C6363ox0 c6363ox0, C6649qR0 c6649qR0, boolean z) {
        O90.f(c6363ox0, "client");
        O90.f(c6649qR0, "originalRequest");
        this.a = c6363ox0;
        this.b = c6649qR0;
        this.c = z;
        this.d = (PT) c6363ox0.b.b;
        c6363ox0.e.getClass();
        CN0 cn0 = new CN0(this);
        cn0.g(c6363ox0.x, TimeUnit.MILLISECONDS);
        this.e = cn0;
        this.f = new AtomicBoolean();
        this.n = true;
    }

    public static final String a(DN0 dn0) {
        StringBuilder sb = new StringBuilder();
        sb.append(dn0.o ? "canceled " : "");
        sb.append(dn0.c ? "web socket" : "call");
        sb.append(" to ");
        sb.append(dn0.b.a.g());
        return sb.toString();
    }

    public final void b(FN0 fn0) {
        byte[] bArr = AbstractC0199Ch1.a;
        if (this.i != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.i = fn0;
        fn0.p.add(new BN0(this, this.g));
    }

    public final IOException c(IOException iOException) throws IOException {
        IOException interruptedIOException;
        Socket socketM;
        byte[] bArr = AbstractC0199Ch1.a;
        FN0 fn0 = this.i;
        if (fn0 != null) {
            synchronized (fn0) {
                socketM = m();
            }
            if (this.i == null) {
                if (socketM != null) {
                    AbstractC0199Ch1.e(socketM);
                }
            } else if (socketM != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.j && this.e.j()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            O90.c(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new DN0(this.a, this.b, this.c);
    }

    public final void e() {
        Socket socket;
        if (this.o) {
            return;
        }
        this.o = true;
        C4210hk c4210hk = this.p;
        if (c4210hk != null) {
            ((XP) c4210hk.d).cancel();
        }
        FN0 fn0 = this.q;
        if (fn0 == null || (socket = fn0.c) == null) {
            return;
        }
        AbstractC0199Ch1.e(socket);
    }

    public final void f(InterfaceC0131Bl interfaceC0131Bl) {
        AN0 an0;
        if (!this.f.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        C6601qB0 c6601qB0 = C6601qB0.a;
        this.g = C6601qB0.a.g();
        C6860rY0 c6860rY0 = this.a.a;
        AN0 an02 = new AN0(this, interfaceC0131Bl);
        c6860rY0.getClass();
        synchronized (c6860rY0) {
            ((ArrayDeque) c6860rY0.e).add(an02);
            if (!this.c) {
                String str = this.b.a.d;
                Iterator it = ((ArrayDeque) c6860rY0.c).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = ((ArrayDeque) c6860rY0.e).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                an0 = null;
                                break;
                            } else {
                                an0 = (AN0) it2.next();
                                if (O90.a(an0.c.b.a.d, str)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        an0 = (AN0) it.next();
                        if (O90.a(an0.c.b.a.d, str)) {
                            break;
                        }
                    }
                }
                if (an0 != null) {
                    an02.b = an0.b;
                }
            }
        }
        c6860rY0.E();
    }

    public final HS0 h() {
        if (!this.f.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.e.i();
        C6601qB0 c6601qB0 = C6601qB0.a;
        this.g = C6601qB0.a.g();
        try {
            C6860rY0 c6860rY0 = this.a.a;
            synchronized (c6860rY0) {
                ((ArrayDeque) c6860rY0.d).add(this);
            }
            return j();
        } finally {
            C6860rY0 c6860rY02 = this.a.a;
            c6860rY02.getClass();
            c6860rY02.u((ArrayDeque) c6860rY02.d, this);
        }
    }

    public final void i(boolean z) {
        C4210hk c4210hk;
        synchronized (this) {
            if (!this.n) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (c4210hk = this.p) != null) {
            ((XP) c4210hk.d).cancel();
            ((DN0) c4210hk.b).k(c4210hk, true, true, null);
        }
        this.k = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.HS0 j() throws java.lang.Throwable {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            ox0 r0 = r11.a
            java.util.List r0 = r0.c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            defpackage.AbstractC0314Du.m(r2, r0)
            gl r0 = new gl
            ox0 r1 = r11.a
            r0.<init>(r1)
            r2.add(r0)
            gl r0 = new gl
            ox0 r1 = r11.a
            hz r1 = r1.j
            r0.<init>(r1)
            r2.add(r0)
            gl r0 = new gl
            ox0 r1 = r11.a
            Yk r1 = r1.k
            r3 = 0
            r0.<init>(r3, r1)
            r2.add(r0)
            nx r0 = defpackage.C6171nx.a
            r2.add(r0)
            boolean r0 = r11.c
            if (r0 != 0) goto L43
            ox0 r0 = r11.a
            java.util.List r0 = r0.d
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            defpackage.AbstractC0314Du.m(r2, r0)
        L43:
            ul r0 = new ul
            boolean r1 = r11.c
            r0.<init>(r1)
            r2.add(r0)
            GN0 r9 = new GN0
            qR0 r5 = r11.b
            ox0 r0 = r11.a
            int r6 = r0.y
            int r7 = r0.z
            int r8 = r0.A
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            qR0 r2 = r11.b     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
            HS0 r2 = r9.b(r2)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
            boolean r3 = r11.o     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
            if (r3 != 0) goto L70
            r11.l(r0)
            return r2
        L70:
            defpackage.AbstractC0199Ch1.d(r2)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
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
            java.io.IOException r1 = r11.l(r1)     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            defpackage.O90.d(r1, r3)     // Catch: java.lang.Throwable -> L89
            throw r1     // Catch: java.lang.Throwable -> L89
        L89:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
        L8d:
            if (r1 != 0) goto L92
            r11.l(r0)
        L92:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DN0.j():HS0");
    }

    public final IOException k(C4210hk c4210hk, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        O90.f(c4210hk, "exchange");
        if (!c4210hk.equals(this.p)) {
            return iOException;
        }
        synchronized (this) {
            z3 = false;
            if (z) {
                try {
                    if (!this.l) {
                        if (z2 || !this.m) {
                            z4 = false;
                        }
                    }
                    if (z) {
                        this.l = false;
                    }
                    if (z2) {
                        this.m = false;
                    }
                    boolean z5 = this.l;
                    boolean z6 = (z5 || this.m) ? false : true;
                    if (!z5 && !this.m) {
                        if (!this.n) {
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
            this.p = null;
            FN0 fn0 = this.i;
            if (fn0 != null) {
                fn0.h();
            }
        }
        return z4 ? c(iOException) : iOException;
    }

    public final IOException l(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.n) {
                this.n = false;
                if (!this.l) {
                    if (!this.m) {
                        z = true;
                    }
                }
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket m() {
        FN0 fn0 = this.i;
        O90.c(fn0);
        byte[] bArr = AbstractC0199Ch1.a;
        ArrayList arrayList = fn0.p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (O90.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.i = null;
        if (arrayList.isEmpty()) {
            fn0.q = System.nanoTime();
            PT pt = this.d;
            pt.getClass();
            byte[] bArr2 = AbstractC0199Ch1.a;
            boolean z = fn0.j;
            C2081a91 c2081a91 = (C2081a91) pt.c;
            if (z) {
                fn0.j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) pt.e;
                concurrentLinkedQueue.remove(fn0);
                if (concurrentLinkedQueue.isEmpty()) {
                    c2081a91.a();
                }
                Socket socket = fn0.d;
                O90.c(socket);
                return socket;
            }
            c2081a91.c((C6436pK) pt.d, 0L);
        }
        return null;
    }
}
