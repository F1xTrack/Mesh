package p000;

/* loaded from: classes.dex */
public final /* synthetic */ class L61 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6493a;

    /* renamed from: b */
    public final /* synthetic */ R61 f6494b;

    public /* synthetic */ L61(R61 r61, int i) {
        this.f6493a = i;
        this.f6494b = r61;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6493a) {
            case 0:
                R61 r61 = this.f6494b;
                r61.getClass();
                QR1.m6710h().execute(new L61(r61, 1));
                break;
            default:
                R61 r612 = this.f6494b;
                if (!r612.f10015n) {
                    r612.m6900e();
                    break;
                }
                break;
        }
    }
}
