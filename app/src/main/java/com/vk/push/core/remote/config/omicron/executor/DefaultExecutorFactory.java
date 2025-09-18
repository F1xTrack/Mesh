package com.vk.push.core.remote.config.omicron.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class DefaultExecutorFactory implements ExecutorFactory {
    @Override // com.vk.push.core.remote.config.omicron.executor.ExecutorFactory
    public ExecutorService newSingleThreadExecutor() {
        return Executors.newSingleThreadExecutor();
    }
}
