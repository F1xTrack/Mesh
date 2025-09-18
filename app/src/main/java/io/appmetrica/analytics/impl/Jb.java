package io.appmetrica.analytics.impl;

import defpackage.AbstractC1676Vg0;
import defpackage.C1518Tf1;
import defpackage.InterfaceC6099nZ;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;

/* loaded from: classes2.dex */
public final class Jb extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public static final Jb a = new Jb();

    public Jb() {
        super(1);
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).stopLocationTracking();
        return C1518Tf1.a;
    }
}
