package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Pw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1255Pw implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(0);
    public final /* synthetic */ boolean b;

    public ThreadFactoryC1255Pw(boolean z) {
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbO = AbstractC8235ym.o(this.b ? "WM.task-" : "androidx.work-");
        sbO.append(this.a.incrementAndGet());
        return new Thread(runnable, sbO.toString());
    }
}
