package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class OP implements InterfaceC3403dV0 {
    public final C6666qX a;
    public long[] c;
    public boolean d;
    public QP e;
    public boolean f;
    public int g;
    public final C3383dO1 b = new C3383dO1(11);
    public long h = -9223372036854775807L;

    public OP(QP qp, C6666qX c6666qX, boolean z) {
        this.a = c6666qX;
        this.e = qp;
        this.c = qp.b;
        b(qp, z);
    }

    public final void b(QP qp, boolean z) {
        int i = this.g;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.d = z;
        this.e = qp;
        long[] jArr = qp.b;
        this.c = jArr;
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            if (j2 != -9223372036854775807L) {
                this.g = AbstractC0277Dh1.b(jArr, j2, false);
            }
        } else {
            int iB = AbstractC0277Dh1.b(jArr, j3, true);
            this.g = iB;
            if (this.d && iB == this.c.length) {
                j = j3;
            }
            this.h = j;
        }
    }

    @Override // defpackage.InterfaceC3403dV0
    public final boolean f() {
        return true;
    }

    @Override // defpackage.InterfaceC3403dV0
    public final int j(long j) {
        int iMax = Math.max(this.g, AbstractC0277Dh1.b(this.c, j, true));
        int i = iMax - this.g;
        this.g = iMax;
        return i;
    }

    @Override // defpackage.InterfaceC3403dV0
    public final int k(N8 n8, ZD zd, int i) throws IOException {
        int i2 = this.g;
        boolean z = i2 == this.c.length;
        if (z && !this.d) {
            zd.b = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.f) {
            n8.c = this.a;
            this.f = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.g = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrU = this.b.u(this.e.a[i2]);
            zd.v(bArrU.length);
            zd.e.put(bArrU);
        }
        zd.g = this.c[i2];
        zd.b = 1;
        return -4;
    }

    @Override // defpackage.InterfaceC3403dV0
    public final void a() {
    }
}
