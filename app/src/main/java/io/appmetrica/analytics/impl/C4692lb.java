package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.lb */
/* loaded from: classes2.dex */
public final class C4692lb extends InterruptionSafeThread {
    public final /* synthetic */ C4716mb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4692lb(C4716mb c4716mb, String str) {
        super(str);
        this.a = c4716mb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap map;
        synchronized (this.a.a) {
            C4716mb.a(this.a);
            this.a.e = true;
            this.a.a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.a.b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                map = new HashMap(this.a.b);
                this.a.b.clear();
            }
            if (map.size() > 0) {
                C4716mb.a(this.a, map);
                map.clear();
            }
        }
    }
}
