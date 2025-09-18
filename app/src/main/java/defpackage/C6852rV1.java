package defpackage;

/* renamed from: rV1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C6852rV1 implements InterfaceC3739fG0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ C1587Uc1 b;

    public /* synthetic */ C6852rV1(C1587Uc1 c1587Uc1, int i) {
        this.a = i;
        this.b = c1587Uc1;
    }

    @Override // defpackage.InterfaceC3739fG0
    public final Object get() {
        switch (this.a) {
            case 0:
                return this.b.a("FIREBASE_ML_SDK", new C7973xO("json"), C1538Tm0.i);
            case 1:
                return this.b.a("FIREBASE_ML_SDK", new C7973xO("proto"), C6518pl0.j);
            case 2:
                return this.b.a("FIREBASE_ML_SDK", new C7973xO("json"), new BG1(4));
            default:
                return this.b.a("FIREBASE_ML_SDK", new C7973xO("proto"), new C7761wG1(4));
        }
    }
}
