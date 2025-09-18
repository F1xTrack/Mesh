package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: t6 */
/* loaded from: classes.dex */
public final class ExecutorC6865t6 implements Executor {

    /* renamed from: a */
    public final /* synthetic */ int f42831a;

    /* renamed from: b */
    public final Object f42832b;

    /* renamed from: c */
    public Object f42833c;

    /* renamed from: d */
    public final Object f42834d;

    /* renamed from: e */
    public final Object f42835e;

    public /* synthetic */ ExecutorC6865t6(Executor executor, FA1 fa1, G10 g10, S81 s81) {
        this.f42831a = 2;
        this.f42834d = executor;
        this.f42832b = fa1;
        this.f42835e = g10;
        this.f42833c = s81;
    }

    /* renamed from: a */
    private final void m24836a(Runnable runnable) {
        synchronized (this.f42834d) {
            try {
                ((ArrayDeque) this.f42832b).add(new RunnableC1483XZ(this, 18, runnable));
                if (((Runnable) this.f42833c) == null) {
                    m24838c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public boolean m24837b() {
        boolean z;
        synchronized (this.f42834d) {
            z = !((ArrayDeque) this.f42832b).isEmpty();
        }
        return z;
    }

    /* renamed from: c */
    public void m24838c() {
        switch (this.f42831a) {
            case 0:
                synchronized (this.f42834d) {
                    try {
                        Runnable runnable = (Runnable) ((ArrayDeque) this.f42832b).poll();
                        this.f42833c = runnable;
                        if (runnable != null) {
                            ((ExecutorC1215TJ) this.f42835e).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                Runnable runnable2 = (Runnable) ((ArrayDeque) this.f42832b).poll();
                this.f42833c = runnable2;
                if (runnable2 != null) {
                    ((ExecutorService) this.f42835e).execute(runnable2);
                    return;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f42831a) {
            case 0:
                synchronized (this.f42834d) {
                    try {
                        ((ArrayDeque) this.f42832b).add(new RunnableC6720r4(this, 3, runnable));
                        if (((Runnable) this.f42833c) == null) {
                            m24838c();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                m24836a(runnable);
                return;
            default:
                try {
                    ((Executor) this.f42834d).execute(runnable);
                    return;
                } catch (RuntimeException e) {
                    if (((FA1) this.f42832b).f3084a.mo11143j()) {
                        ((G10) this.f42835e).m2909y();
                    } else {
                        ((S81) this.f42833c).m7183a(e);
                    }
                    throw e;
                }
        }
    }

    public ExecutorC6865t6(ExecutorService executorService) {
        this.f42831a = 1;
        this.f42835e = executorService;
        this.f42832b = new ArrayDeque();
        this.f42834d = new Object();
    }

    public ExecutorC6865t6(ExecutorC1215TJ executorC1215TJ) {
        this.f42831a = 0;
        this.f42834d = new Object();
        this.f42832b = new ArrayDeque();
        this.f42835e = executorC1215TJ;
    }
}
