package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* renamed from: rA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6789rA1 {
    public static final Object a = new Object();

    public static void a(String str, Throwable th) {
        String strF = f(th);
        if (TextUtils.isEmpty(strF)) {
            return;
        }
        strF.replace("\n", "\n  ");
    }

    public static void c(String str) {
        synchronized (a) {
            a(str, null);
        }
    }

    public static void d(String str) {
        synchronized (a) {
            a(str, null);
        }
    }

    public static void e(String str, Throwable th) {
        synchronized (a) {
            a(str, th);
        }
    }

    public static String f(Throwable th) {
        boolean z;
        if (th == null) {
            return null;
        }
        synchronized (a) {
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

    public static void g(String str) {
        synchronized (a) {
            a(str, null);
        }
    }

    public static void h(String str) {
        synchronized (a) {
            a(str, null);
        }
    }

    public static void i(String str, Throwable th) {
        synchronized (a) {
            a(str, th);
        }
    }

    public abstract C0162Bv0 b();
}
