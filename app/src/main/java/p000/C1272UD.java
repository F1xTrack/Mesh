package p000;

import java.util.concurrent.ExecutorService;

/* renamed from: UD */
/* loaded from: classes.dex */
public final class C1272UD implements QD0 {

    /* renamed from: a */
    public final E00 f11685a;

    /* renamed from: b */
    public final ExecutorService f11686b;

    /* renamed from: c */
    public final ES1 f11687c;

    /* renamed from: d */
    public final C10641pN0 f11688d;

    /* renamed from: e */
    public final int f11689e;

    /* renamed from: f */
    public final boolean f11690f;

    /* renamed from: g */
    public final QD0 f11691g;

    /* renamed from: h */
    public final int f11692h;

    /* renamed from: i */
    public final C7978Mu0 f11693i;

    public C1272UD(E00 e00, ExecutorService executorService, ES1 es1, C10641pN0 c10641pN0, int i, boolean z, QD0 qd0, int i2, C7978Mu0 c7978Mu0) {
        O90.m5968f(e00, "byteArrayPool");
        O90.m5968f(executorService, "executor");
        O90.m5968f(es1, "imageDecoder");
        O90.m5968f(c10641pN0, "progressiveJpegConfig");
        AbstractC0852NX.m5764m(i, "downsampleMode");
        O90.m5968f(qd0, "inputProducer");
        O90.m5968f(c7978Mu0, "closeableReferenceFactory");
        this.f11685a = e00;
        this.f11686b = executorService;
        this.f11687c = es1;
        this.f11688d = c10641pN0;
        this.f11689e = i;
        this.f11690f = z;
        this.f11691g = qd0;
        this.f11692h = i2;
        this.f11693i = c7978Mu0;
    }

    @Override // p000.QD0
    /* renamed from: a */
    public final void mo312a(AbstractC1237Tf abstractC1237Tf, RD0 rd0) {
        AbstractC1237Tf c1083rd;
        O90.m5968f(abstractC1237Tf, "consumer");
        O90.m5968f(rd0, "context");
        AbstractC4250iZ.m19063b();
        C10737q70 c10737q70 = ((C7027vg) rd0).f44473a;
        if (AbstractC8885bh1.m10483d(c10737q70.f40609b) || C10865r70.m24159b(c10737q70.f40609b)) {
            c1083rd = new C1083RD(this, abstractC1237Tf, rd0, new C9855jE0(this.f11685a), this.f11688d, this.f11692h);
        } else {
            c1083rd = new C1021QD(this, abstractC1237Tf, rd0, this.f11692h);
        }
        this.f11691g.mo312a(c1083rd, rd0);
    }
}
