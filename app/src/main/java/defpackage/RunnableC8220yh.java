package defpackage;

/* renamed from: yh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC8220yh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0431Fh b;

    public /* synthetic */ RunnableC8220yh(C0431Fh c0431Fh, int i) {
        this.a = i;
        this.b = c0431Fh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C1210Ph c1210Ph = this.b.b;
                if (c1210Ph.e == null) {
                    c1210Ph.e = new C0899Lh();
                }
                c1210Ph.e.b();
                break;
            default:
                this.b.b.w = false;
                break;
        }
    }
}
