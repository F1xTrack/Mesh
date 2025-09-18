package defpackage;

/* renamed from: mE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5845mE implements InterfaceC1373Rj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Y3 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ C5845mE(Y3 y3, boolean z, int i) {
        this.a = i;
        this.b = y3;
        this.c = z;
    }

    @Override // defpackage.InterfaceC1373Rj0
    public final void invoke(Object obj) {
        Z3 z3 = (Z3) obj;
        switch (this.a) {
            case 0:
                z3.c(this.b, this.c);
                break;
            case 1:
                z3.a(this.b, this.c);
                break;
            case 2:
                z3.e(this.b, this.c);
                break;
            default:
                Y3 y3 = this.b;
                z3.getClass();
                z3.M(y3, this.c);
                break;
        }
    }
}
