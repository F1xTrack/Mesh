package defpackage;

/* renamed from: sE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6990sE implements InterfaceC1373Rj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Y3 b;

    public /* synthetic */ C6990sE(Y3 y3, int i) {
        this.a = i;
        this.b = y3;
    }

    @Override // defpackage.InterfaceC1373Rj0
    public final void invoke(Object obj) {
        Z3 z3 = (Z3) obj;
        switch (this.a) {
            case 0:
                z3.C(this.b);
                break;
            case 1:
                z3.t(this.b);
                break;
            case 2:
                z3.K(this.b);
                break;
            case 3:
                z3.R(this.b);
                break;
            case 4:
                z3.b(this.b);
                break;
            default:
                z3.A(this.b);
                break;
        }
    }

    public /* synthetic */ C6990sE(Y3 y3, WD wd, int i) {
        this.a = i;
        this.b = y3;
    }
}
