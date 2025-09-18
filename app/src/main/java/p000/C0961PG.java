package p000;

import android.text.TextUtils;

/* renamed from: PG */
/* loaded from: classes.dex */
public final class C0961PG extends AbstractC1527YG implements Comparable {

    /* renamed from: e */
    public final int f8951e;

    /* renamed from: f */
    public final boolean f8952f;

    /* renamed from: g */
    public final String f8953g;

    /* renamed from: h */
    public final C1212TG f8954h;

    /* renamed from: i */
    public final boolean f8955i;

    /* renamed from: j */
    public final int f8956j;

    /* renamed from: k */
    public final int f8957k;

    /* renamed from: l */
    public final int f8958l;

    /* renamed from: m */
    public final boolean f8959m;

    /* renamed from: n */
    public final boolean f8960n;

    /* renamed from: o */
    public final int f8961o;

    /* renamed from: p */
    public final int f8962p;

    /* renamed from: q */
    public final boolean f8963q;

    /* renamed from: r */
    public final int f8964r;

    /* renamed from: s */
    public final int f8965s;

    /* renamed from: t */
    public final int f8966t;

    /* renamed from: u */
    public final int f8967u;

    /* renamed from: v */
    public final boolean f8968v;

    /* renamed from: w */
    public final boolean f8969w;

