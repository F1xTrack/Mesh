package defpackage;

/* renamed from: hE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4114hE implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4305iE b;

    public /* synthetic */ RunnableC4114hE(C4305iE c4305iE, int i) {
        this.a = i;
        this.b = c4305iE;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.i();
                break;
            default:
                this.b.k();
                break;
        }
    }
}
