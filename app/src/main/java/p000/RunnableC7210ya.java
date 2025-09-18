package p000;

/* renamed from: ya */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7210ya implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f46311a;

    /* renamed from: b */
    public final /* synthetic */ int f46312b;

    /* renamed from: c */
    public final /* synthetic */ long f46313c;

    /* renamed from: d */
    public final /* synthetic */ long f46314d;

    /* renamed from: e */
    public final /* synthetic */ Object f46315e;

    public /* synthetic */ RunnableC7210ya(Object obj, int i, long j, long j2, int i2) {
        this.f46311a = i2;
        this.f46315e = obj;
        this.f46312b = i;
        this.f46313c = j;
        this.f46314d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f46315e;
        switch (this.f46311a) {
            case 0:
                CC0 cc0 = (CC0) obj;
                cc0.getClass();
                int i = AbstractC7485Dh1.f2166a;
                C7251zE c7251zE = ((SurfaceHolderCallbackC1285UQ) cc0.f1251c).f11780a.f13736r;
                final C1514Y3 c1514y3M26333P = c7251zE.m26333P();
                final int i2 = this.f46312b;
                final long j = this.f46313c;
                final long j2 = this.f46314d;
                c7251zE.m26334Q(c1514y3M26333P, 1011, new InterfaceC8216Rj0() { // from class: xE
                    @Override // p000.InterfaceC8216Rj0
                    public final void invoke(Object obj2) {
                        ((InterfaceC1577Z3) obj2).mo2222G(c1514y3M26333P, i2, j, j2);
                    }
                });
                break;
            default:
                ((C0042Af) obj).f302b.mo795k(this.f46312b, this.f46313c, this.f46314d);
                break;
        }
    }
}
