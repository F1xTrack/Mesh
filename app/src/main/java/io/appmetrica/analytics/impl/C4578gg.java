package io.appmetrica.analytics.impl;

import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.gg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4578gg extends Rg {
    public final Pg e;

    public C4578gg(C4562g0 c4562g0, InterfaceC4459bk interfaceC4459bk, Pg pg) {
        super(c4562g0, interfaceC4459bk);
        this.e = pg;
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final void a(Throwable th) {
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final void a(IAppMetricaService iAppMetricaService) throws RemoteException {
        Pg pg = this.e;
        iAppMetricaService.reportData(pg.c, pg.a.d(pg.e.c()));
    }
}
