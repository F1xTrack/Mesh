package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.impl.Kc;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* loaded from: classes2.dex */
public final class Kc implements ModuleServiceLifecycleController {
    public final M1 a;

    public Kc(M1 m1) {
        this.a = m1;
    }

    public static final void a(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    public static final void b(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(final ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        M1 m1 = this.a;
        final int i = 0;
        m1.b.put(new L1() { // from class: Ef0
            @Override // io.appmetrica.analytics.impl.L1
            public final void a(Intent intent) {
                switch (i) {
                    case 0:
                        Kc.a(moduleServiceLifecycleObserver, intent);
                        break;
                    default:
                        Kc.b(moduleServiceLifecycleObserver, intent);
                        break;
                }
            }
        }, new H1(m1));
        M1 m12 = this.a;
        final int i2 = 1;
        m12.c.put(new L1() { // from class: Ef0
            @Override // io.appmetrica.analytics.impl.L1
            public final void a(Intent intent) {
                switch (i2) {
                    case 0:
                        Kc.a(moduleServiceLifecycleObserver, intent);
                        break;
                    default:
                        Kc.b(moduleServiceLifecycleObserver, intent);
                        break;
                }
            }
        }, new J1(m12));
    }
}
