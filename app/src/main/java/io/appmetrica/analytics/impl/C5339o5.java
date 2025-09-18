package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6497nZ;

/* renamed from: io.appmetrica.analytics.impl.o5 */
/* loaded from: classes2.dex */
public final class C5339o5 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: a */
    public static final C5339o5 f32318a = new C5339o5();

    public C5339o5() {
        super(1);
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        return ((ModuleAdRevenueProcessor) obj).getDescription();
    }
}
