package p000;

/* renamed from: Yp */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1562Yp implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f14549a;

    /* renamed from: b */
    public final /* synthetic */ MU0 f14550b;

    public /* synthetic */ RunnableC1562Yp(MU0 mu0, int i) {
        this.f14549a = i;
        this.f14550b = mu0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14549a) {
            case 0:
                this.f14550b.m5386b();
                break;
            case 1:
                MU0 mu0 = this.f14550b;
                if (mu0 != null) {
                    mu0.m5386b();
                    break;
                }
                break;
            case 2:
                MU0 mu02 = this.f14550b;
                if (mu02 != null) {
                    mu02.m5386b();
                    break;
                }
                break;
            default:
                this.f14550b.m5386b();
                break;
        }
    }
}
