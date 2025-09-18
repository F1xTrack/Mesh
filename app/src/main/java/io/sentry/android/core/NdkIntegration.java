package io.sentry.android.core;

import io.sentry.C5759D1;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5819Y;
import io.sentry.config.AbstractC6003a;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class NdkIntegration implements InterfaceC5819Y, Closeable {

    /* renamed from: a */
    public final Class f33565a;

    /* renamed from: b */
    public SentryAndroidOptions f33566b;

    public NdkIntegration(Class cls) {
        this.f33565a = cls;
    }

    /* renamed from: a */
    public static void m21537a(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f33566b;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class cls = this.f33565a;
        try {
            if (cls != null) {
                try {
                    try {
                        cls.getMethod("close", null).invoke(null, null);
                        this.f33566b.getLogger().mo21407k(EnumC6069n1.DEBUG, "NdkIntegration removed.", new Object[0]);
                    } finally {
                        m21537a(this.f33566b);
                    }
                } catch (NoSuchMethodException e) {
                    this.f33566b.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to invoke the SentryNdk.close method.", e);
                }
                m21537a(this.f33566b);
            }
        } catch (Throwable th) {
            m21537a(this.f33566b);
        }
    }

    @Override // io.sentry.InterfaceC5819Y
    /* renamed from: e */
    public final void mo21468e(C5759D1 c5759d1) {
        Class cls;
        SentryAndroidOptions sentryAndroidOptions = c5759d1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5759d1 : null;
        AbstractC6003a.m21735D(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f33566b = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        ILogger logger = this.f33566b.getLogger();
        EnumC6069n1 enumC6069n1 = EnumC6069n1.DEBUG;
        logger.mo21407k(enumC6069n1, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || (cls = this.f33565a) == null) {
            m21537a(this.f33566b);
            return;
        }
        if (this.f33566b.getCacheDirPath() == null) {
            this.f33566b.getLogger().mo21407k(EnumC6069n1.ERROR, "No cache dir path is defined in options.", new Object[0]);
            m21537a(this.f33566b);
            return;
        }
        try {
            cls.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f33566b);
            this.f33566b.getLogger().mo21407k(enumC6069n1, "NdkIntegration installed.", new Object[0]);
            AbstractC6003a.m21742a("Ndk");
        } catch (NoSuchMethodException e) {
            m21537a(this.f33566b);
            this.f33566b.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to invoke the SentryNdk.init method.", e);
        } catch (Throwable th) {
            m21537a(this.f33566b);
            this.f33566b.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to initialize SentryNdk.", th);
        }
    }
}
