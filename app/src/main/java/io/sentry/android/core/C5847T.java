package io.sentry.android.core;

import io.sentry.C5759D1;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;

/* renamed from: io.sentry.android.core.T */
/* loaded from: classes2.dex */
public final class C5847T implements InterfaceC5839K, ILogger {

    /* renamed from: a */
    public static final C5847T f33615a = new C5847T();

    /* renamed from: a */
    public static boolean m21544a(C5759D1 c5759d1, String str) {
        return m21545b(str, c5759d1 != null ? c5759d1.getLogger() : null) != null;
    }

    /* renamed from: b */
    public static Class m21545b(String str, ILogger iLogger) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            if (iLogger == null) {
                return null;
            }
            iLogger.mo21406d(EnumC6069n1.DEBUG, "Class not available:".concat(str), e);
            return null;
        } catch (UnsatisfiedLinkError e2) {
            if (iLogger == null) {
                return null;
            }
            iLogger.mo21406d(EnumC6069n1.ERROR, "Failed to load (UnsatisfiedLinkError) ".concat(str), e2);
            return null;
        } catch (Throwable th) {
            if (iLogger == null) {
                return null;
            }
            iLogger.mo21406d(EnumC6069n1.ERROR, "Failed to initialize ".concat(str), th);
            return null;
        }
    }

    @Override // io.sentry.ILogger
    /* renamed from: c */
    public void mo21405c(EnumC6069n1 enumC6069n1, Throwable th, String str, Object... objArr) {
        if (objArr.length == 0) {
            mo21406d(enumC6069n1, str, th);
        } else {
            mo21406d(enumC6069n1, String.format(str, objArr), th);
        }
    }

    @Override // io.sentry.ILogger
    /* renamed from: d */
    public void mo21406d(EnumC6069n1 enumC6069n1, String str, Throwable th) {
        int i = AbstractC5895k.f33793a[enumC6069n1.ordinal()];
    }

    @Override // io.sentry.ILogger
    /* renamed from: k */
    public void mo21407k(EnumC6069n1 enumC6069n1, String str, Object... objArr) {
        if (objArr.length == 0) {
            int i = AbstractC5895k.f33793a[enumC6069n1.ordinal()];
        } else {
            int i2 = AbstractC5895k.f33793a[enumC6069n1.ordinal()];
            String.format(str, objArr);
        }
    }

    @Override // io.sentry.ILogger
    /* renamed from: l */
    public boolean mo21408l(EnumC6069n1 enumC6069n1) {
        return true;
    }
}
