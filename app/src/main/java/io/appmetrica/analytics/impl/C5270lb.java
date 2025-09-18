package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.lb */
/* loaded from: classes2.dex */
public final class C5270lb extends InterruptionSafeThread {

    /* renamed from: a */
    public final /* synthetic */ C5295mb f32145a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5270lb(C5295mb c5295mb, String str) {
        super(str);
        this.f32145a = c5295mb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap map;
        synchronized (this.f32145a.f32192a) {
            C5295mb.m20706a(this.f32145a);
            this.f32145a.f32196e = true;
            this.f32145a.f32192a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.f32145a.f32193b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                map = new HashMap(this.f32145a.f32193b);
                this.f32145a.f32193b.clear();
            }
            if (map.size() > 0) {
                C5295mb.m20707a(this.f32145a, map);
                map.clear();
            }
        }
    }
}
