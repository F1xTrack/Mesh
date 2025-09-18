package defpackage;

/* renamed from: oE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6227oE implements InterfaceC1373Rj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Y3 b;
    public final /* synthetic */ String c;

    public /* synthetic */ C6227oE(Y3 y3, String str, int i) {
        this.a = i;
        this.b = y3;
        this.c = str;
    }

    @Override // defpackage.InterfaceC1373Rj0
    public final void invoke(Object obj) {
        Z3 z3 = (Z3) obj;
        switch (this.a) {
            case 0:
                Y3 y3 = this.b;
                z3.getClass();
                z3.g(y3, this.c);
                break;
            case 1:
                z3.y(this.b, this.c);
                break;
            case 2:
                Y3 y32 = this.b;
                z3.getClass();
                z3.L(y32, this.c);
                break;
            default:
                z3.d(this.b, this.c);
                break;
        }
    }

    public /* synthetic */ C6227oE(Y3 y3, String str, long j, long j2, int i) {
        this.a = i;
        this.b = y3;
        this.c = str;
    }
}
