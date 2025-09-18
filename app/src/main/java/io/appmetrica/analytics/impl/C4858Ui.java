package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* renamed from: io.appmetrica.analytics.impl.Ui */
/* loaded from: classes2.dex */
public final class C4858Ui implements InterfaceC4683Na {

    /* renamed from: a */
    public final /* synthetic */ ModuleEvent f30824a;

    public C4858Ui(ModuleEvent moduleEvent) {
        this.f30824a = moduleEvent;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4683Na
    /* renamed from: a */
    public final void mo19451a(InterfaceC4707Oa interfaceC4707Oa) {
        interfaceC4707Oa.reportEvent(this.f30824a);
    }
}
