package defpackage;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: s9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6975s9 extends Thread {
    public final /* synthetic */ int a = 1;

    public /* synthetic */ C6975s9(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        ReentrantLock reentrantLock;
        C7548v9 c7548v9A;
        switch (this.a) {
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
                reentrantLock = C7548v9.h;
                reentrantLock.lock();
                try {
                    c7548v9A = AbstractC2317bO1.a();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused2) {
            }
            if (c7548v9A == C7548v9.l) {
                C7548v9.l = null;
                return;
            } else {
                reentrantLock.unlock();
                if (c7548v9A != null) {
                    c7548v9A.k();
                }
            }
        }
    }

    public /* synthetic */ C6975s9(String str) {
        super(str);
    }

    public /* synthetic */ C6975s9(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
