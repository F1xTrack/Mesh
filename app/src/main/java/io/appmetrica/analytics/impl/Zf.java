package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* loaded from: classes2.dex */
public final class Zf implements Lk {
    public final Cl a;

    public Zf(Cl cl2) {
        this.a = cl2;
    }

    @Override // io.appmetrica.analytics.impl.Lk
    public final void a() {
        NetworkTask networkTaskC = this.a.c();
        if (networkTaskC != null) {
            C4667ka.C.getClass();
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTaskC);
        }
    }
}
