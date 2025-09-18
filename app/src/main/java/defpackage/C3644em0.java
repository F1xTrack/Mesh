package defpackage;

/* renamed from: em0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3644em0 implements InterfaceC5757lm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ C5948mm0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ C3644em0(C5948mm0 c5948mm0, String str, int i) {
        this.a = i;
        this.b = c5948mm0;
        this.c = str;
    }

    @Override // defpackage.InterfaceC5757lm0
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s(this.c);
                break;
            case 1:
                this.b.q(this.c);
                break;
            default:
                this.b.u(this.c);
                break;
        }
    }
}
