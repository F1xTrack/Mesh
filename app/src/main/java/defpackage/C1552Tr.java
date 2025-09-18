package defpackage;

/* renamed from: Tr */
/* loaded from: classes.dex */
public final class C1552Tr {
    public final InterfaceC1584Ub1 a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long[] k;
    public int[] l;

    public C1552Tr(int i, int i2, long j, int i3, InterfaceC1584Ub1 interfaceC1584Ub1) {
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        YN1.c(z);
        this.d = j;
        this.e = i3;
        this.a = interfaceC1584Ub1;
        int i4 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.b = (i2 == 2 ? 1667497984 : 1651965952) | i4;
        this.c = i2 == 2 ? i4 | 1650720768 : -1;
        this.k = new long[512];
        this.l = new int[512];
    }

    public final EX0 a(int i) {
        return new EX0(((this.d * 1) / this.e) * this.l[i], this.k[i]);
    }

    public final BX0 b(long j) {
        int i = (int) (j / ((this.d * 1) / this.e));
        int iE = AbstractC0277Dh1.e(this.l, i, true, true);
        if (this.l[iE] == i) {
            EX0 ex0A = a(iE);
            return new BX0(ex0A, ex0A);
        }
        EX0 ex0A2 = a(iE);
        int i2 = iE + 1;
        return i2 < this.k.length ? new BX0(ex0A2, a(i2)) : new BX0(ex0A2, ex0A2);
    }
}
