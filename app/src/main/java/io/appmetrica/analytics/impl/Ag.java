package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes2.dex */
public abstract class Ag implements Bg {
    protected final DataSendingRestrictionController a;

    public Ag(DataSendingRestrictionController dataSendingRestrictionController) {
        this.a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.impl.Bg
    public boolean a(Boolean bool) {
        return ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
