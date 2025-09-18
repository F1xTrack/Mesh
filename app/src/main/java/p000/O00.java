package p000;

/* loaded from: classes2.dex */
public final /* synthetic */ class O00 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8163a;

    /* renamed from: b */
    public final /* synthetic */ R00 f8164b;

    public /* synthetic */ O00(int i, R00 r00) {
        this.f8163a = i;
        this.f8164b = r00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8163a) {
            case 0:
                R00 r00 = this.f8164b;
                O90.m5968f(r00, "$this_applySelf");
                r00.m6857e();
                break;
            default:
                R00 r002 = this.f8164b;
                O90.m5968f(r002, "$handler");
                r002.m6857e();
                break;
        }
    }
}
