package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.impl.C4613Kc;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* renamed from: io.appmetrica.analytics.impl.Kc */
/* loaded from: classes2.dex */
public final class C4613Kc implements ModuleServiceLifecycleController {

    /* renamed from: a */
    public final C4650M1 f30399a;

    public C4613Kc(C4650M1 c4650m1) {
        this.f30399a = c4650m1;
    }

    /* renamed from: a */
    public static final void m19555a(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    /* renamed from: b */
    public static final void m19556b(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(final ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        C4650M1 c4650m1 = this.f30399a;
        final int i = 0;
        c4650m1.f30456b.put(new InterfaceC4626L1() { // from class: Ef0
            @Override // io.appmetrica.analytics.impl.InterfaceC4626L1
            /* renamed from: a */
            public final void mo2364a(Intent intent) {
                switch (i) {
                    case 0:
                        C4613Kc.m19555a(moduleServiceLifecycleObserver, intent);
                        break;
                    default:
                        C4613Kc.m19556b(moduleServiceLifecycleObserver, intent);
                        break;
                }
            }
        }, new C4530H1(c4650m1));
        C4650M1 c4650m12 = this.f30399a;
        final int i2 = 1;
        c4650m12.f30457c.put(new InterfaceC4626L1() { // from class: Ef0
            @Override // io.appmetrica.analytics.impl.InterfaceC4626L1
            /* renamed from: a */
            public final void mo2364a(Intent intent) {
                switch (i2) {
                    case 0:
                        C4613Kc.m19555a(moduleServiceLifecycleObserver, intent);
                        break;
                    default:
                        C4613Kc.m19556b(moduleServiceLifecycleObserver, intent);
                        break;
                }
            }
        }, new C4578J1(c4650m12));
    }
}
