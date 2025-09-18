package io.appmetrica.analytics.impl;

import android.location.Location;

/* loaded from: classes2.dex */
public final class G0 implements Runnable {
    public final /* synthetic */ Location a;
    public final /* synthetic */ C4611i1 b;

    public G0(C4611i1 c4611i1, Location location) {
        this.b = c4611i1;
        this.a = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4753o0 c4753o0 = this.b.a;
        Location location = this.a;
        c4753o0.getClass();
        C4729n0.g().a(location);
    }
}
