package defpackage;

/* renamed from: lG1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5662lG1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ TJ1 c;

    public /* synthetic */ RunnableC5662lG1(TJ1 tj1, long j, int i) {
        this.a = i;
        this.b = j;
        this.c = tj1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((C0948Lx1) this.c).D1(this.b);
                break;
            default:
                JU1 ju1 = (JU1) this.c;
                C0948Lx1 c0948Lx1 = ((C3386dP1) ju1.b).q;
                C3386dP1.d(c0948Lx1);
                c0948Lx1.z1(this.b);
                ju1.f = null;
                break;
        }
    }
}
