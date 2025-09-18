package p000;

import java.util.logging.Level;

/* renamed from: wf */
/* loaded from: classes2.dex */
public final class RunnableC7089wf implements Runnable {

    /* renamed from: a */
    public final C9108dO1 f45012a = new C9108dO1(20, false);

    /* renamed from: b */
    public final C6741rP f45013b;

    /* renamed from: c */
    public volatile boolean f45014c;

    public RunnableC7089wf(C6741rP c6741rP) {
        this.f45013b = c6741rP;
    }

    /* renamed from: a */
    public final void m25669a(Q51 q51, Object obj) {
        CA0 ca0M1000a = CA0.m1000a(q51, obj);
        synchronized (this) {
            try {
                this.f45012a.m17578v(ca0M1000a);
                if (!this.f45014c) {
                    this.f45014c = true;
                    this.f45013b.f41656j.execute(this);
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
                    CA0 ca0M17564D = this.f45012a.m17564D();
                    if (ca0M17564D == null) {
                        synchronized (this) {
                            ca0M17564D = this.f45012a.m17563C();
                            if (ca0M17564D == null) {
                                this.f45014c = false;
                                this.f45014c = false;
                                return;
                            }
                        }
                    }
                    this.f45013b.m24328c(ca0M17564D);
                } catch (InterruptedException e) {
                    this.f45013b.f41662p.mo7639A(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e);
                    this.f45014c = false;
                    return;
                }
            } catch (Throwable th) {
                this.f45014c = false;
                throw th;
            }
        }
    }
}
