package p000;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* renamed from: rA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10872rA1 {

    /* renamed from: a */
    public static final Object f41369a = new Object();

    /* renamed from: a */
    public static void m24169a(String str, Throwable th) {
        String strM24173f = m24173f(th);
        if (TextUtils.isEmpty(strM24173f)) {
            return;
        }
        strM24173f.replace("\n", "\n  ");
    }

    /* renamed from: c */
    public static void m24170c(String str) {
        synchronized (f41369a) {
            m24169a(str, null);
        }
    }

    /* renamed from: d */
    public static void m24171d(String str) {
        synchronized (f41369a) {
            m24169a(str, null);
        }
    }

    /* renamed from: e */
    public static void m24172e(String str, Throwable th) {
        synchronized (f41369a) {
            m24169a(str, th);
        }
    }

    /* renamed from: f */
    public static String m24173f(Throwable th) {
        boolean z;
        if (th == null) {
            return null;
        }
        synchronized (f41369a) {
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    z = false;
                    break;
                }
                try {
                    if (cause instanceof UnknownHostException) {
                        z = true;
                        break;
                    }
                    cause = cause.getCause();
                } finally {
                }
            }
            if (z) {
                return "UnknownHostException (no network)";
            }
            return Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
    }

    /* renamed from: g */
    public static void m24174g(String str) {
        synchronized (f41369a) {
            m24169a(str, null);
        }
    }

    /* renamed from: h */
    public static void m24175h(String str) {
        synchronized (f41369a) {
            m24169a(str, null);
        }
    }

    /* renamed from: i */
    public static void m24176i(String str, Throwable th) {
        synchronized (f41369a) {
            m24169a(str, th);
        }
    }

    /* renamed from: b */
    public abstract C7408Bv0 m24177b();
}
