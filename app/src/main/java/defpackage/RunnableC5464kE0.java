package defpackage;

/* renamed from: kE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5464kE0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C6419pE0 b;

    public /* synthetic */ RunnableC5464kE0(C6419pE0 c6419pE0, int i) {
        this.a = i;
        this.b = c6419pE0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.G = true;
                break;
            case 1:
                this.b.y();
                break;
            default:
                C6419pE0 c6419pE0 = this.b;
                if (!c6419pE0.M) {
                    InterfaceC8245yp0 interfaceC8245yp0 = c6419pE0.q;
                    interfaceC8245yp0.getClass();
                    interfaceC8245yp0.m(c6419pE0);
                    break;
                }
                break;
        }
    }
}
