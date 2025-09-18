package p000;

import java.io.IOException;

/* renamed from: OP */
/* loaded from: classes.dex */
public final class C0907OP implements InterfaceC9121dV0 {

    /* renamed from: a */
    public final C6686qX f8428a;

    /* renamed from: c */
    public long[] f8430c;

    /* renamed from: d */
    public boolean f8431d;

    /* renamed from: e */
    public C1033QP f8432e;

    /* renamed from: f */
    public boolean f8433f;

    /* renamed from: g */
    public int f8434g;

    /* renamed from: b */
    public final C9108dO1 f8429b = new C9108dO1(11);

    /* renamed from: h */
    public long f8435h = -9223372036854775807L;

    public C0907OP(C1033QP c1033qp, C6686qX c6686qX, boolean z) {
        this.f8428a = c6686qX;
        this.f8432e = c1033qp;
        this.f8430c = c1033qp.f9613b;
        m6061b(c1033qp, z);
    }

    /* renamed from: b */
    public final void m6061b(C1033QP c1033qp, boolean z) {
        int i = this.f8434g;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.f8430c[i - 1];
        this.f8431d = z;
        this.f8432e = c1033qp;
        long[] jArr = c1033qp.f9613b;
        this.f8430c = jArr;
        long j3 = this.f8435h;
        if (j3 == -9223372036854775807L) {
            if (j2 != -9223372036854775807L) {
                this.f8434g = AbstractC7485Dh1.m1814b(jArr, j2, false);
            }
        } else {
            int iM1814b = AbstractC7485Dh1.m1814b(jArr, j3, true);
            this.f8434g = iM1814b;
            if (this.f8431d && iM1814b == this.f8430c.length) {
                j = j3;
            }
            this.f8435h = j;
        }
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: f */
    public final boolean mo37f() {
        return true;
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: j */
    public final int mo38j(long j) {
        int iMax = Math.max(this.f8434g, AbstractC7485Dh1.m1814b(this.f8430c, j, true));
        int i = iMax - this.f8434g;
        this.f8434g = iMax;
        return i;
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: k */
    public final int mo39k(C0827N8 c0827n8, C1587ZD c1587zd, int i) throws IOException {
        int i2 = this.f8434g;
        boolean z = i2 == this.f8430c.length;
        if (z && !this.f8431d) {
            c1587zd.f3082b = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.f8433f) {
            c0827n8.f7524c = this.f8428a;
            this.f8433f = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.f8434g = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrM17577u = this.f8429b.m17577u(this.f8432e.f9612a[i2]);
            c1587zd.m9506v(bArrM17577u.length);
            c1587zd.f14798e.put(bArrM17577u);
        }
        c1587zd.f14800g = this.f8430c[i2];
        c1587zd.f3082b = 1;
        return -4;
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: a */
    public final void mo34a() {
    }
}
