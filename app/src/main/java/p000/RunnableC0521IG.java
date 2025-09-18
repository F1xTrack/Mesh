package p000;

/* renamed from: IG */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0521IG implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4873a;

    /* renamed from: b */
    public final /* synthetic */ Z61 f4874b;

    public /* synthetic */ RunnableC0521IG(Z61 z61, int i) {
        this.f4873a = i;
        this.f4874b = z61;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4873a) {
            case 0:
                this.f4874b.m9493d();
                break;
            default:
                this.f4874b.f14743g.cancel(true);
                break;
        }
    }
}
