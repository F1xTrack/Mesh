package p000;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* renamed from: ai */
/* loaded from: classes.dex */
public final class C1681ai implements V51, InterfaceC1335VD {

    /* renamed from: a */
    public final C11051sa0 f15618a;

    /* renamed from: b */
    public final Object f15619b;

    /* renamed from: c */
    public final ArrayDeque f15620c;

    /* renamed from: d */
    public final ArrayDeque f15621d;

    /* renamed from: e */
    public final C1587ZD[] f15622e;

    /* renamed from: f */
    public final AbstractC1651aE[] f15623f;

    /* renamed from: g */
    public int f15624g;

    /* renamed from: h */
    public int f15625h;

    /* renamed from: i */
    public C1587ZD f15626i;

    /* renamed from: j */
    public AbstractC1461XD f15627j;

    /* renamed from: k */
    public boolean f15628k;

    /* renamed from: l */
    public boolean f15629l;

    /* renamed from: m */
    public long f15630m;

    /* renamed from: n */
    public final /* synthetic */ int f15631n;

    /* renamed from: o */
    public final Object f15632o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1681ai(InterfaceC9200e61 interfaceC9200e61) {
        this(new C8683a61[2], new C0871Nq[2]);
        this.f15631n = 1;
        int i = this.f15624g;
        C1587ZD[] c1587zdArr = this.f15622e;
        YN1.m9281f(i == c1587zdArr.length);
        for (C1587ZD c1587zd : c1587zdArr) {
            c1587zd.m9506v(1024);
        }
        this.f15632o = interfaceC9200e61;
    }

