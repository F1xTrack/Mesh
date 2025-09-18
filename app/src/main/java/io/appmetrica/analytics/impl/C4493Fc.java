package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;

/* renamed from: io.appmetrica.analytics.impl.Fc */
/* loaded from: classes2.dex */
public final class C4493Fc implements ModuleEventServiceHandlerReporter {

    /* renamed from: a */
    public final C5193i9 f30131a;

    /* renamed from: b */
    public final C4821T5 f30132b;

    public C4493Fc(C5193i9 c5193i9, C4821T5 c4821t5) {
        this.f30131a = c5193i9;
        this.f30132b = c4821t5;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final void report(CounterReportApi counterReportApi) {
        C4821T5 c4821t5M19844d = C4821T5.m19844d(this.f30132b);
        c4821t5M19844d.f30764d = counterReportApi.getType();
        c4821t5M19844d.f30765e = counterReportApi.getCustomType();
        c4821t5M19844d.setName(counterReportApi.getName());
        c4821t5M19844d.setValue(counterReportApi.getValue());
        c4821t5M19844d.setValueBytes(counterReportApi.getValueBytes());
        c4821t5M19844d.f30767g = counterReportApi.getBytesTruncated();
        C5193i9 c5193i9 = this.f30131a;
        c5193i9.m20572a(c4821t5M19844d, C4859Uj.m19888a(c5193i9.f31919c.m19892b(c4821t5M19844d), c4821t5M19844d.f30769i));
    }
}
