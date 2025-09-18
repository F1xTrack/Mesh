package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class A10 implements ThreadFactory {

    /* renamed from: a */
    public final ThreadFactoryC7050w2 f13a;

    /* renamed from: b */
    public final String f14b;

    /* renamed from: c */
    public final NV1 f15c;

    /* renamed from: d */
    public final boolean f16d;

    /* renamed from: e */
    public final AtomicInteger f17e;

    public A10(ThreadFactoryC7050w2 threadFactoryC7050w2, String str, boolean z) {
        NV1 nv1 = NV1.f7838d;
        this.f17e = new AtomicInteger();
        this.f13a = threadFactoryC7050w2;
        this.f14b = str;
        this.f15c = nv1;
        this.f16d = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        RunnableC1420WZ runnableC1420WZ = new RunnableC1420WZ(this, runnable, false, 8);
        this.f13a.getClass();
        C6805s9 c6805s9 = new C6805s9(runnableC1420WZ);
        c6805s9.setName("glide-" + this.f14b + "-thread-" + this.f17e.getAndIncrement());
        return c6805s9;
    }
}