    @Override // p000.InterfaceC1335VD
    /* renamed from: a */
    public final void mo6160a(long j) {
        synchronized (this.f15619b) {
            try {
                YN1.m9281f(this.f15624g == this.f15622e.length || this.f15628k);
                this.f15630m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC1335VD
    /* renamed from: d */
    public final Object mo6162d() {
        C1587ZD c1587zd;
        synchronized (this.f15619b) {
            try {
                AbstractC1461XD abstractC1461XD = this.f15627j;
                if (abstractC1461XD != null) {
                    throw abstractC1461XD;
                }
                YN1.m9281f(this.f15626i == null);
                int i = this.f15624g;
                if (i == 0) {
                    c1587zd = null;
                } else {
                    C1587ZD[] c1587zdArr = this.f15622e;
                    int i2 = i - 1;
                    this.f15624g = i2;
                    c1587zd = c1587zdArr[i2];
                }
                this.f15626i = c1587zd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1587zd;
    }

    /* renamed from: f */
    public final AbstractC1461XD m9778f(Throwable th) {
        switch (this.f15631n) {
            case 0:
                return new A60("Unexpected decode error", th);
            default:
                return new W51("Unexpected decode error", th);
        }
    }

    @Override // p000.InterfaceC1335VD
    public final void flush() {
        synchronized (this.f15619b) {
            try {
                this.f15628k = true;
                C1587ZD c1587zd = this.f15626i;
                if (c1587zd != null) {
                    c1587zd.mo7722t();
                    int i = this.f15624g;
                    this.f15624g = i + 1;
                    this.f15622e[i] = c1587zd;
                    this.f15626i = null;
                }
                while (!this.f15620c.isEmpty()) {
                    C1587ZD c1587zd2 = (C1587ZD) this.f15620c.removeFirst();
                    c1587zd2.mo7722t();
                    int i2 = this.f15624g;
                    this.f15624g = i2 + 1;
                    this.f15622e[i2] = c1587zd2;
                }
                while (!this.f15621d.isEmpty()) {
                    ((AbstractC1651aE) this.f15621d.removeFirst()).mo5860u();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final AbstractC1461XD m9779g(C1587ZD c1587zd, AbstractC1651aE abstractC1651aE, boolean z) {
        switch (this.f15631n) {
            case 0:
                C1617Zh c1617Zh = (C1617Zh) abstractC1651aE;
                try {
                    ByteBuffer byteBuffer = c1587zd.f14798e;
                    byteBuffer.getClass();
                    YN1.m9281f(byteBuffer.hasArray());
                    YN1.m9278c(byteBuffer.arrayOffset() == 0);
                    C4262il c4262il = (C4262il) this.f15632o;
                    byte[] bArrArray = byteBuffer.array();
                    int iRemaining = byteBuffer.remaining();
                    c4262il.getClass();
                    c1617Zh.f15092e = C4262il.m19090e(iRemaining, bArrArray);
                    c1617Zh.f15398c = c1587zd.f14800g;
                    return null;
                } catch (A60 e) {
                    return e;
                }
            default:
                C8683a61 c8683a61 = (C8683a61) c1587zd;
                C0871Nq c0871Nq = (C0871Nq) abstractC1651aE;
                try {
                    ByteBuffer byteBuffer2 = c8683a61.f14798e;
                    byteBuffer2.getClass();
                    byte[] bArrArray2 = byteBuffer2.array();
                    int iLimit = byteBuffer2.limit();
                    InterfaceC9200e61 interfaceC9200e61 = (InterfaceC9200e61) this.f15632o;
                    if (z) {
                        interfaceC9200e61.mo4560d();
                    }
                    U51 u51Mo4561g = interfaceC9200e61.mo4561g(bArrArray2, 0, iLimit);
                    long j = c8683a61.f14800g;
                    long j2 = c8683a61.f15313j;
                    c0871Nq.f15398c = j;
                    c0871Nq.f8024e = u51Mo4561g;
                    if (j2 != Long.MAX_VALUE) {
                        j = j2;
                    }
                    c0871Nq.f8025f = j;
                    c0871Nq.f15399d = false;
                    return null;
                } catch (W51 e2) {
                    return e2;
                }
        }
    }

    /* renamed from: h */
    public final boolean m9780h() {
        AbstractC1461XD abstractC1461XDM9778f;
        synchronized (this.f15619b) {
            while (!this.f15629l) {
                try {
                    if (!this.f15620c.isEmpty() && this.f15625h > 0) {
                        break;
                    }
                    this.f15619b.wait();
                } finally {
                }
            }
            if (this.f15629l) {
                return false;
            }
            C1587ZD c1587zd = (C1587ZD) this.f15620c.removeFirst();
            AbstractC1651aE[] abstractC1651aEArr = this.f15623f;
            int i = this.f15625h - 1;
            this.f15625h = i;
            AbstractC1651aE abstractC1651aE = abstractC1651aEArr[i];
            boolean z = this.f15628k;
            this.f15628k = false;
            if (c1587zd.m2501g(4)) {
                abstractC1651aE.m2498a(4);
            } else {
                abstractC1651aE.f15398c = c1587zd.f14800g;
                if (c1587zd.m2501g(134217728)) {
                    abstractC1651aE.m2498a(134217728);
                }
                if (!m9782j(c1587zd.f14800g)) {
                    abstractC1651aE.f15399d = true;
                }
                try {
                    abstractC1461XDM9778f = m9779g(c1587zd, abstractC1651aE, z);
                } catch (OutOfMemoryError e) {
                    abstractC1461XDM9778f = m9778f(e);
                } catch (RuntimeException e2) {
                    abstractC1461XDM9778f = m9778f(e2);
                }
                if (abstractC1461XDM9778f != null) {
                    synchronized (this.f15619b) {
                        this.f15627j = abstractC1461XDM9778f;
                    }
                    return false;
                }
            }
            synchronized (this.f15619b) {
                try {
                    if (this.f15628k || abstractC1651aE.f15399d) {
                        abstractC1651aE.mo5860u();
                    } else {
                        this.f15621d.addLast(abstractC1651aE);
                    }
                    c1587zd.mo7722t();
                    int i2 = this.f15624g;
                    this.f15624g = i2 + 1;
                    this.f15622e[i2] = c1587zd;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // p000.InterfaceC1335VD
    /* renamed from: i */
    public final AbstractC1651aE mo3599c() {
        synchronized (this.f15619b) {
            try {
                AbstractC1461XD abstractC1461XD = this.f15627j;
                if (abstractC1461XD != null) {
                    throw abstractC1461XD;
                }
                if (this.f15621d.isEmpty()) {
                    return null;
                }
                return (AbstractC1651aE) this.f15621d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: j */
    public final boolean m9782j(long j) {
        boolean z;
        synchronized (this.f15619b) {
            long j2 = this.f15630m;
            z = j2 == -9223372036854775807L || j >= j2;
        }
        return z;
    }

    @Override // p000.InterfaceC1335VD
    /* renamed from: k */
    public final void mo6163e(C1587ZD c1587zd) {
        synchronized (this.f15619b) {
            try {
                AbstractC1461XD abstractC1461XD = this.f15627j;
                if (abstractC1461XD != null) {
                    throw abstractC1461XD;
                }
                YN1.m9278c(c1587zd == this.f15626i);
                this.f15620c.addLast(c1587zd);
                if (!this.f15620c.isEmpty() && this.f15625h > 0) {
                    this.f15619b.notify();
                }
                this.f15626i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: l */
    public final void m9784l(AbstractC1651aE abstractC1651aE) {
        synchronized (this.f15619b) {
            abstractC1651aE.mo5859t();
            int i = this.f15625h;
            this.f15625h = i + 1;
            this.f15623f[i] = abstractC1651aE;
            if (!this.f15620c.isEmpty() && this.f15625h > 0) {
                this.f15619b.notify();
            }
        }
    }

    @Override // p000.InterfaceC1335VD
    public final void release() throws InterruptedException {
        synchronized (this.f15619b) {
            this.f15629l = true;
            this.f15619b.notify();
        }
        try {
            this.f15618a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public C1681ai(C1587ZD[] c1587zdArr, AbstractC1651aE[] abstractC1651aEArr) {
        AbstractC1651aE c1617Zh;
        C1587ZD c1587zd;
        this.f15619b = new Object();
        this.f15630m = -9223372036854775807L;
        this.f15620c = new ArrayDeque();
        this.f15621d = new ArrayDeque();
        this.f15622e = c1587zdArr;
        this.f15624g = c1587zdArr.length;
        for (int i = 0; i < this.f15624g; i++) {
            C1587ZD[] c1587zdArr2 = this.f15622e;
            switch (this.f15631n) {
                case 0:
                    c1587zd = new C1587ZD(1);
                    break;
                default:
                    c1587zd = new C8683a61(1);
                    break;
            }
            c1587zdArr2[i] = c1587zd;
        }
        this.f15623f = abstractC1651aEArr;
        this.f15625h = abstractC1651aEArr.length;
        for (int i2 = 0; i2 < this.f15625h; i2++) {
            AbstractC1651aE[] abstractC1651aEArr2 = this.f15623f;
            switch (this.f15631n) {
                case 0:
                    c1617Zh = new C1617Zh(this);
                    break;
                default:
                    c1617Zh = new C0871Nq(this);
                    break;
            }
            abstractC1651aEArr2[i2] = c1617Zh;
        }
        C11051sa0 c11051sa0 = new C11051sa0(this);
        this.f15618a = c11051sa0;
        c11051sa0.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1681ai(C4262il c4262il) {
        this(new C1587ZD[1], new C1617Zh[1]);
        this.f15631n = 0;
        this.f15632o = c4262il;
    }

    @Override // p000.V51
    /* renamed from: b */
    public void mo6161b(long j) {
    }
}
