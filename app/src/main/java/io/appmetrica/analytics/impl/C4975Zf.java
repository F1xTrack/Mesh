package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* renamed from: io.appmetrica.analytics.impl.Zf */
/* loaded from: classes2.dex */
public final class C4975Zf implements InterfaceC4645Lk {

    /* renamed from: a */
    public final C4428Cl f31197a;

    public C4975Zf(C4428Cl c4428Cl) {
        this.f31197a = c4428Cl;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4645Lk
    /* renamed from: a */
    public final void mo19601a() {
        NetworkTask networkTaskM19297c = this.f31197a.m19297c();
        if (networkTaskM19297c != null) {
            C5244ka.f32038C.getClass();
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTaskM19297c);
        }
    }
}
