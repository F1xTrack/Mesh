package io.appmetrica.analytics.impl;

import android.os.HandlerThread;
import io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread;

/* renamed from: io.appmetrica.analytics.impl.Xa */
/* loaded from: classes2.dex */
public final class HandlerThreadC4922Xa extends HandlerThread implements IInterruptionSafeThread {

    /* renamed from: a */
    public volatile boolean f31028a;

    public HandlerThreadC4922Xa(String str) {
        super(str);
        this.f31028a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized boolean isRunning() {
        return this.f31028a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized void stopRunning() {
        this.f31028a = false;
        interrupt();
    }
}
