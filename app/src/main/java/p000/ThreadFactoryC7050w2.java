package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: w2 */
/* loaded from: classes.dex */
public final class ThreadFactoryC7050w2 implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ int f44656a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f44656a) {
            case 0:
                return new Thread(new RunnableC6987v2(runnable, 0), "glide-active-resources");
            case 1:
                return new C6805s9(runnable);
            default:
                Thread thread = new Thread(runnable);
                thread.setPriority(10);
                thread.setName("CameraX-camerax_high_priority");
                return thread;
        }
    }
}
