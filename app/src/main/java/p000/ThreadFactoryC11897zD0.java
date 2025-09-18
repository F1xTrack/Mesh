package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC11897zD0 implements ThreadFactory {

    /* renamed from: a */
    public final String f46728a;

    /* renamed from: b */
    public final AtomicInteger f46729b = new AtomicInteger(1);

    public ThreadFactoryC11897zD0(String str) {
        this.f46728a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        O90.m5968f(runnable, "runnable");
        return new Thread(new RunnableC1096RQ(this, 25, runnable), this.f46728a + "-" + this.f46729b.getAndIncrement());
    }
}
