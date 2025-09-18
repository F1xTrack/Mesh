package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;

/* renamed from: io.appmetrica.analytics.impl.Gc */
/* loaded from: classes2.dex */
public final class C4517Gc implements ModuleEventServiceHandlerContext {

    /* renamed from: a */
    public final ModulePreferences f30174a;

    /* renamed from: b */
    public final ModulePreferences f30175b;

    /* renamed from: c */
    public final ModuleEventServiceHandlerReporter f30176c;

    public C4517Gc(ModulePreferences modulePreferences, ModulePreferences modulePreferences2, ModuleEventServiceHandlerReporter moduleEventServiceHandlerReporter) {
        this.f30174a = modulePreferences;
        this.f30175b = modulePreferences2;
        this.f30176c = moduleEventServiceHandlerReporter;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    public final ModuleEventServiceHandlerReporter getEventReporter() {
        return this.f30176c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    public final ModulePreferences getLegacyModulePreferences() {
        return this.f30175b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    public final ModulePreferences getModulePreferences() {
        return this.f30174a;
    }
}
