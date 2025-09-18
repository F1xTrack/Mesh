package defpackage;

/* renamed from: xt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8066xt extends I {
    public final C8387zZ0 h;
    public final E90 i;
    public final /* synthetic */ int j;

    public C8066xt(QD0 qd0, C8387zZ0 c8387zZ0, E90 e90, int i) {
        this.j = i;
        O90.f(qd0, "producer");
        this.h = c8387zZ0;
        this.i = e90;
        AbstractC4368iZ.b();
        this.a = c8387zZ0.f;
        AbstractC4368iZ.b();
        e90.b(c8387zZ0);
        AbstractC4368iZ.b();
        qd0.a(new R0(0, this), c8387zZ0);
    }

    @Override // defpackage.I
    public void b(Object obj) {
        switch (this.j) {
            case 0:
                AbstractC8446zt.p((AbstractC8446zt) obj);
                break;
        }
    }

    @Override // defpackage.I, defpackage.YC
    public final boolean close() {
        if (!super.close()) {
            return false;
        }
        if (g()) {
            return true;
        }
        E90 e90 = this.i;
        C8387zZ0 c8387zZ0 = this.h;
        e90.h(c8387zZ0);
        c8387zZ0.e();
        return true;
    }

    @Override // defpackage.I, defpackage.YC
    public Object getResult() {
        switch (this.j) {
            case 0:
                return AbstractC8446zt.o((AbstractC8446zt) super.getResult());
            default:
                return super.getResult();
        }
    }

    public final void n(Object obj, int i, C8387zZ0 c8387zZ0) {
        O90.f(c8387zZ0, "producerContext");
        boolean zA = AbstractC1516Tf.a(i);
        if (k(obj, zA, c8387zZ0.f) && zA) {
            this.i.g(this.h);
        }
    }
}
