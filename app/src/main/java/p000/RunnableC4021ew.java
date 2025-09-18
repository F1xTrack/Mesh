package p000;

/* renamed from: ew */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4021ew implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f26945a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC8217Rj1 f26946b;

    public /* synthetic */ RunnableC4021ew(C4084fw c4084fw, InterfaceC8217Rj1 interfaceC8217Rj1, int i) {
        this.f26945a = i;
        this.f26946b = interfaceC8217Rj1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26945a) {
            case 0:
                this.f26946b.getClass();
                break;
            case 1:
                this.f26946b.mo5476v();
                break;
            default:
                this.f26946b.mo5473e();
                break;
        }
    }

    public /* synthetic */ RunnableC4021ew(C4084fw c4084fw, InterfaceC8217Rj1 interfaceC8217Rj1, C8321Tj1 c8321Tj1) {
        this.f26945a = 0;
        this.f26946b = interfaceC8217Rj1;
    }
}
