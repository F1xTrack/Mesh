package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.Ag */
/* loaded from: classes2.dex */
public abstract class AbstractC4373Ag implements InterfaceC4398Bg {

    /* renamed from: a */
    protected final DataSendingRestrictionController f29862a;

    public AbstractC4373Ag(DataSendingRestrictionController dataSendingRestrictionController) {
        this.f29862a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4398Bg
    /* renamed from: a */
    public boolean mo19204a(Boolean bool) {
        return ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
