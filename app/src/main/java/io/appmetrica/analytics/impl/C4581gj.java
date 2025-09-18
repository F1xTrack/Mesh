package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.gj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4581gj extends Ag {
    public C4581gj(E6 e6) {
        super(e6);
    }

    @Override // io.appmetrica.analytics.impl.Ag, io.appmetrica.analytics.impl.Bg
    public final boolean a(Boolean bool) {
        return !this.a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
