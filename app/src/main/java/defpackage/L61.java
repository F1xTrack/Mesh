package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class L61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ R61 b;

    public /* synthetic */ L61(R61 r61, int i) {
        this.a = i;
        this.b = r61;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                R61 r61 = this.b;
                r61.getClass();
                QR1.h().execute(new L61(r61, 1));
                break;
            default:
                R61 r612 = this.b;
                if (!r612.n) {
                    r612.e();
                    break;
                }
                break;
        }
    }
}
