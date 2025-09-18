package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class A10 implements ThreadFactory {
    public final ThreadFactoryC7716w2 a;
    public final String b;
    public final NV1 c;
    public final boolean d;
    public final AtomicInteger e;

    public A10(ThreadFactoryC7716w2 threadFactoryC7716w2, String str, boolean z) {
        NV1 nv1 = NV1.d;
        this.e = new AtomicInteger();
        this.a = threadFactoryC7716w2;
        this.b = str;
        this.c = nv1;
        this.d = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        WZ wz = new WZ(this, runnable, false, 8);
        this.a.getClass();
        C6975s9 c6975s9 = new C6975s9(wz);
        c6975s9.setName("glide-" + this.b + "-thread-" + this.e.getAndIncrement());
        return c6975s9;
    }
}
