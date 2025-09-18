package io.sentry;

import com.yandex.metrica.C2460e;
import io.sentry.clientreport.EnumC6000d;
import io.sentry.clientreport.InterfaceC6002f;
import io.sentry.config.AbstractC6003a;
import io.sentry.exception.C6015a;
import io.sentry.hints.C6034i;
import io.sentry.internal.debugmeta.C6042c;
import io.sentry.protocol.C6078A;
import io.sentry.protocol.C6082E;
import io.sentry.protocol.C6104t;
import io.sentry.transport.C6161m;
import io.sentry.transport.InterfaceC6154f;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import p000.O91;

/* renamed from: io.sentry.D */
/* loaded from: classes2.dex */
public final class C5757D implements InterfaceC5775J {

    /* renamed from: a */
    public final C5759D1 f33226a;

    /* renamed from: b */
    public volatile boolean f33227b;

    /* renamed from: c */
    public final C6059l1 f33228c;

    /* renamed from: d */
    public final C5774I1 f33229d;

    /* renamed from: e */
    public final Map f33230e = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: f */
    public final InterfaceC5982b2 f33231f;

    public C5757D(C5759D1 c5759d1, C6059l1 c6059l1) {
        AbstractC6003a.m21735D(c5759d1, "SentryOptions is required.");
        if (c5759d1.getDsn() == null || c5759d1.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available.");
        }
        this.f33226a = c5759d1;
        this.f33229d = new C5774I1(c5759d1, 1);
        this.f33228c = c6059l1;
        C6104t c6104t = C6104t.f34442b;
        this.f33231f = c5759d1.getTransactionPerformanceCollector();
        this.f33227b = true;
    }

    @Override // io.sentry.InterfaceC5775J
    /* renamed from: A */
    public final C5759D1 mo21364A() {
        return this.f33228c.m21835x().f33431a;
    }

