package p000;

/* renamed from: oG */
/* loaded from: classes.dex */
public final class C6541oG implements InterfaceC10201lx0 {

    /* renamed from: a */
    public final C10073kx0 f38915a;

    /* renamed from: b */
    public final long f38916b;

    /* renamed from: c */
    public final long f38917c;

    /* renamed from: d */
    public final AbstractC9582h51 f38918d;

    /* renamed from: e */
    public int f38919e;

    /* renamed from: f */
    public long f38920f;

    /* renamed from: g */
    public long f38921g;

    /* renamed from: h */
    public long f38922h;

    /* renamed from: i */
    public long f38923i;

    /* renamed from: j */
    public long f38924j;

    /* renamed from: k */
    public long f38925k;

    /* renamed from: l */
    public long f38926l;

    public C6541oG(AbstractC9582h51 abstractC9582h51, long j, long j2, long j3, long j4, boolean z) {
        YN1.m9278c(j >= 0 && j2 > j);
        this.f38918d = abstractC9582h51;
        this.f38916b = j;
        this.f38917c = j2;
        if (j3 == j2 - j || z) {
            this.f38920f = j4;
            this.f38919e = 4;
        } else {
            this.f38919e = 0;
        }
        this.f38915a = new C10073kx0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // p000.InterfaceC10201lx0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo1936a(p000.C7000vF r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6541oG.mo1936a(vF):long");
    }

    @Override // p000.InterfaceC10201lx0
    /* renamed from: b */
    public final CX0 mo1937b() {
        if (this.f38920f != 0) {
            return new C6478nG(this);
        }
        return null;
    }

    @Override // p000.InterfaceC10201lx0
    /* renamed from: d */
    public final void mo1938d(long j) {
        this.f38922h = AbstractC7485Dh1.m1826k(j, 0L, this.f38920f - 1);
        this.f38919e = 2;
        this.f38923i = this.f38916b;
        this.f38924j = this.f38917c;
        this.f38925k = 0L;
        this.f38926l = this.f38920f;
    }
}
