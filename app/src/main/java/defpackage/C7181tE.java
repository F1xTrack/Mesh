package defpackage;

/* renamed from: tE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7181tE implements InterfaceC1373Rj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Y3 b;
    public final /* synthetic */ C6666qX c;

    public /* synthetic */ C7181tE(Y3 y3, C6666qX c6666qX, C2285bE c2285bE, int i) {
        this.a = i;
        this.b = y3;
        this.c = c6666qX;
    }

    @Override // defpackage.InterfaceC1373Rj0
    public final void invoke(Object obj) {
        Z3 z3 = (Z3) obj;
        switch (this.a) {
            case 0:
                z3.w(this.b, this.c);
                break;
            default:
                z3.n(this.b, this.c);
                break;
        }
    }
}
