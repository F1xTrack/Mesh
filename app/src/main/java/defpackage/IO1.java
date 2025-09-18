package defpackage;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.AbstractQueue;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class IO1 extends Thread {
    public final Object a;
    public final AbstractQueue b;
    public boolean c = false;
    public final /* synthetic */ C7595vO1 d;

    /* JADX WARN: Multi-variable type inference failed */
    public IO1(C7595vO1 c7595vO1, String str, BlockingQueue blockingQueue) {
        this.d = c7595vO1;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.a = new Object();
        this.b = (AbstractQueue) blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.a) {
            this.a.notifyAll();
        }
    }

    public final void b(InterruptedException interruptedException) {
        OL1 ol1N = this.d.n();
        ol1N.j.c(interruptedException, AbstractC8235ym.i(getName(), " was interrupted"));
    }

    public final void c() {
        synchronized (this.d.j) {
            try {
                if (!this.c) {
                    this.d.k.release();
                    this.d.j.notifyAll();
                    C7595vO1 c7595vO1 = this.d;
                    if (this == c7595vO1.d) {
                        c7595vO1.d = null;
                    } else if (this == c7595vO1.e) {
                        c7595vO1.e = null;
                    } else {
                        c7595vO1.n().g.d("Current scheduler thread is neither worker nor network");
                    }
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        boolean z = false;
        while (!z) {
            try {
                this.d.k.acquire();
                z = true;
            } catch (InterruptedException e) {
                b(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                VO1 vo1 = (VO1) this.b.poll();
                if (vo1 != null) {
                    Process.setThreadPriority(vo1.b ? threadPriority : 10);
                    vo1.run();
                } else {
                    synchronized (this.a) {
                        if (this.b.peek() == null) {
                            this.d.getClass();
                            try {
                                this.a.wait(30000L);
                            } catch (InterruptedException e2) {
                                b(e2);
                            }
                        }
                    }
                    synchronized (this.d.j) {
                        if (this.b.peek() == null) {
                            c();
                            c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }
}
