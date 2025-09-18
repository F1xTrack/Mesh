package defpackage;

/* loaded from: classes.dex */
public final class J81 implements InterfaceC1573Ty {
    public final /* synthetic */ RunnableC1492Sx a;

    public J81(RunnableC1492Sx runnableC1492Sx) {
        this.a = runnableC1492Sx;
    }

    @Override // defpackage.InterfaceC1573Ty
    public final Object a(N81 n81) {
        boolean z;
        synchronized (n81.a) {
            z = n81.c;
        }
        RunnableC1492Sx runnableC1492Sx = this.a;
        if (z) {
            ((C6845rT0) runnableC1492Sx.d).e();
            return null;
        }
        if (n81.g()) {
            ((C6845rT0) runnableC1492Sx.d).g(n81.d());
            return null;
        }
        ((C6845rT0) runnableC1492Sx.d).i(n81.e());
        return null;
    }
}
