package defpackage;

/* loaded from: classes.dex */
public final class ZW0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NB b;

    public /* synthetic */ ZW0(NB nb, int i) {
        this.a = i;
        this.b = nb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.v();
                break;
            default:
                BB bb = this.b.Q;
                if (bb instanceof ViewOnClickListenerC5823m61) {
                    bb.b(null);
                    break;
                }
                break;
        }
    }
}
