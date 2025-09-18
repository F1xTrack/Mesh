package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: kK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC5481kK implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final synchronized Thread newThread(Runnable runnable) {
        Thread thread;
        thread = new Thread(runnable, "glide-disk-lru-cache-thread");
        thread.setPriority(1);
        return thread;
    }
}
