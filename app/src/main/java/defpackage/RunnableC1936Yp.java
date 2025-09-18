package defpackage;

/* renamed from: Yp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1936Yp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MU0 b;

    public /* synthetic */ RunnableC1936Yp(MU0 mu0, int i) {
        this.a = i;
        this.b = mu0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                MU0 mu0 = this.b;
                if (mu0 != null) {
                    mu0.b();
                    break;
                }
                break;
            case 2:
                MU0 mu02 = this.b;
                if (mu02 != null) {
                    mu02.b();
                    break;
                }
                break;
            default:
                this.b.b();
                break;
        }
    }
}
