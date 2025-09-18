package p000;

/* renamed from: v81, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC11380v81 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f44209a;

    /* renamed from: b */
    public final /* synthetic */ C11507w81 f44210b;

    public /* synthetic */ RunnableC11380v81(C11507w81 c11507w81, int i) {
        this.f44209a = i;
        this.f44210b = c11507w81;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44209a) {
            case 0:
                this.f44210b.m25567c();
                break;
            default:
                C11507w81 c11507w81 = this.f44210b;
                c11507w81.f44695d = null;
                c11507w81.m25567c();
                break;
        }
    }
}
