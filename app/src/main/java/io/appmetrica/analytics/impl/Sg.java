package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes2.dex */
public final class Sg extends Ag {
    public Sg(E6 e6) {
        super(e6);
    }

    @Override // io.appmetrica.analytics.impl.Ag, io.appmetrica.analytics.impl.Bg
    public final boolean a(Boolean bool) {
        return !this.a.isRestrictedForReporter() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
