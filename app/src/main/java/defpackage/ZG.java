package defpackage;

/* loaded from: classes.dex */
public final class ZG extends YG {
    public final boolean e;
    public final TG f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final boolean q;
    public final boolean r;
    public final int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ZG(int r8, defpackage.C1272Qb1 r9, int r10, defpackage.TG r11, int r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ZG.<init>(int, Qb1, int, TG, int, int, boolean):void");
    }

    public static int c(ZG zg, ZG zg2) {
        AbstractC4052gv abstractC4052gvC = AbstractC4052gv.a.c(zg.h, zg2.h).a(zg.m, zg2.m).c(zg.n, zg2.n).c(zg.i, zg2.i).c(zg.e, zg2.e).c(zg.g, zg2.g);
        Integer numValueOf = Integer.valueOf(zg.l);
        Integer numValueOf2 = Integer.valueOf(zg2.l);
        C0081Au0.a.getClass();
        AbstractC4052gv abstractC4052gvB = abstractC4052gvC.b(numValueOf, numValueOf2, C3397dT0.a);
        boolean z = zg2.q;
        boolean z2 = zg.q;
        AbstractC4052gv abstractC4052gvC2 = abstractC4052gvB.c(z2, z);
        boolean z3 = zg2.r;
        boolean z4 = zg.r;
        AbstractC4052gv abstractC4052gvC3 = abstractC4052gvC2.c(z4, z3);
        if (z2 && z4) {
            abstractC4052gvC3 = abstractC4052gvC3.a(zg.s, zg2.s);
        }
        return abstractC4052gvC3.e();
    }

    @Override // defpackage.YG
    public final int a() {
        return this.p;
    }

    @Override // defpackage.YG
    public final boolean b(YG yg) {
        ZG zg = (ZG) yg;
        if (this.o || AbstractC0277Dh1.a(this.d.m, zg.d.m)) {
            this.f.getClass();
            if (this.q == zg.q && this.r == zg.r) {
                return true;
            }
        }
        return false;
    }
}
