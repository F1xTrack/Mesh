package ru.ok.tracer.utils;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return TracerThreads$bgExecutor$2.invoke$lambda$0(runnable);
    }
}
