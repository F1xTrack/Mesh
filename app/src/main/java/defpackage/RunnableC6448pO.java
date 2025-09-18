package defpackage;

/* renamed from: pO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6448pO implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ InterfaceC3571eO b;

    public /* synthetic */ RunnableC6448pO(InterfaceC3571eO interfaceC3571eO, int i) {
        this.a = i;
        this.b = interfaceC3571eO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            default:
                this.b.j();
                break;
        }
    }
}
