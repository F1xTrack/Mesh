package p000;

/* renamed from: kE */
/* loaded from: classes.dex */
public final /* synthetic */ class C6287kE implements InterfaceC8216Rj0 {

    /* renamed from: a */
    public final /* synthetic */ int f36363a;

    /* renamed from: b */
    public final /* synthetic */ C1514Y3 f36364b;

    /* renamed from: c */
    public final /* synthetic */ int f36365c;

    public /* synthetic */ C6287kE(int i, long j, C1514Y3 c1514y3) {
        this.f36363a = 3;
        this.f36364b = c1514y3;
        this.f36365c = i;
    }

    @Override // p000.InterfaceC8216Rj0
    public final void invoke(Object obj) {
        InterfaceC1577Z3 interfaceC1577Z3 = (InterfaceC1577Z3) obj;
        switch (this.f36363a) {
            case 0:
                interfaceC1577Z3.mo2260v(this.f36364b, this.f36365c);
                break;
            case 1:
                interfaceC1577Z3.mo2262x(this.f36364b, this.f36365c);
                break;
            case 2:
                interfaceC1577Z3.mo2232Q(this.f36364b, this.f36365c);
                break;
            case 3:
                interfaceC1577Z3.mo2250l(this.f36364b, this.f36365c);
                break;
            case 4:
                interfaceC1577Z3.mo2248j(this.f36364b, this.f36365c);
                break;
            case 5:
                interfaceC1577Z3.mo2255q(this.f36364b, this.f36365c);
                break;
            default:
                C1514Y3 c1514y3 = this.f36364b;
                interfaceC1577Z3.getClass();
                interfaceC1577Z3.mo2217B(c1514y3, this.f36365c);
                break;
        }
    }

    public /* synthetic */ C6287kE(C1514Y3 c1514y3, int i, int i2) {
        this.f36363a = i2;
        this.f36364b = c1514y3;
        this.f36365c = i;
    }

    public /* synthetic */ C6287kE(C1514Y3 c1514y3, C10825qp0 c10825qp0, int i) {
        this.f36363a = 1;
        this.f36364b = c1514y3;
        this.f36365c = i;
    }
}
