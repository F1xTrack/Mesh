package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class An extends ExecutorC2987on {
    @Override // com.yandex.metrica.impl.ob.ExecutorC2987on, java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }
}
