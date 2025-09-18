package io.sentry.transport;

import defpackage.JX;
import io.sentry.D1;
import io.sentry.EnumC5134j;
import io.sentry.android.replay.ReplayIntegration;
import java.io.Closeable;
import java.util.Date;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class m implements Closeable {
    public final d a;
    public final D1 b;
    public final ConcurrentHashMap c;
    public final CopyOnWriteArrayList d;
    public Timer e;
    public final Object f;

    public m(D1 d1) {
        d dVar = d.a;
        this.c = new ConcurrentHashMap();
        this.d = new CopyOnWriteArrayList();
        this.e = null;
        this.f = new Object();
        this.a = dVar;
        this.b = d1;
    }

    public final void a(EnumC5134j enumC5134j, Date date) {
        Date date2 = (Date) this.c.get(enumC5134j);
        if (date2 == null || date.after(date2)) {
            this.c.put(enumC5134j, date);
            m();
            synchronized (this.f) {
                try {
                    if (this.e == null) {
                        this.e = new Timer(true);
                    }
                    this.e.schedule(new JX(1, this), date);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean c(EnumC5134j enumC5134j) {
        Date date;
        this.a.getClass();
        Date date2 = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = this.c;
        Date date3 = (Date) concurrentHashMap.get(EnumC5134j.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (EnumC5134j.Unknown.equals(enumC5134j) || (date = (Date) concurrentHashMap.get(enumC5134j)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f) {
            try {
                Timer timer = this.e;
                if (timer != null) {
                    timer.cancel();
                    this.e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d.clear();
    }

    public final void m() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ReplayIntegration replayIntegration = (ReplayIntegration) it.next();
            replayIntegration.getClass();
            if (replayIntegration.l instanceof io.sentry.android.replay.capture.o) {
                if (c(EnumC5134j.All) || c(EnumC5134j.Replay)) {
                    replayIntegration.pause();
                } else {
                    replayIntegration.resume();
                }
            }
        }
    }
}
