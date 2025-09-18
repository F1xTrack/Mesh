package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: yH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC8144yH1 implements ThreadFactory {
    public final /* synthetic */ int a;
    public Object b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread threadNewThread = ((ThreadFactory) this.b).newThread(runnable);
                threadNewThread.setName("ScionFrontendApi");
                return threadNewThread;
            case 1:
                return ((ThreadFactory) this.b).newThread(new RunnableC7525v2(runnable, 5));
            default:
                Thread threadNewThread2 = Executors.defaultThreadFactory().newThread(new C4341iQ(runnable));
                threadNewThread2.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.b).getAndIncrement());
                return threadNewThread2;
        }
    }

    public /* synthetic */ ThreadFactoryC8144yH1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
