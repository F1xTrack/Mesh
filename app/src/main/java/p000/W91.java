package p000;

import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class W91 implements QD0 {

    /* renamed from: a */
    public final /* synthetic */ int f13013a = 0;

    /* renamed from: b */
    public final QD0 f13014b;

    /* renamed from: c */
    public final Object f13015c;

    public W91(QD0 qd0, C4238iN c4238iN) {
        O90.m5968f(qd0, "inputProducer");
        O90.m5968f(c4238iN, "threadHandoffProducerQueue");
        this.f13014b = qd0;
        this.f13015c = c4238iN;
    }

    @Override // p000.QD0
    /* renamed from: a */
    public final void mo312a(AbstractC1237Tf abstractC1237Tf, RD0 rd0) {
        switch (this.f13013a) {
            case 0:
                O90.m5968f(abstractC1237Tf, "consumer");
                O90.m5968f(rd0, "context");
                AbstractC4250iZ.m19063b();
                C7027vg c7027vg = (C7027vg) rd0;
                c7027vg.f44484l.f16804t.getClass();
                C7386Bk0 c7386Bk0 = new C7386Bk0(abstractC1237Tf, c7027vg.f44475c, rd0, this);
                c7027vg.m25462a(new E40(c7386Bk0, 4, this));
                C4238iN c4238iN = (C4238iN) this.f13015c;
                synchronized (c4238iN) {
                    ((ExecutorService) c4238iN.f29113b).execute(c7386Bk0);
                }
                return;
            default:
                ((C8854bS0) this.f13014b).mo312a(new C1682aj(this, abstractC1237Tf, rd0), rd0);
                return;
        }
    }

    public W91(C8854bS0 c8854bS0, C8999ca1 c8999ca1) {
        this.f13014b = c8854bS0;
        this.f13015c = c8999ca1;
    }
}
