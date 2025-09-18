package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: hS1 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC9628hS1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f28423a;

    /* renamed from: b */
    public /* synthetic */ AtomicReference f28424b;

    /* renamed from: c */
    public /* synthetic */ FR1 f28425c;

    public /* synthetic */ RunnableC9628hS1() {
        this.f28423a = 0;
    }

    /* renamed from: a */
    private final void m18817a() {
        synchronized (this.f28424b) {
            try {
                try {
                    AtomicReference atomicReference = this.f28424b;
                    C9110dP1 c9110dP1 = (C9110dP1) this.f28425c.f11615b;
                    C8143Py1 c8143Py1 = c9110dP1.f26037g;
                    String strM22025C1 = c9110dP1.m17597j().m22025C1();
                    c8143Py1.getClass();
                    atomicReference.set(c8143Py1.m6509C1(strM22025C1, IB1.f4772W));
                } finally {
                    this.f28424b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28423a) {
            case 0:
                C8989cV1 c8989cV1M17601o = ((C9110dP1) this.f28425c.f11615b).m17601o();
                VX1 vx1M8460i0 = VX1.m8460i0(4);
                c8989cV1M17601o.mo7681v1();
                c8989cV1M17601o.m18793A1();
                EY1 ey1M10752N1 = c8989cV1M17601o.m10752N1(false);
                RunnableC6704qp runnableC6704qp = new RunnableC6704qp(11);
                runnableC6704qp.f41181b = c8989cV1M17601o;
                runnableC6704qp.f41182c = this.f28424b;
                runnableC6704qp.f41183d = ey1M10752N1;
                runnableC6704qp.f41184e = vx1M8460i0;
                c8989cV1M17601o.m10744F1(runnableC6704qp);
                return;
            case 1:
                m18817a();
                return;
            default:
                synchronized (this.f28424b) {
                    try {
                        try {
                            AtomicReference atomicReference = this.f28424b;
                            C9110dP1 c9110dP1 = (C9110dP1) this.f28425c.f11615b;
                            atomicReference.set(Double.valueOf(c9110dP1.f26037g.m6515w1(c9110dP1.m17597j().m22025C1(), IB1.f4778Z)));
                        } finally {
                            this.f28424b.notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public /* synthetic */ RunnableC9628hS1(FR1 fr1, AtomicReference atomicReference, int i) {
        this.f28423a = i;
        this.f28424b = atomicReference;
        this.f28425c = fr1;
    }
}
