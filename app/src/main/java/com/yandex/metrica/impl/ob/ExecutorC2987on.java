package com.yandex.metrica.impl.ob;

import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.on, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class ExecutorC2987on implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }
}
