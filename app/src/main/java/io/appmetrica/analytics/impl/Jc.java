package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Jc implements ModuleSelfReporter {
    public final C4557fj a = AbstractC4658k1.a();
    public final int b = 4;

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(String str, Throwable th) {
        C4557fj c4557fj = this.a;
        c4557fj.getClass();
        c4557fj.a(new C4533ej(str, th));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str) {
        C4557fj c4557fj = this.a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.b).withName(str).build();
        c4557fj.getClass();
        c4557fj.a(new Ui(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(String str, String str2) {
        this.a.reportError(str, str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str, Map<String, ? extends Object> map) {
        C4557fj c4557fj = this.a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.b).withName(str).withAttributes(map).build();
        c4557fj.getClass();
        c4557fj.a(new Ui(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str, String str2) {
        C4557fj c4557fj = this.a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.b).withName(str).withValue(str2).build();
        c4557fj.getClass();
        c4557fj.a(new Ui(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(int i, String str, String str2) {
        C4557fj c4557fj = this.a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(i).withName(str).withValue(str2).build();
        c4557fj.getClass();
        c4557fj.a(new Ui(moduleEventBuild));
    }
}
