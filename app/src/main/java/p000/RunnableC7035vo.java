package p000;

/* renamed from: vo */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7035vo implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f44539a;

    /* renamed from: b */
    public final /* synthetic */ C7098wo f44540b;

    /* renamed from: c */
    public final /* synthetic */ String f44541c;

    public /* synthetic */ RunnableC7035vo(C7098wo c7098wo, String str, int i) {
        this.f44539a = i;
        this.f44540b = c7098wo;
        this.f44541c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44539a) {
            case 0:
                this.f44540b.f45109b.onCameraAvailable(this.f44541c);
                break;
            default:
                this.f44540b.f45109b.onCameraUnavailable(this.f44541c);
                break;
        }
    }
}
