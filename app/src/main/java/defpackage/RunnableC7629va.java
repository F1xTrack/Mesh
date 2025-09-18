package defpackage;

/* renamed from: va, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7629va implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CC0 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ RunnableC7629va(CC0 cc0, Exception exc, int i) {
        this.a = i;
        this.b = cc0;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc = this.c;
        CC0 cc0 = this.b;
        int i = this.a;
        cc0.getClass();
        switch (i) {
            case 0:
                int i2 = AbstractC0277Dh1.a;
                C8323zE c8323zE = ((UQ) cc0.c).a.r;
                Y3 y3P = c8323zE.P();
                c8323zE.Q(y3P, 1029, new C6799rE(y3P, exc, 2));
                break;
            default:
                int i3 = AbstractC0277Dh1.a;
                C8323zE c8323zE2 = ((UQ) cc0.c).a.r;
                Y3 y3P2 = c8323zE2.P();
                c8323zE2.Q(y3P2, 1014, new C6799rE(y3P2, exc, 3));
                break;
        }
    }
}
