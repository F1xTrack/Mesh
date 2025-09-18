package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* loaded from: classes.dex */
public final class BW implements WR {
    public final C4103hA0 a = new C4103hA0(4);
    public final C4103hA0 b = new C4103hA0(9);
    public final C4103hA0 c = new C4103hA0(11);
    public final C4103hA0 d = new C4103hA0();
    public final IW0 e;
    public YR f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public C1111Oa o;
    public C1686Vj1 p;

    public BW() {
        IW0 iw0 = new IW0(11, new WJ());
        iw0.c = -9223372036854775807L;
        iw0.d = new long[0];
        iw0.e = new long[0];
        this.e = iw0;
        this.g = 1;
    }

    public final C4103hA0 a(C7566vF c7566vF) throws EOFException, InterruptedIOException {
        int i = this.l;
        C4103hA0 c4103hA0 = this.d;
        byte[] bArr = c4103hA0.a;
        if (i > bArr.length) {
            c4103hA0.E(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            c4103hA0.G(0);
        }
        c4103hA0.F(this.l);
        c7566vF.b(c4103hA0.a, 0, this.l, false);
        return c4103hA0;
    }

    @Override // defpackage.WR
    public final WR b() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0378 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0273  */
    @Override // defpackage.WR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.XR r30, defpackage.SV r31) throws defpackage.C5643lA0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BW.d(XR, SV):int");
    }

    @Override // defpackage.WR
    public final boolean f(XR xr) throws EOFException, InterruptedIOException {
        C4103hA0 c4103hA0 = this.a;
        C7566vF c7566vF = (C7566vF) xr;
        c7566vF.f(c4103hA0.a, 0, 3, false);
        c4103hA0.G(0);
        if (c4103hA0.x() != 4607062) {
            return false;
        }
        c7566vF.f(c4103hA0.a, 0, 2, false);
        c4103hA0.G(0);
        if ((c4103hA0.A() & 250) != 0) {
            return false;
        }
        c7566vF.f(c4103hA0.a, 0, 4, false);
        c4103hA0.G(0);
        int iG = c4103hA0.g();
        c7566vF.f = 0;
        c7566vF.a(iG, false);
        c7566vF.f(c4103hA0.a, 0, 4, false);
        c4103hA0.G(0);
        return c4103hA0.g() == 0;
    }

    @Override // defpackage.WR
    public final void g(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.WR
    public final List h() {
        N70 n70 = P70.b;
        return C3769fQ0.e;
    }

    @Override // defpackage.WR
    public final void l(YR yr) {
        this.f = yr;
    }

    @Override // defpackage.WR
    public final void release() {
    }
}
