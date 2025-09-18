package io.appmetrica.analytics.impl;

import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.gg */
/* loaded from: classes2.dex */
public class C5150gg extends AbstractCallableC4784Rg {

    /* renamed from: e */
    public final C4737Pg f31774e;

    public C5150gg(C5134g0 c5134g0, InterfaceC5029bk interfaceC5029bk, C4737Pg c4737Pg) {
        super(c5134g0, interfaceC5029bk);
        this.f31774e = c4737Pg;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC4784Rg
    /* renamed from: a */
    public final void mo19778a(Throwable th) {
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC4784Rg
    /* renamed from: a */
    public final void mo19541a(IAppMetricaService iAppMetricaService) throws RemoteException {
        C4737Pg c4737Pg = this.f31774e;
        iAppMetricaService.reportData(c4737Pg.f30622c, c4737Pg.f30620a.m19859d(c4737Pg.f30624e.m20038c()));
    }
}
