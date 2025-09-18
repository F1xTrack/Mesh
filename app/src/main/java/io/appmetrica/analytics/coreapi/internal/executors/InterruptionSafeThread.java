package io.appmetrica.analytics.coreapi.internal.executors;

/* loaded from: classes2.dex */
public class InterruptionSafeThread extends Thread implements IInterruptionSafeThread {

    /* renamed from: a */
    private volatile boolean f29634a;

    public InterruptionSafeThread() {
        this.f29634a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized boolean isRunning() {
        return this.f29634a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized void stopRunning() {
        this.f29634a = false;
        interrupt();
    }

    public InterruptionSafeThread(Runnable runnable, String str) {
        super(runnable, str);
        this.f29634a = true;
    }

    public InterruptionSafeThread(String str) {
        super(str);
        this.f29634a = true;
    }

    public InterruptionSafeThread(Runnable runnable) {
        super(runnable);
        this.f29634a = true;
    }
}
