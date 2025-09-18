package defpackage;

import android.net.Uri;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: h30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4081h30 {
    public final CF a;
    public final ZC b;
    public final ZC c;
    public final C5996n11 d;
    public final Uri[] e;
    public final C6666qX[] f;
    public final FF g;
    public final C1272Qb1 h;
    public final List i;
    public final NB0 k;
    public final C22 l;
    public boolean m;
    public C2562ch o;
    public Uri p;
    public boolean q;
    public InterfaceC5311jR r;
    public boolean t;
    public long u = -9223372036854775807L;
    public final QQ0 j = new QQ0(19);
    public byte[] n = AbstractC0277Dh1.f;
    public long s = -9223372036854775807L;

    public C4081h30(CF cf, FF ff, Uri[] uriArr, C6666qX[] c6666qXArr, C0136Bm1 c0136Bm1, InterfaceC4188hc1 interfaceC4188hc1, C5996n11 c5996n11, List list, NB0 nb0, C22 c22) {
        this.a = cf;
        this.g = ff;
        this.e = uriArr;
        this.f = c6666qXArr;
        this.d = c5996n11;
        this.i = list;
        this.k = nb0;
        this.l = c22;
        ZC zcS0 = ((WC) c0136Bm1.b).s0();
        this.b = zcS0;
        if (interfaceC4188hc1 != null) {
            zcS0.d(interfaceC4188hc1);
        }
        this.c = ((WC) c0136Bm1.b).s0();
        this.h = new C1272Qb1("", c6666qXArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((c6666qXArr[i].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        C1272Qb1 c1272Qb1 = this.h;
        int[] iArrG = AbstractC6955s22.g(arrayList);
        C3699f30 c3699f30 = new C3699f30(c1272Qb1, iArrG);
        c3699f30.g = c3699f30.f(c1272Qb1.d[iArrG[0]]);
        this.r = c3699f30;
    }

    public static C3890g30 d(C6576q30 c6576q30, long j, int i) {
        int i2 = (int) (j - c6576q30.k);
        P70 p70 = c6576q30.r;
        int size = p70.size();
        P70 p702 = c6576q30.s;
        if (i2 == size) {
            if (i == -1) {
                i = 0;
            }
            if (i < p702.size()) {
                return new C3890g30((AbstractC6194o30) p702.get(i), j, i);
            }
            return null;
        }
        C6003n30 c6003n30 = (C6003n30) p70.get(i2);
        if (i == -1) {
            return new C3890g30(c6003n30, j, -1);
        }
        if (i < c6003n30.m.size()) {
            return new C3890g30((AbstractC6194o30) c6003n30.m.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < p70.size()) {
            return new C3890g30((AbstractC6194o30) p70.get(i3), j + 1, -1);
        }
        if (p702.isEmpty()) {
            return null;
        }
        return new C3890g30((AbstractC6194o30) p702.get(0), j + 1, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.InterfaceC0375Eo0[] a(defpackage.C5239j30 r20, long r21) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4081h30.a(j30, long):Eo0[]");
    }

    public final int b(C5239j30 c5239j30) {
        if (c5239j30.o == -1) {
            return 1;
        }
        C6576q30 c6576q30A = this.g.a(false, this.e[this.h.b(c5239j30.d)]);
        c6576q30A.getClass();
        int i = (int) (c5239j30.j - c6576q30A.k);
        if (i < 0) {
            return 1;
        }
        P70 p70 = c6576q30A.r;
        P70 p702 = i < p70.size() ? ((C6003n30) p70.get(i)).m : c6576q30A.s;
        int size = p702.size();
        int i2 = c5239j30.o;
        if (i2 >= size) {
            return 2;
        }
        C5621l30 c5621l30 = (C5621l30) p702.get(i2);
        if (c5621l30.m) {
            return 0;
        }
        return AbstractC0277Dh1.a(Uri.parse(AbstractC2051a02.h(c6576q30A.a, c5621l30.a)), c5239j30.b.a) ? 1 : 2;
    }

    public final Pair c(C5239j30 c5239j30, boolean z, C6576q30 c6576q30, long j, long j2) {
        boolean z2 = true;
        if (c5239j30 != null && !z) {
            boolean z3 = c5239j30.H;
            long jA = c5239j30.j;
            int i = c5239j30.o;
            if (!z3) {
                return new Pair(Long.valueOf(jA), Integer.valueOf(i));
            }
            if (i == -1) {
                jA = c5239j30.a();
            }
            return new Pair(Long.valueOf(jA), Integer.valueOf(i != -1 ? i + 1 : -1));
        }
        long j3 = c6576q30.u + j;
        if (c5239j30 != null && !this.q) {
            j2 = c5239j30.g;
        }
        boolean z4 = c6576q30.o;
        long j4 = c6576q30.k;
        P70 p70 = c6576q30.r;
        if (!z4 && j2 >= j3) {
            return new Pair(Long.valueOf(j4 + p70.size()), -1);
        }
        long j5 = j2 - j;
        Long lValueOf = Long.valueOf(j5);
        int i2 = 0;
        if (this.g.m && c5239j30 != null) {
            z2 = false;
        }
        int iD = AbstractC0277Dh1.d(p70, lValueOf, z2);
        long j6 = iD + j4;
        if (iD >= 0) {
            C6003n30 c6003n30 = (C6003n30) p70.get(iD);
            long j7 = c6003n30.e + c6003n30.c;
            P70 p702 = c6576q30.s;
            P70 p703 = j5 < j7 ? c6003n30.m : p702;
            while (true) {
                if (i2 >= p703.size()) {
                    break;
                }
                C5621l30 c5621l30 = (C5621l30) p703.get(i2);
                if (j5 >= c5621l30.e + c5621l30.c) {
                    i2++;
                } else if (c5621l30.l) {
                    j6 += p703 == p702 ? 1L : 0L;
                    i = i2;
                }
            }
        }
        return new Pair(Long.valueOf(j6), Integer.valueOf(i));
    }

    public final C3318d30 e(Uri uri, int i, boolean z, C1090Nt c1090Nt) {
        if (uri == null) {
            return null;
        }
        QQ0 qq0 = this.j;
        byte[] bArr = (byte[]) ((C5526kZ) qq0.a).remove(uri);
        if (bArr != null) {
            return null;
        }
        C3538eD c3538eD = new C3538eD(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 1);
        if (c1090Nt != null) {
            if (z) {
                c1090Nt.j = "i";
            }
            c3538eD = c1090Nt.a().a(c3538eD);
        }
        C6666qX c6666qX = this.f[i];
        int iN = this.r.n();
        Object objQ = this.r.q();
        byte[] bArr2 = this.n;
        C3318d30 c3318d30 = new C3318d30(this.c, c3538eD, 3, c6666qX, iN, objQ, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = AbstractC0277Dh1.f;
        }
        c3318d30.j = bArr2;
        return c3318d30;
    }
}
