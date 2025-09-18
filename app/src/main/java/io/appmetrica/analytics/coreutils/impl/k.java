package io.appmetrica.analytics.coreutils.impl;

import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC5908mZ;
import io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;

/* loaded from: classes2.dex */
public final class k extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ UtilityServiceProvider a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(UtilityServiceProvider utilityServiceProvider) {
        super(0);
        this.a = utilityServiceProvider;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        return new FirstExecutionConditionServiceImpl(this.a);
    }
}
