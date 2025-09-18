package io.legere.pdfiumandroid.util;

import java.util.concurrent.Semaphore;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m22267d2 = {"Lio/legere/pdfiumandroid/util/InitLock;", "", "<init>", "()V", "LTf1;", "markReady", "waitForReady", "Ljava/util/concurrent/Semaphore;", "semaphore", "Ljava/util/concurrent/Semaphore;", "", "isInitialized", "Z", "pdfiumandroid_release"}, m22268k = 1, m22269mv = {2, 0, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class InitLock {
    private boolean isInitialized;
    private final Semaphore semaphore = new Semaphore(0);

    public final void markReady() {
        this.isInitialized = true;
        this.semaphore.release();
    }

    public final synchronized void waitForReady() {
        if (!this.isInitialized) {
            this.semaphore.acquire();
        }
    }
}
