package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* renamed from: ai */
/* loaded from: classes.dex */
public final class C2184ai implements V51, VD {
    public final C7057sa0 a;
    public final Object b;
    public final ArrayDeque c;
    public final ArrayDeque d;
    public final ZD[] e;
    public final AbstractC2094aE[] f;
    public int g;
    public int h;
    public ZD i;
    public XD j;
    public boolean k;
    public boolean l;
    public long m;
    public final /* synthetic */ int n;
    public final Object o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2184ai(InterfaceC3519e61 interfaceC3519e61) {
        this(new C2072a61[2], new C1081Nq[2]);
        this.n = 1;
        int i = this.g;
        ZD[] zdArr = this.e;
        YN1.f(i == zdArr.length);
        for (ZD zd : zdArr) {
            zd.v(1024);
        }
        this.o = interfaceC3519e61;
    }

    @Override // defpackage.VD
    public final void a(long j) {
        synchronized (this.b) {
            try {
                YN1.f(this.g == this.e.length || this.k);
                this.m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.VD
    public final Object d() {
        ZD zd;
        synchronized (this.b) {
            try {
                XD xd = this.j;
                if (xd != null) {
                    throw xd;
                }
                YN1.f(this.i == null);
                int i = this.g;
                if (i == 0) {
                    zd = null;
                } else {
                    ZD[] zdArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    zd = zdArr[i2];
                }
                this.i = zd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zd;
    }

    public final XD f(Throwable th) {
        switch (this.n) {
            case 0:
                return new A60("Unexpected decode error", th);
            default:
                return new W51("Unexpected decode error", th);
        }
    }

    @Override // defpackage.VD
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                ZD zd = this.i;
                if (zd != null) {
                    zd.t();
                    int i = this.g;
                    this.g = i + 1;
                    this.e[i] = zd;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    ZD zd2 = (ZD) this.c.removeFirst();
                    zd2.t();
                    int i2 = this.g;
                    this.g = i2 + 1;
                    this.e[i2] = zd2;
                }
                while (!this.d.isEmpty()) {
                    ((AbstractC2094aE) this.d.removeFirst()).u();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final XD g(ZD zd, AbstractC2094aE abstractC2094aE, boolean z) {
        switch (this.n) {
            case 0:
                C1990Zh c1990Zh = (C1990Zh) abstractC2094aE;
                try {
                    ByteBuffer byteBuffer = zd.e;
                    byteBuffer.getClass();
                    YN1.f(byteBuffer.hasArray());
                    YN1.c(byteBuffer.arrayOffset() == 0);
                    C4403il c4403il = (C4403il) this.o;
                    byte[] bArrArray = byteBuffer.array();
                    int iRemaining = byteBuffer.remaining();
                    c4403il.getClass();
                    c1990Zh.e = C4403il.e(iRemaining, bArrArray);
                    c1990Zh.c = zd.g;
                    return null;
                } catch (A60 e) {
                    return e;
                }
            default:
                C2072a61 c2072a61 = (C2072a61) zd;
                C1081Nq c1081Nq = (C1081Nq) abstractC2094aE;
                try {
                    ByteBuffer byteBuffer2 = c2072a61.e;
                    byteBuffer2.getClass();
                    byte[] bArrArray2 = byteBuffer2.array();
                    int iLimit = byteBuffer2.limit();
                    InterfaceC3519e61 interfaceC3519e61 = (InterfaceC3519e61) this.o;
                    if (z) {
                        interfaceC3519e61.d();
                    }
                    U51 u51G = interfaceC3519e61.g(bArrArray2, 0, iLimit);
                    long j = c2072a61.g;
                    long j2 = c2072a61.j;
                    c1081Nq.c = j;
                    c1081Nq.e = u51G;
                    if (j2 != Long.MAX_VALUE) {
                        j = j2;
                    }
                    c1081Nq.f = j;
                    c1081Nq.d = false;
                    return null;
                } catch (W51 e2) {
                    return e2;
                }
        }
    }

    public final boolean h() {
        XD xdF;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        break;
                    }
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            ZD zd = (ZD) this.c.removeFirst();
            AbstractC2094aE[] abstractC2094aEArr = this.f;
            int i = this.h - 1;
            this.h = i;
            AbstractC2094aE abstractC2094aE = abstractC2094aEArr[i];
            boolean z = this.k;
            this.k = false;
            if (zd.g(4)) {
                abstractC2094aE.a(4);
            } else {
                abstractC2094aE.c = zd.g;
                if (zd.g(134217728)) {
                    abstractC2094aE.a(134217728);
                }
                if (!j(zd.g)) {
                    abstractC2094aE.d = true;
                }
                try {
                    xdF = g(zd, abstractC2094aE, z);
                } catch (OutOfMemoryError e) {
                    xdF = f(e);
                } catch (RuntimeException e2) {
                    xdF = f(e2);
                }
                if (xdF != null) {
                    synchronized (this.b) {
                        this.j = xdF;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k || abstractC2094aE.d) {
                        abstractC2094aE.u();
                    } else {
                        this.d.addLast(abstractC2094aE);
                    }
                    zd.t();
                    int i2 = this.g;
                    this.g = i2 + 1;
                    this.e[i2] = zd;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // defpackage.VD
    /* renamed from: i */
    public final AbstractC2094aE c() {
        synchronized (this.b) {
            try {
                XD xd = this.j;
                if (xd != null) {
                    throw xd;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (AbstractC2094aE) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j(long j) {
        boolean z;
        synchronized (this.b) {
            long j2 = this.m;
            z = j2 == -9223372036854775807L || j >= j2;
        }
        return z;
    }

    @Override // defpackage.VD
    /* renamed from: k */
    public final void e(ZD zd) {
        synchronized (this.b) {
            try {
                XD xd = this.j;
                if (xd != null) {
                    throw xd;
                }
                YN1.c(zd == this.i);
                this.c.addLast(zd);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(AbstractC2094aE abstractC2094aE) {
        synchronized (this.b) {
            abstractC2094aE.t();
            int i = this.h;
            this.h = i + 1;
            this.f[i] = abstractC2094aE;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    @Override // defpackage.VD
    public final void release() throws InterruptedException {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public C2184ai(ZD[] zdArr, AbstractC2094aE[] abstractC2094aEArr) {
        AbstractC2094aE c1990Zh;
        ZD zd;
        this.b = new Object();
        this.m = -9223372036854775807L;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = zdArr;
        this.g = zdArr.length;
        for (int i = 0; i < this.g; i++) {
            ZD[] zdArr2 = this.e;
            switch (this.n) {
                case 0:
                    zd = new ZD(1);
                    break;
                default:
                    zd = new C2072a61(1);
                    break;
            }
            zdArr2[i] = zd;
        }
        this.f = abstractC2094aEArr;
        this.h = abstractC2094aEArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            AbstractC2094aE[] abstractC2094aEArr2 = this.f;
            switch (this.n) {
                case 0:
                    c1990Zh = new C1990Zh(this);
                    break;
                default:
                    c1990Zh = new C1081Nq(this);
                    break;
            }
            abstractC2094aEArr2[i2] = c1990Zh;
        }
        C7057sa0 c7057sa0 = new C7057sa0(this);
        this.a = c7057sa0;
        c7057sa0.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2184ai(C4403il c4403il) {
        this(new ZD[1], new C1990Zh[1]);
        this.n = 0;
        this.o = c4403il;
    }

    @Override // defpackage.V51
    public void b(long j) {
    }
}
