package ru.p031ok.tracer.utils;

import java.util.concurrent.ThreadFactory;

/* renamed from: ru.ok.tracer.utils.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class ThreadFactoryC6788a implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return TracerThreads$bgExecutor$2.invoke$lambda$0(runnable);
    }
}