    @Override // io.sentry.InterfaceC5775J
    /* renamed from: B */
    public final InterfaceC5807U mo21365B() {
        if (this.f33227b) {
            return this.f33228c.m21835x().f33433c.f33305a;
        }
        this.f33226a.getLogger().mo21407k(EnumC6069n1.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.InterfaceC5775J
    /* renamed from: C */
    public final C6104t mo21366C(C6078A c6078a, C5821Y1 c5821y1, C6193y c6193y, C5761E0 c5761e0) {
        C6104t c6104t = C6104t.f34442b;
        if (!this.f33227b) {
            this.f33226a.getLogger().mo21407k(EnumC6069n1.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return c6104t;
        }
        if (c6078a.f34279r == null) {
            this.f33226a.getLogger().mo21407k(EnumC6069n1.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", c6078a.f33416a);
            return c6104t;
        }
        Boolean bool = Boolean.TRUE;
        C5798Q1 c5798q1M21849a = c6078a.f33417b.m21849a();
        C5820Y0 c5820y0 = c5798q1M21849a == null ? null : c5798q1M21849a.f33382d;
        if (bool.equals(Boolean.valueOf(c5820y0 == null ? false : ((Boolean) c5820y0.f33441a).booleanValue()))) {
            try {
                C5812V1 c5812v1M21835x = this.f33228c.m21835x();
                return c5812v1M21835x.f33432b.m21486l(c6078a, c5821y1, c5812v1M21835x.f33433c, c6193y, c5761e0);
            } catch (Throwable th) {
                this.f33226a.getLogger().mo21406d(EnumC6069n1.ERROR, "Error while capturing transaction with id: " + c6078a.f33416a, th);
                return c6104t;
            }
        }
        this.f33226a.getLogger().mo21407k(EnumC6069n1.DEBUG, "Transaction %s was dropped due to sampling decision.", c6078a.f33416a);
        if (this.f33226a.getBackpressureMonitor().mo3999a() > 0) {
            InterfaceC6002f clientReportRecorder = this.f33226a.getClientReportRecorder();
            EnumC6000d enumC6000d = EnumC6000d.BACKPRESSURE;
            clientReportRecorder.mo21727a(enumC6000d, EnumC6051j.Transaction);
            this.f33226a.getClientReportRecorder().mo21729g(enumC6000d, EnumC6051j.Span, c6078a.f34280s.size() + 1);
            return c6104t;
        }
        InterfaceC6002f clientReportRecorder2 = this.f33226a.getClientReportRecorder();
        EnumC6000d enumC6000d2 = EnumC6000d.SAMPLE_RATE;
        clientReportRecorder2.mo21727a(enumC6000d2, EnumC6051j.Transaction);
        this.f33226a.getClientReportRecorder().mo21729g(enumC6000d2, EnumC6051j.Span, c6078a.f34280s.size() + 1);
        return c6104t;
    }

    @Override // io.sentry.InterfaceC5775J
    /* renamed from: D */
    public final void mo21367D() {
        C5792O1 c5792o1;
        if (!this.f33227b) {
            this.f33226a.getLogger().mo21407k(EnumC6069n1.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        C5812V1 c5812v1M21835x = this.f33228c.m21835x();
        C5782L0 c5782l0 = c5812v1M21835x.f33433c;
        synchronized (c5782l0.f33316l) {
            try {
                c5792o1 = null;
                if (c5782l0.f33315k != null) {
                    C5792O1 c5792o12 = c5782l0.f33315k;
                    c5792o12.getClass();
                    c5792o12.m21454b(AbstractC6003a.m21752k());
                    C5792O1 c5792o1Clone = c5782l0.f33315k.clone();
                    c5782l0.f33315k = null;
                    c5792o1 = c5792o1Clone;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c5792o1 != null) {
            c5812v1M21835x.f33432b.m21485k(c5792o1, AbstractC6003a.m21743b(new C6034i()));
        }
    }

    @Override // io.sentry.InterfaceC5775J
    /* renamed from: E */
    public final void mo21368E() {
        C6059l1 c6059l1;
        if (!this.f33227b) {
            this.f33226a.getLogger().mo21407k(EnumC6069n1.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        C5812V1 c5812v1M21835x = this.f33228c.m21835x();
        C5782L0 c5782l0 = c5812v1M21835x.f33433c;
        synchronized (c5782l0.f33316l) {
            try {
                if (c5782l0.f33315k != null) {
                    C5792O1 c5792o1 = c5782l0.f33315k;
                    c5792o1.getClass();
                    c5792o1.m21454b(AbstractC6003a.m21752k());
                }
                C5792O1 c5792o12 = c5782l0.f33315k;
                c6059l1 = null;
                if (c5782l0.f33314j.getRelease() != null) {
                    String distinctId = c5782l0.f33314j.getDistinctId();
                    C6082E c6082e = c5782l0.f33306b;
                    c5782l0.f33315k = new C5792O1(EnumC5789N1.Ok, AbstractC6003a.m21752k(), AbstractC6003a.m21752k(), 0, distinctId, UUID.randomUUID(), Boolean.TRUE, null, null, c6082e != null ? c6082e.f34292e : null, null, c5782l0.f33314j.getEnvironment(), c5782l0.f33314j.getRelease(), null);
                    c6059l1 = new C6059l1(c5782l0.f33315k.clone(), c5792o12 != null ? c5792o12.clone() : null);
                } else {
                    c5782l0.f33314j.getLogger().mo21407k(EnumC6069n1.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c6059l1 == null) {
            this.f33226a.getLogger().mo21407k(EnumC6069n1.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        if (((C5792O1) c6059l1.f34226a) != null) {
            c5812v1M21835x.f33432b.m21485k((C5792O1) c6059l1.f34226a, AbstractC6003a.m21743b(new C6034i()));
        }
        c5812v1M21835x.f33432b.m21485k((C5792O1) c6059l1.f34227b, AbstractC6003a.m21743b(new C6034i()));
    }

    @Override // io.sentry.InterfaceC5775J
    /* renamed from: F */
    public final C6104t mo21369F(C6039i1 c6039i1, C6193y c6193y) {
        C6104t c6104t = C6104t.f34442b;
        if (!this.f33227b) {
            this.f33226a.getLogger().mo21407k(EnumC6069n1.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return c6104t;
        }
        try {
            m21370a(c6039i1);
            C5812V1 c5812v1M21835x = this.f33228c.m21835x();
            return c5812v1M21835x.f33432b.m21483i(c6039i1, c5812v1M21835x.f33433c, c6193y);
        } catch (Throwable th) {
            this.f33226a.getLogger().mo21406d(EnumC6069n1.ERROR, "Error while capturing event with id: " + c6039i1.f33416a, th);
            return c6104t;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Throwable] */
    /* renamed from: a */
    public final void m21370a(C6039i1 c6039i1) {
        if (this.f33226a.isTracingEnabled()) {
            C6015a c6015a = c6039i1.f33425j;
            if ((c6015a instanceof C6015a ? c6015a.f34140b : c6015a) != null) {
                boolean z = c6015a instanceof C6015a;
                C6015a c6015a2 = c6015a;
                if (z) {
                    c6015a2 = c6015a.f34140b;
                }
                AbstractC6003a.m21735D(c6015a2, "throwable cannot be null");
                Throwable cause = c6015a2;
                while (cause.getCause() != null && cause.getCause() != cause) {
                    cause = cause.getCause();
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC5775J
    /* renamed from: b */
    public final void mo21371b(boolean z) {
        if (!this.f33227b) {
            this.f33226a.getLogger().mo21407k(EnumC6069n1.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (InterfaceC5819Y interfaceC5819Y : this.f33226a.getIntegrations()) {
                if (interfaceC5819Y instanceof Closeable) {
                    try {
                        ((Closeable) interfaceC5819Y).close();
                    } catch (IOException e) {
                        this.f33226a.getLogger().mo21407k(EnumC6069n1.WARNING, "Failed to close the integration {}.", interfaceC5819Y, e);
                    }
                }
            }
            mo21377w(new C5754C(0));
            this.f33226a.getTransactionProfiler().close();
            this.f33226a.getTransactionPerformanceCollector().close();
            InterfaceC5796Q executorService = this.f33226a.getExecutorService();
            if (z) {
                executorService.submit(new O91(this, 20, executorService));
            } else {
                executorService.mo13812e(this.f33226a.getShutdownTimeoutMillis());
            }
            this.f33228c.m21835x().f33432b.m21487m(z);
        } catch (Throwable th) {
            this.f33226a.getLogger().mo21406d(EnumC6069n1.ERROR, "Error while closing the Hub.", th);
        }
        this.f33227b = false;
    }

    @Override // io.sentry.InterfaceC5775J
    public final boolean isEnabled() {
        return this.f33227b;
    }

    @Override // io.sentry.InterfaceC5775J
    /* renamed from: q */
    public final C6161m mo21372q() {
        return ((InterfaceC6154f) this.f33228c.m21835x().f33432b.f33442b).mo21864q();
    }

    @Override // io.sentry.InterfaceC5775J
    /* renamed from: s */
    public final boolean mo21373s() {
        return ((InterfaceC6154f) this.f33228c.m21835x().f33432b.f33442b).mo21865s();
    }

    @Override // io.sentry.InterfaceC5775J
    /* renamed from: t */
    public final void mo21374t(long j) {
        if (!this.f33227b) {
            this.f33226a.getLogger().mo21407k(EnumC6069n1.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            ((InterfaceC6154f) this.f33228c.m21835x().f33432b.f33442b).mo21866t(j);
        } catch (Throwable th) {
            this.f33226a.getLogger().mo21406d(EnumC6069n1.ERROR, "Error in the 'client.flush'.", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.InterfaceC5775J
    /* renamed from: u */
    public final InterfaceC5807U mo21375u(C5824Z1 c5824z1, C5828a2 c5828a2) {
        C6194y0 c6194y0;
        boolean z = this.f33227b;
        C6194y0 c6194y02 = C6194y0.f34745a;
        if (!z) {
            this.f33226a.getLogger().mo21407k(EnumC6069n1.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            c6194y0 = c6194y02;
        } else if (!this.f33226a.getInstrumenter().equals(c5824z1.f33466o)) {
            this.f33226a.getLogger().mo21407k(EnumC6069n1.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", c5824z1.f33466o, this.f33226a.getInstrumenter());
            c6194y0 = c6194y02;
        } else if (this.f33226a.isTracingEnabled()) {
            C5820Y0 c5820y0M21404c = this.f33229d.m21404c(new C2460e(c5824z1));
            c5824z1.f33382d = c5820y0M21404c;
            C5786M1 c5786m1 = new C5786M1(c5824z1, this, c5828a2, this.f33231f);
            c6194y0 = c5786m1;
            if (((Boolean) c5820y0M21404c.f33441a).booleanValue()) {
                c6194y0 = c5786m1;
                if (((Boolean) c5820y0M21404c.f33443c).booleanValue()) {
                    InterfaceC5810V transactionProfiler = this.f33226a.getTransactionProfiler();
                    if (transactionProfiler.isRunning()) {
                        c6194y0 = c5786m1;
                        if (c5828a2.f33473c) {
                            transactionProfiler.mo21471h(c5786m1);
                            c6194y0 = c5786m1;
                        }
                    } else {
                        transactionProfiler.start();
                        transactionProfiler.mo21471h(c5786m1);
                        c6194y0 = c5786m1;
                    }
                }
            }
        } else {
            this.f33226a.getLogger().mo21407k(EnumC6069n1.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            c6194y0 = c6194y02;
        }
        return c6194y0;
    }

    @Override // io.sentry.InterfaceC5775J
    /* renamed from: v */
    public final void mo21376v(C6017f c6017f, C6193y c6193y) {
        if (this.f33227b) {
            this.f33228c.m21835x().f33433c.m21410a(c6017f, c6193y);
        } else {
            this.f33226a.getLogger().mo21407k(EnumC6069n1.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC5775J
    /* renamed from: w */
    public final void mo21377w(InterfaceC5785M0 interfaceC5785M0) {
        if (!this.f33227b) {
            this.f33226a.getLogger().mo21407k(EnumC6069n1.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            interfaceC5785M0.mo3170b(this.f33228c.m21835x().f33433c);
        } catch (Throwable th) {
            this.f33226a.getLogger().mo21406d(EnumC6069n1.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.InterfaceC5775J
    /* renamed from: x */
    public final Boolean mo21378x() {
        C5823Z0 c5823z0 = C5823Z0.f33457d;
        String cacheDirPath = this.f33226a.getCacheDirPath();
        boolean zIsEnableAutoSessionTracking = this.f33226a.isEnableAutoSessionTracking();
        synchronized (c5823z0.f33460c) {
            try {
                if (c5823z0.f33458a) {
                    return c5823z0.f33459b;
                }
                if (cacheDirPath == null) {
                    return null;
                }
                boolean z = true;
                c5823z0.f33458a = true;
                File file = new File(cacheDirPath, "last_crash");
                File file2 = new File(cacheDirPath, ".sentry-native/last_crash");
                if (!file.exists()) {
                    if (!file2.exists()) {
                        z = false;
                    } else if (!zIsEnableAutoSessionTracking) {
                        file2.delete();
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    c5823z0.f33459b = boolValueOf;
                    return boolValueOf;
                }
                file.delete();
                Boolean boolValueOf2 = Boolean.valueOf(z);
                c5823z0.f33459b = boolValueOf2;
                return boolValueOf2;
            } finally {
            }
        }
    }

    @Override // io.sentry.InterfaceC5775J
    /* renamed from: y */
    public final C6104t mo21379y(C6042c c6042c, C6193y c6193y) {
        C6104t c6104t = C6104t.f34442b;
        if (!this.f33227b) {
            this.f33226a.getLogger().mo21407k(EnumC6069n1.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return c6104t;
        }
        try {
            C6104t c6104tM21482h = this.f33228c.m21835x().f33432b.m21482h(c6042c, c6193y);
            return c6104tM21482h != null ? c6104tM21482h : c6104t;
        } catch (Throwable th) {
            this.f33226a.getLogger().mo21406d(EnumC6069n1.ERROR, "Error while capturing envelope.", th);
            return c6104t;
        }
    }

    @Override // io.sentry.InterfaceC5775J
    /* renamed from: z */
    public final C6104t mo21380z(C5765F1 c5765f1, C6193y c6193y) {
        C6104t c6104t = C6104t.f34442b;
        if (!this.f33227b) {
            this.f33226a.getLogger().mo21407k(EnumC6069n1.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
            return c6104t;
        }
        try {
            C5812V1 c5812v1M21835x = this.f33228c.m21835x();
            return c5812v1M21835x.f33432b.m21484j(c5765f1, c5812v1M21835x.f33433c, c6193y);
        } catch (Throwable th) {
            this.f33226a.getLogger().mo21406d(EnumC6069n1.ERROR, "Error while capturing replay", th);
            return c6104t;
        }
    }

    @Override // io.sentry.InterfaceC5775J
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final InterfaceC5775J m26686clone() {
        if (!this.f33227b) {
            this.f33226a.getLogger().mo21407k(EnumC6069n1.WARNING, "Disabled Hub cloned.", new Object[0]);
        }
        C5759D1 c5759d1 = this.f33226a;
        C6059l1 c6059l1 = this.f33228c;
        C6059l1 c6059l12 = new C6059l1((ILogger) c6059l1.f34227b, new C5812V1((C5812V1) ((LinkedBlockingDeque) c6059l1.f34226a).getLast()));
        Iterator itDescendingIterator = ((LinkedBlockingDeque) c6059l1.f34226a).descendingIterator();
        if (itDescendingIterator.hasNext()) {
            itDescendingIterator.next();
        }
        while (itDescendingIterator.hasNext()) {
            ((LinkedBlockingDeque) c6059l12.f34226a).push(new C5812V1((C5812V1) itDescendingIterator.next()));
        }
        return new C5757D(c5759d1, c6059l12);
    }
}
