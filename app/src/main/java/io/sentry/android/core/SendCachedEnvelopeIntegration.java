package io.sentry.android.core;

import io.sentry.AbstractC6008d;
import io.sentry.C5759D1;
import io.sentry.C5760E;
import io.sentry.C5791O0;
import io.sentry.EnumC5763F;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5766G;
import io.sentry.InterfaceC5769H;
import io.sentry.InterfaceC5819Y;
import io.sentry.config.AbstractC6003a;
import io.sentry.util.C6170c;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C7253zG;

/* loaded from: classes2.dex */
final class SendCachedEnvelopeIntegration implements InterfaceC5819Y, InterfaceC5766G, Closeable {

    /* renamed from: a */
    public final C5791O0 f33595a;

    /* renamed from: b */
    public final C6170c f33596b;

    /* renamed from: d */
    public InterfaceC5769H f33598d;

    /* renamed from: e */
    public C5760E f33599e;

    /* renamed from: f */
    public SentryAndroidOptions f33600f;

    /* renamed from: g */
    public C7253zG f33601g;

    /* renamed from: c */
    public final AtomicBoolean f33597c = new AtomicBoolean(false);

    /* renamed from: h */
    public final AtomicBoolean f33602h = new AtomicBoolean(false);

    /* renamed from: i */
    public final AtomicBoolean f33603i = new AtomicBoolean(false);

    public SendCachedEnvelopeIntegration(C5791O0 c5791o0, C6170c c6170c) {
        this.f33595a = c5791o0;
        this.f33596b = c6170c;
    }

    /* renamed from: a */
    public final synchronized void m21541a(C5760E c5760e, SentryAndroidOptions sentryAndroidOptions) {
        try {
            try {
                Future futureSubmit = sentryAndroidOptions.getExecutorService().submit(new RunnableC5850W(this, sentryAndroidOptions, c5760e, 0));
                if (((Boolean) this.f33596b.m21880a()).booleanValue() && this.f33597c.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
            } catch (RejectedExecutionException e) {
                sentryAndroidOptions.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e);
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to call the executor. Cached events will not be sent", th);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC5766G
    /* renamed from: c */
    public final void mo21386c(EnumC5763F enumC5763F) {
        SentryAndroidOptions sentryAndroidOptions;
        C5760E c5760e = this.f33599e;
        if (c5760e == null || (sentryAndroidOptions = this.f33600f) == null) {
            return;
        }
        m21541a(c5760e, sentryAndroidOptions);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f33603i.set(true);
        InterfaceC5769H interfaceC5769H = this.f33598d;
        if (interfaceC5769H != null) {
            interfaceC5769H.mo21391d(this);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0020. Please report as an issue. */
    @Override // io.sentry.InterfaceC5819Y
    /* renamed from: e */
    public final void mo21468e(C5759D1 c5759d1) {
        C5760E c5760e = C5760E.f33234a;
        this.f33599e = c5760e;
        SentryAndroidOptions sentryAndroidOptions = c5759d1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5759d1 : null;
        AbstractC6003a.m21735D(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f33600f = sentryAndroidOptions;
        String cacheDirPath = c5759d1.getCacheDirPath();
        C5791O0 c5791o0 = this.f33595a;
        ILogger logger = c5759d1.getLogger();
        switch (c5791o0.f33345a) {
        }
        if (!AbstractC6008d.m21772b(cacheDirPath, logger)) {
            c5759d1.getLogger().mo21407k(EnumC6069n1.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            AbstractC6003a.m21742a("SendCachedEnvelope");
            m21541a(c5760e, this.f33600f);
        }
    }
}
