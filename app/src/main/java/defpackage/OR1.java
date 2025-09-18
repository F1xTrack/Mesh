package defpackage;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class OR1 implements Runnable {
    public final /* synthetic */ int a;
    public /* synthetic */ AtomicReference b;
    public /* synthetic */ FR1 c;

    public /* synthetic */ OR1() {
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
                    atomicReference.set(Boolean.valueOf(c1263Py1.E1(strC1, IB1.V)));
                } finally {
                    this.b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        synchronized (this.b) {
            try {
                try {
                    AtomicReference atomicReference = this.b;
                    C3386dP1 c3386dP1 = (C3386dP1) this.c.b;
                    atomicReference.set(Long.valueOf(c3386dP1.g.A1(c3386dP1.j().C1(), IB1.X)));
                } finally {
                    this.b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.a) {
            case 0:
                FR1 fr1 = this.c;
                Bundle bundleU = fr1.t1().p.U();
                C2528cV1 c2528cV1J = RI1.j((C3386dP1) fr1.b);
                EY1 ey1N1 = c2528cV1J.N1(false);
                boolean zE1 = ((C3386dP1) c2528cV1J.b).g.E1(null, IB1.e1);
                AtomicReference atomicReference = this.b;
                if (!zE1) {
                    c2528cV1J.F1(new RunnableC5516kV1(c2528cV1J, atomicReference, ey1N1, bundleU));
                    return;
                }
                RunnableC5516kV1 runnableC5516kV1 = new RunnableC5516kV1();
                runnableC5516kV1.e = c2528cV1J;
                runnableC5516kV1.b = atomicReference;
                runnableC5516kV1.c = ey1N1;
                runnableC5516kV1.d = bundleU;
                c2528cV1J.F1(runnableC5516kV1);
                return;
            case 1:
                a();
                return;
            case 2:
                b();
                return;
            default:
                synchronized (this.b) {
                    try {
                        try {
                            AtomicReference atomicReference2 = this.b;
                            C3386dP1 c3386dP1 = (C3386dP1) this.c.b;
                            atomicReference2.set(Integer.valueOf(c3386dP1.g.z1(c3386dP1.j().C1(), IB1.Y)));
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

    public /* synthetic */ OR1(FR1 fr1, AtomicReference atomicReference, int i) {
        this.a = i;
        this.b = atomicReference;
        this.c = fr1;
    }
}
