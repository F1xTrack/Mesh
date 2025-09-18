package defpackage;

/* renamed from: zH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8332zH extends AbstractC1516Tf {
    public final AbstractC1516Tf b;

    public AbstractC8332zH(AbstractC1516Tf abstractC1516Tf) {
        O90.f(abstractC1516Tf, "consumer");
        this.b = abstractC1516Tf;
    }

    @Override // defpackage.AbstractC1516Tf
    public void d() {
        this.b.c();
    }

    @Override // defpackage.AbstractC1516Tf
    public void f(Throwable th) {
        O90.f(th, "t");
        this.b.e(th);
    }

    @Override // defpackage.AbstractC1516Tf
    public void j(float f) {
        this.b.i(f);
    }
}
