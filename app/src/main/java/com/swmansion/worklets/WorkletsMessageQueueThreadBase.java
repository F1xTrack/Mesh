package com.swmansion.worklets;

import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import com.facebook.react.bridge.queue.MessageQueueThreadPerfStats;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import java.lang.reflect.Field;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p000.C8749ad1;
import p000.InterfaceC0965PK;

@InterfaceC0965PK
/* loaded from: classes2.dex */
public abstract class WorkletsMessageQueueThreadBase implements MessageQueueThread {

    /* renamed from: a */
    public final MessageQueueThreadImpl f20266a = MessageQueueThreadImpl.create(MessageQueueThreadSpec.mainThreadSpec(), new C8749ad1(3));

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public final void assertIsOnThread() {
        this.f20266a.assertIsOnThread();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public final Future callOnQueue(Callable callable) {
        return this.f20266a.callOnQueue(callable);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public final MessageQueueThreadPerfStats getPerfStats() {
        return this.f20266a.getPerfStats();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public final boolean isOnThread() {
        return this.f20266a.isOnThread();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public final void quitSynchronous() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        MessageQueueThreadImpl messageQueueThreadImpl = this.f20266a;
        try {
            Field declaredField = messageQueueThreadImpl.getClass().getDeclaredField("mIsFinished");
            declaredField.setAccessible(true);
            declaredField.set(messageQueueThreadImpl, Boolean.TRUE);
            declaredField.setAccessible(false);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public final void resetPerfStats() {
        this.f20266a.resetPerfStats();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public final void assertIsOnThread(String str) {
        this.f20266a.assertIsOnThread(str);
    }
}
