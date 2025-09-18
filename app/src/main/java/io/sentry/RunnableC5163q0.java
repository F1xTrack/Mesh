package io.sentry;

import defpackage.CallableC0437Fj;
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

/* renamed from: io.sentry.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC5163q0 implements K, Runnable, Closeable {
    public final ILogger a;
    public final Y0 b;
    public final InterfaceC5112b1 c;
    public volatile C5177v0 d;
    public volatile boolean e;
    public final ConcurrentSkipListMap f;
    public final AtomicInteger g;
    public final int h;

    static {
        Charset.forName("UTF-8");
    }

    public RunnableC5163q0(D1 d1, Y0 y0) {
        ILogger logger = d1.getLogger();
        InterfaceC5112b1 dateProvider = d1.getDateProvider();
        d1.getBeforeEmitMetricCallback();
        C5177v0 c5177v0 = C5177v0.d;
        this.e = false;
        this.f = new ConcurrentSkipListMap();
        this.g = new AtomicInteger();
        this.b = y0;
        this.a = logger;
        this.c = dateProvider;
        this.h = 100000;
        this.d = c5177v0;
    }

    public final void a(boolean z) {
        Set<Long> setKeySet;
        if (!z) {
            if (this.g.get() + this.f.size() >= this.h) {
                this.a.k(EnumC5148n1.INFO, "Metrics: total weight exceeded, flushing all buckets", new Object[0]);
                z = true;
            }
        }
        ConcurrentSkipListMap concurrentSkipListMap = this.f;
        if (z) {
            setKeySet = concurrentSkipListMap.keySet();
        } else {
            long millis = (TimeUnit.NANOSECONDS.toMillis(this.c.now().d()) - 10000) - io.sentry.metrics.c.a;
            long j = ((millis / 1000) / 10) * 10;
            if (millis < 0) {
                j--;
            }
            setKeySet = concurrentSkipListMap.headMap((Object) Long.valueOf(j), true).keySet();
        }
        if (setKeySet.isEmpty()) {
            this.a.k(EnumC5148n1.DEBUG, "Metrics: nothing to flush", new Object[0]);
            return;
        }
        this.a.k(EnumC5148n1.DEBUG, "Metrics: flushing " + setKeySet.size() + " buckets", new Object[0]);
        HashMap map = new HashMap();
        int size = 0;
        for (Long l : setKeySet) {
            l.getClass();
            Map map2 = (Map) this.f.remove(l);
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
                        this.g.addAndGet(0);
                        size += map2.size();
                        map.put(l, map2);
                    } finally {
                    }
                }
            }
        }
        if (size == 0) {
            this.a.k(EnumC5148n1.DEBUG, "Metrics: only empty buckets found", new Object[0]);
            return;
        }
        this.a.k(EnumC5148n1.DEBUG, "Metrics: capturing metrics", new Object[0]);
        Y0 y0 = this.b;
        io.sentry.metrics.a aVar = new io.sentry.metrics.a(map);
        y0.getClass();
        Charset charset = C5127g1.d;
        C5142l1 c5142l1 = new C5142l1(new CallableC0437Fj(11, aVar));
        y0.h(new io.sentry.internal.debugmeta.c(new C5115c1(new io.sentry.protocol.t((UUID) null), ((D1) y0.a).getSdkVersion(), null), Collections.singleton(new C5127g1(new C5130h1(EnumC5145m1.Statsd, new CallableC5118d1(c5142l1, 10), "application/octet-stream", (String) null, (String) null), new CallableC5118d1(c5142l1, 11)))), null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.e = true;
            this.d.getClass();
        }
        a(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a(false);
        synchronized (this) {
            try {
                if (!this.e && !this.f.isEmpty()) {
                    this.d.t(this, 5000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
