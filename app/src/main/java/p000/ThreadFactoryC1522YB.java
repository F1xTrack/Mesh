package p000;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: YB */
/* loaded from: classes.dex */
public final class ThreadFactoryC1522YB implements ThreadFactory {

    /* renamed from: e */
    public static final ThreadFactory f14192e = Executors.defaultThreadFactory();

    /* renamed from: a */
    public final AtomicLong f14193a = new AtomicLong();

    /* renamed from: b */
    public final String f14194b;

    /* renamed from: c */
    public final int f14195c;

    /* renamed from: d */
    public final StrictMode.ThreadPolicy f14196d;

    public ThreadFactoryC1522YB(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f14194b = str;
        this.f14195c = i;
        this.f14196d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f14192e.newThread(new RunnableC3973eA(this, 3, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f14194b + " Thread #" + this.f14193a.getAndIncrement());
        return threadNewThread;
    }
}
