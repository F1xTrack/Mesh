package p000;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.AbstractQueue;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class IO1 extends Thread {

    /* renamed from: a */
    public final Object f4921a;

    /* renamed from: b */
    public final AbstractQueue f4922b;

    /* renamed from: c */
    public boolean f4923c = false;

    /* renamed from: d */
    public final /* synthetic */ C11412vO1 f4924d;

    /* JADX WARN: Multi-variable type inference failed */
    public IO1(C11412vO1 c11412vO1, String str, BlockingQueue blockingQueue) {
        this.f4924d = c11412vO1;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.f4921a = new Object();
        this.f4922b = (AbstractQueue) blockingQueue;
        setName(str);
    }

    /* renamed from: a */
    public final void m3842a() {
        synchronized (this.f4921a) {
            this.f4921a.notifyAll();
        }
    }

    /* renamed from: b */
    public final void m3843b(InterruptedException interruptedException) {
        OL1 ol1Mo6070n = this.f4924d.mo6070n();
        ol1Mo6070n.f8381j.m24554c(interruptedException, AbstractC7222ym.m26232i(getName(), " was interrupted"));
    }

    /* renamed from: c */
    public final void m3844c() {
        synchronized (this.f4924d.f44360j) {
            try {
                if (!this.f4923c) {
                    this.f4924d.f44361k.release();
                    this.f4924d.f44360j.notifyAll();
                    C11412vO1 c11412vO1 = this.f4924d;
                    if (this == c11412vO1.f44354d) {
                        c11412vO1.f44354d = null;
                    } else if (this == c11412vO1.f44355e) {
                        c11412vO1.f44355e = null;
                    } else {
                        c11412vO1.mo6070n().f8378g.m24555d("Current scheduler thread is neither worker nor network");
                    }
                    this.f4923c = true;
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
                this.f4924d.f44361k.acquire();
                z = true;
            } catch (InterruptedException e) {
                m3843b(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                VO1 vo1 = (VO1) this.f4922b.poll();
                if (vo1 != null) {
                    Process.setThreadPriority(vo1.f12541b ? threadPriority : 10);
                    vo1.run();
                } else {
                    synchronized (this.f4921a) {
                        if (this.f4922b.peek() == null) {
                            this.f4924d.getClass();
                            try {
                                this.f4921a.wait(30000L);
                            } catch (InterruptedException e2) {
                                m3843b(e2);
                            }
                        }
                    }
                    synchronized (this.f4924d.f44360j) {
                        if (this.f4922b.peek() == null) {
                            m3844c();
                            m3844c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            m3844c();
            throw th;
        }
    }
}
