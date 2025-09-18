package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: vm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC11459vm0 implements ThreadFactory {

    /* renamed from: d */
    public static final AtomicInteger f44521d = new AtomicInteger(1);

    /* renamed from: a */
    public final ThreadGroup f44522a;

    /* renamed from: b */
    public final AtomicInteger f44523b = new AtomicInteger(1);

    /* renamed from: c */
    public final String f44524c;

    public ThreadFactoryC11459vm0() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f44522a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f44524c = "lottie-" + f44521d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f44522a, runnable, this.f44524c + this.f44523b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
