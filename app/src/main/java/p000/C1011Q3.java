package p000;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* renamed from: Q3 */
/* loaded from: classes.dex */
public final class C1011Q3 implements InterfaceC1412WR {

    /* renamed from: p */
    public static final int[] f9417p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: q */
    public static final int[] f9418q;

    /* renamed from: r */
    public static final byte[] f9419r;

    /* renamed from: s */
    public static final byte[] f9420s;

    /* renamed from: t */
    public static final int f9421t;

    /* renamed from: c */
    public boolean f9424c;

    /* renamed from: d */
    public long f9425d;

    /* renamed from: e */
    public int f9426e;

    /* renamed from: f */
    public int f9427f;

    /* renamed from: g */
    public boolean f9428g;

    /* renamed from: h */
    public long f9429h;

    /* renamed from: j */
    public int f9431j;

    /* renamed from: k */
    public long f9432k;

    /* renamed from: l */
    public InterfaceC1538YR f9433l;

    /* renamed from: m */
    public InterfaceC8357Ub1 f9434m;

    /* renamed from: n */
    public CX0 f9435n;

    /* renamed from: o */
    public boolean f9436o;

    /* renamed from: b */
    public final int f9423b = 0;

    /* renamed from: a */
    public final byte[] f9422a = new byte[1];

    /* renamed from: i */
    public int f9430i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f9418q = iArr;
        int i = AbstractC7485Dh1.f2166a;
        Charset charset = AbstractC7227yr.f46511c;
        f9419r = "#!AMR\n".getBytes(charset);
        f9420s = "#!AMR-WB\n".getBytes(charset);
        f9421t = iArr[8];
    }

    /* renamed from: a */
    public final int m6562a(C7000vF c7000vF) throws C10103lA0 {
        boolean z;
        c7000vF.f44297f = 0;
        byte[] bArr = this.f9422a;
        c7000vF.mo3620f(bArr, 0, 1, false);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw C10103lA0.m22366a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.f9424c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? f9418q[i] : f9417p[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f9424c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw C10103lA0.m22366a(null, sb.toString());
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: b */
    public final InterfaceC1412WR mo737b() {
        return this;
    }

    /* renamed from: c */
    public final boolean m6563c(C7000vF c7000vF) throws EOFException, InterruptedIOException {
        c7000vF.f44297f = 0;
        byte[] bArr = f9419r;
        byte[] bArr2 = new byte[bArr.length];
        c7000vF.mo3620f(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f9424c = false;
            c7000vF.mo3627n(bArr.length);
            return true;
        }
        c7000vF.f44297f = 0;
        byte[] bArr3 = f9420s;
        byte[] bArr4 = new byte[bArr3.length];
        c7000vF.mo3620f(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f9424c = true;
        c7000vF.mo3627n(bArr3.length);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8  */
    @Override // p000.InterfaceC1412WR
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo738d(p000.InterfaceC1475XR r20, p000.C1164SV r21) throws p000.C10103lA0 {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1011Q3.mo738d(XR, SV):int");
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: f */
    public final boolean mo739f(InterfaceC1475XR interfaceC1475XR) {
        return m6563c((C7000vF) interfaceC1475XR);
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: g */
    public final void mo740g(long j, long j2) {
        this.f9425d = 0L;
        this.f9426e = 0;
        this.f9427f = 0;
        if (j != 0) {
            CX0 cx0 = this.f9435n;
            if (cx0 instanceof C0060Ax) {
                this.f9432k = (Math.max(0L, j - ((C0060Ax) cx0).f477b) * 8000000) / r0.f480e;
                return;
            }
        }
        this.f9432k = 0L;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: h */
    public final List mo741h() {
        N70 n70 = P70.f8867b;
        return C9367fQ0.f27184e;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: l */
    public final void mo742l(InterfaceC1538YR interfaceC1538YR) {
        this.f9433l = interfaceC1538YR;
        this.f9434m = interfaceC1538YR.mo2005w(0, 1);
        interfaceC1538YR.mo2003p();
    }

    @Override // p000.InterfaceC1412WR
    public final void release() {
    }
}
