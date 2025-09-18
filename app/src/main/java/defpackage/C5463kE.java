package defpackage;

/* renamed from: kE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5463kE implements InterfaceC1373Rj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Y3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ C5463kE(int i, long j, Y3 y3) {
        this.a = 3;
        this.b = y3;
        this.c = i;
    }

    @Override // defpackage.InterfaceC1373Rj0
    public final void invoke(Object obj) {
        Z3 z3 = (Z3) obj;
        switch (this.a) {
            case 0:
                z3.v(this.b, this.c);
                break;
            case 1:
                z3.x(this.b, this.c);
                break;
            case 2:
                z3.Q(this.b, this.c);
                break;
            case 3:
                z3.l(this.b, this.c);
                break;
            case 4:
                z3.j(this.b, this.c);
                break;
            case 5:
                z3.q(this.b, this.c);
                break;
            default:
                Y3 y3 = this.b;
                z3.getClass();
                z3.B(y3, this.c);
                break;
        }
    }

    public /* synthetic */ C5463kE(Y3 y3, int i, int i2) {
        this.a = i2;
        this.b = y3;
        this.c = i;
    }

    public /* synthetic */ C5463kE(Y3 y3, C6721qp0 c6721qp0, int i) {
        this.a = 1;
        this.b = y3;
        this.c = i;
    }
}
