package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: hS1 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4158hS1 implements Runnable {
    public final /* synthetic */ int a;
    public /* synthetic */ AtomicReference b;
    public /* synthetic */ FR1 c;

    public /* synthetic */ RunnableC4158hS1() {
        this.a = 0;
    }

    private final void a() {
        synchronized (this.b) {
            try {
                try {
                    AtomicReference atomicReference = this.b;
                    C3386dP1 c3386dP1 = (C3386dP1) this.c.b;
                    C1263Py1 c1263Py1 = c3386dP1.g;
                    String strC1 = c3386dP1.j().C1();
                    c1263Py1.getClass();
                    atomicReference.set(c1263Py1.C1(strC1, IB1.W));
                } finally {
                    this.b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C2528cV1 c2528cV1O = ((C3386dP1) this.c.b).o();
                VX1 vx1I0 = VX1.i0(4);
                c2528cV1O.v1();
                c2528cV1O.A1();
                EY1 ey1N1 = c2528cV1O.N1(false);
                RunnableC6720qp runnableC6720qp = new RunnableC6720qp(11);
                runnableC6720qp.b = c2528cV1O;
                runnableC6720qp.c = this.b;
                runnableC6720qp.d = ey1N1;
                runnableC6720qp.e = vx1I0;
                c2528cV1O.F1(runnableC6720qp);
                return;
            case 1:
                a();
                return;
            default:
                synchronized (this.b) {
                    try {
                        try {
                            AtomicReference atomicReference = this.b;
                            C3386dP1 c3386dP1 = (C3386dP1) this.c.b;
                            atomicReference.set(Double.valueOf(c3386dP1.g.w1(c3386dP1.j().C1(), IB1.Z)));
                        } finally {
                            this.b.notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public /* synthetic */ RunnableC4158hS1(FR1 fr1, AtomicReference atomicReference, int i) {
        this.a = i;
        this.b = atomicReference;
        this.c = fr1;
    }
}
