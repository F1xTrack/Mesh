package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p000.N61;

/* renamed from: io.appmetrica.analytics.impl.e */
/* loaded from: classes2.dex */
public final class C5083e {

    /* renamed from: g */
    public static final long f31505g = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: h */
    public static final String f31506h = "WatchDog-" + ThreadFactoryC5047cd.f31411a.incrementAndGet();

    /* renamed from: a */
    public final CopyOnWriteArrayList f31507a;

    /* renamed from: b */
    public final AtomicInteger f31508b;

    /* renamed from: c */
    public final Handler f31509c;

    /* renamed from: d */
    public C5058d f31510d;

    /* renamed from: e */
    public final AtomicBoolean f31511e;

    /* renamed from: f */
    public final Runnable f31512f;

    public C5083e(C5570xb c5570xb) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f31507a = copyOnWriteArrayList;
        this.f31508b = new AtomicInteger();
        this.f31509c = new Handler(Looper.getMainLooper());
        this.f31511e = new AtomicBoolean();
        this.f31512f = new N61(14, this);
        copyOnWriteArrayList.add(c5570xb);
    }

    /* renamed from: a */
    public final /* synthetic */ void m20298a() {
        this.f31511e.set(true);
    }

    /* renamed from: b */
    public final synchronized void m20300b() {
        C5058d c5058d = this.f31510d;
        if (c5058d != null) {
            c5058d.f31453a.set(false);
            this.f31510d = null;
            PublicLogger.getAnonymousInstance().info("Stop ANR monitoring", new Object[0]);
        }
    }

    /* renamed from: a */
    public final synchronized void m20299a(int i) {
        AtomicInteger atomicInteger = this.f31508b;
        int i2 = 5;
        if (i >= 5) {
            i2 = i;
        }
        atomicInteger.set(i2);
        if (this.f31510d == null) {
            C5058d c5058d = new C5058d(this);
            this.f31510d = c5058d;
            try {
                c5058d.setName(f31506h);
            } catch (SecurityException unused) {
            }
            this.f31510d.start();
            PublicLogger.getAnonymousInstance().info("Start ANR monitoring with timeout: %s seconds", Integer.valueOf(i));
        }
    }
}
