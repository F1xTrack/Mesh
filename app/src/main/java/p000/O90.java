package p000;

import android.os.Build;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public abstract class O90 {

    /* renamed from: a */
    public static final C7190yG f8260a = new C7190yG("CLOSED");

    /* renamed from: a */
    public static boolean m5963a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m5964b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str.concat(" must not be null"));
        m5975m(illegalStateException, O90.class.getName());
        throw illegalStateException;
    }

    /* renamed from: c */
    public static void m5965c(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m5975m(nullPointerException, O90.class.getName());
        throw nullPointerException;
    }

    /* renamed from: d */
    public static void m5966d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m5975m(nullPointerException, O90.class.getName());
        throw nullPointerException;
    }

    /* renamed from: e */
    public static void m5967e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        m5975m(nullPointerException, O90.class.getName());
        throw nullPointerException;
    }

    /* renamed from: f */
    public static void m5968f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(m5971i(str));
        m5975m(nullPointerException, O90.class.getName());
        throw nullPointerException;
    }

    /* renamed from: g */
    public static void m5969g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(m5971i(str));
        m5975m(illegalArgumentException, O90.class.getName());
        throw illegalArgumentException;
    }

    /* renamed from: h */
    public static int m5970h(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: i */
    public static String m5971i(String str) {
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
        StringBuilder sbM2541x = F91.m2541x("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        sbM2541x.append(str);
        return sbM2541x.toString();
    }

    /* renamed from: j */
    public static final Object m5972j(KX0 kx0, long j, Function2 function2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (kx0.f6149c >= j && !kx0.mo4662d()) {
                return kx0;
            }
            Object obj = AbstractC6648pw.f40440a.get(kx0);
            C7190yG c7190yG = f8260a;
            if (obj == c7190yG) {
                return c7190yG;
            }
            KX0 kx02 = (KX0) ((AbstractC6648pw) obj);
            if (kx02 == null) {
                kx02 = (KX0) function2.invoke(Long.valueOf(kx0.f6149c + 1), kx0);
                do {
                    atomicReferenceFieldUpdater = AbstractC6648pw.f40440a;
                    if (atomicReferenceFieldUpdater.compareAndSet(kx0, null, kx02)) {
                        if (kx0.mo4662d()) {
                            kx0.m23887e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(kx0) == null);
            }
            kx0 = kx02;
        }
    }

    /* renamed from: k */
    public static void m5973k(int i, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() <= 23) {
            return;
        }
        str.substring(0, 23);
    }

    /* renamed from: l */
    public static void m5974l() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: m */
    public static void m5975m(RuntimeException runtimeException, String str) {
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

    /* renamed from: n */
    public static String m5976n(Object obj, String str) {
        return str + obj;
    }

    /* renamed from: o */
    public static void m5977o(String str) {
        C6838sg c6838sg = new C6838sg(AbstractC7222ym.m26234k("lateinit property ", str, " has not been initialized"));
        m5975m(c6838sg, O90.class.getName());
        throw c6838sg;
    }
}
