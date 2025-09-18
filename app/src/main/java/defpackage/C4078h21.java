package defpackage;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.yandex.metrica.impl.ob.InterfaceC3013q;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: h21, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4078h21 implements SkuDetailsResponseListener {
    public final String a;
    public final Executor b;
    public final BillingClient c;
    public final InterfaceC3013q d;
    public final CQ1 e;
    public final Map f;
    public final C2216as1 g;

    public C4078h21(String str, Executor executor, BillingClient billingClient, InterfaceC3013q interfaceC3013q, CQ1 cq1, Map map, C2216as1 c2216as1) {
        this.a = str;
        this.b = executor;
        this.c = billingClient;
        this.d = interfaceC3013q;
        this.e = cq1;
        this.f = map;
        this.g = c2216as1;
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        Purchase.PurchasesResult purchasesResultQueryPurchases = this.c.queryPurchases(this.a);
        List<Purchase> purchasesList = purchasesResultQueryPurchases.getPurchasesList();
        if (purchasesResultQueryPurchases.getResponseCode() == 0 && purchasesList != null) {
            for (Purchase purchase : purchasesList) {
                map.put(purchase.getSku(), purchase);
            }
        }
        return map;
    }

    @Override // com.android.billingclient.api.SkuDetailsResponseListener
    public final void onSkuDetailsResponse(BillingResult billingResult, List list) {
        this.b.execute(new C5741lh(this, billingResult, list, 8, false));
    }
}
