package io.sentry.transport;

import com.yandex.metrica.C2460e;
import io.sentry.AbstractC5827a1;
import io.sentry.C5759D1;
import io.sentry.C5987c1;
import io.sentry.C5988c2;
import io.sentry.C6022g1;
import io.sentry.C6067n;
import io.sentry.C6193y;
import io.sentry.EnumC6051j;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5981b1;
import io.sentry.ThreadFactoryC5748A;
import io.sentry.cache.InterfaceC5992d;
import io.sentry.clientreport.EnumC6000d;
import io.sentry.config.AbstractC6003a;
import io.sentry.hints.InterfaceC6029d;
import io.sentry.hints.InterfaceC6032g;
import io.sentry.hints.InterfaceC6035j;
import io.sentry.internal.debugmeta.C6042c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.transport.c */
/* loaded from: classes2.dex */
public final class C6151c implements InterfaceC6154f {

    /* renamed from: a */
    public final C6160l f34626a;

    /* renamed from: b */
    public final InterfaceC5992d f34627b;

    /* renamed from: c */
    public final C5759D1 f34628c;

    /* renamed from: d */
    public final C6161m f34629d;

    /* renamed from: e */
    public final InterfaceC6155g f34630e;

    /* renamed from: f */
    public final C6153e f34631f;

    /* renamed from: g */
    public volatile RunnableC6150b f34632g;

