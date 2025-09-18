package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class PG extends YG implements Comparable {
    public final int e;
    public final boolean f;
    public final String g;
    public final TG h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final int o;
    public final int p;
    public final boolean q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final boolean v;
    public final boolean w;

    public PG(int i, C1272Qb1 c1272Qb1, int i2, TG tg, int i3, boolean z, OG og, int i4) {
        int i5;
        int iE;
        int iE2;
        boolean z2;
        super(i, c1272Qb1, i2);
        this.h = tg;
        int i6 = tg.u ? 24 : 16;
        int i7 = 0;
        this.m = false;
        this.g = C2103aH.h(this.d.d);
        this.i = AbstractC7209tN0.s(i3, false);
        int i8 = 0;
        while (true) {
            C3769fQ0 c3769fQ0 = tg.i;
            i5 = Integer.MAX_VALUE;
            if (i8 >= c3769fQ0.size()) {
                iE = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iE = C2103aH.e(this.d, (String) c3769fQ0.get(i8), false);
                if (iE > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.k = i8;
        this.j = iE;
        this.l = C2103aH.c(this.d.f, 0);
        C6666qX c6666qX = this.d;
        int i9 = c6666qX.f;
        this.n = i9 == 0 || (i9 & 1) != 0;
        this.q = (c6666qX.e & 1) != 0;
        int i10 = c6666qX.A;
        this.r = i10;
        this.s = c6666qX.B;
        int i11 = c6666qX.i;
        this.t = i11;
        this.f = (i11 == -1 || i11 <= tg.k) && (i10 == -1 || i10 <= tg.j) && og.apply(c6666qX);
        String[] strArrE = AbstractC0277Dh1.E();
        int i12 = 0;
        while (true) {
            if (i12 >= strArrE.length) {
                iE2 = 0;
                i12 = Integer.MAX_VALUE;
                break;
            } else {
                iE2 = C2103aH.e(this.d, strArrE[i12], false);
                if (iE2 > 0) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        this.o = i12;
        this.p = iE2;
        int i13 = 0;
        while (true) {
            C3769fQ0 c3769fQ02 = tg.l;
            if (i13 < c3769fQ02.size()) {
                String str = this.d.m;
                if (str != null && str.equals(c3769fQ02.get(i13))) {
                    i5 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        this.u = i5;
        this.v = AbstractC7209tN0.n(i3) == 128;
        this.w = AbstractC7209tN0.o(i3) == 64;
        TG tg2 = this.h;
        if (AbstractC7209tN0.s(i3, tg2.w) && ((z2 = this.f) || tg2.t)) {
            tg2.m.getClass();
            i7 = (!AbstractC7209tN0.s(i3, false) || !z2 || this.d.i == -1 || (!tg2.x && z) || (i6 & i3) == 0) ? 1 : 2;
        }
        this.e = i7;
    }

    @Override // defpackage.YG
    public final int a() {
        return this.e;
    }

    @Override // defpackage.YG
    public final boolean b(YG yg) {
        int i;
        String str;
        PG pg = (PG) yg;
        this.h.getClass();
        C6666qX c6666qX = this.d;
        int i2 = c6666qX.A;
        if (i2 != -1) {
            C6666qX c6666qX2 = pg.d;
            if (i2 == c6666qX2.A && ((this.m || ((str = c6666qX.m) != null && TextUtils.equals(str, c6666qX2.m))) && (i = c6666qX.B) != -1 && i == c6666qX2.B)) {
                if (this.v == pg.v && this.w == pg.w) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(PG pg) {
        boolean z = this.i;
        boolean z2 = this.f;
        AbstractC1028My0 abstractC1028My0A = (z2 && z) ? C2103aH.k : C2103aH.k.a();
        AbstractC4052gv abstractC4052gvC = AbstractC4052gv.a.c(z, pg.i);
        Integer numValueOf = Integer.valueOf(this.k);
        Integer numValueOf2 = Integer.valueOf(pg.k);
        C0081Au0.a.getClass();
        C3397dT0 c3397dT0 = C3397dT0.a;
        AbstractC4052gv abstractC4052gvB = abstractC4052gvC.b(numValueOf, numValueOf2, c3397dT0).a(this.j, pg.j).a(this.l, pg.l).c(this.q, pg.q).c(this.n, pg.n).b(Integer.valueOf(this.o), Integer.valueOf(pg.o), c3397dT0).a(this.p, pg.p).c(z2, pg.f).b(Integer.valueOf(this.u), Integer.valueOf(pg.u), c3397dT0);
        this.h.getClass();
        AbstractC4052gv abstractC4052gvB2 = abstractC4052gvB.c(this.v, pg.v).c(this.w, pg.w).b(Integer.valueOf(this.r), Integer.valueOf(pg.r), abstractC1028My0A).b(Integer.valueOf(this.s), Integer.valueOf(pg.s), abstractC1028My0A);
        if (AbstractC0277Dh1.a(this.g, pg.g)) {
            abstractC4052gvB2 = abstractC4052gvB2.b(Integer.valueOf(this.t), Integer.valueOf(pg.t), abstractC1028My0A);
        }
        return abstractC4052gvB2.e();
    }
}
