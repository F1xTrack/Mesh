package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.b3 */
/* loaded from: classes2.dex */
public final class C5012b3 implements ProtobufConverter {
    /* renamed from: a */
    public static C5461t2 m20136a(BillingInfo billingInfo) {
        C5461t2 c5461t2 = new C5461t2();
        int i = AbstractC4987a3.f31237a[billingInfo.type.ordinal()];
        c5461t2.f32611a = i != 1 ? i != 2 ? 1 : 3 : 2;
        c5461t2.f32612b = billingInfo.productId;
        c5461t2.f32613c = billingInfo.purchaseToken;
        c5461t2.f32614d = billingInfo.purchaseTime;
        c5461t2.f32615e = billingInfo.sendTime;
        return c5461t2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return m20136a((BillingInfo) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C5461t2 c5461t2 = (C5461t2) obj;
        int i = c5461t2.f32611a;
        return new BillingInfo(i != 2 ? i != 3 ? ProductType.UNKNOWN : ProductType.SUBS : ProductType.INAPP, c5461t2.f32612b, c5461t2.f32613c, c5461t2.f32614d, c5461t2.f32615e);
    }
}
