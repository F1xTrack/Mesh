package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class IG implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Z61 b;

    public /* synthetic */ IG(Z61 z61, int i) {
        this.a = i;
        this.b = z61;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            default:
                this.b.g.cancel(true);
                break;
        }
    }
}
