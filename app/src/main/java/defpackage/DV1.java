package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class DV1 {
    public static AV1 a;

    public static void a() {
        AbstractC3377dM1.i(c(), "Not in application's main thread");
    }

    public static final void b(InterfaceC0173Bz interfaceC0173Bz, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC0563Gz.a.iterator();
        while (it.hasNext()) {
            try {
                ((C6006n4) it.next()).l(interfaceC0173Bz, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    I02.a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            I02.a(th, new AJ(interfaceC0173Bz));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void d(Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            AbstractC3377dM1.i(new Handler(Looper.getMainLooper()).post(runnable), "Unable to post to main thread");
        }
    }

    public static synchronized C5898mV1 e(RU1 ru1) {
        try {
            if (a == null) {
                a = new AV1(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C5898mV1) a.g1(ru1);
    }
}
