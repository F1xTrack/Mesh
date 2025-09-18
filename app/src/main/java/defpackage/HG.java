package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class HG implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0365El b;

    public /* synthetic */ HG(int i, C0365El c0365El) {
        this.a = i;
        this.b = c0365El;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                break;
            default:
                this.b.b(null);
                break;
        }
    }
}
