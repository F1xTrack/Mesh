package defpackage;

import android.os.Build;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public abstract class O90 {
    public static final C8139yG a = new C8139yG("CLOSED");

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str.concat(" must not be null"));
        m(illegalStateException, O90.class.getName());
        throw illegalStateException;
    }

    public static void c(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m(nullPointerException, O90.class.getName());
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m(nullPointerException, O90.class.getName());
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        m(nullPointerException, O90.class.getName());
        throw nullPointerException;
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(i(str));
        m(nullPointerException, O90.class.getName());
        throw nullPointerException;
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(i(str));
        m(illegalArgumentException, O90.class.getName());
        throw illegalArgumentException;
    }

    public static int h(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static String i(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = O90.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        StringBuilder sbX = F91.x("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        sbX.append(str);
        return sbX.toString();
    }

    public static final Object j(KX0 kx0, long j, Function2 function2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (kx0.c >= j && !kx0.d()) {
                return kx0;
            }
            Object obj = AbstractC6550pw.a.get(kx0);
            C8139yG c8139yG = a;
            if (obj == c8139yG) {
                return c8139yG;
            }
            KX0 kx02 = (KX0) ((AbstractC6550pw) obj);
            if (kx02 == null) {
                kx02 = (KX0) function2.invoke(Long.valueOf(kx0.c + 1), kx0);
                do {
                    atomicReferenceFieldUpdater = AbstractC6550pw.a;
                    if (atomicReferenceFieldUpdater.compareAndSet(kx0, null, kx02)) {
                        if (kx0.d()) {
                            kx0.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(kx0) == null);
            }
            kx0 = kx02;
        }
    }

    public static void k(int i, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() <= 23) {
            return;
        }
        str.substring(0, 23);
    }

    public static void l() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void m(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static String n(Object obj, String str) {
        return str + obj;
    }

    public static void o(String str) {
        C7074sg c7074sg = new C7074sg(AbstractC8235ym.k("lateinit property ", str, " has not been initialized"));
        m(c7074sg, O90.class.getName());
        throw c7074sg;
    }
}
