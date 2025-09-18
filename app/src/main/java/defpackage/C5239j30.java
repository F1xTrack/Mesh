package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: j30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5239j30 extends AbstractC0297Do0 {
    public static final AtomicInteger L = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public C4210hk C;
    public E30 D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public C3769fQ0 I;
    public boolean J;
    public boolean K;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    public final ZC p;
    public final C3538eD q;
    public final C4210hk r;
    public final boolean s;
    public final boolean t;
    public final C0724Ja1 u;
    public final CF v;
    public final List w;
    public final JL x;
    public final U50 y;
    public final C4103hA0 z;

    public C5239j30(CF cf, ZC zc, C3538eD c3538eD, C6666qX c6666qX, boolean z, ZC zc2, C3538eD c3538eD2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, C0724Ja1 c0724Ja1, JL jl, C4210hk c4210hk, U50 u50, C4103hA0 c4103hA0, boolean z6, NB0 nb0) {
        super(zc, c3538eD, c6666qX, i, obj, j, j2, j3);
        this.A = z;
        this.o = i2;
        this.K = z3;
        this.l = i3;
        this.q = c3538eD2;
        this.p = zc2;
        this.F = c3538eD2 != null;
        this.B = z2;
        this.m = uri;
        this.s = z5;
        this.u = c0724Ja1;
        this.t = z4;
        this.v = cf;
        this.w = list;
        this.x = jl;
        this.r = c4210hk;
        this.y = u50;
        this.z = c4103hA0;
        this.n = z6;
        N70 n70 = P70.b;
        this.I = C3769fQ0.e;
        this.k = L.getAndIncrement();
    }

    public static byte[] d(String str) {
        if (PN1.c(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // defpackage.AbstractC0297Do0
    public final boolean b() {
        throw null;
    }

    public final void c(ZC zc, C3538eD c3538eD, boolean z, boolean z2) {
        C3538eD c3538eDD;
        long j;
        long j2;
        if (z) {
            z = this.E != 0;
            c3538eDD = c3538eD;
        } else {
            c3538eDD = c3538eD.d(this.E);
        }
        try {
            C7566vF c7566vFG = g(zc, c3538eDD, z2);
            if (z) {
                c7566vFG.n(this.E);
            }
            while (!this.G) {
                try {
                    try {
                        if (((WR) this.C.b).d(c7566vFG, C4210hk.f) != 0) {
                            break;
                        }
                    } catch (EOFException e) {
                        if ((this.d.f & 16384) == 0) {
                            throw e;
                        }
                        ((WR) this.C.b).g(0L, 0L);
                        j = c7566vFG.d;
                        j2 = c3538eD.f;
                    }
                } catch (Throwable th) {
                    this.E = (int) (c7566vFG.d - c3538eD.f);
                    throw th;
                }
            }
            j = c7566vFG.d;
            j2 = c3538eD.f;
            this.E = (int) (j - j2);
        } finally {
            AbstractC4370iZ1.b(zc);
        }
    }

    @Override // defpackage.InterfaceC5751lk0
    public final void e() {
        C4210hk c4210hk;
        this.D.getClass();
        if (this.C == null && (c4210hk = this.r) != null) {
            WR wrB = ((WR) c4210hk.b).b();
            if ((wrB instanceof C4382id1) || (wrB instanceof KY)) {
                this.C = this.r;
                this.F = false;
            }
        }
        if (this.F) {
            ZC zc = this.p;
            zc.getClass();
            C3538eD c3538eD = this.q;
            c3538eD.getClass();
            c(zc, c3538eD, this.B, false);
            this.E = 0;
            this.F = false;
        }
        if (this.G) {
            return;
        }
        if (!this.t) {
            c(this.i, this.b, this.A, true);
        }
        this.H = !this.G;
    }

    public final int f(int i) {
        YN1.f(!this.n);
        if (i >= this.I.size()) {
            return 0;
        }
        return ((Integer) this.I.get(i)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0160  */
    /* JADX WARN: Type inference failed for: r10v21, types: [Bv0] */
    /* JADX WARN: Type inference failed for: r10v6, types: [Bv0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C7566vF g(defpackage.ZC r36, defpackage.C3538eD r37, boolean r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5239j30.g(ZC, eD, boolean):vF");
    }

    @Override // defpackage.InterfaceC5751lk0
    public final void s() {
        this.G = true;
    }
}
