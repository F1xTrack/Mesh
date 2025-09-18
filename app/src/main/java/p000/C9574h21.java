package p000;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.yandex.metrica.impl.p022ob.InterfaceC3531q;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: h21, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9574h21 implements SkuDetailsResponseListener {

    /* renamed from: a */
    public final String f28174a;

    /* renamed from: b */
    public final Executor f28175b;

    /* renamed from: c */
    public final BillingClient f28176c;

    /* renamed from: d */
    public final InterfaceC3531q f28177d;

    /* renamed from: e */
    public final CQ1 f28178e;

    /* renamed from: f */
    public final Map f28179f;

    /* renamed from: g */
    public final C8779as1 f28180g;

    public C9574h21(String str, Executor executor, BillingClient billingClient, InterfaceC3531q interfaceC3531q, CQ1 cq1, Map map, C8779as1 c8779as1) {
        this.f28174a = str;
        this.f28175b = executor;
        this.f28176c = billingClient;
        this.f28177d = interfaceC3531q;
        this.f28178e = cq1;
        this.f28179f = map;
        this.f28180g = c8779as1;
    }

    /* renamed from: a */
    public final HashMap m18701a() {
        HashMap map = new HashMap();
        Purchase.PurchasesResult purchasesResultQueryPurchases = this.f28176c.queryPurchases(this.f28174a);
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
        this.f28175b.execute(new C6379lh(this, billingResult, list, 8, false));
    }
}
