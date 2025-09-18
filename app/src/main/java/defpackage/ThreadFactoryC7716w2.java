package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: w2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC7716w2 implements ThreadFactory {
    public final /* synthetic */ int a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new Thread(new RunnableC7525v2(runnable, 0), "glide-active-resources");
            case 1:
                return new C6975s9(runnable);
            default:
                Thread thread = new Thread(runnable);
                thread.setPriority(10);
                thread.setName("CameraX-camerax_high_priority");
                return thread;
        }
    }
}
