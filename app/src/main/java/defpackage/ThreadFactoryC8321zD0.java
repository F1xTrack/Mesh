package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC8321zD0 implements ThreadFactory {
    public final String a;
    public final AtomicInteger b = new AtomicInteger(1);

    public ThreadFactoryC8321zD0(String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        O90.f(runnable, "runnable");
        return new Thread(new RQ(this, 25, runnable), this.a + "-" + this.b.getAndIncrement());
    }
}
