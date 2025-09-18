package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.AbstractC7167xu;
import p000.O90;

/* renamed from: io.appmetrica.analytics.billingv6.impl.l */
/* loaded from: classes2.dex */
public final class C4302l extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C4306p f29598a;

    /* renamed from: b */
    public final /* synthetic */ BillingResult f29599b;

    /* renamed from: c */
    public final /* synthetic */ List f29600c;

    public C4302l(C4306p c4306p, BillingResult billingResult, List list) {
        this.f29598a = c4306p;
        this.f29599b = billingResult;
        this.f29600c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C4306p c4306p = this.f29598a;
        BillingResult billingResult = this.f29599b;
        List<PurchaseHistoryRecord> list = this.f29600c;
        c4306p.getClass();
        if (billingResult.getResponseCode() == 0 && list != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
                for (String str : purchaseHistoryRecord.getProducts()) {
                    String str2 = c4306p.f29612d;
                    BillingInfo billingInfo = new BillingInfo(O90.m5963a(str2, "inapp") ? ProductType.INAPP : O90.m5963a(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = c4306p.f29611c.getUpdatePolicy().getBillingInfoToUpdate(c4306p.f29609a, linkedHashMap, c4306p.f29611c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                C4310t.m19154a(linkedHashMap, billingInfoToUpdate, c4306p.f29612d, c4306p.f29611c.getBillingInfoManager());
            } else {
                List listM25982b0 = AbstractC7167xu.m25982b0(billingInfoToUpdate.keySet());
                C4303m c4303m = new C4303m(linkedHashMap, billingInfoToUpdate, c4306p);
                String str3 = c4306p.f29612d;
                BillingClient billingClient = c4306p.f29610b;
                UtilsProvider utilsProvider = c4306p.f29611c;
                C4297g c4297g = c4306p.f29613e;
                C4301k c4301k = new C4301k(str3, billingClient, utilsProvider, c4303m, list, c4297g);
                c4297g.f29584c.add(c4301k);
                c4306p.f29611c.getUiExecutor().execute(new C4305o(c4306p, listM25982b0, c4301k));
            }
        }
        C4306p c4306p2 = this.f29598a;
        c4306p2.f29613e.m19153a(c4306p2);
    }
}
