package defpackage;

/* renamed from: gm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4026gm0 implements InterfaceC5757lm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ C5948mm0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ C4026gm0(C5948mm0 c5948mm0, int i, int i2) {
        this.a = i2;
        this.b = c5948mm0;
        this.c = i;
    }

    @Override // defpackage.InterfaceC5757lm0
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(this.c);
                break;
            case 1:
                this.b.t(this.c);
                break;
            default:
                this.b.o(this.c);
                break;
        }
    }
}
