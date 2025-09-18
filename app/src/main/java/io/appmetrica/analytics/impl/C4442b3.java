package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.b3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4442b3 implements ProtobufConverter {
    public static C4874t2 a(BillingInfo billingInfo) {
        C4874t2 c4874t2 = new C4874t2();
        int i = AbstractC4417a3.a[billingInfo.type.ordinal()];
        c4874t2.a = i != 1 ? i != 2 ? 1 : 3 : 2;
        c4874t2.b = billingInfo.productId;
        c4874t2.c = billingInfo.purchaseToken;
        c4874t2.d = billingInfo.purchaseTime;
        c4874t2.e = billingInfo.sendTime;
        return c4874t2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((BillingInfo) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C4874t2 c4874t2 = (C4874t2) obj;
        int i = c4874t2.a;
        return new BillingInfo(i != 2 ? i != 3 ? ProductType.UNKNOWN : ProductType.SUBS : ProductType.INAPP, c4874t2.b, c4874t2.c, c4874t2.d, c4874t2.e);
    }
}
