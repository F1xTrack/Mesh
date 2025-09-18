package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class DV1 {

    /* renamed from: a */
    public static AV1 f2024a;

    /* renamed from: a */
    public static void m1716a() {
        AbstractC9104dM1.m17550i(m1718c(), "Not in application's main thread");
    }

    /* renamed from: b */
    public static final void m1717b(InterfaceC0125Bz interfaceC0125Bz, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC0440Gz.f3974a.iterator();
        while (it.hasNext()) {
            try {
                ((C6466n4) it.next()).m23067l(interfaceC0125Bz, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    I02.m3687a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            I02.m3687a(th, new C0020AJ(interfaceC0125Bz));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    /* renamed from: c */
    public static boolean m1718c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: d */
    public static void m1719d(Runnable runnable) {
        if (m1718c()) {
            runnable.run();
        } else {
            AbstractC9104dM1.m17550i(new Handler(Looper.getMainLooper()).post(runnable), "Unable to post to main thread");
        }
    }

    /* renamed from: e */
    public static synchronized C10274mV1 m1720e(RU1 ru1) {
        try {
            if (f2024a == null) {
                f2024a = new AV1(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C10274mV1) f2024a.m7838g1(ru1);
    }
}
