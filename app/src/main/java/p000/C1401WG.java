package p000;

import java.util.Comparator;

/* renamed from: WG */
/* loaded from: classes.dex */
public final class C1401WG extends AbstractC1527YG implements Comparable {

    /* renamed from: e */
    public final int f13099e;

    /* renamed from: f */
    public final boolean f13100f;

    /* renamed from: g */
    public final boolean f13101g;

    /* renamed from: h */
    public final boolean f13102h;

    /* renamed from: i */
    public final int f13103i;

    /* renamed from: j */
    public final int f13104j;

    /* renamed from: k */
    public final int f13105k;

    /* renamed from: l */
    public final int f13106l;

    /* renamed from: m */
    public final boolean f13107m;

    public C1401WG(int i, C8149Qb1 c8149Qb1, int i2, C1212TG c1212tg, int i3, String str) {
        int iM9689e;
        super(i, c8149Qb1, i2);
        int i4 = 0;
        this.f13100f = AbstractC11153tN0.m24907s(i3, false);
        int i5 = this.f14218d.f40966e;
        c1212tg.getClass();
        this.f13101g = (i5 & 1) != 0;
        this.f13102h = (i5 & 2) != 0;
        C9367fQ0 c9367fQ0 = c1212tg.f15008n;
        C9367fQ0 c9367fQ0M6229B = c9367fQ0.isEmpty() ? P70.m6229B("") : c9367fQ0;
        int i6 = 0;
        while (true) {
            if (i6 >= c9367fQ0M6229B.size()) {
                i6 = Integer.MAX_VALUE;
                iM9689e = 0;
                break;
            } else {
                iM9689e = C1654aH.m9689e(this.f14218d, (String) c9367fQ0M6229B.get(i6), false);
                if (iM9689e > 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.f13103i = i6;
        this.f13104j = iM9689e;
        int iM9687c = C1654aH.m9687c(this.f14218d.f40967f, c1212tg.f15009o);
        this.f13105k = iM9687c;
        this.f13107m = (this.f14218d.f40967f & 1088) != 0;
        int iM9689e2 = C1654aH.m9689e(this.f14218d, str, C1654aH.m9690h(str) == null);
        this.f13106l = iM9689e2;
        boolean z = iM9689e > 0 || (c9367fQ0.isEmpty() && iM9687c > 0) || this.f13101g || (this.f13102h && iM9689e2 > 0);
        if (AbstractC11153tN0.m24907s(i3, c1212tg.f11268w) && z) {
            i4 = 1;
        }
        this.f13099e = i4;
    }

    @Override // p000.AbstractC1527YG
    /* renamed from: a */
    public final int mo6282a() {
        return this.f13099e;
    }

    @Override // p000.AbstractC1527YG
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo6283b(AbstractC1527YG abstractC1527YG) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1401WG c1401wg) {
        AbstractC4146gv abstractC4146gvMo18074c = AbstractC4146gv.f28081a.mo18074c(this.f13100f, c1401wg.f13100f);
        Integer numValueOf = Integer.valueOf(this.f13103i);
        Integer numValueOf2 = Integer.valueOf(c1401wg.f13103i);
        Comparator comparator = C7354Au0.f461a;
        comparator.getClass();
        C9117dT0 c9117dT0 = C9117dT0.f26118a;
        AbstractC4146gv abstractC4146gvMo18073b = abstractC4146gvMo18074c.mo18073b(numValueOf, numValueOf2, c9117dT0);
        int i = this.f13104j;
        AbstractC4146gv abstractC4146gvMo18072a = abstractC4146gvMo18073b.mo18072a(i, c1401wg.f13104j);
        int i2 = this.f13105k;
        AbstractC4146gv abstractC4146gvMo18074c2 = abstractC4146gvMo18072a.mo18072a(i2, c1401wg.f13105k).mo18074c(this.f13101g, c1401wg.f13101g);
        Boolean boolValueOf = Boolean.valueOf(this.f13102h);
        Boolean boolValueOf2 = Boolean.valueOf(c1401wg.f13102h);
        if (i != 0) {
            comparator = c9117dT0;
        }
        AbstractC4146gv abstractC4146gvMo18072a2 = abstractC4146gvMo18074c2.mo18073b(boolValueOf, boolValueOf2, comparator).mo18072a(this.f13106l, c1401wg.f13106l);
        if (i2 == 0) {
            abstractC4146gvMo18072a2 = abstractC4146gvMo18072a2.mo18075d(this.f13107m, c1401wg.f13107m);
        }
        return abstractC4146gvMo18072a2.mo18076e();
    }
}
