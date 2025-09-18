package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.s2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4850s2 implements ProtobufConverter {
    public final C4442b3 a;

    public C4850s2() {
        this(new C4442b3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4898u2 fromModel(C4826r2 c4826r2) {
        C4898u2 c4898u2 = new C4898u2();
        c4898u2.a = new C4874t2[c4826r2.a.size()];
        int i = 0;
        for (BillingInfo billingInfo : c4826r2.a) {
            C4874t2[] c4874t2Arr = c4898u2.a;
            this.a.getClass();
            c4874t2Arr[i] = C4442b3.a(billingInfo);
            i++;
        }
        c4898u2.b = c4826r2.b;
        return c4898u2;
    }

    public C4850s2(C4442b3 c4442b3) {
        this.a = c4442b3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4826r2 toModel(C4898u2 c4898u2) {
        ProductType productType;
        ArrayList arrayList = new ArrayList(c4898u2.a.length);
        for (C4874t2 c4874t2 : c4898u2.a) {
            this.a.getClass();
            int i = c4874t2.a;
            if (i == 2) {
                productType = ProductType.INAPP;
            } else if (i != 3) {
                productType = ProductType.UNKNOWN;
            } else {
                productType = ProductType.SUBS;
            }
            arrayList.add(new BillingInfo(productType, c4874t2.b, c4874t2.c, c4874t2.d, c4874t2.e));
        }
        return new C4826r2(arrayList, c4898u2.b);
    }
}
