package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class M61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Q61 b;

    public /* synthetic */ M61(Q61 q61, int i) {
        this.a = i;
        this.b = q61;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                this.b.b();
                break;
            default:
                Q61 q61 = this.b;
                T61 t61 = q61.r;
                if (t61 != null) {
                    t61.m();
                }
                if (q61.q == null) {
                    q61.p.c();
                    break;
                }
                break;
        }
    }
}
