package defpackage;

import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class W91 implements QD0 {
    public final /* synthetic */ int a = 0;
    public final QD0 b;
    public final Object c;

    public W91(QD0 qd0, C4332iN c4332iN) {
        O90.f(qd0, "inputProducer");
        O90.f(c4332iN, "threadHandoffProducerQueue");
        this.b = qd0;
        this.c = c4332iN;
    }

    @Override // defpackage.QD0
    public final void a(AbstractC1516Tf abstractC1516Tf, RD0 rd0) {
        switch (this.a) {
            case 0:
                O90.f(abstractC1516Tf, "consumer");
                O90.f(rd0, "context");
                AbstractC4368iZ.b();
                C7647vg c7647vg = (C7647vg) rd0;
                c7647vg.l.t.getClass();
                C0129Bk0 c0129Bk0 = new C0129Bk0(abstractC1516Tf, c7647vg.c, rd0, this);
                c7647vg.a(new E40(c0129Bk0, 4, this));
                C4332iN c4332iN = (C4332iN) this.c;
                synchronized (c4332iN) {
                    ((ExecutorService) c4332iN.b).execute(c0129Bk0);
                }
                return;
            default:
                ((C2328bS0) this.b).a(new C2187aj(this, abstractC1516Tf, rd0), rd0);
                return;
        }
    }

    public W91(C2328bS0 c2328bS0, C2543ca1 c2543ca1) {
        this.b = c2328bS0;
        this.c = c2543ca1;
    }
}
