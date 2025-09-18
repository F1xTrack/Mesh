package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2778Mb;
import p000.AbstractC9225eJ0;
import p000.C9097dJ0;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.Nb */
/* loaded from: classes2.dex */
public final class C2803Nb {

    /* renamed from: a */
    private final C2778Mb.b f21771a = new C2778Mb.b(false, 1);

    /* renamed from: a */
    public final C2778Mb m14643a(C3654ui c3654ui) {
        C2778Mb.b bVar = this.f21771a;
        C9097dJ0 c9097dJ0 = AbstractC9225eJ0.f26655a;
        C2842P0 c2842p0M14728i = C2842P0.m14728i();
        O90.m5967e(c2842p0M14728i, "GlobalServiceLocator.getInstance()");
        C3789zn c3789znM14748s = c2842p0M14728i.m14748s();
        O90.m5967e(c3789znM14748s, "GlobalServiceLocator.get…).serviceExecutorProvider");
        InterfaceExecutorC3607sn interfaceExecutorC3607snM17356h = c3789znM14748s.m17356h();
        O90.m5967e(interfaceExecutorC3607snM17356h, "GlobalServiceLocator.get…ortDataCollectingExecutor");
        C2828Ob c2828Ob = new C2828Ob(c3654ui);
        InterfaceC3016W0 interfaceC3016W0M14711a = C2834Oh.m14711a();
        O90.m5967e(interfaceC3016W0M14711a, "YandexMetricaSelfReportFacade.getReporter()");
        return new C2778Mb(c3654ui, bVar, c9097dJ0, interfaceExecutorC3607snM17356h, new C2902Rb(c2828Ob, new C2878Qb(c3654ui, interfaceC3016W0M14711a)));
    }
}
