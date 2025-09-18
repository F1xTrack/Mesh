package io.sentry.transport;

import io.sentry.C5759D1;
import io.sentry.EnumC6051j;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.C5941o;
import java.io.Closeable;
import java.util.Date;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.C0601JX;

/* renamed from: io.sentry.transport.m */
/* loaded from: classes2.dex */
public final class C6161m implements Closeable {

    /* renamed from: a */
    public final C6152d f34649a;

    /* renamed from: b */
    public final C5759D1 f34650b;

    /* renamed from: c */
    public final ConcurrentHashMap f34651c;

    /* renamed from: d */
    public final CopyOnWriteArrayList f34652d;

    /* renamed from: e */
    public Timer f34653e;

    /* renamed from: f */
    public final Object f34654f;

    public C6161m(C5759D1 c5759d1) {
        C6152d c6152d = C6152d.f34633a;
        this.f34651c = new ConcurrentHashMap();
        this.f34652d = new CopyOnWriteArrayList();
        this.f34653e = null;
        this.f34654f = new Object();
        this.f34649a = c6152d;
        this.f34650b = c5759d1;
    }

    /* renamed from: a */
    public final void m21872a(EnumC6051j enumC6051j, Date date) {
        Date date2 = (Date) this.f34651c.get(enumC6051j);
        if (date2 == null || date.after(date2)) {
            this.f34651c.put(enumC6051j, date);
            m21874m();
            synchronized (this.f34654f) {
                try {
                    if (this.f34653e == null) {
                        this.f34653e = new Timer(true);
                    }
                    this.f34653e.schedule(new C0601JX(1, this), date);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean m21873c(EnumC6051j enumC6051j) {
        Date date;
        this.f34649a.getClass();
        Date date2 = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = this.f34651c;
        Date date3 = (Date) concurrentHashMap.get(EnumC6051j.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (EnumC6051j.Unknown.equals(enumC6051j) || (date = (Date) concurrentHashMap.get(enumC6051j)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f34654f) {
            try {
                Timer timer = this.f34653e;
                if (timer != null) {
                    timer.cancel();
                    this.f34653e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f34652d.clear();
    }

    /* renamed from: m */
    public final void m21874m() {
        Iterator it = this.f34652d.iterator();
        while (it.hasNext()) {
            ReplayIntegration replayIntegration = (ReplayIntegration) it.next();
            replayIntegration.getClass();
            if (replayIntegration.f33889l instanceof C5941o) {
                if (m21873c(EnumC6051j.All) || m21873c(EnumC6051j.Replay)) {
                    replayIntegration.pause();
                } else {
                    replayIntegration.resume();
                }
            }
        }
    }
}
