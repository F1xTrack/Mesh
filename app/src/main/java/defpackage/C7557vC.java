package defpackage;

/* renamed from: vC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7557vC extends AbstractC0178Ca1 {
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final long f;
    public final long g;
    public final long h;
    public final C6412pC i;
    public final C6721qp0 j;
    public final C5766lp0 k;

    public C7557vC(long j, long j2, long j3, int i, long j4, long j5, long j6, C6412pC c6412pC, C6721qp0 c6721qp0, C5766lp0 c5766lp0) {
        YN1.f(c6412pC.d == (c5766lp0 != null));
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = i;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = c6412pC;
        this.j = c6721qp0;
        this.k = c5766lp0;
    }

    @Override // defpackage.AbstractC0178Ca1
    public final int b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.e) >= 0 && iIntValue < h()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // defpackage.AbstractC0178Ca1
    public final C0022Aa1 f(int i, C0022Aa1 c0022Aa1, boolean z) {
        YN1.d(i, h());
        C6412pC c6412pC = this.i;
        String str = z ? c6412pC.b(i).a : null;
        Integer numValueOf = z ? Integer.valueOf(this.e + i) : null;
        long jD = c6412pC.d(i);
        long jQ = AbstractC0277Dh1.Q(c6412pC.b(i).b - c6412pC.b(0).b) - this.f;
        c0022Aa1.getClass();
        c0022Aa1.h(str, numValueOf, 0, jD, jQ, C3507e3.c, false);
        return c0022Aa1;
    }

    @Override // defpackage.AbstractC0178Ca1
    public final int h() {
        return this.i.m.size();
    }

    @Override // defpackage.AbstractC0178Ca1
    public final Object l(int i) {
        YN1.d(i, h());
        return Integer.valueOf(this.e + i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b A[PHI: r7
  0x003b: PHI (r7v1 long) = (r7v0 long), (r7v2 long) binds: [B:14:0x002e, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.AbstractC0178Ca1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C0100Ba1 m(int r22, defpackage.C0100Ba1 r23, long r24) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7557vC.m(int, Ba1, long):Ba1");
    }

    @Override // defpackage.AbstractC0178Ca1
    public final int o() {
        return 1;
    }
}
