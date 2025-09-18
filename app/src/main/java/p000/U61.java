package p000;

/* loaded from: classes.dex */
public final /* synthetic */ class U61 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f11655a;

    /* renamed from: b */
    public final /* synthetic */ Y61 f11656b;

    /* renamed from: c */
    public final /* synthetic */ C0922Oe f11657c;

    public /* synthetic */ U61(Y61 y61, C0922Oe c0922Oe, int i) {
        this.f11655a = i;
        this.f11656b = y61;
        this.f11657c = c0922Oe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11655a) {
            case 0:
                this.f11656b.mo3134b(this.f11657c);
                break;
            default:
                this.f11656b.mo3134b(this.f11657c);
                break;
        }
    }
}
