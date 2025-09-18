package io.sentry;

import defpackage.O91;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.sentry.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5143m implements b2 {
    public final ArrayList d;
    public final ArrayList e;
    public final boolean f;
    public final SentryAndroidOptions g;
    public final Object a = new Object();
    public volatile Timer b = null;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final AtomicBoolean h = new AtomicBoolean(false);
    public long i = 0;

    public C5143m(SentryAndroidOptions sentryAndroidOptions) {
        boolean z = false;
        io.sentry.config.a.D(sentryAndroidOptions, "The options object is required.");
        this.g = sentryAndroidOptions;
        this.d = new ArrayList();
        this.e = new ArrayList();
        for (M m : sentryAndroidOptions.getPerformanceCollectors()) {
            if (m instanceof O) {
                this.d.add((O) m);
            }
            if (m instanceof N) {
                this.e.add((N) m);
            }
        }
        if (this.d.isEmpty() && this.e.isEmpty()) {
            z = true;
        }
        this.f = z;
    }

    @Override // io.sentry.b2
    public final void b(P1 p1) throws Throwable {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.e0) ((N) it.next())).f(p1);
        }
    }

    @Override // io.sentry.b2
    public final void close() {
        this.g.getLogger().k(EnumC5148n1.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.c.clear();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.e0) ((N) it.next())).e();
        }
        if (this.h.getAndSet(false)) {
            synchronized (this.a) {
                try {
                    if (this.b != null) {
                        this.b.cancel();
                        this.b = null;
                    }
                } finally {
                }
            }
        }
    }

    @Override // io.sentry.b2
    public final void f(P1 p1) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.e0) ((N) it.next())).g(p1);
        }
    }

    @Override // io.sentry.b2
    public final void g(M1 m1) {
        if (this.f) {
            this.g.getLogger().k(EnumC5148n1.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.e0) ((N) it.next())).g(m1);
        }
        if (!this.c.containsKey(m1.a.toString())) {
            this.c.put(m1.a.toString(), new ArrayList());
            try {
                this.g.getExecutorService().t(new O91(this, 19, m1), 30000L);
            } catch (RejectedExecutionException e) {
                this.g.getLogger().d(EnumC5148n1.ERROR, "Failed to call the executor. Performance collector will not be automatically finished. Did you call Sentry.close()?", e);
            }
        }
        if (this.h.getAndSet(true)) {
            return;
        }
        synchronized (this.a) {
            try {
                if (this.b == null) {
                    this.b = new Timer(true);
                }
                this.b.schedule(new C5140l(this, 0), 0L);
                this.b.scheduleAtFixedRate(new C5140l(this, 1), 100L, 100L);
            } finally {
            }
        }
    }

    @Override // io.sentry.b2
    public final List j(U u) {
        this.g.getLogger().k(EnumC5148n1.DEBUG, "stop collecting performance info for transactions %s (%s)", u.getName(), u.n().a.toString());
        ConcurrentHashMap concurrentHashMap = this.c;
        List list = (List) concurrentHashMap.remove(u.k().toString());
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.e0) ((N) it.next())).f(u);
        }
        if (concurrentHashMap.isEmpty()) {
            close();
        }
        return list;
    }
}
