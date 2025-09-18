package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes2.dex */
public final class Uh extends Rg {
    public final Re e;

    public Uh(C4562g0 c4562g0, InterfaceC4459bk interfaceC4459bk, Re re) {
        super(c4562g0, interfaceC4459bk);
        this.e = re;
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final void a(IAppMetricaService iAppMetricaService) throws RemoteException {
        Bundle bundle = new Bundle();
        Re re = this.e;
        synchronized (re) {
            bundle.putParcelable("PROCESS_CFG_OBJ", re);
        }
        iAppMetricaService.resumeUserSession(bundle);
    }
}
