package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import p000.AbstractC8418Vg0;
import p000.C8313Tf1;
import p000.InterfaceC6497nZ;

/* renamed from: io.appmetrica.analytics.impl.Ib */
/* loaded from: classes2.dex */
public final class C4564Ib extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: a */
    public static final C4564Ib f30279a = new C4564Ib();

    public C4564Ib() {
        super(1);
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).startLocationTracking();
        return C8313Tf1.f11463a;
    }
}
