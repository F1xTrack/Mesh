package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: xm */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7159xm implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f45768a;

    /* renamed from: b */
    public final /* synthetic */ C8539Xo1 f45769b;

    public /* synthetic */ RunnableC7159xm(C8539Xo1 c8539Xo1, int i) {
        this.f45768a = i;
        this.f45769b = c8539Xo1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f45768a) {
            case 0:
                C8539Xo1 c8539Xo1 = this.f45769b;
                if (!((AtomicBoolean) c8539Xo1.f13982c).getAndSet(true)) {
                    ((C0175Cm) ((C7967Mo1) c8539Xo1.f13983d).f7363b).f1624c.execute(new RunnableC7159xm(c8539Xo1, 1));
                    break;
                }
                break;
            default:
                C8539Xo1 c8539Xo12 = this.f45769b;
                if (((C0175Cm) ((C7967Mo1) c8539Xo12.f13983d).f7363b).f1621L == 8) {
                    ((C0175Cm) ((C7967Mo1) c8539Xo12.f13983d).f7363b).m1347u("Camera onError timeout, reopen it.");
                    ((C0175Cm) ((C7967Mo1) c8539Xo12.f13983d).f7363b).m1319F(7);
                    ((C0175Cm) ((C7967Mo1) c8539Xo12.f13983d).f7363b).f1629h.m856b();
                    break;
                } else {
                    C0175Cm c0175Cm = (C0175Cm) ((C7967Mo1) c8539Xo12.f13983d).f7363b;
                    c0175Cm.m1347u("Camera skip reopen at state: ".concat(AbstractC7222ym.m26249z(c0175Cm.f1621L)));
                    break;
                }
        }
    }
}
