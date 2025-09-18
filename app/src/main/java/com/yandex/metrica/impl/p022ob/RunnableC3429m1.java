package com.yandex.metrica.impl.p022ob;

import android.os.Handler;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.metrica.impl.ob.m1 */
/* loaded from: classes2.dex */
class RunnableC3429m1 implements Runnable {

    /* renamed from: a */
    private final WeakReference<Handler> f24236a;

    /* renamed from: b */
    private final WeakReference<AbstractC2691J> f24237b;

    public RunnableC3429m1(Handler handler, AbstractC2691J abstractC2691J) {
        this.f24236a = new WeakReference<>(handler);
        this.f24237b = new WeakReference<>(abstractC2691J);
    }

    @Override // java.lang.Runnable
    public void run() {
        Handler handler = this.f24236a.get();
        AbstractC2691J abstractC2691J = this.f24237b.get();
        if (handler == null || abstractC2691J == null || !abstractC2691J.m14388e()) {
            return;
        }
        C3403l1.m16342a(handler, abstractC2691J, this);
    }
}
