package com.yandex.metrica.impl.p022ob;

import com.android.billingclient.api.SkuDetails;
import p000.C8235Rs1;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.l */
/* loaded from: classes2.dex */
public final class C3401l {

    /* renamed from: a */
    public static final C3401l f24148a = new C3401l();

    private C3401l() {
    }

    /* renamed from: b */
    private final int m16339b(SkuDetails skuDetails) {
        String freeTrialPeriod = skuDetails.getFreeTrialPeriod();
        O90.m5967e(freeTrialPeriod, "skuDetails.freeTrialPeriod");
        if (freeTrialPeriod.length() == 0) {
            return skuDetails.getIntroductoryPriceCycles();
        }
        return 1;
    }

    /* renamed from: c */
    private final C8235Rs1 m16340c(SkuDetails skuDetails) {
        String freeTrialPeriod = skuDetails.getFreeTrialPeriod();
        O90.m5967e(freeTrialPeriod, "skuDetails.freeTrialPeriod");
        return freeTrialPeriod.length() == 0 ? C8235Rs1.m7125a(skuDetails.getIntroductoryPricePeriod()) : C8235Rs1.m7125a(skuDetails.getFreeTrialPeriod());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C11474vt1 m16341a(com.android.billingclient.api.PurchaseHistoryRecord r22, com.android.billingclient.api.SkuDetails r23, com.android.billingclient.api.Purchase r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            java.lang.String r2 = "purchasesHistoryRecord"
            r3 = r22
            p000.O90.m5968f(r3, r2)
            java.lang.String r2 = "skuDetails"
            p000.O90.m5968f(r1, r2)
            vt1 r2 = new vt1
            java.lang.String r4 = r23.getType()
            java.lang.String r5 = "skuDetails.type"
            p000.O90.m5967e(r4, r5)
            int r5 = r4.hashCode()
            r6 = 3541555(0x360a33, float:4.962776E-39)
            if (r5 == r6) goto L35
            r6 = 100343516(0x5fb1edc, float:2.3615263E-35)
            if (r5 == r6) goto L2a
            goto L40
        L2a:
            java.lang.String r5 = "inapp"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L40
            Ht1 r4 = p000.EnumC7717Ht1.f4566a
            goto L42
        L35:
            java.lang.String r5 = "subs"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L40
            Ht1 r4 = p000.EnumC7717Ht1.f4567b
            goto L42
        L40:
            Ht1 r4 = p000.EnumC7717Ht1.f4568c
        L42:
            java.lang.String r5 = r23.getSku()
            int r6 = r22.getQuantity()
            long r7 = r23.getPriceAmountMicros()
            java.lang.String r9 = r23.getPriceCurrencyCode()
            long r10 = r0.m16338a(r1)
            Rs1 r12 = r0.m16340c(r1)
            int r13 = r0.m16339b(r1)
            java.lang.String r1 = r23.getSubscriptionPeriod()
            Rs1 r14 = p000.C8235Rs1.m7125a(r1)
            java.lang.String r15 = r22.getSignature()
            java.lang.String r16 = r22.getPurchaseToken()
            long r17 = r22.getPurchaseTime()
            if (r24 == 0) goto L7b
            boolean r1 = r24.isAutoRenewing()
        L78:
            r19 = r1
            goto L7d
        L7b:
            r1 = 0
            goto L78
        L7d:
            if (r24 == 0) goto L88
            java.lang.String r1 = r24.getOriginalJson()
            if (r1 == 0) goto L88
        L85:
            r20 = r1
            goto L8b
        L88:
            java.lang.String r1 = "{}"
            goto L85
        L8b:
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r9, r10, r12, r13, r14, r15, r16, r17, r19, r20)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C3401l.m16341a(com.android.billingclient.api.PurchaseHistoryRecord, com.android.billingclient.api.SkuDetails, com.android.billingclient.api.Purchase):vt1");
    }

    /* renamed from: a */
    private final long m16338a(SkuDetails skuDetails) {
        String freeTrialPeriod = skuDetails.getFreeTrialPeriod();
        O90.m5967e(freeTrialPeriod, "skuDetails.freeTrialPeriod");
        if (freeTrialPeriod.length() == 0) {
            return skuDetails.getIntroductoryPriceAmountMicros();
        }
        return 0L;
    }
}
