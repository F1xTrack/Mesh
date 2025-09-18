package io.appmetrica.analytics.coreutils.impl;

import io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;

/* renamed from: io.appmetrica.analytics.coreutils.impl.k */
/* loaded from: classes2.dex */
public final class C4324k extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: a */
    public final /* synthetic */ UtilityServiceProvider f29699a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4324k(UtilityServiceProvider utilityServiceProvider) {
        super(0);
        this.f29699a = utilityServiceProvider;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        return new FirstExecutionConditionServiceImpl(this.f29699a);
    }
}
