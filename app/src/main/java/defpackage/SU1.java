package defpackage;

/* loaded from: classes.dex */
public final class SU1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ JU1 b;

    public /* synthetic */ SU1(JU1 ju1, int i) {
        this.a = i;
        this.b = ju1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                JU1 ju1 = this.b;
                ju1.f = ju1.k;
                break;
            default:
                this.b.k = null;
                break;
        }
    }
}
