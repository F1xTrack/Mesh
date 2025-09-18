package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.p2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4779p2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4798pl fromModel(BillingConfig billingConfig) {
        C4798pl c4798pl = new C4798pl();
        c4798pl.a = billingConfig.sendFrequencySeconds;
        c4798pl.b = billingConfig.firstCollectingInappMaxAgeSeconds;
        return c4798pl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C4798pl c4798pl = (C4798pl) obj;
        return new BillingConfig(c4798pl.a, c4798pl.b);
    }

    public final BillingConfig a(C4798pl c4798pl) {
        return new BillingConfig(c4798pl.a, c4798pl.b);
    }
}
