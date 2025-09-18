package p000;

/* renamed from: yh */
/* loaded from: classes.dex */
public final class RunnableC7217yh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f46416a;

    /* renamed from: b */
    public final /* synthetic */ C0359Fh f46417b;

    public /* synthetic */ RunnableC7217yh(C0359Fh c0359Fh, int i) {
        this.f46416a = i;
        this.f46417b = c0359Fh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46416a) {
            case 0:
                C0988Ph c0988Ph = this.f46417b.f3389b;
                if (c0988Ph.f9228e == null) {
                    c0988Ph.f9228e = new C0736Lh();
                }
                c0988Ph.f9228e.mo2212b();
                break;
            default:
                this.f46417b.f3389b.f9246w = false;
                break;
        }
    }
}
