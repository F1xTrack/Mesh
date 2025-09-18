package io.sentry.android.core;

import io.sentry.C5752B0;
import io.sentry.C5759D1;
import io.sentry.C5760E;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5819Y;
import java.io.Closeable;

/* loaded from: classes2.dex */
public abstract class EnvelopeFileObserverIntegration implements InterfaceC5819Y, Closeable {

    /* renamed from: a */
    public FileObserverC5838J f33527a;

    /* renamed from: b */
    public ILogger f33528b;

    /* renamed from: c */
    public boolean f33529c = false;

    /* renamed from: d */
    public final Object f33530d = new Object();

    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        public /* synthetic */ OutboxEnvelopeFileObserverIntegration(int i) {
            this();
        }
    }

    /* renamed from: m */
    public static EnvelopeFileObserverIntegration m21523m() {
        return new OutboxEnvelopeFileObserverIntegration(0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f33530d) {
            this.f33529c = true;
        }
        FileObserverC5838J fileObserverC5838J = this.f33527a;
        if (fileObserverC5838J != null) {
            fileObserverC5838J.stopWatching();
            ILogger iLogger = this.f33528b;
            if (iLogger != null) {
                iLogger.mo21407k(EnumC6069n1.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC5819Y
    /* renamed from: e */
    public final void mo21468e(C5759D1 c5759d1) {
        this.f33528b = c5759d1.getLogger();
        String outboxPath = c5759d1.getOutboxPath();
        if (outboxPath == null) {
            this.f33528b.mo21407k(EnumC6069n1.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        this.f33528b.mo21407k(EnumC6069n1.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", outboxPath);
        try {
            c5759d1.getExecutorService().submit(new RunnableC5850W(this, c5759d1, outboxPath, 2));
        } catch (Throwable th) {
            this.f33528b.mo21406d(EnumC6069n1.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th);
        }
    }

    /* renamed from: n */
    public final void m21524n(C5759D1 c5759d1, String str) {
        FileObserverC5838J fileObserverC5838J = new FileObserverC5838J(str, new C5752B0(C5760E.f33234a, c5759d1.getEnvelopeReader(), c5759d1.getSerializer(), c5759d1.getLogger(), c5759d1.getFlushTimeoutMillis(), c5759d1.getMaxQueueSize()), c5759d1.getLogger(), c5759d1.getFlushTimeoutMillis());
        this.f33527a = fileObserverC5838J;
        try {
            fileObserverC5838J.startWatching();
            c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
        } catch (Throwable th) {
            c5759d1.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th);
        }
    }
}
