package io.sentry.android.core;

import io.sentry.D1;
import io.sentry.EnumC5148n1;
import io.sentry.ILogger;

/* loaded from: classes2.dex */
public final class T implements K, ILogger {
    public static final T a = new T();

    public static boolean a(D1 d1, String str) {
        return b(str, d1 != null ? d1.getLogger() : null) != null;
    }

    public static Class b(String str, ILogger iLogger) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            if (iLogger == null) {
                return null;
            }
            iLogger.d(EnumC5148n1.DEBUG, "Class not available:".concat(str), e);
            return null;
        } catch (UnsatisfiedLinkError e2) {
            if (iLogger == null) {
                return null;
            }
            iLogger.d(EnumC5148n1.ERROR, "Failed to load (UnsatisfiedLinkError) ".concat(str), e2);
            return null;
        } catch (Throwable th) {
            if (iLogger == null) {
                return null;
            }
            iLogger.d(EnumC5148n1.ERROR, "Failed to initialize ".concat(str), th);
            return null;
        }
    }

    @Override // io.sentry.ILogger
    public void c(EnumC5148n1 enumC5148n1, Throwable th, String str, Object... objArr) {
        if (objArr.length == 0) {
            d(enumC5148n1, str, th);
        } else {
            d(enumC5148n1, String.format(str, objArr), th);
        }
    }

    @Override // io.sentry.ILogger
    public void d(EnumC5148n1 enumC5148n1, String str, Throwable th) {
        int i = AbstractC5094k.a[enumC5148n1.ordinal()];
    }

    @Override // io.sentry.ILogger
    public void k(EnumC5148n1 enumC5148n1, String str, Object... objArr) {
        if (objArr.length == 0) {
            int i = AbstractC5094k.a[enumC5148n1.ordinal()];
        } else {
            int i2 = AbstractC5094k.a[enumC5148n1.ordinal()];
            String.format(str, objArr);
        }
    }

    @Override // io.sentry.ILogger
    public boolean l(EnumC5148n1 enumC5148n1) {
        return true;
    }
}
