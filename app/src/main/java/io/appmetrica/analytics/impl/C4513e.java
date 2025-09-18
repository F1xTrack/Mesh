package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import defpackage.N61;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.appmetrica.analytics.impl.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4513e {
    public static final long g = TimeUnit.SECONDS.toMillis(1);
    public static final String h = "WatchDog-" + ThreadFactoryC4477cd.a.incrementAndGet();
    public final CopyOnWriteArrayList a;
    public final AtomicInteger b;
    public final Handler c;
    public C4488d d;
    public final AtomicBoolean e;
    public final Runnable f;

    public C4513e(C4979xb c4979xb) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.a = copyOnWriteArrayList;
        this.b = new AtomicInteger();
        this.c = new Handler(Looper.getMainLooper());
        this.e = new AtomicBoolean();
        this.f = new N61(14, this);
        copyOnWriteArrayList.add(c4979xb);
    }

    public final /* synthetic */ void a() {
        this.e.set(true);
    }

    public final synchronized void b() {
        C4488d c4488d = this.d;
        if (c4488d != null) {
            c4488d.a.set(false);
            this.d = null;
            PublicLogger.getAnonymousInstance().info("Stop ANR monitoring", new Object[0]);
        }
    }

    public final synchronized void a(int i) {
        AtomicInteger atomicInteger = this.b;
        int i2 = 5;
        if (i >= 5) {
            i2 = i;
        }
        atomicInteger.set(i2);
        if (this.d == null) {
            C4488d c4488d = new C4488d(this);
            this.d = c4488d;
            try {
                c4488d.setName(h);
            } catch (SecurityException unused) {
            }
            this.d.start();
            PublicLogger.getAnonymousInstance().info("Start ANR monitoring with timeout: %s seconds", Integer.valueOf(i));
        }
    }
}
