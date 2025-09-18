package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import p000.AbstractC8418Vg0;
import p000.C8313Tf1;
import p000.InterfaceC6497nZ;

/* renamed from: io.appmetrica.analytics.impl.Jb */
/* loaded from: classes2.dex */
public final class C4588Jb extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: a */
    public static final C4588Jb f30359a = new C4588Jb();

    public C4588Jb() {
        super(1);
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).stopLocationTracking();
        return C8313Tf1.f11463a;
    }
}
