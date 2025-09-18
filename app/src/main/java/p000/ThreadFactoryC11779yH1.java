package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: yH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC11779yH1 implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ int f46175a;

    /* renamed from: b */
    public Object f46176b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f46175a) {
            case 0:
                Thread threadNewThread = ((ThreadFactory) this.f46176b).newThread(runnable);
                threadNewThread.setName("ScionFrontendApi");
                return threadNewThread;
            case 1:
                return ((ThreadFactory) this.f46176b).newThread(new RunnableC6987v2(runnable, 5));
            default:
                Thread threadNewThread2 = Executors.defaultThreadFactory().newThread(new C4241iQ(runnable));
                threadNewThread2.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.f46176b).getAndIncrement());
                return threadNewThread2;
        }
    }

    public /* synthetic */ ThreadFactoryC11779yH1(int i, Object obj) {
        this.f46175a = i;
        this.f46176b = obj;
    }
}
