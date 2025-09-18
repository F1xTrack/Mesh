package io.sentry.transport;

import io.sentry.A;
import io.sentry.AbstractC5083a1;
import io.sentry.C5115c1;
import io.sentry.C5127g1;
import io.sentry.C5146n;
import io.sentry.C5185y;
import io.sentry.D1;
import io.sentry.EnumC5134j;
import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5112b1;
import io.sentry.c2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class c implements f {
    public final l a;
    public final io.sentry.cache.d b;
    public final D1 c;
    public final m d;
    public final g e;
    public final e f;
    public volatile b g;

    /* JADX WARN: Type inference failed for: r3v0, types: [io.sentry.transport.a] */
    public c(D1 d1, m mVar, g gVar, io.sentry.internal.debugmeta.c cVar) {
        int maxQueueSize = d1.getMaxQueueSize();
        final io.sentry.cache.d envelopeDiskCache = d1.getEnvelopeDiskCache();
        final ILogger logger = d1.getLogger();
        InterfaceC5112b1 dateProvider = d1.getDateProvider();
        l lVar = new l(maxQueueSize, new A(5), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                if (runnable instanceof b) {
                    b bVar = (b) runnable;
                    boolean zV = io.sentry.config.a.v(bVar.b, io.sentry.hints.d.class);
                    C5185y c5185y = bVar.b;
                    if (!zV) {
                        envelopeDiskCache.j(bVar.a, c5185y);
                    }
                    Object objR = io.sentry.config.a.r(c5185y);
                    if (io.sentry.hints.j.class.isInstance(io.sentry.config.a.r(c5185y)) && objR != null) {
                        ((io.sentry.hints.j) objR).b(false);
                    }
                    Object objR2 = io.sentry.config.a.r(c5185y);
                    if (io.sentry.hints.g.class.isInstance(io.sentry.config.a.r(c5185y)) && objR2 != null) {
                        ((io.sentry.hints.g) objR2).c(true);
                    }
                    logger.k(EnumC5148n1.WARNING, "Envelope rejected", new Object[0]);
                }
            }
        }, logger, dateProvider);
        e eVar = new e(d1, cVar, mVar);
        this.g = null;
        this.a = lVar;
        io.sentry.cache.d envelopeDiskCache2 = d1.getEnvelopeDiskCache();
        io.sentry.config.a.D(envelopeDiskCache2, "envelopeCache is required");
        this.b = envelopeDiskCache2;
        this.c = d1;
        this.d = mVar;
        io.sentry.config.a.D(gVar, "transportGate is required");
        this.e = gVar;
        this.f = eVar;
    }

    @Override // io.sentry.transport.f
    public final void T(io.sentry.internal.debugmeta.c cVar, C5185y c5185y) {
        boolean z;
        io.sentry.cache.d dVar;
        io.sentry.internal.debugmeta.c cVarK;
        EnumC5134j enumC5134j;
        boolean zIsInstance = io.sentry.hints.d.class.isInstance(io.sentry.config.a.r(c5185y));
        D1 d1 = this.c;
        io.sentry.cache.d dVar2 = this.b;
        if (zIsInstance) {
            dVar = h.a;
            d1.getLogger().k(EnumC5148n1.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z = true;
        } else {
            z = false;
            dVar = dVar2;
        }
        m mVar = this.d;
        mVar.getClass();
        Collection<C5127g1> collection = (Collection) cVar.c;
        Iterator it = collection.iterator();
        ArrayList arrayList = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            D1 d12 = mVar.b;
            if (!zHasNext) {
                if (arrayList != null) {
                    d12.getLogger().k(EnumC5148n1.INFO, "%d items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
                    ArrayList arrayList2 = new ArrayList();
                    for (C5127g1 c5127g1 : collection) {
                        if (!arrayList.contains(c5127g1)) {
                            arrayList2.add(c5127g1);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        d12.getLogger().k(EnumC5148n1.INFO, "Envelope discarded due all items rate limited.", new Object[0]);
                        Object objR = io.sentry.config.a.r(c5185y);
                        if (io.sentry.hints.j.class.isInstance(io.sentry.config.a.r(c5185y)) && objR != null) {
                            ((io.sentry.hints.j) objR).b(false);
                        }
                        Object objR2 = io.sentry.config.a.r(c5185y);
                        if (io.sentry.hints.g.class.isInstance(io.sentry.config.a.r(c5185y)) && objR2 != null) {
                            ((io.sentry.hints.g) objR2).c(false);
                        }
                        cVarK = null;
                    } else {
                        cVarK = new io.sentry.internal.debugmeta.c((C5115c1) cVar.b, arrayList2);
                    }
                } else {
                    cVarK = cVar;
                }
                if (cVarK == null) {
                    if (z) {
                        dVar2.h0(cVar);
                        return;
                    }
                    return;
                }
                if (c2.class.isInstance(io.sentry.config.a.r(c5185y))) {
                    cVarK = d1.getClientReportRecorder().k(cVarK);
                }
                Future futureSubmit = this.a.submit(new b(this, cVarK, c5185y, dVar));
                if (futureSubmit != null && futureSubmit.isCancelled()) {
                    d1.getClientReportRecorder().e(io.sentry.clientreport.d.QUEUE_OVERFLOW, cVarK);
                    return;
                }
                Object objR3 = io.sentry.config.a.r(c5185y);
                if (!C5146n.class.isInstance(io.sentry.config.a.r(c5185y)) || objR3 == null) {
                    return;
                }
                C5146n c5146n = (C5146n) objR3;
                c5146n.g.add(c5146n.f);
                d1.getLogger().k(EnumC5148n1.DEBUG, "Envelope enqueued", new Object[0]);
                return;
            }
            C5127g1 c5127g12 = (C5127g1) it.next();
            String itemType = c5127g12.a.c.getItemType();
            itemType.getClass();
            switch (itemType) {
                case "attachment":
                    enumC5134j = EnumC5134j.Attachment;
                    break;
                case "replay_video":
                    enumC5134j = EnumC5134j.Replay;
                    break;
                case "statsd":
                    enumC5134j = EnumC5134j.MetricBucket;
                    break;
                case "profile":
                    enumC5134j = EnumC5134j.Profile;
                    break;
                case "event":
                    enumC5134j = EnumC5134j.Error;
                    break;
                case "check_in":
                    enumC5134j = EnumC5134j.Monitor;
                    break;
                case "session":
                    enumC5134j = EnumC5134j.Session;
                    break;
                case "transaction":
                    enumC5134j = EnumC5134j.Transaction;
                    break;
                default:
                    enumC5134j = EnumC5134j.Unknown;
                    break;
            }
            if (mVar.c(enumC5134j)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c5127g12);
                d12.getClientReportRecorder().i(io.sentry.clientreport.d.RATELIMIT_BACKOFF, c5127g12);
            }
        }
    }

    @Override // io.sentry.transport.f
    public final void b(boolean z) {
        long flushTimeoutMillis;
        this.d.close();
        this.a.shutdown();
        this.c.getLogger().k(EnumC5148n1.DEBUG, "Shutting down", new Object[0]);
        if (z) {
            flushTimeoutMillis = 0;
        } else {
            try {
                flushTimeoutMillis = this.c.getFlushTimeoutMillis();
            } catch (InterruptedException unused) {
                this.c.getLogger().k(EnumC5148n1.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
                Thread.currentThread().interrupt();
                return;
            }
        }
        if (this.a.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
            return;
        }
        this.c.getLogger().k(EnumC5148n1.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
        this.a.shutdownNow();
        if (this.g != null) {
            this.a.getRejectedExecutionHandler().rejectedExecution(this.g, this.a);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b(false);
    }

    @Override // io.sentry.transport.f
    public final m q() {
        return this.d;
    }

    @Override // io.sentry.transport.f
    public final boolean s() {
        boolean z;
        m mVar = this.d;
        mVar.getClass();
        mVar.a.getClass();
        Date date = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = mVar.c;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Date date2 = (Date) concurrentHashMap.get((EnumC5134j) it.next());
            if (date2 != null && !date.after(date2)) {
                z = true;
                break;
            }
        }
        l lVar = this.a;
        AbstractC5083a1 abstractC5083a1 = lVar.b;
        return (z || (abstractC5083a1 != null && (lVar.d.now().b(abstractC5083a1) > 2000000000L ? 1 : (lVar.d.now().b(abstractC5083a1) == 2000000000L ? 0 : -1)) < 0)) ? false : true;
    }

    @Override // io.sentry.transport.f
    public final void t(long j) throws InterruptedException {
        l lVar = this.a;
        lVar.getClass();
        try {
            com.yandex.metrica.e eVar = lVar.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            eVar.getClass();
            ((n) eVar.a).tryAcquireSharedNanos(1, timeUnit.toNanos(j));
        } catch (InterruptedException e) {
            lVar.c.d(EnumC5148n1.ERROR, "Failed to wait till idle", e);
            Thread.currentThread().interrupt();
        }
    }
}
