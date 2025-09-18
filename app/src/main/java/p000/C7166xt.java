package p000;

/* renamed from: xt */
/* loaded from: classes.dex */
public final class C7166xt extends AbstractC0504I {

    /* renamed from: h */
    public final C11941zZ0 f45871h;

    /* renamed from: i */
    public final E90 f45872i;

    /* renamed from: j */
    public final /* synthetic */ int f45873j;

    public C7166xt(QD0 qd0, C11941zZ0 c11941zZ0, E90 e90, int i) {
        this.f45873j = i;
        O90.m5968f(qd0, "producer");
        this.f45871h = c11941zZ0;
        this.f45872i = e90;
        AbstractC4250iZ.m19063b();
        this.f4626a = c11941zZ0.f44478f;
        AbstractC4250iZ.m19063b();
        e90.mo744b(c11941zZ0);
        AbstractC4250iZ.m19063b();
        qd0.mo312a(new C1070R0(0, this), c11941zZ0);
    }

    @Override // p000.AbstractC0504I
    /* renamed from: b */
    public void mo3663b(Object obj) {
        switch (this.f45873j) {
            case 0:
                AbstractC7292zt.m26569p((AbstractC7292zt) obj);
                break;
        }
    }

    @Override // p000.AbstractC0504I, p000.InterfaceC1523YC
    public final boolean close() {
        if (!super.close()) {
            return false;
        }
        if (m3668g()) {
            return true;
        }
        E90 e90 = this.f45872i;
        C11941zZ0 c11941zZ0 = this.f45871h;
        e90.mo750h(c11941zZ0);
        c11941zZ0.m25463e();
        return true;
    }

    @Override // p000.AbstractC0504I, p000.InterfaceC1523YC
    public Object getResult() {
        switch (this.f45873j) {
            case 0:
                return AbstractC7292zt.m26568o((AbstractC7292zt) super.getResult());
            default:
                return super.getResult();
        }
    }

    /* renamed from: n */
    public final void m25953n(Object obj, int i, C11941zZ0 c11941zZ0) {
        O90.m5968f(c11941zZ0, "producerContext");
        boolean zM7714a = AbstractC1237Tf.m7714a(i);
        if (m3672k(obj, zM7714a, c11941zZ0.f44478f) && zM7714a) {
            this.f45872i.mo749g(this.f45871h);
        }
    }
}
