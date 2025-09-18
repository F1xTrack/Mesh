package defpackage;

/* renamed from: ew, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3673ew implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ InterfaceC1374Rj1 b;

    public /* synthetic */ RunnableC3673ew(C3864fw c3864fw, InterfaceC1374Rj1 interfaceC1374Rj1, int i) {
        this.a = i;
        this.b = interfaceC1374Rj1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                this.b.v();
                break;
            default:
                this.b.e();
                break;
        }
    }

    public /* synthetic */ RunnableC3673ew(C3864fw c3864fw, InterfaceC1374Rj1 interfaceC1374Rj1, C1530Tj1 c1530Tj1) {
        this.a = 0;
        this.b = interfaceC1374Rj1;
    }
}
