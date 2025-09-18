package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.Sg */
/* loaded from: classes2.dex */
public final class C4808Sg extends AbstractC4373Ag {
    public C4808Sg(C4463E6 c4463e6) {
        super(c4463e6);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4373Ag, io.appmetrica.analytics.impl.InterfaceC4398Bg
    /* renamed from: a */
    public final boolean mo19204a(Boolean bool) {
        return !this.f29862a.isRestrictedForReporter() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
