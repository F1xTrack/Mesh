package defpackage;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.yandex.metrica.impl.ob.C2814i;
import com.yandex.metrica.impl.ob.C2988p;
import com.yandex.metrica.impl.ob.InterfaceC3013q;
import com.yandex.metrica.impl.ob.InterfaceC3062s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: kG0 */
/* loaded from: classes2.dex */
public final class C5470kG0 implements PurchaseHistoryResponseListener {
    public final C2988p a;
    public final Executor b;
    public final Executor c;
    public final BillingClient d;
    public final InterfaceC3013q e;
    public final String f;
    public final C2216as1 g;

    public C5470kG0(C2988p c2988p, Executor executor, Executor executor2, BillingClient billingClient, InterfaceC3013q interfaceC3013q, String str, C2216as1 c2216as1, C0082Au1 c0082Au1) {
        this.a = c2988p;
        this.b = executor;
        this.c = executor2;
        this.d = billingClient;
        this.e = interfaceC3013q;
        this.f = str;
        this.g = c2216as1;
    }

    public final void a(HashMap map, Map map2) {
        InterfaceC3062s interfaceC3062sE = this.e.e();
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (C2404br1 c2404br1 : map.values()) {
            if (map2.containsKey(c2404br1.b)) {
                c2404br1.e = jCurrentTimeMillis;
            } else {
                C2404br1 c2404br1A = interfaceC3062sE.a(c2404br1.b);
                if (c2404br1A != null) {
                    c2404br1.e = c2404br1A.e;
                }
            }
        }
        interfaceC3062sE.a(map);
        if (interfaceC3062sE.a() || !"inapp".equals(this.f)) {
            return;
        }
        interfaceC3062sE.b();
    }

    public final HashMap b(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) it.next();
            EnumC0625Ht1 enumC0625Ht1C = C2814i.c(this.f);
            String sku = purchaseHistoryRecord.getSku();
            map.put(sku, new C2404br1(enumC0625Ht1C, sku, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0L));
        }
        return map;
    }

    @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
    public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
        this.b.execute(new C5741lh(this, billingResult, list, 3, false));
    }
}
