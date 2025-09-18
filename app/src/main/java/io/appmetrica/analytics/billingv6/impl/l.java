package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import defpackage.AbstractC8069xu;
import defpackage.O90;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class l extends SafeRunnable {
    public final /* synthetic */ p a;
    public final /* synthetic */ BillingResult b;
    public final /* synthetic */ List c;

    public l(p pVar, BillingResult billingResult, List list) {
        this.a = pVar;
        this.b = billingResult;
        this.c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        p pVar = this.a;
        BillingResult billingResult = this.b;
        List<PurchaseHistoryRecord> list = this.c;
        pVar.getClass();
        if (billingResult.getResponseCode() == 0 && list != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
                for (String str : purchaseHistoryRecord.getProducts()) {
                    String str2 = pVar.d;
                    BillingInfo billingInfo = new BillingInfo(O90.a(str2, "inapp") ? ProductType.INAPP : O90.a(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = pVar.c.getUpdatePolicy().getBillingInfoToUpdate(pVar.a, linkedHashMap, pVar.c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                t.a(linkedHashMap, billingInfoToUpdate, pVar.d, pVar.c.getBillingInfoManager());
            } else {
                List listB0 = AbstractC8069xu.b0(billingInfoToUpdate.keySet());
                m mVar = new m(linkedHashMap, billingInfoToUpdate, pVar);
                String str3 = pVar.d;
                BillingClient billingClient = pVar.b;
                UtilsProvider utilsProvider = pVar.c;
                g gVar = pVar.e;
                k kVar = new k(str3, billingClient, utilsProvider, mVar, list, gVar);
                gVar.c.add(kVar);
                pVar.c.getUiExecutor().execute(new o(pVar, listB0, kVar));
            }
        }
        p pVar2 = this.a;
        pVar2.e.a(pVar2);
    }
}
