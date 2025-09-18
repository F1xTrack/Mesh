package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.Uh */
/* loaded from: classes2.dex */
public final class C4857Uh extends AbstractCallableC4784Rg {

    /* renamed from: e */
    public final C4782Re f30823e;

    public C4857Uh(C5134g0 c5134g0, InterfaceC5029bk interfaceC5029bk, C4782Re c4782Re) {
        super(c5134g0, interfaceC5029bk);
        this.f30823e = c4782Re;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC4784Rg
    /* renamed from: a */
    public final void mo19541a(IAppMetricaService iAppMetricaService) throws RemoteException {
        Bundle bundle = new Bundle();
        C4782Re c4782Re = this.f30823e;
        synchronized (c4782Re) {
            bundle.putParcelable("PROCESS_CFG_OBJ", c4782Re);
        }
        iAppMetricaService.resumeUserSession(bundle);
    }
}
