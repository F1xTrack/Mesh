package p000;

/* renamed from: mE */
/* loaded from: classes.dex */
public final /* synthetic */ class C6413mE implements InterfaceC8216Rj0 {

    /* renamed from: a */
    public final /* synthetic */ int f37566a;

    /* renamed from: b */
    public final /* synthetic */ C1514Y3 f37567b;

    /* renamed from: c */
    public final /* synthetic */ boolean f37568c;

    public /* synthetic */ C6413mE(C1514Y3 c1514y3, boolean z, int i) {
        this.f37566a = i;
        this.f37567b = c1514y3;
        this.f37568c = z;
    }

    @Override // p000.InterfaceC8216Rj0
    public final void invoke(Object obj) {
        InterfaceC1577Z3 interfaceC1577Z3 = (InterfaceC1577Z3) obj;
        switch (this.f37566a) {
            case 0:
                interfaceC1577Z3.mo2241c(this.f37567b, this.f37568c);
                break;
            case 1:
                interfaceC1577Z3.mo2239a(this.f37567b, this.f37568c);
                break;
            case 2:
                interfaceC1577Z3.mo2243e(this.f37567b, this.f37568c);
                break;
            default:
                C1514Y3 c1514y3 = this.f37567b;
                interfaceC1577Z3.getClass();
                interfaceC1577Z3.mo2228M(c1514y3, this.f37568c);
                break;
        }
    }
}
