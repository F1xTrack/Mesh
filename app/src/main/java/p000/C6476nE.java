package p000;

/* renamed from: nE */
/* loaded from: classes.dex */
public final /* synthetic */ class C6476nE implements InterfaceC8216Rj0, InterfaceC6587oy {

    /* renamed from: a */
    public final /* synthetic */ long f38186a;

    /* renamed from: b */
    public final /* synthetic */ int f38187b;

    /* renamed from: c */
    public final /* synthetic */ Object f38188c;

    public /* synthetic */ C6476nE(C1514Y3 c1514y3, int i, long j, long j2) {
        this.f38188c = c1514y3;
        this.f38187b = i;
        this.f38186a = j;
    }

    @Override // p000.InterfaceC6587oy
    /* renamed from: b */
    public void mo4000b(Object obj) {
        C7122xB c7122xB = (C7122xB) obj;
        C9584h61 c9584h61 = (C9584h61) this.f38188c;
        YN1.m9283h(c9584h61.f28267h);
        byte[] bArrM2447e = C7564Ev0.m2447e(c7122xB.f45432a, c7122xB.f45434c);
        C9591hA0 c9591hA0 = c9584h61.f28262c;
        c9591hA0.getClass();
        c9591hA0.m18739E(bArrM2447e.length, bArrM2447e);
        c9584h61.f28260a.mo963d(bArrM2447e.length, c9591hA0);
        long j = c7122xB.f45433b;
        long j2 = this.f38186a;
        if (j == -9223372036854775807L) {
            YN1.m9281f(c9584h61.f28267h.f40979r == Long.MAX_VALUE);
        } else {
            long j3 = c9584h61.f28267h.f40979r;
            j2 = j3 == Long.MAX_VALUE ? j2 + j : j + j3;
        }
        c9584h61.f28260a.mo960a(j2, this.f38187b, bArrM2447e.length, 0, null);
    }

    @Override // p000.InterfaceC8216Rj0
    public void invoke(Object obj) {
        ((InterfaceC1577Z3) obj).mo2219D(this.f38187b, this.f38186a, (C1514Y3) this.f38188c);
    }

    public /* synthetic */ C6476nE(C9584h61 c9584h61, long j, int i) {
        this.f38188c = c9584h61;
        this.f38186a = j;
        this.f38187b = i;
    }
}
