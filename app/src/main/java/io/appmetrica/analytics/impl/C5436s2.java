package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.s2 */
/* loaded from: classes2.dex */
public final class C5436s2 implements ProtobufConverter {

    /* renamed from: a */
    public final C5012b3 f32531a;

    public C5436s2() {
        this(new C5012b3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5486u2 fromModel(C5411r2 c5411r2) {
        C5486u2 c5486u2 = new C5486u2();
        c5486u2.f32669a = new C5461t2[c5411r2.f32494a.size()];
        int i = 0;
        for (BillingInfo billingInfo : c5411r2.f32494a) {
            C5461t2[] c5461t2Arr = c5486u2.f32669a;
            this.f32531a.getClass();
            c5461t2Arr[i] = C5012b3.m20136a(billingInfo);
            i++;
        }
        c5486u2.f32670b = c5411r2.f32495b;
        return c5486u2;
    }

    public C5436s2(C5012b3 c5012b3) {
        this.f32531a = c5012b3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5411r2 toModel(C5486u2 c5486u2) {
        ProductType productType;
        ArrayList arrayList = new ArrayList(c5486u2.f32669a.length);
        for (C5461t2 c5461t2 : c5486u2.f32669a) {
            this.f32531a.getClass();
            int i = c5461t2.f32611a;
            if (i == 2) {
                productType = ProductType.INAPP;
            } else if (i != 3) {
                productType = ProductType.UNKNOWN;
            } else {
                productType = ProductType.SUBS;
            }
            arrayList.add(new BillingInfo(productType, c5461t2.f32612b, c5461t2.f32613c, c5461t2.f32614d, c5461t2.f32615e));
        }
        return new C5411r2(arrayList, c5486u2.f32670b);
    }
}
