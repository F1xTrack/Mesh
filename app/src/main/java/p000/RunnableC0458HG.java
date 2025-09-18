package p000;

/* renamed from: HG */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0458HG implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4200a;

    /* renamed from: b */
    public final /* synthetic */ C0300El f4201b;

    public /* synthetic */ RunnableC0458HG(int i, C0300El c0300El) {
        this.f4200a = i;
        this.f4201b = c0300El;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4200a) {
            case 0:
                this.f4201b.m2377d(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                break;
            default:
                this.f4201b.m2375b(null);
                break;
        }
    }
}
