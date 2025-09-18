package io.sentry;

import io.sentry.internal.debugmeta.C6042c;
import io.sentry.metrics.AbstractC6065c;
import io.sentry.metrics.C6063a;
import io.sentry.protocol.C6104t;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p000.CallableC0361Fj;

/* renamed from: io.sentry.q0 */
/* loaded from: classes2.dex */
public final class RunnableC6112q0 implements InterfaceC5778K, Runnable, Closeable {

    /* renamed from: a */
    public final ILogger f34498a;

    /* renamed from: b */
    public final C5820Y0 f34499b;

    /* renamed from: c */
    public final InterfaceC5981b1 f34500c;

    /* renamed from: d */
    public volatile C6180v0 f34501d;

    /* renamed from: e */
    public volatile boolean f34502e;

    /* renamed from: f */
    public final ConcurrentSkipListMap f34503f;

    /* renamed from: g */
    public final AtomicInteger f34504g;

    /* renamed from: h */
    public final int f34505h;

    static {
        Charset.forName("UTF-8");
    }

    public RunnableC6112q0(C5759D1 c5759d1, C5820Y0 c5820y0) {
        ILogger logger = c5759d1.getLogger();
        InterfaceC5981b1 dateProvider = c5759d1.getDateProvider();
        c5759d1.getBeforeEmitMetricCallback();
        C6180v0 c6180v0 = C6180v0.f34674d;
        this.f34502e = false;
        this.f34503f = new ConcurrentSkipListMap();
        this.f34504g = new AtomicInteger();
        this.f34499b = c5820y0;
        this.f34498a = logger;
        this.f34500c = dateProvider;
        this.f34505h = 100000;
        this.f34501d = c6180v0;
    }

    /* renamed from: a */
    public final void m21853a(boolean z) {
        Set<Long> setKeySet;
        if (!z) {
            if (this.f34504g.get() + this.f34503f.size() >= this.f34505h) {
                this.f34498a.mo21407k(EnumC6069n1.INFO, "Metrics: total weight exceeded, flushing all buckets", new Object[0]);
                z = true;
            }
        }
        ConcurrentSkipListMap concurrentSkipListMap = this.f34503f;
        if (z) {
            setKeySet = concurrentSkipListMap.keySet();
        } else {
            long millis = (TimeUnit.NANOSECONDS.toMillis(this.f34500c.now().mo21497d()) - 10000) - AbstractC6065c.f34243a;
            long j = ((millis / 1000) / 10) * 10;
            if (millis < 0) {
                j--;
            }
            setKeySet = concurrentSkipListMap.headMap((Object) Long.valueOf(j), true).keySet();
        }
        if (setKeySet.isEmpty()) {
            this.f34498a.mo21407k(EnumC6069n1.DEBUG, "Metrics: nothing to flush", new Object[0]);
            return;
        }
        this.f34498a.mo21407k(EnumC6069n1.DEBUG, "Metrics: flushing " + setKeySet.size() + " buckets", new Object[0]);
        HashMap map = new HashMap();
        int size = 0;
        for (Long l : setKeySet) {
            l.getClass();
            Map map2 = (Map) this.f34503f.remove(l);
            if (map2 != null) {
                synchronized (map2) {
                    try {
                        Iterator it = map2.values().iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                        this.f34504g.addAndGet(0);
                        size += map2.size();
                        map.put(l, map2);
                    } finally {
                    }
                }
            }
        }
        if (size == 0) {
            this.f34498a.mo21407k(EnumC6069n1.DEBUG, "Metrics: only empty buckets found", new Object[0]);
            return;
        }
        this.f34498a.mo21407k(EnumC6069n1.DEBUG, "Metrics: capturing metrics", new Object[0]);
        C5820Y0 c5820y0 = this.f34499b;
        C6063a c6063a = new C6063a(map);
        c5820y0.getClass();
        Charset charset = C6022g1.f34163d;
        C6059l1 c6059l1 = new C6059l1(new CallableC0361Fj(11, c6063a));
        c5820y0.m21482h(new C6042c(new C5987c1(new C6104t((UUID) null), ((C5759D1) c5820y0.f33441a).getSdkVersion(), null), Collections.singleton(new C6022g1(new C6025h1(EnumC6062m1.Statsd, new CallableC6010d1(c6059l1, 10), "application/octet-stream", (String) null, (String) null), new CallableC6010d1(c6059l1, 11)))), null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f34502e = true;
            this.f34501d.getClass();
        }
        m21853a(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        m21853a(false);
        synchronized (this) {
            try {
                if (!this.f34502e && !this.f34503f.isEmpty()) {
                    this.f34501d.mo13827t(this, 5000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
