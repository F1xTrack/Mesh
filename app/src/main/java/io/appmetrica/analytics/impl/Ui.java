package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* loaded from: classes2.dex */
public final class Ui implements Na {
    public final /* synthetic */ ModuleEvent a;

    public Ui(ModuleEvent moduleEvent) {
        this.a = moduleEvent;
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(Oa oa) {
        oa.reportEvent(this.a);
    }
}