    /* JADX WARN: Type inference failed for: r3v0, types: [io.sentry.transport.a] */
    public C6151c(C5759D1 c5759d1, C6161m c6161m, InterfaceC6155g interfaceC6155g, C6042c c6042c) {
        int maxQueueSize = c5759d1.getMaxQueueSize();
        final InterfaceC5992d envelopeDiskCache = c5759d1.getEnvelopeDiskCache();
        final ILogger logger = c5759d1.getLogger();
        InterfaceC5981b1 dateProvider = c5759d1.getDateProvider();
        C6160l c6160l = new C6160l(maxQueueSize, new ThreadFactoryC5748A(5), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                if (runnable instanceof RunnableC6150b) {
                    RunnableC6150b runnableC6150b = (RunnableC6150b) runnable;
                    boolean zM21762v = AbstractC6003a.m21762v(runnableC6150b.f34622b, InterfaceC6029d.class);
                    C6193y c6193y = runnableC6150b.f34622b;
                    if (!zM21762v) {
                        envelopeDiskCache.mo21556j(runnableC6150b.f34621a, c6193y);
                    }
                    Object objM21758r = AbstractC6003a.m21758r(c6193y);
                    if (InterfaceC6035j.class.isInstance(AbstractC6003a.m21758r(c6193y)) && objM21758r != null) {
                        ((InterfaceC6035j) objM21758r).mo21530b(false);
                    }
                    Object objM21758r2 = AbstractC6003a.m21758r(c6193y);
                    if (InterfaceC6032g.class.isInstance(AbstractC6003a.m21758r(c6193y)) && objM21758r2 != null) {
                        ((InterfaceC6032g) objM21758r2).mo21531c(true);
                    }
                    logger.mo21407k(EnumC6069n1.WARNING, "Envelope rejected", new Object[0]);
                }
            }
        }, logger, dateProvider);
        C6153e c6153e = new C6153e(c5759d1, c6042c, c6161m);
        this.f34632g = null;
        this.f34626a = c6160l;
        InterfaceC5992d envelopeDiskCache2 = c5759d1.getEnvelopeDiskCache();
        AbstractC6003a.m21735D(envelopeDiskCache2, "envelopeCache is required");
        this.f34627b = envelopeDiskCache2;
        this.f34628c = c5759d1;
        this.f34629d = c6161m;
        AbstractC6003a.m21735D(interfaceC6155g, "transportGate is required");
        this.f34630e = interfaceC6155g;
        this.f34631f = c6153e;
    }

    @Override // io.sentry.transport.InterfaceC6154f
    /* renamed from: T */
    public final void mo21862T(C6042c c6042c, C6193y c6193y) {
        boolean z;
        InterfaceC5992d interfaceC5992d;
        C6042c c6042cMo21731k;
        EnumC6051j enumC6051j;
        boolean zIsInstance = InterfaceC6029d.class.isInstance(AbstractC6003a.m21758r(c6193y));
        C5759D1 c5759d1 = this.f34628c;
        InterfaceC5992d interfaceC5992d2 = this.f34627b;
        if (zIsInstance) {
            interfaceC5992d = C6156h.f34640a;
            c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z = true;
        } else {
            z = false;
            interfaceC5992d = interfaceC5992d2;
        }
        C6161m c6161m = this.f34629d;
        c6161m.getClass();
        Collection<C6022g1> collection = (Collection) c6042c.f34199c;
        Iterator it = collection.iterator();
        ArrayList arrayList = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            C5759D1 c5759d12 = c6161m.f34650b;
            if (!zHasNext) {
                if (arrayList != null) {
                    c5759d12.getLogger().mo21407k(EnumC6069n1.INFO, "%d items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
                    ArrayList arrayList2 = new ArrayList();
                    for (C6022g1 c6022g1 : collection) {
                        if (!arrayList.contains(c6022g1)) {
                            arrayList2.add(c6022g1);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        c5759d12.getLogger().mo21407k(EnumC6069n1.INFO, "Envelope discarded due all items rate limited.", new Object[0]);
                        Object objM21758r = AbstractC6003a.m21758r(c6193y);
                        if (InterfaceC6035j.class.isInstance(AbstractC6003a.m21758r(c6193y)) && objM21758r != null) {
                            ((InterfaceC6035j) objM21758r).mo21530b(false);
                        }
                        Object objM21758r2 = AbstractC6003a.m21758r(c6193y);
                        if (InterfaceC6032g.class.isInstance(AbstractC6003a.m21758r(c6193y)) && objM21758r2 != null) {
                            ((InterfaceC6032g) objM21758r2).mo21531c(false);
                        }
                        c6042cMo21731k = null;
                    } else {
                        c6042cMo21731k = new C6042c((C5987c1) c6042c.f34198b, arrayList2);
                    }
                } else {
                    c6042cMo21731k = c6042c;
                }
                if (c6042cMo21731k == null) {
                    if (z) {
                        interfaceC5992d2.mo21710h0(c6042c);
                        return;
                    }
                    return;
                }
                if (C5988c2.class.isInstance(AbstractC6003a.m21758r(c6193y))) {
                    c6042cMo21731k = c5759d1.getClientReportRecorder().mo21731k(c6042cMo21731k);
                }
                Future futureSubmit = this.f34626a.submit(new RunnableC6150b(this, c6042cMo21731k, c6193y, interfaceC5992d));
                if (futureSubmit != null && futureSubmit.isCancelled()) {
                    c5759d1.getClientReportRecorder().mo21728e(EnumC6000d.QUEUE_OVERFLOW, c6042cMo21731k);
                    return;
                }
                Object objM21758r3 = AbstractC6003a.m21758r(c6193y);
                if (!C6067n.class.isInstance(AbstractC6003a.m21758r(c6193y)) || objM21758r3 == null) {
                    return;
                }
                C6067n c6067n = (C6067n) objM21758r3;
                c6067n.f34252g.add(c6067n.f34251f);
                c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Envelope enqueued", new Object[0]);
                return;
            }
            C6022g1 c6022g12 = (C6022g1) it.next();
            String itemType = c6022g12.f34164a.f34175c.getItemType();
            itemType.getClass();
            switch (itemType) {
                case "attachment":
                    enumC6051j = EnumC6051j.Attachment;
                    break;
                case "replay_video":
                    enumC6051j = EnumC6051j.Replay;
                    break;
                case "statsd":
                    enumC6051j = EnumC6051j.MetricBucket;
                    break;
                case "profile":
                    enumC6051j = EnumC6051j.Profile;
                    break;
                case "event":
                    enumC6051j = EnumC6051j.Error;
                    break;
                case "check_in":
                    enumC6051j = EnumC6051j.Monitor;
                    break;
                case "session":
                    enumC6051j = EnumC6051j.Session;
                    break;
                case "transaction":
                    enumC6051j = EnumC6051j.Transaction;
                    break;
                default:
                    enumC6051j = EnumC6051j.Unknown;
                    break;
            }
            if (c6161m.m21873c(enumC6051j)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c6022g12);
                c5759d12.getClientReportRecorder().mo21730i(EnumC6000d.RATELIMIT_BACKOFF, c6022g12);
            }
        }
    }

    @Override // io.sentry.transport.InterfaceC6154f
    /* renamed from: b */
    public final void mo21863b(boolean z) {
        long flushTimeoutMillis;
        this.f34629d.close();
        this.f34626a.shutdown();
        this.f34628c.getLogger().mo21407k(EnumC6069n1.DEBUG, "Shutting down", new Object[0]);
        if (z) {
            flushTimeoutMillis = 0;
        } else {
            try {
                flushTimeoutMillis = this.f34628c.getFlushTimeoutMillis();
            } catch (InterruptedException unused) {
                this.f34628c.getLogger().mo21407k(EnumC6069n1.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
                Thread.currentThread().interrupt();
                return;
            }
        }
        if (this.f34626a.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
            return;
        }
        this.f34628c.getLogger().mo21407k(EnumC6069n1.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
        this.f34626a.shutdownNow();
        if (this.f34632g != null) {
            this.f34626a.getRejectedExecutionHandler().rejectedExecution(this.f34632g, this.f34626a);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mo21863b(false);
    }

    @Override // io.sentry.transport.InterfaceC6154f
    /* renamed from: q */
    public final C6161m mo21864q() {
        return this.f34629d;
    }

    @Override // io.sentry.transport.InterfaceC6154f
    /* renamed from: s */
    public final boolean mo21865s() {
        boolean z;
        C6161m c6161m = this.f34629d;
        c6161m.getClass();
        c6161m.f34649a.getClass();
        Date date = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = c6161m.f34651c;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Date date2 = (Date) concurrentHashMap.get((EnumC6051j) it.next());
            if (date2 != null && !date.after(date2)) {
                z = true;
                break;
            }
        }
        C6160l c6160l = this.f34626a;
        AbstractC5827a1 abstractC5827a1 = c6160l.f34645b;
        return (z || (abstractC5827a1 != null && (c6160l.f34647d.now().mo21495b(abstractC5827a1) > 2000000000L ? 1 : (c6160l.f34647d.now().mo21495b(abstractC5827a1) == 2000000000L ? 0 : -1)) < 0)) ? false : true;
    }

    @Override // io.sentry.transport.InterfaceC6154f
    /* renamed from: t */
    public final void mo21866t(long j) throws InterruptedException {
        C6160l c6160l = this.f34626a;
        c6160l.getClass();
        try {
            C2460e c2460e = c6160l.f34648e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c2460e.getClass();
            ((C6162n) c2460e.f20786a).tryAcquireSharedNanos(1, timeUnit.toNanos(j));
        } catch (InterruptedException e) {
            c6160l.f34646c.mo21406d(EnumC6069n1.ERROR, "Failed to wait till idle", e);
            Thread.currentThread().interrupt();
        }
    }
}
