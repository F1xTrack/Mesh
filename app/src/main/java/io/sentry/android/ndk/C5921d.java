package io.sentry.android.ndk;

import io.sentry.AbstractC5788N0;
import io.sentry.C6017f;
import io.sentry.EnumC6069n1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6082E;

/* renamed from: io.sentry.android.ndk.d */
/* loaded from: classes2.dex */
public final class C5921d extends AbstractC5788N0 {

    /* renamed from: a */
    public final SentryAndroidOptions f33874a;

    /* renamed from: b */
    public final InterfaceC5918a f33875b;

    public C5921d(SentryAndroidOptions sentryAndroidOptions) {
        NativeScope nativeScope = new NativeScope();
        AbstractC6003a.m21735D(sentryAndroidOptions, "The SentryOptions object is required.");
        this.f33874a = sentryAndroidOptions;
        this.f33875b = nativeScope;
    }

    @Override // io.sentry.AbstractC5788N0, io.sentry.InterfaceC5793P
    /* renamed from: a */
    public final void mo21440a(String str, String str2) {
        SentryAndroidOptions sentryAndroidOptions = this.f33874a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new RunnableC5920c(this, str, str2, 0));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().mo21405c(EnumC6069n1.ERROR, th, "Scope sync setExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.InterfaceC5793P
    /* renamed from: e */
    public final void mo21456e(C6082E c6082e) {
        SentryAndroidOptions sentryAndroidOptions = this.f33874a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new RunnableC5919b(this, c6082e, 1));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().mo21405c(EnumC6069n1.ERROR, th, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.AbstractC5788N0, io.sentry.InterfaceC5793P
    /* renamed from: i */
    public final void mo21447i(C6017f c6017f) {
        SentryAndroidOptions sentryAndroidOptions = this.f33874a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new RunnableC5919b(this, c6017f, 0));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().mo21405c(EnumC6069n1.ERROR, th, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.AbstractC5788N0, io.sentry.InterfaceC5793P
    /* renamed from: j */
    public final void mo21448j(String str, String str2) {
        SentryAndroidOptions sentryAndroidOptions = this.f33874a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new RunnableC5920c(this, str, str2, 1));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().mo21405c(EnumC6069n1.ERROR, th, "Scope sync setTag(%s) has an error.", str);
        }
    }
}