    public C0961PG(int i, C8149Qb1 c8149Qb1, int i2, C1212TG c1212tg, int i3, boolean z, C0898OG c0898og, int i4) {
        int i5;
        int iM9689e;
        int iM9689e2;
        boolean z2;
        super(i, c8149Qb1, i2);
        this.f8954h = c1212tg;
        int i6 = c1212tg.f11266u ? 24 : 16;
        int i7 = 0;
        this.f8959m = false;
        this.f8953g = C1654aH.m9690h(this.f14218d.f40965d);
        this.f8955i = AbstractC11153tN0.m24907s(i3, false);
        int i8 = 0;
        while (true) {
            C9367fQ0 c9367fQ0 = c1212tg.f15003i;
            i5 = Integer.MAX_VALUE;
            if (i8 >= c9367fQ0.size()) {
                iM9689e = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iM9689e = C1654aH.m9689e(this.f14218d, (String) c9367fQ0.get(i8), false);
                if (iM9689e > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f8957k = i8;
        this.f8956j = iM9689e;
        this.f8958l = C1654aH.m9687c(this.f14218d.f40967f, 0);
        C6686qX c6686qX = this.f14218d;
        int i9 = c6686qX.f40967f;
        this.f8960n = i9 == 0 || (i9 & 1) != 0;
        this.f8963q = (c6686qX.f40966e & 1) != 0;
        int i10 = c6686qX.f40951A;
        this.f8964r = i10;
        this.f8965s = c6686qX.f40952B;
        int i11 = c6686qX.f40970i;
        this.f8966t = i11;
        this.f8952f = (i11 == -1 || i11 <= c1212tg.f15005k) && (i10 == -1 || i10 <= c1212tg.f15004j) && c0898og.apply(c6686qX);
        String[] strArrM1790E = AbstractC7485Dh1.m1790E();
        int i12 = 0;
        while (true) {
            if (i12 >= strArrM1790E.length) {
                iM9689e2 = 0;
                i12 = Integer.MAX_VALUE;
                break;
            } else {
                iM9689e2 = C1654aH.m9689e(this.f14218d, strArrM1790E[i12], false);
                if (iM9689e2 > 0) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        this.f8961o = i12;
        this.f8962p = iM9689e2;
        int i13 = 0;
        while (true) {
            C9367fQ0 c9367fQ02 = c1212tg.f15006l;
            if (i13 < c9367fQ02.size()) {
                String str = this.f14218d.f40974m;
                if (str != null && str.equals(c9367fQ02.get(i13))) {
                    i5 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        this.f8967u = i5;
        this.f8968v = AbstractC11153tN0.m24902n(i3) == 128;
        this.f8969w = AbstractC11153tN0.m24903o(i3) == 64;
        C1212TG c1212tg2 = this.f8954h;
        if (AbstractC11153tN0.m24907s(i3, c1212tg2.f11268w) && ((z2 = this.f8952f) || c1212tg2.f11265t)) {
            c1212tg2.f15007m.getClass();
            i7 = (!AbstractC11153tN0.m24907s(i3, false) || !z2 || this.f14218d.f40970i == -1 || (!c1212tg2.f11269x && z) || (i6 & i3) == 0) ? 1 : 2;
        }
        this.f8951e = i7;
    }

    @Override // p000.AbstractC1527YG
    /* renamed from: a */
    public final int mo6282a() {
        return this.f8951e;
    }

    @Override // p000.AbstractC1527YG
    /* renamed from: b */
    public final boolean mo6283b(AbstractC1527YG abstractC1527YG) {
        int i;
        String str;
        C0961PG c0961pg = (C0961PG) abstractC1527YG;
        this.f8954h.getClass();
        C6686qX c6686qX = this.f14218d;
        int i2 = c6686qX.f40951A;
        if (i2 != -1) {
            C6686qX c6686qX2 = c0961pg.f14218d;
            if (i2 == c6686qX2.f40951A && ((this.f8959m || ((str = c6686qX.f40974m) != null && TextUtils.equals(str, c6686qX2.f40974m))) && (i = c6686qX.f40952B) != -1 && i == c6686qX2.f40952B)) {
                if (this.f8968v == c0961pg.f8968v && this.f8969w == c0961pg.f8969w) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0961PG c0961pg) {
        boolean z = this.f8955i;
        boolean z2 = this.f8952f;
        AbstractC7986My0 abstractC7986My0Mo371a = (z2 && z) ? C1654aH.f15413k : C1654aH.f15413k.mo371a();
        AbstractC4146gv abstractC4146gvMo18074c = AbstractC4146gv.f28081a.mo18074c(z, c0961pg.f8955i);
        Integer numValueOf = Integer.valueOf(this.f8957k);
        Integer numValueOf2 = Integer.valueOf(c0961pg.f8957k);
        C7354Au0.f461a.getClass();
        C9117dT0 c9117dT0 = C9117dT0.f26118a;
        AbstractC4146gv abstractC4146gvMo18073b = abstractC4146gvMo18074c.mo18073b(numValueOf, numValueOf2, c9117dT0).mo18072a(this.f8956j, c0961pg.f8956j).mo18072a(this.f8958l, c0961pg.f8958l).mo18074c(this.f8963q, c0961pg.f8963q).mo18074c(this.f8960n, c0961pg.f8960n).mo18073b(Integer.valueOf(this.f8961o), Integer.valueOf(c0961pg.f8961o), c9117dT0).mo18072a(this.f8962p, c0961pg.f8962p).mo18074c(z2, c0961pg.f8952f).mo18073b(Integer.valueOf(this.f8967u), Integer.valueOf(c0961pg.f8967u), c9117dT0);
        this.f8954h.getClass();
        AbstractC4146gv abstractC4146gvMo18073b2 = abstractC4146gvMo18073b.mo18074c(this.f8968v, c0961pg.f8968v).mo18074c(this.f8969w, c0961pg.f8969w).mo18073b(Integer.valueOf(this.f8964r), Integer.valueOf(c0961pg.f8964r), abstractC7986My0Mo371a).mo18073b(Integer.valueOf(this.f8965s), Integer.valueOf(c0961pg.f8965s), abstractC7986My0Mo371a);
        if (AbstractC7485Dh1.m1812a(this.f8953g, c0961pg.f8953g)) {
            abstractC4146gvMo18073b2 = abstractC4146gvMo18073b2.mo18073b(Integer.valueOf(this.f8966t), Integer.valueOf(c0961pg.f8966t), abstractC7986My0Mo371a);
        }
        return abstractC4146gvMo18073b2.mo18076e();
    }
}
