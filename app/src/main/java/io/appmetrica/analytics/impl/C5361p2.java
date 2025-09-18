package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.p2 */
/* loaded from: classes2.dex */
public final class C5361p2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5380pl fromModel(BillingConfig billingConfig) {
        C5380pl c5380pl = new C5380pl();
        c5380pl.f32406a = billingConfig.sendFrequencySeconds;
        c5380pl.f32407b = billingConfig.firstCollectingInappMaxAgeSeconds;
        return c5380pl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C5380pl c5380pl = (C5380pl) obj;
        return new BillingConfig(c5380pl.f32406a, c5380pl.f32407b);
    }

    /* renamed from: a */
    public final BillingConfig m20898a(C5380pl c5380pl) {
        return new BillingConfig(c5380pl.f32406a, c5380pl.f32407b);
    }
}
