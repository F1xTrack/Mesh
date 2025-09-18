package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes2.dex */
public final class Jm extends Rg {
    public final int e;
    public final Bundle f;

    public Jm(C4562g0 c4562g0, InterfaceC4459bk interfaceC4459bk, int i, Bundle bundle) {
        super(c4562g0, interfaceC4459bk);
        this.e = i;
        this.f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final void a(IAppMetricaService iAppMetricaService) throws RemoteException {
        iAppMetricaService.reportData(this.e, this.f);
    }
}
