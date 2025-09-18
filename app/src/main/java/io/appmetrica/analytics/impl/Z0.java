package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* loaded from: classes2.dex */
public final class Z0 implements Runnable {
    public final /* synthetic */ AnrListener a;
    public final /* synthetic */ C4611i1 b;

    public Z0(C4611i1 c4611i1, AnrListener anrListener) {
        this.b = c4611i1;
        this.a = anrListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4611i1.a(this.b).a(this.a);
    }
}
