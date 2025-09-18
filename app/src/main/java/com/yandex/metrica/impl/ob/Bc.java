package com.yandex.metrica.impl.ob;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class Bc<T> implements InterfaceC3205xc<T> {
    private InterfaceExecutorC3086sn a;
    private volatile Runnable b;

    public Bc(InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this.a = interfaceExecutorC3086sn;
    }

    public void a(Runnable runnable, long j) {
        ((C3061rn) this.a).a(runnable, j, TimeUnit.SECONDS);
        this.b = runnable;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3205xc
    public void a() {
        Runnable runnable = this.b;
        if (runnable != null) {
            ((C3061rn) this.a).a(runnable);
            this.b = null;
        }
    }
}
