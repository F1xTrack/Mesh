package io.sentry;

import defpackage.O91;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes2.dex */
public final class D implements J {
    public final D1 a;
    public volatile boolean b;
    public final C5142l1 c;
    public final I1 d;
    public final Map e = Collections.synchronizedMap(new WeakHashMap());
    public final b2 f;

    public D(D1 d1, C5142l1 c5142l1) {
        io.sentry.config.a.D(d1, "SentryOptions is required.");
        if (d1.getDsn() == null || d1.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available.");
        }
        this.a = d1;
        this.d = new I1(d1, 1);
        this.c = c5142l1;
        io.sentry.protocol.t tVar = io.sentry.protocol.t.b;
        this.f = d1.getTransactionPerformanceCollector();
        this.b = true;
    }

    @Override // io.sentry.J
    public final D1 A() {
        return this.c.x().a;
    }

    @Override // io.sentry.J
    public final U B() {
        if (this.b) {
            return this.c.x().c.a;
        }
        this.a.getLogger().k(EnumC5148n1.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.J
    public final io.sentry.protocol.t C(io.sentry.protocol.A a, Y1 y1, C5185y c5185y, E0 e0) {
        io.sentry.protocol.t tVar = io.sentry.protocol.t.b;
        if (!this.b) {
            this.a.getLogger().k(EnumC5148n1.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return tVar;
        }
        if (a.r == null) {
            this.a.getLogger().k(EnumC5148n1.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", a.a);
            return tVar;
        }
        Boolean bool = Boolean.TRUE;
        Q1 q1A = a.b.a();
        Y0 y0 = q1A == null ? null : q1A.d;
        if (bool.equals(Boolean.valueOf(y0 == null ? false : ((Boolean) y0.a).booleanValue()))) {
            try {
                V1 v1X = this.c.x();
                return v1X.b.l(a, y1, v1X.c, c5185y, e0);
            } catch (Throwable th) {
                this.a.getLogger().d(EnumC5148n1.ERROR, "Error while capturing transaction with id: " + a.a, th);
                return tVar;
            }
        }
        this.a.getLogger().k(EnumC5148n1.DEBUG, "Transaction %s was dropped due to sampling decision.", a.a);
        if (this.a.getBackpressureMonitor().a() > 0) {
            io.sentry.clientreport.f clientReportRecorder = this.a.getClientReportRecorder();
            io.sentry.clientreport.d dVar = io.sentry.clientreport.d.BACKPRESSURE;
            clientReportRecorder.a(dVar, EnumC5134j.Transaction);
            this.a.getClientReportRecorder().g(dVar, EnumC5134j.Span, a.s.size() + 1);
            return tVar;
        }
        io.sentry.clientreport.f clientReportRecorder2 = this.a.getClientReportRecorder();
        io.sentry.clientreport.d dVar2 = io.sentry.clientreport.d.SAMPLE_RATE;
        clientReportRecorder2.a(dVar2, EnumC5134j.Transaction);
        this.a.getClientReportRecorder().g(dVar2, EnumC5134j.Span, a.s.size() + 1);
        return tVar;
    }

    @Override // io.sentry.J
    public final void D() {
        O1 o1;
        if (!this.b) {
            this.a.getLogger().k(EnumC5148n1.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        V1 v1X = this.c.x();
        L0 l0 = v1X.c;
        synchronized (l0.l) {
            try {
                o1 = null;
                if (l0.k != null) {
                    O1 o12 = l0.k;
                    o12.getClass();
                    o12.b(io.sentry.config.a.k());
                    O1 o1Clone = l0.k.clone();
                    l0.k = null;
                    o1 = o1Clone;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (o1 != null) {
            v1X.b.k(o1, io.sentry.config.a.b(new io.sentry.hints.i()));
        }
    }

    @Override // io.sentry.J
    public final void E() {
        C5142l1 c5142l1;
        if (!this.b) {
            this.a.getLogger().k(EnumC5148n1.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        V1 v1X = this.c.x();
        L0 l0 = v1X.c;
        synchronized (l0.l) {
            try {
                if (l0.k != null) {
                    O1 o1 = l0.k;
                    o1.getClass();
                    o1.b(io.sentry.config.a.k());
                }
                O1 o12 = l0.k;
                c5142l1 = null;
                if (l0.j.getRelease() != null) {
                    String distinctId = l0.j.getDistinctId();
                    io.sentry.protocol.E e = l0.b;
                    l0.k = new O1(N1.Ok, io.sentry.config.a.k(), io.sentry.config.a.k(), 0, distinctId, UUID.randomUUID(), Boolean.TRUE, null, null, e != null ? e.e : null, null, l0.j.getEnvironment(), l0.j.getRelease(), null);
                    c5142l1 = new C5142l1(l0.k.clone(), o12 != null ? o12.clone() : null);
                } else {
                    l0.j.getLogger().k(EnumC5148n1.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c5142l1 == null) {
            this.a.getLogger().k(EnumC5148n1.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        if (((O1) c5142l1.a) != null) {
            v1X.b.k((O1) c5142l1.a, io.sentry.config.a.b(new io.sentry.hints.i()));
        }
        v1X.b.k((O1) c5142l1.b, io.sentry.config.a.b(new io.sentry.hints.i()));
    }

    @Override // io.sentry.J
    public final io.sentry.protocol.t F(C5133i1 c5133i1, C5185y c5185y) {
        io.sentry.protocol.t tVar = io.sentry.protocol.t.b;
        if (!this.b) {
            this.a.getLogger().k(EnumC5148n1.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return tVar;
        }
        try {
            a(c5133i1);
            V1 v1X = this.c.x();
            return v1X.b.i(c5133i1, v1X.c, c5185y);
        } catch (Throwable th) {
            this.a.getLogger().d(EnumC5148n1.ERROR, "Error while capturing event with id: " + c5133i1.a, th);
            return tVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Throwable] */
    public final void a(C5133i1 c5133i1) {
        if (this.a.isTracingEnabled()) {
            io.sentry.exception.a aVar = c5133i1.j;
            if ((aVar instanceof io.sentry.exception.a ? aVar.b : aVar) != null) {
                boolean z = aVar instanceof io.sentry.exception.a;
                io.sentry.exception.a aVar2 = aVar;
                if (z) {
                    aVar2 = aVar.b;
                }
                io.sentry.config.a.D(aVar2, "throwable cannot be null");
                Throwable cause = aVar2;
                while (cause.getCause() != null && cause.getCause() != cause) {
                    cause = cause.getCause();
                }
            }
        }
    }

    @Override // io.sentry.J
    public final void b(boolean z) {
        if (!this.b) {
            this.a.getLogger().k(EnumC5148n1.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (Y y : this.a.getIntegrations()) {
                if (y instanceof Closeable) {
                    try {
                        ((Closeable) y).close();
                    } catch (IOException e) {
                        this.a.getLogger().k(EnumC5148n1.WARNING, "Failed to close the integration {}.", y, e);
                    }
                }
            }
            w(new C(0));
            this.a.getTransactionProfiler().close();
            this.a.getTransactionPerformanceCollector().close();
            Q executorService = this.a.getExecutorService();
            if (z) {
                executorService.submit(new O91(this, 20, executorService));
            } else {
                executorService.e(this.a.getShutdownTimeoutMillis());
            }
            this.c.x().b.m(z);
        } catch (Throwable th) {
            this.a.getLogger().d(EnumC5148n1.ERROR, "Error while closing the Hub.", th);
        }
        this.b = false;
    }

    @Override // io.sentry.J
    public final boolean isEnabled() {
        return this.b;
    }

    @Override // io.sentry.J
    public final io.sentry.transport.m q() {
        return ((io.sentry.transport.f) this.c.x().b.b).q();
    }

    @Override // io.sentry.J
    public final boolean s() {
        return ((io.sentry.transport.f) this.c.x().b.b).s();
    }

    @Override // io.sentry.J
    public final void t(long j) {
        if (!this.b) {
            this.a.getLogger().k(EnumC5148n1.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            ((io.sentry.transport.f) this.c.x().b.b).t(j);
        } catch (Throwable th) {
            this.a.getLogger().d(EnumC5148n1.ERROR, "Error in the 'client.flush'.", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.J
    public final U u(Z1 z1, a2 a2Var) {
        C5186y0 c5186y0;
        boolean z = this.b;
        C5186y0 c5186y02 = C5186y0.a;
        if (!z) {
            this.a.getLogger().k(EnumC5148n1.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            c5186y0 = c5186y02;
        } else if (!this.a.getInstrumenter().equals(z1.o)) {
            this.a.getLogger().k(EnumC5148n1.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", z1.o, this.a.getInstrumenter());
            c5186y0 = c5186y02;
        } else if (this.a.isTracingEnabled()) {
            Y0 y0C = this.d.c(new com.yandex.metrica.e(z1));
            z1.d = y0C;
            M1 m1 = new M1(z1, this, a2Var, this.f);
            c5186y0 = m1;
            if (((Boolean) y0C.a).booleanValue()) {
                c5186y0 = m1;
                if (((Boolean) y0C.c).booleanValue()) {
                    V transactionProfiler = this.a.getTransactionProfiler();
                    if (transactionProfiler.isRunning()) {
                        c5186y0 = m1;
                        if (a2Var.c) {
                            transactionProfiler.h(m1);
                            c5186y0 = m1;
                        }
                    } else {
                        transactionProfiler.start();
                        transactionProfiler.h(m1);
                        c5186y0 = m1;
                    }
                }
            }
        } else {
            this.a.getLogger().k(EnumC5148n1.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            c5186y0 = c5186y02;
        }
        return c5186y0;
    }

    @Override // io.sentry.J
    public final void v(C5122f c5122f, C5185y c5185y) {
        if (this.b) {
            this.c.x().c.a(c5122f, c5185y);
        } else {
            this.a.getLogger().k(EnumC5148n1.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.J
    public final void w(M0 m0) {
        if (!this.b) {
            this.a.getLogger().k(EnumC5148n1.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            m0.b(this.c.x().c);
        } catch (Throwable th) {
            this.a.getLogger().d(EnumC5148n1.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.J
    public final Boolean x() {
        Z0 z0 = Z0.d;
        String cacheDirPath = this.a.getCacheDirPath();
        boolean zIsEnableAutoSessionTracking = this.a.isEnableAutoSessionTracking();
        synchronized (z0.c) {
            try {
                if (z0.a) {
                    return z0.b;
                }
                if (cacheDirPath == null) {
                    return null;
                }
                boolean z = true;
                z0.a = true;
                File file = new File(cacheDirPath, "last_crash");
                File file2 = new File(cacheDirPath, ".sentry-native/last_crash");
                if (!file.exists()) {
                    if (!file2.exists()) {
                        z = false;
                    } else if (!zIsEnableAutoSessionTracking) {
                        file2.delete();
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    z0.b = boolValueOf;
                    return boolValueOf;
                }
                file.delete();
                Boolean boolValueOf2 = Boolean.valueOf(z);
                z0.b = boolValueOf2;
                return boolValueOf2;
            } finally {
            }
        }
    }

    @Override // io.sentry.J
    public final io.sentry.protocol.t y(io.sentry.internal.debugmeta.c cVar, C5185y c5185y) {
        io.sentry.protocol.t tVar = io.sentry.protocol.t.b;
        if (!this.b) {
            this.a.getLogger().k(EnumC5148n1.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return tVar;
        }
        try {
            io.sentry.protocol.t tVarH = this.c.x().b.h(cVar, c5185y);
            return tVarH != null ? tVarH : tVar;
        } catch (Throwable th) {
            this.a.getLogger().d(EnumC5148n1.ERROR, "Error while capturing envelope.", th);
            return tVar;
        }
    }

    @Override // io.sentry.J
    public final io.sentry.protocol.t z(F1 f1, C5185y c5185y) {
        io.sentry.protocol.t tVar = io.sentry.protocol.t.b;
        if (!this.b) {
            this.a.getLogger().k(EnumC5148n1.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
            return tVar;
        }
        try {
            V1 v1X = this.c.x();
            return v1X.b.j(f1, v1X.c, c5185y);
        } catch (Throwable th) {
            this.a.getLogger().d(EnumC5148n1.ERROR, "Error while capturing replay", th);
            return tVar;
        }
    }

    @Override // io.sentry.J
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final J m92clone() {
        if (!this.b) {
            this.a.getLogger().k(EnumC5148n1.WARNING, "Disabled Hub cloned.", new Object[0]);
        }
        D1 d1 = this.a;
        C5142l1 c5142l1 = this.c;
        C5142l1 c5142l12 = new C5142l1((ILogger) c5142l1.b, new V1((V1) ((LinkedBlockingDeque) c5142l1.a).getLast()));
        Iterator itDescendingIterator = ((LinkedBlockingDeque) c5142l1.a).descendingIterator();
        if (itDescendingIterator.hasNext()) {
            itDescendingIterator.next();
        }
        while (itDescendingIterator.hasNext()) {
            ((LinkedBlockingDeque) c5142l12.a).push(new V1((V1) itDescendingIterator.next()));
        }
        return new D(d1, c5142l12);
    }
}
