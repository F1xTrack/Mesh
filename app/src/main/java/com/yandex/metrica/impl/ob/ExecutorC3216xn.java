package com.yandex.metrica.impl.ob;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.xn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class ExecutorC3216xn implements Executor {
    final /* synthetic */ Handler a;

    public ExecutorC3216xn(C3241yn c3241yn, Handler handler) {
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
