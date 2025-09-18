package com.facebook.react.bridge.queue;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p000.InterfaceC0965PK;

@InterfaceC0965PK
/* loaded from: classes.dex */
public interface MessageQueueThread {
    @InterfaceC0965PK
    void assertIsOnThread();

    @InterfaceC0965PK
    void assertIsOnThread(String str);

    @InterfaceC0965PK
    <T> Future<T> callOnQueue(Callable<T> callable);

    @InterfaceC0965PK
    MessageQueueThreadPerfStats getPerfStats();

    @InterfaceC0965PK
    boolean isIdle();

    @InterfaceC0965PK
    boolean isOnThread();

    @InterfaceC0965PK
    void quitSynchronous();

    @InterfaceC0965PK
    void resetPerfStats();

    @InterfaceC0965PK
    boolean runOnQueue(Runnable runnable);
}
