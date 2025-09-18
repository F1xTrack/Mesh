package p000;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: s9 */
/* loaded from: classes2.dex */
public final class C6805s9 extends Thread {

    /* renamed from: a */
    public final /* synthetic */ int f42280a = 1;

    public /* synthetic */ C6805s9(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        ReentrantLock reentrantLock;
        C6994v9 c6994v9M10452a;
        switch (this.f42280a) {
            case 0:
                break;
            case 1:
                Process.setThreadPriority(9);
                super.run();
                return;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
        while (true) {
            try {
                reentrantLock = C6994v9.f44211h;
                reentrantLock.lock();
                try {
                    c6994v9M10452a = AbstractC8847bO1.m10452a();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused2) {
            }
            if (c6994v9M10452a == C6994v9.f44215l) {
                C6994v9.f44215l = null;
                return;
            } else {
                reentrantLock.unlock();
                if (c6994v9M10452a != null) {
                    c6994v9M10452a.mo1159k();
                }
            }
        }
    }

    public /* synthetic */ C6805s9(String str) {
        super(str);
    }

    public /* synthetic */ C6805s9(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
