package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Jc */
/* loaded from: classes2.dex */
public final class C4589Jc implements ModuleSelfReporter {

    /* renamed from: a */
    public final C5128fj f30360a = AbstractC5235k1.m20601a();

    /* renamed from: b */
    public final int f30361b = 4;

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(String str, Throwable th) {
        C5128fj c5128fj = this.f30360a;
        c5128fj.getClass();
        c5128fj.m20394a(new C5103ej(str, th));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str) {
        C5128fj c5128fj = this.f30360a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f30361b).withName(str).build();
        c5128fj.getClass();
        c5128fj.m20394a(new C4858Ui(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(String str, String str2) {
        this.f30360a.reportError(str, str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str, Map<String, ? extends Object> map) {
        C5128fj c5128fj = this.f30360a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f30361b).withName(str).withAttributes(map).build();
        c5128fj.getClass();
        c5128fj.m20394a(new C4858Ui(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str, String str2) {
        C5128fj c5128fj = this.f30360a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f30361b).withName(str).withValue(str2).build();
        c5128fj.getClass();
        c5128fj.m20394a(new C4858Ui(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(int i, String str, String str2) {
        C5128fj c5128fj = this.f30360a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(i).withName(str).withValue(str2).build();
        c5128fj.getClass();
        c5128fj.m20394a(new C4858Ui(moduleEventBuild));
    }
}
