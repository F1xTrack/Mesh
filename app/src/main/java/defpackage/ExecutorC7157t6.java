package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: t6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC7157t6 implements Executor {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ ExecutorC7157t6(Executor executor, FA1 fa1, G10 g10, S81 s81) {
        this.a = 2;
        this.d = executor;
        this.b = fa1;
        this.e = g10;
        this.c = s81;
    }

    private final void a(Runnable runnable) {
        synchronized (this.d) {
            try {
                ((ArrayDeque) this.b).add(new XZ(this, 18, runnable));
                if (((Runnable) this.c) == null) {
                    c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this.d) {
            z = !((ArrayDeque) this.b).isEmpty();
        }
        return z;
    }

    public void c() {
        switch (this.a) {
            case 0:
                synchronized (this.d) {
                    try {
                        Runnable runnable = (Runnable) ((ArrayDeque) this.b).poll();
                        this.c = runnable;
                        if (runnable != null) {
                            ((TJ) this.e).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                Runnable runnable2 = (Runnable) ((ArrayDeque) this.b).poll();
                this.c = runnable2;
                if (runnable2 != null) {
                    ((ExecutorService) this.e).execute(runnable2);
                    return;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                synchronized (this.d) {
                    try {
                        ((ArrayDeque) this.b).add(new RunnableC6769r4(this, 3, runnable));
                        if (((Runnable) this.c) == null) {
                            c();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                a(runnable);
                return;
            default:
                try {
                    ((Executor) this.d).execute(runnable);
                    return;
                } catch (RuntimeException e) {
                    if (((FA1) this.b).a.j()) {
                        ((G10) this.e).y();
                    } else {
                        ((S81) this.c).a(e);
                    }
                    throw e;
                }
        }
    }

    public ExecutorC7157t6(ExecutorService executorService) {
        this.a = 1;
        this.e = executorService;
        this.b = new ArrayDeque();
        this.d = new Object();
    }

    public ExecutorC7157t6(TJ tj) {
        this.a = 0;
        this.d = new Object();
        this.b = new ArrayDeque();
        this.e = tj;
    }
}
