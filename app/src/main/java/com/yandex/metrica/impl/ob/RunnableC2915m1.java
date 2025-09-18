package com.yandex.metrica.impl.ob;

import android.os.Handler;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.metrica.impl.ob.m1 */
/* loaded from: classes2.dex */
class RunnableC2915m1 implements Runnable {
    private final WeakReference<Handler> a;
    private final WeakReference<J> b;

    public RunnableC2915m1(Handler handler, J j) {
        this.a = new WeakReference<>(handler);
        this.b = new WeakReference<>(j);
    }

    @Override // java.lang.Runnable
    public void run() {
        Handler handler = this.a.get();
        J j = this.b.get();
        if (handler == null || j == null || !j.e()) {
            return;
        }
        C2890l1.a(handler, j, this);
    }
}
