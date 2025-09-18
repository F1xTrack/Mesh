package defpackage;

/* renamed from: xh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC8030xh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ CharSequence c;
    public final /* synthetic */ C0431Fh d;

    public /* synthetic */ RunnableC8030xh(C0431Fh c0431Fh, int i, CharSequence charSequence, int i2) {
        this.a = i2;
        this.d = c0431Fh;
        this.b = i;
        this.c = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C1210Ph c1210Ph = this.d.b;
                if (c1210Ph.e == null) {
                    c1210Ph.e = new C0899Lh();
                }
                c1210Ph.e.a(this.b, this.c);
                break;
            default:
                this.d.w(this.b, this.c);
                break;
        }
    }
}
