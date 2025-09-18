package defpackage;

import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class UD implements QD0 {
    public final E00 a;
    public final ExecutorService b;
    public final ES1 c;
    public final C6446pN0 d;
    public final int e;
    public final boolean f;
    public final QD0 g;
    public final int h;
    public final C1016Mu0 i;

    public UD(E00 e00, ExecutorService executorService, ES1 es1, C6446pN0 c6446pN0, int i, boolean z, QD0 qd0, int i2, C1016Mu0 c1016Mu0) {
        O90.f(e00, "byteArrayPool");
        O90.f(executorService, "executor");
        O90.f(es1, "imageDecoder");
        O90.f(c6446pN0, "progressiveJpegConfig");
        NX.m(i, "downsampleMode");
        O90.f(qd0, "inputProducer");
        O90.f(c1016Mu0, "closeableReferenceFactory");
        this.a = e00;
        this.b = executorService;
        this.c = es1;
        this.d = c6446pN0;
        this.e = i;
        this.f = z;
        this.g = qd0;
        this.h = i2;
        this.i = c1016Mu0;
    }

    @Override // defpackage.QD0
    public final void a(AbstractC1516Tf abstractC1516Tf, RD0 rd0) {
        AbstractC1516Tf rd;
        O90.f(abstractC1516Tf, "consumer");
        O90.f(rd0, "context");
        AbstractC4368iZ.b();
        C6589q70 c6589q70 = ((C7647vg) rd0).a;
        if (AbstractC2374bh1.d(c6589q70.b) || C6779r70.b(c6589q70.b)) {
            rd = new RD(this, abstractC1516Tf, rd0, new C5273jE0(this.a), this.d, this.h);
        } else {
            rd = new QD(this, abstractC1516Tf, rd0, this.h);
        }
        this.g.a(rd, rd0);
    }
}
