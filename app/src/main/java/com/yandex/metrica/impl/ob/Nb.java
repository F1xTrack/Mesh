package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Mb;
import defpackage.AbstractC3557eJ0;
import defpackage.C3367dJ0;
import defpackage.O90;

/* loaded from: classes2.dex */
public final class Nb {
    private final Mb.b a = new Mb.b(false, 1);

    public final Mb a(C3131ui c3131ui) {
        Mb.b bVar = this.a;
        C3367dJ0 c3367dJ0 = AbstractC3557eJ0.a;
        P0 p0I = P0.i();
        O90.e(p0I, "GlobalServiceLocator.getInstance()");
        C3266zn c3266znS = p0I.s();
        O90.e(c3266znS, "GlobalServiceLocator.get…).serviceExecutorProvider");
        InterfaceExecutorC3086sn interfaceExecutorC3086snH = c3266znS.h();
        O90.e(interfaceExecutorC3086snH, "GlobalServiceLocator.get…ortDataCollectingExecutor");
        Ob ob = new Ob(c3131ui);
        W0 w0A = Oh.a();
        O90.e(w0A, "YandexMetricaSelfReportFacade.getReporter()");
        return new Mb(c3131ui, bVar, c3367dJ0, interfaceExecutorC3086snH, new Rb(ob, new Qb(c3131ui, w0A)));
    }
}
