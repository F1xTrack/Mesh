package com.swmansion.worklets;

import p000.InterfaceC0965PK;

@InterfaceC0965PK
/* loaded from: classes2.dex */
public class WorkletsMessageQueueThread extends WorkletsMessageQueueThreadBase {
    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public final boolean isIdle() {
        return this.f20266a.isIdle();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public final boolean runOnQueue(Runnable runnable) {
        return this.f20266a.runOnQueue(runnable);
    }
}
