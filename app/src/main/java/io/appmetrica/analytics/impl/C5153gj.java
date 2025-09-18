package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.gj */
/* loaded from: classes2.dex */
public final class C5153gj extends AbstractC4373Ag {
    public C5153gj(C4463E6 c4463e6) {
        super(c4463e6);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4373Ag, io.appmetrica.analytics.impl.InterfaceC4398Bg
    /* renamed from: a */
    public final boolean mo19204a(Boolean bool) {
        return !this.f29862a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
