package com.yandex.metrica.impl.p022ob;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.xn */
/* loaded from: classes2.dex */
class ExecutorC3737xn implements Executor {

    /* renamed from: a */
    final /* synthetic */ Handler f25261a;

    public ExecutorC3737xn(C3763yn c3763yn, Handler handler) {
        this.f25261a = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f25261a.post(runnable);
    }
}
