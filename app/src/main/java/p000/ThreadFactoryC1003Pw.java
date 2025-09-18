package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Pw */
/* loaded from: classes.dex */
public final class ThreadFactoryC1003Pw implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f9362a = new AtomicInteger(0);

    /* renamed from: b */
    public final /* synthetic */ boolean f9363b;

    public ThreadFactoryC1003Pw(boolean z) {
        this.f9363b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbM26238o = AbstractC7222ym.m26238o(this.f9363b ? "WM.task-" : "androidx.work-");
        sbM26238o.append(this.f9362a.incrementAndGet());
        return new Thread(runnable, sbM26238o.toString());
    }
}
