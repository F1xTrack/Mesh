package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.Oc */
/* loaded from: classes2.dex */
public final class C4709Oc extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C4780Rc f30555a;

    /* renamed from: b */
    public final /* synthetic */ ModuleEvent f30556b;

    public C4709Oc(C4780Rc c4780Rc, ModuleEvent moduleEvent) {
        this.f30555a = c4780Rc;
        this.f30556b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C4780Rc.m19761a(this.f30555a).reportEvent(this.f30556b);
    }
}
