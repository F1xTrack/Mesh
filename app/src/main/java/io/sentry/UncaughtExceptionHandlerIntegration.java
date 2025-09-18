package io.sentry;

import io.sentry.config.AbstractC6003a;
import io.sentry.exception.C6015a;
import io.sentry.hints.EnumC6030e;
import io.sentry.protocol.C6094j;
import io.sentry.protocol.C6104t;
import java.io.Closeable;
import java.lang.Thread;

/* loaded from: classes2.dex */
public final class UncaughtExceptionHandlerIntegration implements InterfaceC5819Y, Thread.UncaughtExceptionHandler, Closeable {

    /* renamed from: a */
    public Thread.UncaughtExceptionHandler f33412a;

    /* renamed from: b */
    public C5760E f33413b;

    /* renamed from: c */
    public C5759D1 f33414c;

    /* renamed from: d */
    public boolean f33415d = false;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this == Thread.getDefaultUncaughtExceptionHandler()) {
            Thread.setDefaultUncaughtExceptionHandler(this.f33412a);
            C5759D1 c5759d1 = this.f33414c;
            if (c5759d1 != null) {
                c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC5819Y
    /* renamed from: e */
    public final void mo21468e(C5759D1 c5759d1) {
        C5760E c5760e = C5760E.f33234a;
        if (this.f33415d) {
            c5759d1.getLogger().mo21407k(EnumC6069n1.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f33415d = true;
        this.f33413b = c5760e;
        this.f33414c = c5759d1;
        ILogger logger = c5759d1.getLogger();
        EnumC6069n1 enumC6069n1 = EnumC6069n1.DEBUG;
        logger.mo21407k(enumC6069n1, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f33414c.isEnableUncaughtExceptionHandler()));
        if (this.f33414c.isEnableUncaughtExceptionHandler()) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                this.f33414c.getLogger().mo21407k(enumC6069n1, "default UncaughtExceptionHandler class='" + defaultUncaughtExceptionHandler.getClass().getName() + "'", new Object[0]);
                if (defaultUncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
                    this.f33412a = ((UncaughtExceptionHandlerIntegration) defaultUncaughtExceptionHandler).f33412a;
                } else {
                    this.f33412a = defaultUncaughtExceptionHandler;
                }
            }
            Thread.setDefaultUncaughtExceptionHandler(this);
            this.f33414c.getLogger().mo21407k(enumC6069n1, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
            AbstractC6003a.m21742a("UncaughtExceptionHandler");
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        C6104t c6104t;
        C5759D1 c5759d1 = this.f33414c;
        if (c5759d1 == null || this.f33413b == null) {
            return;
        }
        c5759d1.getLogger().mo21407k(EnumC6069n1.INFO, "Uncaught exception received.", new Object[0]);
        try {
            C5988c2 c5988c2 = new C5988c2(this.f33414c.getFlushTimeoutMillis(), this.f33414c.getLogger());
            C6094j c6094j = new C6094j();
            c6094j.f34386d = Boolean.FALSE;
            c6094j.f34383a = "UncaughtExceptionHandler";
            C6039i1 c6039i1 = new C6039i1(new C6015a(c6094j, th, thread, false));
            c6039i1.f34191u = EnumC6069n1.FATAL;
            if (this.f33413b.mo21365B() == null && (c6104t = c6039i1.f33416a) != null) {
                c5988c2.mo21646g(c6104t);
            }
            C6193y c6193yM21743b = AbstractC6003a.m21743b(c5988c2);
            boolean zEquals = this.f33413b.mo21369F(c6039i1, c6193yM21743b).equals(C6104t.f34442b);
            EnumC6030e enumC6030e = (EnumC6030e) c6193yM21743b.m21927b(EnumC6030e.class, "sentry:eventDropReason");
            if ((!zEquals || EnumC6030e.MULTITHREADED_DEDUPLICATION.equals(enumC6030e)) && !c5988c2.mo21532d()) {
                this.f33414c.getLogger().mo21407k(EnumC6069n1.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", c6039i1.f33416a);
            }
        } catch (Throwable th2) {
            this.f33414c.getLogger().mo21406d(EnumC6069n1.ERROR, "Error sending uncaught exception to Sentry.", th2);
        }
        if (this.f33412a != null) {
            this.f33414c.getLogger().mo21407k(EnumC6069n1.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.f33412a.uncaughtException(thread, th);
        } else if (this.f33414c.isPrintUncaughtStackTrace()) {
            th.printStackTrace();
        }
    }
}
