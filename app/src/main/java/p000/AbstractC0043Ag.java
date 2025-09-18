package p000;

/* renamed from: Ag */
/* loaded from: classes.dex */
public abstract class AbstractC0043Ag implements PB0 {

    /* renamed from: b */
    public final int f307b;

    /* renamed from: d */
    public ZQ0 f309d;

    /* renamed from: e */
    public int f310e;

    /* renamed from: f */
    public NB0 f311f;

    /* renamed from: g */
    public M71 f312g;

    /* renamed from: h */
    public int f313h;

    /* renamed from: i */
    public InterfaceC9121dV0 f314i;

    /* renamed from: j */
    public C6686qX[] f315j;

    /* renamed from: k */
    public long f316k;

    /* renamed from: l */
    public long f317l;

    /* renamed from: n */
    public boolean f319n;

    /* renamed from: o */
    public boolean f320o;

    /* renamed from: q */
    public C1654aH f322q;

    /* renamed from: a */
    public final Object f306a = new Object();

    /* renamed from: c */
    public final C0827N8 f308c = new C0827N8(12, false);

    /* renamed from: m */
    public long f318m = Long.MIN_VALUE;

    /* renamed from: p */
    public AbstractC7419Ca1 f321p = AbstractC7419Ca1.f1466a;

    public AbstractC0043Ag(int i) {
        this.f307b = i;
    }

    /* renamed from: A */
    public int mo258A() {
        return 0;
    }

    /* renamed from: f */
    public final C0531IQ m260f(Exception exc, C6686qX c6686qX, boolean z, int i) {
        int iMo280z;
        if (c6686qX == null || this.f320o) {
            iMo280z = 4;
        } else {
            this.f320o = true;
            try {
                iMo280z = mo280z(c6686qX) & 7;
            } catch (C0531IQ unused) {
            } finally {
                this.f320o = false;
            }
        }
        return new C0531IQ(1, exc, i, mo263i(), this.f310e, c6686qX, c6686qX == null ? 4 : iMo280z, z);
    }

    /* renamed from: g */
    public void mo261g() {
    }

    /* renamed from: h */
    public InterfaceC7602Fo0 mo262h() {
        return null;
    }

    /* renamed from: i */
    public abstract String mo263i();

    /* renamed from: j */
    public final boolean m264j() {
        return this.f318m == Long.MIN_VALUE;
    }

    /* renamed from: k */
    public abstract boolean mo265k();

    /* renamed from: l */
    public abstract boolean mo266l();

    /* renamed from: m */
    public abstract void mo267m();

    /* renamed from: o */
    public abstract void mo269o(long j, boolean z);

    /* renamed from: t */
    public abstract void mo274t(C6686qX[] c6686qXArr, long j, long j2);

    /* renamed from: u */
    public final int m275u(C0827N8 c0827n8, C1587ZD c1587zd, int i) {
        InterfaceC9121dV0 interfaceC9121dV0 = this.f314i;
        interfaceC9121dV0.getClass();
        int iMo39k = interfaceC9121dV0.mo39k(c0827n8, c1587zd, i);
        if (iMo39k == -4) {
            if (c1587zd.m2501g(4)) {
                this.f318m = Long.MIN_VALUE;
                return this.f319n ? -4 : -3;
            }
            long j = c1587zd.f14800g + this.f316k;
            c1587zd.f14800g = j;
            this.f318m = Math.max(this.f318m, j);
        } else if (iMo39k == -5) {
            C6686qX c6686qX = (C6686qX) c0827n8.f7524c;
            c6686qX.getClass();
            long j2 = c6686qX.f40979r;
            if (j2 != Long.MAX_VALUE) {
                C6623pX c6623pXM24020a = c6686qX.m24020a();
                c6623pXM24020a.f40166q = j2 + this.f316k;
                c0827n8.f7524c = new C6686qX(c6623pXM24020a);
            }
        }
        return iMo39k;
    }

    /* renamed from: v */
    public abstract void mo276v(long j, long j2);

    /* renamed from: w */
    public final void m277w(C6686qX[] c6686qXArr, InterfaceC9121dV0 interfaceC9121dV0, long j, long j2, C7604Fp0 c7604Fp0) {
        YN1.m9281f(!this.f319n);
        this.f314i = interfaceC9121dV0;
        if (this.f318m == Long.MIN_VALUE) {
            this.f318m = j;
        }
        this.f315j = c6686qXArr;
        this.f316k = j2;
        mo274t(c6686qXArr, j, j2);
    }

    /* renamed from: x */
    public final void m278x() {
        YN1.m9281f(this.f313h == 0);
        this.f308c.m5557f();
        mo271q();
    }

    /* renamed from: y */
    public void mo279y(float f, float f2) {
    }

    /* renamed from: z */
    public abstract int mo280z(C6686qX c6686qX);

    /* renamed from: p */
    public void mo270p() {
    }

    /* renamed from: q */
    public void mo271q() {
    }

    /* renamed from: r */
    public void mo272r() {
    }

    /* renamed from: s */
    public void mo273s() {
    }

    @Override // p000.PB0
    /* renamed from: d */
    public void mo259d(int i, Object obj) {
    }

    /* renamed from: n */
    public void mo268n(boolean z, boolean z2) {
    }
}
