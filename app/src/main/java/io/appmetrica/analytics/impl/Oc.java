package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes2.dex */
public final class Oc extends SafeRunnable {
    public final /* synthetic */ Rc a;
    public final /* synthetic */ ModuleEvent b;

    public Oc(Rc rc, ModuleEvent moduleEvent) {
        this.a = rc;
        this.b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Rc.a(this.a).reportEvent(this.b);
    }
}
