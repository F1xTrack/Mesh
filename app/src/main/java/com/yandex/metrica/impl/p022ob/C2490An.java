package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.An */
/* loaded from: classes2.dex */
public class C2490An extends ExecutorC3503on {
    @Override // com.yandex.metrica.impl.p022ob.ExecutorC3503on, java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }
}
