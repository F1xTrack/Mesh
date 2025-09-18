package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;

/* loaded from: classes2.dex */
public final class Fc implements ModuleEventServiceHandlerReporter {
    public final C4619i9 a;
    public final T5 b;

    public Fc(C4619i9 c4619i9, T5 t5) {
        this.a = c4619i9;
        this.b = t5;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final void report(CounterReportApi counterReportApi) {
        T5 t5D = T5.d(this.b);
        t5D.d = counterReportApi.getType();
        t5D.e = counterReportApi.getCustomType();
        t5D.setName(counterReportApi.getName());
        t5D.setValue(counterReportApi.getValue());
        t5D.setValueBytes(counterReportApi.getValueBytes());
        t5D.g = counterReportApi.getBytesTruncated();
        C4619i9 c4619i9 = this.a;
        c4619i9.a(t5D, Uj.a(c4619i9.c.b(t5D), t5D.i));
    }
}
