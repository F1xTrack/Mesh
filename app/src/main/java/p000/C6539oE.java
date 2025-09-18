package p000;

/* renamed from: oE */
/* loaded from: classes.dex */
public final /* synthetic */ class C6539oE implements InterfaceC8216Rj0 {

    /* renamed from: a */
    public final /* synthetic */ int f38896a;

    /* renamed from: b */
    public final /* synthetic */ C1514Y3 f38897b;

    /* renamed from: c */
    public final /* synthetic */ String f38898c;

    public /* synthetic */ C6539oE(C1514Y3 c1514y3, String str, int i) {
        this.f38896a = i;
        this.f38897b = c1514y3;
        this.f38898c = str;
    }

    @Override // p000.InterfaceC8216Rj0
    public final void invoke(Object obj) {
        InterfaceC1577Z3 interfaceC1577Z3 = (InterfaceC1577Z3) obj;
        switch (this.f38896a) {
            case 0:
                C1514Y3 c1514y3 = this.f38897b;
                interfaceC1577Z3.getClass();
                interfaceC1577Z3.mo2245g(c1514y3, this.f38898c);
                break;
            case 1:
                interfaceC1577Z3.mo2263y(this.f38897b, this.f38898c);
                break;
            case 2:
                C1514Y3 c1514y32 = this.f38897b;
                interfaceC1577Z3.getClass();
                interfaceC1577Z3.mo2227L(c1514y32, this.f38898c);
                break;
            default:
                interfaceC1577Z3.mo2242d(this.f38897b, this.f38898c);
                break;
        }
    }

    public /* synthetic */ C6539oE(C1514Y3 c1514y3, String str, long j, long j2, int i) {
        this.f38896a = i;
        this.f38897b = c1514y3;
        this.f38898c = str;
    }
}
