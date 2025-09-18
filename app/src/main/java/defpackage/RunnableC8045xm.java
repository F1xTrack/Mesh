package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: xm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC8045xm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C1857Xo1 b;

    public /* synthetic */ RunnableC8045xm(C1857Xo1 c1857Xo1, int i) {
        this.a = i;
        this.b = c1857Xo1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C1857Xo1 c1857Xo1 = this.b;
                if (!((AtomicBoolean) c1857Xo1.c).getAndSet(true)) {
                    ((C0212Cm) ((C0999Mo1) c1857Xo1.d).b).c.execute(new RunnableC8045xm(c1857Xo1, 1));
                    break;
                }
                break;
            default:
                C1857Xo1 c1857Xo12 = this.b;
                if (((C0212Cm) ((C0999Mo1) c1857Xo12.d).b).L == 8) {
                    ((C0212Cm) ((C0999Mo1) c1857Xo12.d).b).u("Camera onError timeout, reopen it.");
                    ((C0212Cm) ((C0999Mo1) c1857Xo12.d).b).F(7);
                    ((C0212Cm) ((C0999Mo1) c1857Xo12.d).b).h.b();
                    break;
                } else {
                    C0212Cm c0212Cm = (C0212Cm) ((C0999Mo1) c1857Xo12.d).b;
                    c0212Cm.u("Camera skip reopen at state: ".concat(AbstractC8235ym.z(c0212Cm.L)));
                    break;
                }
        }
    }
}
