package io.sentry;

import io.sentry.android.core.C5864e0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.config.AbstractC6003a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.O91;

/* renamed from: io.sentry.m */
/* loaded from: classes2.dex */
public final class C6060m implements InterfaceC5982b2 {

    /* renamed from: d */
    public final ArrayList f34231d;

    /* renamed from: e */
    public final ArrayList f34232e;

    /* renamed from: f */
    public final boolean f34233f;

    /* renamed from: g */
    public final SentryAndroidOptions f34234g;

    /* renamed from: a */
    public final Object f34228a = new Object();

    /* renamed from: b */
    public volatile Timer f34229b = null;

    /* renamed from: c */
    public final ConcurrentHashMap f34230c = new ConcurrentHashMap();

    /* renamed from: h */
    public final AtomicBoolean f34235h = new AtomicBoolean(false);

    /* renamed from: i */
    public long f34236i = 0;

    public C6060m(SentryAndroidOptions sentryAndroidOptions) {
        boolean z = false;
        AbstractC6003a.m21735D(sentryAndroidOptions, "The options object is required.");
        this.f34234g = sentryAndroidOptions;
        this.f34231d = new ArrayList();
        this.f34232e = new ArrayList();
        for (InterfaceC5784M interfaceC5784M : sentryAndroidOptions.getPerformanceCollectors()) {
            if (interfaceC5784M instanceof InterfaceC5790O) {
                this.f34231d.add((InterfaceC5790O) interfaceC5784M);
            }
            if (interfaceC5784M instanceof InterfaceC5787N) {
                this.f34232e.add((InterfaceC5787N) interfaceC5784M);
            }
        }
        if (this.f34231d.isEmpty() && this.f34232e.isEmpty()) {
            z = true;
        }
        this.f34233f = z;
    }

    @Override // io.sentry.InterfaceC5982b2
    /* renamed from: b */
    public final void mo21694b(C5795P1 c5795p1) throws Throwable {
        Iterator it = this.f34232e.iterator();
        while (it.hasNext()) {
            ((C5864e0) ((InterfaceC5787N) it.next())).m21566f(c5795p1);
        }
    }

    @Override // io.sentry.InterfaceC5982b2
    public final void close() {
        this.f34234g.getLogger().mo21407k(EnumC6069n1.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.f34230c.clear();
        Iterator it = this.f34232e.iterator();
        while (it.hasNext()) {
            ((C5864e0) ((InterfaceC5787N) it.next())).m21565e();
        }
        if (this.f34235h.getAndSet(false)) {
            synchronized (this.f34228a) {
                try {
                    if (this.f34229b != null) {
                        this.f34229b.cancel();
                        this.f34229b = null;
                    }
                } finally {
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC5982b2
    /* renamed from: f */
    public final void mo21695f(C5795P1 c5795p1) {
        Iterator it = this.f34232e.iterator();
        while (it.hasNext()) {
            ((C5864e0) ((InterfaceC5787N) it.next())).m21567g(c5795p1);
        }
    }

    @Override // io.sentry.InterfaceC5982b2
    /* renamed from: g */
    public final void mo21696g(C5786M1 c5786m1) {
        if (this.f34233f) {
            this.f34234g.getLogger().mo21407k(EnumC6069n1.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.f34232e.iterator();
        while (it.hasNext()) {
            ((C5864e0) ((InterfaceC5787N) it.next())).m21567g(c5786m1);
        }
        if (!this.f34230c.containsKey(c5786m1.f33326a.toString())) {
            this.f34230c.put(c5786m1.f33326a.toString(), new ArrayList());
            try {
                this.f34234g.getExecutorService().mo13827t(new O91(this, 19, c5786m1), 30000L);
            } catch (RejectedExecutionException e) {
                this.f34234g.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to call the executor. Performance collector will not be automatically finished. Did you call Sentry.close()?", e);
            }
        }
        if (this.f34235h.getAndSet(true)) {
            return;
        }
        synchronized (this.f34228a) {
            try {
                if (this.f34229b == null) {
                    this.f34229b = new Timer(true);
                }
                this.f34229b.schedule(new C6057l(this, 0), 0L);
                this.f34229b.scheduleAtFixedRate(new C6057l(this, 1), 100L, 100L);
            } finally {
            }
        }
    }

    @Override // io.sentry.InterfaceC5982b2
    /* renamed from: j */
    public final List mo21697j(InterfaceC5807U interfaceC5807U) {
        this.f34234g.getLogger().mo21407k(EnumC6069n1.DEBUG, "stop collecting performance info for transactions %s (%s)", interfaceC5807U.getName(), interfaceC5807U.mo21432n().f33379a.toString());
        ConcurrentHashMap concurrentHashMap = this.f34230c;
        List list = (List) concurrentHashMap.remove(interfaceC5807U.mo21429k().toString());
        Iterator it = this.f34232e.iterator();
        while (it.hasNext()) {
            ((C5864e0) ((InterfaceC5787N) it.next())).m21566f(interfaceC5807U);
        }
        if (concurrentHashMap.isEmpty()) {
            close();
        }
        return list;
    }
}
