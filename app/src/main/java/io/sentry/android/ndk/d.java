package io.sentry.android.ndk;

import io.sentry.C5122f;
import io.sentry.EnumC5148n1;
import io.sentry.N0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.E;

/* loaded from: classes2.dex */
public final class d extends N0 {
    public final SentryAndroidOptions a;
    public final a b;

    public d(SentryAndroidOptions sentryAndroidOptions) {
        NativeScope nativeScope = new NativeScope();
        io.sentry.config.a.D(sentryAndroidOptions, "The SentryOptions object is required.");
        this.a = sentryAndroidOptions;
        this.b = nativeScope;
    }

    @Override // io.sentry.N0, io.sentry.P
    public final void a(String str, String str2) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new c(this, str, str2, 0));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().c(EnumC5148n1.ERROR, th, "Scope sync setExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.P
    public final void e(E e) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new b(this, e, 1));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().c(EnumC5148n1.ERROR, th, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.N0, io.sentry.P
    public final void i(C5122f c5122f) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new b(this, c5122f, 0));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().c(EnumC5148n1.ERROR, th, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.N0, io.sentry.P
    public final void j(String str, String str2) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new c(this, str, str2, 1));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().c(EnumC5148n1.ERROR, th, "Scope sync setTag(%s) has an error.", str);
        }
    }
}
