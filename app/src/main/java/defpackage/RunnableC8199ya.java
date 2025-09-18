package defpackage;

/* renamed from: ya */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC8199ya implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC8199ya(Object obj, int i, long j, long j2, int i2) {
        this.a = i2;
        this.e = obj;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.e;
        switch (this.a) {
            case 0:
                CC0 cc0 = (CC0) obj;
                cc0.getClass();
                int i = AbstractC0277Dh1.a;
                C8323zE c8323zE = ((UQ) cc0.c).a.r;
                final Y3 y3P = c8323zE.P();
                final int i2 = this.b;
                final long j = this.c;
                final long j2 = this.d;
                c8323zE.Q(y3P, 1011, new InterfaceC1373Rj0() { // from class: xE
                    @Override // defpackage.InterfaceC1373Rj0
                    public final void invoke(Object obj2) {
                        ((Z3) obj2).G(y3P, i2, j, j2);
                    }
                });
                break;
            default:
                ((C0035Af) obj).b.k(this.b, this.c, this.d);
                break;
        }
    }
}
