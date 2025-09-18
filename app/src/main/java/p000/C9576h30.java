package p000;

import android.net.Uri;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: h30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9576h30 {

    /* renamed from: a */
    public final C0142CF f28184a;

    /* renamed from: b */
    public final InterfaceC1586ZC f28185b;

    /* renamed from: c */
    public final InterfaceC1586ZC f28186c;

    /* renamed from: d */
    public final C10339n11 f28187d;

    /* renamed from: e */
    public final Uri[] f28188e;

    /* renamed from: f */
    public final C6686qX[] f28189f;

    /* renamed from: g */
    public final C0331FF f28190g;

    /* renamed from: h */
    public final C8149Qb1 f28191h;

    /* renamed from: i */
    public final List f28192i;

    /* renamed from: k */
    public final NB0 f28194k;

    /* renamed from: l */
    public final C22 f28195l;

    /* renamed from: m */
    public boolean f28196m;

    /* renamed from: o */
    public C1863ch f28198o;

    /* renamed from: p */
    public Uri f28199p;

    /* renamed from: q */
    public boolean f28200q;

    /* renamed from: r */
    public InterfaceC6237jR f28201r;

    /* renamed from: t */
    public boolean f28203t;

    /* renamed from: u */
    public long f28204u = -9223372036854775807L;

    /* renamed from: j */
    public final QQ0 f28193j = new QQ0(19);

    /* renamed from: n */
    public byte[] f28197n = AbstractC7485Dh1.f2171f;

    /* renamed from: s */
    public long f28202s = -9223372036854775807L;

    public C9576h30(C0142CF c0142cf, C0331FF c0331ff, Uri[] uriArr, C6686qX[] c6686qXArr, C7391Bm1 c7391Bm1, InterfaceC9648hc1 interfaceC9648hc1, C10339n11 c10339n11, List list, NB0 nb0, C22 c22) {
        this.f28184a = c0142cf;
        this.f28190g = c0331ff;
        this.f28188e = uriArr;
        this.f28189f = c6686qXArr;
        this.f28187d = c10339n11;
        this.f28192i = list;
        this.f28194k = nb0;
        this.f28195l = c22;
        InterfaceC1586ZC interfaceC1586ZCMo506s0 = ((InterfaceC1397WC) c7391Bm1.f1022b).mo506s0();
        this.f28185b = interfaceC1586ZCMo506s0;
        if (interfaceC9648hc1 != null) {
            interfaceC1586ZCMo506s0.mo5255d(interfaceC9648hc1);
        }
        this.f28186c = ((InterfaceC1397WC) c7391Bm1.f1022b).mo506s0();
        this.f28191h = new C8149Qb1("", c6686qXArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((c6686qXArr[i].f40967f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        C8149Qb1 c8149Qb1 = this.f28191h;
        int[] iArrM24585g = AbstractC10983s22.m24585g(arrayList);
        C9320f30 c9320f30 = new C9320f30(c8149Qb1, iArrM24585g);
        c9320f30.f27024g = c9320f30.mo2725f(c8149Qb1.f9690d[iArrM24585g[0]]);
        this.f28201r = c9320f30;
    }

    /* renamed from: d */
    public static C9448g30 m18706d(C10728q30 c10728q30, long j, int i) {
        int i2 = (int) (j - c10728q30.f40547k);
        P70 p70 = c10728q30.f40554r;
        int size = p70.size();
        P70 p702 = c10728q30.f40555s;
        if (i2 == size) {
            if (i == -1) {
                i = 0;
            }
            if (i < p702.size()) {
                return new C9448g30((AbstractC10472o30) p702.get(i), j, i);
            }
            return null;
        }
        C10344n30 c10344n30 = (C10344n30) p70.get(i2);
        if (i == -1) {
            return new C9448g30(c10344n30, j, -1);
        }
        if (i < c10344n30.f38066m.size()) {
            return new C9448g30((AbstractC10472o30) c10344n30.f38066m.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < p70.size()) {
            return new C9448g30((AbstractC10472o30) p70.get(i3), j + 1, -1);
        }
        if (p702.isEmpty()) {
            return null;
        }
        return new C9448g30((AbstractC10472o30) p702.get(0), j + 1, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.InterfaceC7550Eo0[] m18707a(p000.C9832j30 r20, long r21) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9576h30.m18707a(j30, long):Eo0[]");
    }

    /* renamed from: b */
    public final int m18708b(C9832j30 c9832j30) {
        if (c9832j30.f34882o == -1) {
            return 1;
        }
        C10728q30 c10728q30M2560a = this.f28190g.m2560a(false, this.f28188e[this.f28191h.m6736b(c9832j30.f9814d)]);
        c10728q30M2560a.getClass();
        int i = (int) (c9832j30.f2255j - c10728q30M2560a.f40547k);
        if (i < 0) {
            return 1;
        }
        P70 p70 = c10728q30M2560a.f40554r;
        P70 p702 = i < p70.size() ? ((C10344n30) p70.get(i)).f38066m : c10728q30M2560a.f40555s;
        int size = p702.size();
        int i2 = c9832j30.f34882o;
        if (i2 >= size) {
            return 2;
        }
        C10088l30 c10088l30 = (C10088l30) p702.get(i2);
        if (c10088l30.f36845m) {
            return 0;
        }
        return AbstractC7485Dh1.m1812a(Uri.parse(AbstractC8668a02.m9659h(c10728q30M2560a.f44119a, c10088l30.f38735a)), c9832j30.f9812b.f26595a) ? 1 : 2;
    }

    /* renamed from: c */
    public final Pair m18709c(C9832j30 c9832j30, boolean z, C10728q30 c10728q30, long j, long j2) {
        boolean z2 = true;
        if (c9832j30 != null && !z) {
            boolean z3 = c9832j30.f34874H;
            long jMo1898a = c9832j30.f2255j;
            int i = c9832j30.f34882o;
            if (!z3) {
                return new Pair(Long.valueOf(jMo1898a), Integer.valueOf(i));
            }
            if (i == -1) {
                jMo1898a = c9832j30.mo1898a();
            }
            return new Pair(Long.valueOf(jMo1898a), Integer.valueOf(i != -1 ? i + 1 : -1));
        }
        long j3 = c10728q30.f40557u + j;
        if (c9832j30 != null && !this.f28200q) {
            j2 = c9832j30.f9817g;
        }
        boolean z4 = c10728q30.f40551o;
        long j4 = c10728q30.f40547k;
        P70 p70 = c10728q30.f40554r;
        if (!z4 && j2 >= j3) {
            return new Pair(Long.valueOf(j4 + p70.size()), -1);
        }
        long j5 = j2 - j;
        Long lValueOf = Long.valueOf(j5);
        int i2 = 0;
        if (this.f28190g.f3109m && c9832j30 != null) {
            z2 = false;
        }
        int iM1818d = AbstractC7485Dh1.m1818d(p70, lValueOf, z2);
        long j6 = iM1818d + j4;
        if (iM1818d >= 0) {
            C10344n30 c10344n30 = (C10344n30) p70.get(iM1818d);
            long j7 = c10344n30.f38739e + c10344n30.f38737c;
            P70 p702 = c10728q30.f40555s;
            P70 p703 = j5 < j7 ? c10344n30.f38066m : p702;
            while (true) {
                if (i2 >= p703.size()) {
                    break;
                }
                C10088l30 c10088l30 = (C10088l30) p703.get(i2);
                if (j5 >= c10088l30.f38739e + c10088l30.f38737c) {
                    i2++;
                } else if (c10088l30.f36844l) {
                    j6 += p703 == p702 ? 1L : 0L;
                    i = i2;
                }
            }
        }
        return new Pair(Long.valueOf(j6), Integer.valueOf(i));
    }

    /* renamed from: e */
    public final C9064d30 m18710e(Uri uri, int i, boolean z, C0874Nt c0874Nt) {
        if (uri == null) {
            return null;
        }
        QQ0 qq0 = this.f28193j;
        byte[] bArr = (byte[]) ((C6308kZ) qq0.f9619a).remove(uri);
        if (bArr != null) {
            return null;
        }
        C3976eD c3976eD = new C3976eD(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 1);
        if (c0874Nt != null) {
            if (z) {
                c0874Nt.f8112j = "i";
            }
            c3976eD = c0874Nt.m5896a().m6179a(c3976eD);
        }
        C6686qX c6686qX = this.f28189f[i];
        int iMo6375n = this.f28201r.mo6375n();
        Object objMo6376q = this.f28201r.mo6376q();
        byte[] bArr2 = this.f28197n;
        C9064d30 c9064d30 = new C9064d30(this.f28186c, c3976eD, 3, c6686qX, iMo6375n, objMo6376q, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = AbstractC7485Dh1.f2171f;
        }
        c9064d30.f25783j = bArr2;
        return c9064d30;
    }
}
