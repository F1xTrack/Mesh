package p000;

/* renamed from: vC */
/* loaded from: classes.dex */
public final class C6997vC extends AbstractC7419Ca1 {

    /* renamed from: b */
    public final long f44241b;

    /* renamed from: c */
    public final long f44242c;

    /* renamed from: d */
    public final long f44243d;

    /* renamed from: e */
    public final int f44244e;

    /* renamed from: f */
    public final long f44245f;

    /* renamed from: g */
    public final long f44246g;

    /* renamed from: h */
    public final long f44247h;

    /* renamed from: i */
    public final C6602pC f44248i;

    /* renamed from: j */
    public final C10825qp0 f44249j;

    /* renamed from: k */
    public final C10185lp0 f44250k;

    public C6997vC(long j, long j2, long j3, int i, long j4, long j5, long j6, C6602pC c6602pC, C10825qp0 c10825qp0, C10185lp0 c10185lp0) {
        YN1.m9281f(c6602pC.f39900d == (c10185lp0 != null));
        this.f44241b = j;
        this.f44242c = j2;
        this.f44243d = j3;
        this.f44244e = i;
        this.f44245f = j4;
        this.f44246g = j5;
        this.f44247h = j6;
        this.f44248i = c6602pC;
        this.f44249j = c10825qp0;
        this.f44250k = c10185lp0;
    }

    @Override // p000.AbstractC7419Ca1
    /* renamed from: b */
    public final int mo1245b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f44244e) >= 0 && iIntValue < mo1251h()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // p000.AbstractC7419Ca1
    /* renamed from: f */
    public final C7315Aa1 mo1249f(int i, C7315Aa1 c7315Aa1, boolean z) {
        YN1.m9279d(i, mo1251h());
        C6602pC c6602pC = this.f44248i;
        String str = z ? c6602pC.m23640b(i).f7013a : null;
        Integer numValueOf = z ? Integer.valueOf(this.f44244e + i) : null;
        long jM23642d = c6602pC.m23642d(i);
        long jM1802Q = AbstractC7485Dh1.m1802Q(c6602pC.m23640b(i).f7014b - c6602pC.m23640b(0).f7014b) - this.f44245f;
        c7315Aa1.getClass();
        c7315Aa1.m243h(str, numValueOf, 0, jM23642d, jM1802Q, C3966e3.f26513c, false);
        return c7315Aa1;
    }

    @Override // p000.AbstractC7419Ca1
    /* renamed from: h */
    public final int mo1251h() {
        return this.f44248i.f39909m.size();
    }

    @Override // p000.AbstractC7419Ca1
    /* renamed from: l */
    public final Object mo1255l(int i) {
        YN1.m9279d(i, mo1251h());
        return Integer.valueOf(this.f44244e + i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b A[PHI: r7
  0x003b: PHI (r7v1 long) = (r7v0 long), (r7v2 long) binds: [B:14:0x002e, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.AbstractC7419Ca1
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C7367Ba1 mo1256m(int r22, p000.C7367Ba1 r23, long r24) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6997vC.mo1256m(int, Ba1, long):Ba1");
    }

    @Override // p000.AbstractC7419Ca1
    /* renamed from: o */
    public final int mo1258o() {
        return 1;
    }
}
