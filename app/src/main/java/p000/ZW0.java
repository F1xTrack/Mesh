package p000;

/* loaded from: classes.dex */
public final class ZW0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f14954a;

    /* renamed from: b */
    public final /* synthetic */ C0830NB f14955b;

    public /* synthetic */ ZW0(C0830NB c0830nb, int i) {
        this.f14954a = i;
        this.f14955b = c0830nb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14954a) {
            case 0:
                this.f14955b.m22064v();
                break;
            default:
                AbstractC0075BB abstractC0075BB = this.f14955b.f35192Q;
                if (abstractC0075BB instanceof ViewOnClickListenerC10224m61) {
                    abstractC0075BB.mo541b(null);
                    break;
                }
                break;
        }
    }
}
