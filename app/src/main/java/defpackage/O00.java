package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class O00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ R00 b;

    public /* synthetic */ O00(int i, R00 r00) {
        this.a = i;
        this.b = r00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                R00 r00 = this.b;
                O90.f(r00, "$this_applySelf");
                r00.e();
                break;
            default:
                R00 r002 = this.b;
                O90.f(r002, "$handler");
                r002.e();
                break;
        }
    }
}
