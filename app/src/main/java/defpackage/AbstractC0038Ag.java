package defpackage;

/* renamed from: Ag, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0038Ag implements PB0 {
    public final int b;
    public ZQ0 d;
    public int e;
    public NB0 f;
    public M71 g;
    public int h;
    public InterfaceC3403dV0 i;
    public C6666qX[] j;
    public long k;
    public long l;
    public boolean n;
    public boolean o;
    public C2103aH q;
    public final Object a = new Object();
    public final N8 c = new N8(12, false);
    public long m = Long.MIN_VALUE;
    public AbstractC0178Ca1 p = AbstractC0178Ca1.a;

    public AbstractC0038Ag(int i) {
        this.b = i;
    }

    public int A() {
        return 0;
    }

    public final IQ f(Exception exc, C6666qX c6666qX, boolean z, int i) {
        int iZ;
        if (c6666qX == null || this.o) {
            iZ = 4;
        } else {
            this.o = true;
            try {
                iZ = z(c6666qX) & 7;
            } catch (IQ unused) {
            } finally {
                this.o = false;
            }
        }
        return new IQ(1, exc, i, i(), this.e, c6666qX, c6666qX == null ? 4 : iZ, z);
    }

    public void g() {
    }

    public InterfaceC0453Fo0 h() {
        return null;
    }

    public abstract String i();

    public final boolean j() {
        return this.m == Long.MIN_VALUE;
    }

    public abstract boolean k();

    public abstract boolean l();

    public abstract void m();

    public abstract void o(long j, boolean z);

    public abstract void t(C6666qX[] c6666qXArr, long j, long j2);

    public final int u(N8 n8, ZD zd, int i) {
        InterfaceC3403dV0 interfaceC3403dV0 = this.i;
        interfaceC3403dV0.getClass();
        int iK = interfaceC3403dV0.k(n8, zd, i);
        if (iK == -4) {
            if (zd.g(4)) {
                this.m = Long.MIN_VALUE;
                return this.n ? -4 : -3;
            }
            long j = zd.g + this.k;
            zd.g = j;
            this.m = Math.max(this.m, j);
        } else if (iK == -5) {
            C6666qX c6666qX = (C6666qX) n8.c;
            c6666qX.getClass();
            long j2 = c6666qX.r;
            if (j2 != Long.MAX_VALUE) {
                C6475pX c6475pXA = c6666qX.a();
                c6475pXA.q = j2 + this.k;
                n8.c = new C6666qX(c6475pXA);
            }
        }
        return iK;
    }

    public abstract void v(long j, long j2);

    public final void w(C6666qX[] c6666qXArr, InterfaceC3403dV0 interfaceC3403dV0, long j, long j2, C0456Fp0 c0456Fp0) {
        YN1.f(!this.n);
        this.i = interfaceC3403dV0;
        if (this.m == Long.MIN_VALUE) {
            this.m = j;
        }
        this.j = c6666qXArr;
        this.k = j2;
        t(c6666qXArr, j, j2);
    }

    public final void x() {
        YN1.f(this.h == 0);
        this.c.f();
        q();
    }

    public void y(float f, float f2) {
    }

    public abstract int z(C6666qX c6666qX);

    public void p() {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    @Override // defpackage.PB0
    public void d(int i, Object obj) {
    }

    public void n(boolean z, boolean z2) {
    }
}
