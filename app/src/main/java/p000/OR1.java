package p000;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class OR1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8446a;

    /* renamed from: b */
    public /* synthetic */ AtomicReference f8447b;

    /* renamed from: c */
    public /* synthetic */ FR1 f8448c;

    public /* synthetic */ OR1() {
        this.f8446a = 0;
    }

    /* renamed from: a */
    private final void m6072a() {
        synchronized (this.f8447b) {
            try {
                try {
                    AtomicReference atomicReference = this.f8447b;
                    C9110dP1 c9110dP1 = (C9110dP1) this.f8448c.f11615b;
                    C8143Py1 c8143Py1 = c9110dP1.f26037g;
                    String strM22025C1 = c9110dP1.m17597j().m22025C1();
                    c8143Py1.getClass();
                    atomicReference.set(Boolean.valueOf(c8143Py1.m6511E1(strM22025C1, IB1.f4770V)));
                } finally {
                    this.f8447b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    private final void m6073b() {
        synchronized (this.f8447b) {
            try {
                try {
                    AtomicReference atomicReference = this.f8447b;
                    C9110dP1 c9110dP1 = (C9110dP1) this.f8448c.f11615b;
                    atomicReference.set(Long.valueOf(c9110dP1.f26037g.m6507A1(c9110dP1.m17597j().m22025C1(), IB1.f4774X)));
                } finally {
                    this.f8447b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.f8446a) {
            case 0:
                FR1 fr1 = this.f8448c;
                Bundle bundleM7569U = fr1.m7851t1().f11755p.m7569U();
                C8989cV1 c8989cV1M6946j = RI1.m6946j((C9110dP1) fr1.f11615b);
                EY1 ey1M10752N1 = c8989cV1M6946j.m10752N1(false);
                boolean zM6511E1 = ((C9110dP1) c8989cV1M6946j.f11615b).f26037g.m6511E1(null, IB1.f4794e1);
                AtomicReference atomicReference = this.f8447b;
                if (!zM6511E1) {
                    c8989cV1M6946j.m10744F1(new RunnableC10018kV1(c8989cV1M6946j, atomicReference, ey1M10752N1, bundleM7569U));
                    return;
                }
                RunnableC10018kV1 runnableC10018kV1 = new RunnableC10018kV1();
                runnableC10018kV1.f36516e = c8989cV1M6946j;
                runnableC10018kV1.f36513b = atomicReference;
                runnableC10018kV1.f36514c = ey1M10752N1;
                runnableC10018kV1.f36515d = bundleM7569U;
                c8989cV1M6946j.m10744F1(runnableC10018kV1);
                return;
            case 1:
                m6072a();
                return;
            case 2:
                m6073b();
                return;
            default:
                synchronized (this.f8447b) {
                    try {
                        try {
                            AtomicReference atomicReference2 = this.f8447b;
                            C9110dP1 c9110dP1 = (C9110dP1) this.f8448c.f11615b;
                            atomicReference2.set(Integer.valueOf(c9110dP1.f26037g.m6518z1(c9110dP1.m17597j().m22025C1(), IB1.f4776Y)));
                        } finally {
                            this.f8447b.notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public /* synthetic */ OR1(FR1 fr1, AtomicReference atomicReference, int i) {
        this.f8446a = i;
        this.f8447b = atomicReference;
        this.f8448c = fr1;
    }
}
