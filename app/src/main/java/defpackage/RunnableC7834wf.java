package defpackage;

import java.util.logging.Level;

/* renamed from: wf */
/* loaded from: classes2.dex */
public final class RunnableC7834wf implements Runnable {
    public final C3383dO1 a = new C3383dO1(20, false);
    public final C6832rP b;
    public volatile boolean c;

    public RunnableC7834wf(C6832rP c6832rP) {
        this.b = c6832rP;
    }

    public final void a(Q51 q51, Object obj) {
        CA0 ca0A = CA0.a(q51, obj);
        synchronized (this) {
            try {
                this.a.v(ca0A);
                if (!this.c) {
                    this.c = true;
                    this.b.j.execute(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                try {
                    CA0 ca0D = this.a.D();
                    if (ca0D == null) {
                        synchronized (this) {
                            ca0D = this.a.C();
                            if (ca0D == null) {
                                this.c = false;
                                this.c = false;
                                return;
                            }
                        }
                    }
                    this.b.c(ca0D);
                } catch (InterruptedException e) {
                    this.b.p.A(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e);
                    this.c = false;
                    return;
                }
            } catch (Throwable th) {
                this.c = false;
                throw th;
            }
        }
    }
}
