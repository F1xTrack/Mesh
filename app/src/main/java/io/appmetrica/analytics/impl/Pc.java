package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes2.dex */
public final class Pc extends SafeRunnable {
    public final /* synthetic */ Rc a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public Pc(Rc rc, int i, String str) {
        this.a = rc;
        this.b = i;
        this.c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Rc.a(this.a).a(new C9(this.b, this.c));
    }
}
