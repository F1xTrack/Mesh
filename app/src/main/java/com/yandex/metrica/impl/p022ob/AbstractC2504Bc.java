package com.yandex.metrica.impl.p022ob;

import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Bc */
/* loaded from: classes2.dex */
public abstract class AbstractC2504Bc<T> implements InterfaceC3726xc<T> {

    /* renamed from: a */
    private InterfaceExecutorC3607sn f20926a;

    /* renamed from: b */
    private volatile Runnable f20927b;

    public AbstractC2504Bc(InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this.f20926a = interfaceExecutorC3607sn;
    }

    /* renamed from: a */
    public void m13925a(Runnable runnable, long j) {
        ((C3581rn) this.f20926a).m16705a(runnable, j, TimeUnit.SECONDS);
        this.f20927b = runnable;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3726xc
    /* renamed from: a */
    public void mo13924a() {
        Runnable runnable = this.f20927b;
        if (runnable != null) {
            ((C3581rn) this.f20926a).m16703a(runnable);
            this.f20927b = null;
        }
    }
}
