package defpackage;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class WJ implements InterfaceC1584Ub1 {
    public final byte[] a = new byte[4096];

    @Override // defpackage.InterfaceC1584Ub1
    public final void b(C4103hA0 c4103hA0, int i, int i2) {
        c4103hA0.H(i);
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final int c(RC rc, int i, boolean z) throws EOFException {
        byte[] bArr = this.a;
        int iR = rc.r(bArr, 0, Math.min(bArr.length, i));
        if (iR != -1) {
            return iR;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final /* synthetic */ void d(int i, C4103hA0 c4103hA0) {
        F91.n(this, c4103hA0, i);
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final int e(RC rc, int i, boolean z) {
        return c(rc, i, z);
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final void f(C6666qX c6666qX) {
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final void a(long j, int i, int i2, int i3, C1506Tb1 c1506Tb1) {
    }
}
