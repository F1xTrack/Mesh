package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class Q3 implements WR {
    public static final int[] p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final int t;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public boolean g;
    public long h;
    public int j;
    public long k;
    public YR l;
    public InterfaceC1584Ub1 m;
    public CX0 n;
    public boolean o;
    public final int b = 0;
    public final byte[] a = new byte[1];
    public int i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        q = iArr;
        int i = AbstractC0277Dh1.a;
        Charset charset = AbstractC8250yr.c;
        r = "#!AMR\n".getBytes(charset);
        s = "#!AMR-WB\n".getBytes(charset);
        t = iArr[8];
    }

    public final int a(C7566vF c7566vF) throws C5643lA0 {
        boolean z;
        c7566vF.f = 0;
        byte[] bArr = this.a;
        c7566vF.f(bArr, 0, 1, false);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw C5643lA0.a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? q[i] : p[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw C5643lA0.a(null, sb.toString());
    }

    @Override // defpackage.WR
    public final WR b() {
        return this;
    }

    public final boolean c(C7566vF c7566vF) throws EOFException, InterruptedIOException {
        c7566vF.f = 0;
        byte[] bArr = r;
        byte[] bArr2 = new byte[bArr.length];
        c7566vF.f(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            c7566vF.n(bArr.length);
            return true;
        }
        c7566vF.f = 0;
        byte[] bArr3 = s;
        byte[] bArr4 = new byte[bArr3.length];
        c7566vF.f(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        c7566vF.n(bArr3.length);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8  */
    @Override // defpackage.WR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.XR r20, defpackage.SV r21) throws defpackage.C5643lA0 {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Q3.d(XR, SV):int");
    }

    @Override // defpackage.WR
    public final boolean f(XR xr) {
        return c((C7566vF) xr);
    }

    @Override // defpackage.WR
    public final void g(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        if (j != 0) {
            CX0 cx0 = this.n;
            if (cx0 instanceof C0089Ax) {
                this.k = (Math.max(0L, j - ((C0089Ax) cx0).b) * 8000000) / r0.e;
                return;
            }
        }
        this.k = 0L;
    }

    @Override // defpackage.WR
    public final List h() {
        N70 n70 = P70.b;
        return C3769fQ0.e;
    }

    @Override // defpackage.WR
    public final void l(YR yr) {
        this.l = yr;
        this.m = yr.w(0, 1);
        yr.p();
    }

    @Override // defpackage.WR
    public final void release() {
    }
}
