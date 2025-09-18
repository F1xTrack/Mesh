package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import com.yandex.metrica.RunnableC3795n;
import io.sentry.C5759D1;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5819Y;
import io.sentry.config.AbstractC6003a;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class NetworkBreadcrumbsIntegration implements InterfaceC5819Y, Closeable {

    /* renamed from: a */
    public final Context f33567a;

    /* renamed from: b */
    public final C5832D f33568b;

    /* renamed from: c */
    public final ILogger f33569c;

    /* renamed from: d */
    public final Object f33570d = new Object();

    /* renamed from: e */
    public volatile boolean f33571e;

    /* renamed from: f */
    public C5759D1 f33572f;

    /* renamed from: g */
    public volatile C5846S f33573g;

    public NetworkBreadcrumbsIntegration(Context context, ILogger iLogger, C5832D c5832d) {
        Context applicationContext = context.getApplicationContext();
        this.f33567a = applicationContext != null ? applicationContext : context;
        this.f33568b = c5832d;
        AbstractC6003a.m21735D(iLogger, "ILogger is required");
        this.f33569c = iLogger;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f33571e = true;
        try {
            C5759D1 c5759d1 = this.f33572f;
            AbstractC6003a.m21735D(c5759d1, "Options is required");
            c5759d1.getExecutorService().submit(new RunnableC5854a(4, this));
        } catch (Throwable th) {
            this.f33569c.mo21406d(EnumC6069n1.ERROR, "Error submitting NetworkBreadcrumbsIntegration task.", th);
        }
    }

    @Override // io.sentry.InterfaceC5819Y
    /* renamed from: e */
    public final void mo21468e(C5759D1 c5759d1) {
        int i = 1;
        SentryAndroidOptions sentryAndroidOptions = c5759d1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5759d1 : null;
        AbstractC6003a.m21735D(sentryAndroidOptions, "SentryAndroidOptions is required");
        EnumC6069n1 enumC6069n1 = EnumC6069n1.DEBUG;
        Object[] objArr = {Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs())};
        ILogger iLogger = this.f33569c;
        iLogger.mo21407k(enumC6069n1, "NetworkBreadcrumbsIntegration enabled: %s", objArr);
        this.f33572f = c5759d1;
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            this.f33568b.getClass();
            if (Build.VERSION.SDK_INT < 24) {
                iLogger.mo21407k(enumC6069n1, "NetworkCallbacks need Android N+.", new Object[0]);
                return;
            }
            try {
                c5759d1.getExecutorService().submit(new RunnableC3795n(this, i, c5759d1));
            } catch (Throwable th) {
                iLogger.mo21406d(EnumC6069n1.ERROR, "Error submitting NetworkBreadcrumbsIntegration task.", th);
            }
        }
    }
}
