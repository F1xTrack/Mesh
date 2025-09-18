package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class WG extends YG implements Comparable {
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;

    public WG(int i, C1272Qb1 c1272Qb1, int i2, TG tg, int i3, String str) {
        int iE;
        super(i, c1272Qb1, i2);
        int i4 = 0;
        this.f = AbstractC7209tN0.s(i3, false);
        int i5 = this.d.e;
        tg.getClass();
        this.g = (i5 & 1) != 0;
        this.h = (i5 & 2) != 0;
        C3769fQ0 c3769fQ0 = tg.n;
        C3769fQ0 c3769fQ0B = c3769fQ0.isEmpty() ? P70.B("") : c3769fQ0;
        int i6 = 0;
        while (true) {
            if (i6 >= c3769fQ0B.size()) {
                i6 = Integer.MAX_VALUE;
                iE = 0;
                break;
            } else {
                iE = C2103aH.e(this.d, (String) c3769fQ0B.get(i6), false);
                if (iE > 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.i = i6;
        this.j = iE;
        int iC = C2103aH.c(this.d.f, tg.o);
        this.k = iC;
        this.m = (this.d.f & 1088) != 0;
        int iE2 = C2103aH.e(this.d, str, C2103aH.h(str) == null);
        this.l = iE2;
        boolean z = iE > 0 || (c3769fQ0.isEmpty() && iC > 0) || this.g || (this.h && iE2 > 0);
        if (AbstractC7209tN0.s(i3, tg.w) && z) {
            i4 = 1;
        }
        this.e = i4;
    }

    @Override // defpackage.YG
    public final int a() {
        return this.e;
    }

    @Override // defpackage.YG
    public final /* bridge */ /* synthetic */ boolean b(YG yg) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(WG wg) {
        AbstractC4052gv abstractC4052gvC = AbstractC4052gv.a.c(this.f, wg.f);
        Integer numValueOf = Integer.valueOf(this.i);
        Integer numValueOf2 = Integer.valueOf(wg.i);
        Comparator comparator = C0081Au0.a;
        comparator.getClass();
        C3397dT0 c3397dT0 = C3397dT0.a;
        AbstractC4052gv abstractC4052gvB = abstractC4052gvC.b(numValueOf, numValueOf2, c3397dT0);
        int i = this.j;
        AbstractC4052gv abstractC4052gvA = abstractC4052gvB.a(i, wg.j);
        int i2 = this.k;
        AbstractC4052gv abstractC4052gvC2 = abstractC4052gvA.a(i2, wg.k).c(this.g, wg.g);
        Boolean boolValueOf = Boolean.valueOf(this.h);
        Boolean boolValueOf2 = Boolean.valueOf(wg.h);
        if (i != 0) {
            comparator = c3397dT0;
        }
        AbstractC4052gv abstractC4052gvA2 = abstractC4052gvC2.b(boolValueOf, boolValueOf2, comparator).a(this.l, wg.l);
        if (i2 == 0) {
            abstractC4052gvA2 = abstractC4052gvA2.d(this.m, wg.m);
        }
        return abstractC4052gvA2.e();
    }
}
