package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: kK */
/* loaded from: classes.dex */
public final class ThreadFactoryC6293kK implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final synchronized Thread newThread(Runnable runnable) {
        Thread thread;
        thread = new Thread(runnable, "glide-disk-lru-cache-thread");
        thread.setPriority(1);
        return thread;
    }
}
