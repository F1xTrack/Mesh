package p000;

/* loaded from: classes.dex */
public final /* synthetic */ class XN0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f13682a;

    /* renamed from: b */
    public final /* synthetic */ C9491gO0 f13683b;

    /* renamed from: c */
    public final /* synthetic */ C6693qe f13684c;

    public /* synthetic */ XN0(C9491gO0 c9491gO0, C6693qe c6693qe, int i) {
        this.f13682a = i;
        this.f13683b = c9491gO0;
        this.f13684c = c6693qe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13682a) {
            case 0:
                this.f13683b.m18504s(this.f13684c);
                break;
            default:
                C9491gO0 c9491gO0 = this.f13683b;
                if (c9491gO0.f27770q == this.f13684c && !c9491gO0.f27771r) {
                    if (c9491gO0.m18500m()) {
                        c9491gO0.f27726H.m24727k();
                    }
                    C6820sO c6820sO = c9491gO0.f27724F;
                    if (c6820sO == null) {
                        c9491gO0.f27752d0 = true;
                        break;
                    } else {
                        c6820sO.m24727k();
                        C6693qe c6693qe = c9491gO0.f27770q;
                        c6693qe.m24036g(new C7853Kj1(c6693qe.f41084h, c9491gO0.m18499j()));
                        break;
                    }
                }
                break;
        }
    }
}
