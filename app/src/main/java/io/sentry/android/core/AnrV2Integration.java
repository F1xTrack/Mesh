package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import io.sentry.C5759D1;
import io.sentry.EnumC6069n1;
import io.sentry.InterfaceC5819Y;
import io.sentry.config.AbstractC6003a;
import io.sentry.transport.C6152d;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public class AnrV2Integration implements InterfaceC5819Y, Closeable {

    /* renamed from: d */
    public static final long f33507d = TimeUnit.DAYS.toMillis(91);

    /* renamed from: a */
    public final Context f33508a;

    /* renamed from: b */
    public final C6152d f33509b;

    /* renamed from: c */
    public SentryAndroidOptions f33510c;

    public AnrV2Integration(Context context) {
        C6152d c6152d = C6152d.f34633a;
        Context applicationContext = context.getApplicationContext();
        this.f33508a = applicationContext != null ? applicationContext : context;
        this.f33509b = c6152d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f33510c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC5819Y
    /* renamed from: e */
    public final void mo21468e(C5759D1 c5759d1) {
        SentryAndroidOptions sentryAndroidOptions = c5759d1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5759d1 : null;
        AbstractC6003a.m21735D(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f33510c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.f33510c.isAnrEnabled()));
        if (this.f33510c.getCacheDirPath() == null) {
            this.f33510c.getLogger().mo21407k(EnumC6069n1.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.f33510c.isAnrEnabled()) {
            try {
                c5759d1.getExecutorService().submit(new RunnableC5914w(this.f33508a, this.f33510c, this.f33509b));
            } catch (Throwable th) {
                c5759d1.getLogger().mo21406d(EnumC6069n1.DEBUG, "Failed to start AnrProcessor.", th);
            }
            c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "AnrV2Integration installed.", new Object[0]);
            AbstractC6003a.m21742a("AnrV2");
        }
    }
}
