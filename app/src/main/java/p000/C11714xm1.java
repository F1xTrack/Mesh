package p000;

import java.math.RoundingMode;

/* renamed from: xm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11714xm1 implements InterfaceC11587wm1 {

    /* renamed from: a */
    public final InterfaceC1538YR f45773a;

    /* renamed from: b */
    public final InterfaceC8357Ub1 f45774b;

    /* renamed from: c */
    public final C0640K9 f45775c;

    /* renamed from: d */
    public final C6686qX f45776d;

    /* renamed from: e */
    public final int f45777e;

    /* renamed from: f */
    public long f45778f;

    /* renamed from: g */
    public int f45779g;

    /* renamed from: h */
    public long f45780h;

    public C11714xm1(InterfaceC1538YR interfaceC1538YR, InterfaceC8357Ub1 interfaceC8357Ub1, C0640K9 c0640k9, String str, int i) throws C10103lA0 {
        this.f45773a = interfaceC1538YR;
        this.f45774b = interfaceC8357Ub1;
        this.f45775c = c0640k9;
        int i2 = c0640k9.f5923e;
        int i3 = c0640k9.f5920b;
        int i4 = (i2 * i3) / 8;
        int i5 = c0640k9.f5922d;
        if (i5 != i4) {
            throw C10103lA0.m22366a(null, "Expected block size: " + i4 + "; got: " + i5);
        }
        int i6 = c0640k9.f5921c;
        int i7 = i6 * i4;
        int i8 = i7 * 8;
        int iMax = Math.max(i4, i7 / 10);
        this.f45777e = iMax;
        C6623pX c6623pX = new C6623pX();
        c6623pX.f40161l = AbstractC8544Xr0.m9171n(str);
        c6623pX.f40156g = i8;
        c6623pX.f40157h = i8;
        c6623pX.f40162m = iMax;
        c6623pX.f40175z = i3;
        c6623pX.f40141A = i6;
        c6623pX.f40142B = i;
        this.f45776d = new C6686qX(c6623pX);
    }

    @Override // p000.InterfaceC11587wm1
    /* renamed from: a */
    public final boolean mo25484a(C7000vF c7000vF, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.f45779g) < (i2 = this.f45777e)) {
            int iMo964e = this.f45774b.mo964e(c7000vF, (int) Math.min(i2 - i, j2), true);
            if (iMo964e == -1) {
                j2 = 0;
            } else {
                this.f45779g += iMo964e;
                j2 -= iMo964e;
            }
        }
        C0640K9 c0640k9 = this.f45775c;
        int i3 = this.f45779g;
        int i4 = c0640k9.f5922d;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long j3 = this.f45778f;
            long j4 = this.f45780h;
            long j5 = c0640k9.f5921c;
            int i6 = AbstractC7485Dh1.f2166a;
            long jM1810Y = j3 + AbstractC7485Dh1.m1810Y(j4, 1000000L, j5, RoundingMode.FLOOR);
            int i7 = i5 * i4;
            int i8 = this.f45779g - i7;
            this.f45774b.mo960a(jM1810Y, 1, i7, i8, null);
            this.f45780h += i5;
            this.f45779g = i8;
        }
        return j2 <= 0;
    }

    @Override // p000.InterfaceC11587wm1
    /* renamed from: b */
    public final void mo25485b(long j) {
        this.f45778f = j;
        this.f45779g = 0;
        this.f45780h = 0L;
    }

    @Override // p000.InterfaceC11587wm1
    /* renamed from: c */
    public final void mo25486c(int i, long j) {
        this.f45773a.mo2006x(new C11968zm1(this.f45775c, 1, i, j));
        this.f45774b.mo965f(this.f45776d);
    }
}
