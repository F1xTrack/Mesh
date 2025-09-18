package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.Jm */
/* loaded from: classes2.dex */
public final class C4599Jm extends AbstractCallableC4784Rg {

    /* renamed from: e */
    public final int f30375e;

    /* renamed from: f */
    public final Bundle f30376f;

    public C4599Jm(C5134g0 c5134g0, InterfaceC5029bk interfaceC5029bk, int i, Bundle bundle) {
        super(c5134g0, interfaceC5029bk);
        this.f30375e = i;
        this.f30376f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC4784Rg
    /* renamed from: a */
    public final void mo19541a(IAppMetricaService iAppMetricaService) throws RemoteException {
        iAppMetricaService.reportData(this.f30375e, this.f30376f);
    }
}
