package defpackage;

/* renamed from: wE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7753wE implements InterfaceC1373Rj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Y3 b;
    public final /* synthetic */ C7102sp0 c;

    public /* synthetic */ C7753wE(Y3 y3, C7102sp0 c7102sp0, int i) {
        this.a = i;
        this.b = y3;
        this.c = c7102sp0;
    }

    @Override // defpackage.InterfaceC1373Rj0
    public final void invoke(Object obj) {
        Z3 z3 = (Z3) obj;
        switch (this.a) {
            case 0:
                z3.J(this.b, this.c);
                break;
            default:
                z3.o(this.b, this.c);
                break;
        }
    }
}
