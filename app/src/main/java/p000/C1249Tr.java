package p000;

/* renamed from: Tr */
/* loaded from: classes.dex */
public final class C1249Tr {

    /* renamed from: a */
    public final InterfaceC8357Ub1 f11552a;

    /* renamed from: b */
    public final int f11553b;

    /* renamed from: c */
    public final int f11554c;

    /* renamed from: d */
    public final long f11555d;

    /* renamed from: e */
    public final int f11556e;

    /* renamed from: f */
    public int f11557f;

    /* renamed from: g */
    public int f11558g;

    /* renamed from: h */
    public int f11559h;

    /* renamed from: i */
    public int f11560i;

    /* renamed from: j */
    public int f11561j;

    /* renamed from: k */
    public long[] f11562k;

    /* renamed from: l */
    public int[] f11563l;

    public C1249Tr(int i, int i2, long j, int i3, InterfaceC8357Ub1 interfaceC8357Ub1) {
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        YN1.m9278c(z);
        this.f11555d = j;
        this.f11556e = i3;
        this.f11552a = interfaceC8357Ub1;
        int i4 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.f11553b = (i2 == 2 ? 1667497984 : 1651965952) | i4;
        this.f11554c = i2 == 2 ? i4 | 1650720768 : -1;
        this.f11562k = new long[512];
        this.f11563l = new int[512];
    }

    /* renamed from: a */
    public final EX0 m7792a(int i) {
        return new EX0(((this.f11555d * 1) / this.f11556e) * this.f11563l[i], this.f11562k[i]);
    }

    /* renamed from: b */
    public final BX0 m7793b(long j) {
        int i = (int) (j / ((this.f11555d * 1) / this.f11556e));
        int iM1820e = AbstractC7485Dh1.m1820e(this.f11563l, i, true, true);
        if (this.f11563l[iM1820e] == i) {
            EX0 ex0M7792a = m7792a(iM1820e);
            return new BX0(ex0M7792a, ex0M7792a);
        }
        EX0 ex0M7792a2 = m7792a(iM1820e);
        int i2 = iM1820e + 1;
        return i2 < this.f11562k.length ? new BX0(ex0M7792a2, m7792a(i2)) : new BX0(ex0M7792a2, ex0M7792a2);
    }
}
