package p000;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.yandex.metrica.impl.p022ob.C3323i;
import com.yandex.metrica.impl.p022ob.C3505p;
import com.yandex.metrica.impl.p022ob.InterfaceC3531q;
import com.yandex.metrica.impl.p022ob.InterfaceC3583s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: kG0 */
/* loaded from: classes2.dex */
public final class C9987kG0 implements PurchaseHistoryResponseListener {

    /* renamed from: a */
    public final C3505p f36406a;

    /* renamed from: b */
    public final Executor f36407b;

    /* renamed from: c */
    public final Executor f36408c;

    /* renamed from: d */
    public final BillingClient f36409d;

    /* renamed from: e */
    public final InterfaceC3531q f36410e;

    /* renamed from: f */
    public final String f36411f;

    /* renamed from: g */
    public final C8779as1 f36412g;

    public C9987kG0(C3505p c3505p, Executor executor, Executor executor2, BillingClient billingClient, InterfaceC3531q interfaceC3531q, String str, C8779as1 c8779as1, C7355Au1 c7355Au1) {
        this.f36406a = c3505p;
        this.f36407b = executor;
        this.f36408c = executor2;
        this.f36409d = billingClient;
        this.f36410e = interfaceC3531q;
        this.f36411f = str;
        this.f36412g = c8779as1;
    }

    /* renamed from: a */
    public final void m22183a(HashMap map, Map map2) {
        InterfaceC3583s interfaceC3583sMo3445e = this.f36410e.mo3445e();
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (C8905br1 c8905br1 : map.values()) {
            if (map2.containsKey(c8905br1.f17191b)) {
                c8905br1.f17194e = jCurrentTimeMillis;
            } else {
                C8905br1 c8905br1Mo16101a = interfaceC3583sMo3445e.mo16101a(c8905br1.f17191b);
                if (c8905br1Mo16101a != null) {
                    c8905br1.f17194e = c8905br1Mo16101a.f17194e;
                }
            }
        }
        interfaceC3583sMo3445e.mo16102a(map);
        if (interfaceC3583sMo3445e.mo16103a() || !"inapp".equals(this.f36411f)) {
            return;
        }
        interfaceC3583sMo3445e.mo16104b();
    }

    /* renamed from: b */
    public final HashMap m22184b(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) it.next();
            EnumC7717Ht1 enumC7717Ht1M16072c = C3323i.m16072c(this.f36411f);
            String sku = purchaseHistoryRecord.getSku();
            map.put(sku, new C8905br1(enumC7717Ht1M16072c, sku, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0L));
        }
        return map;
    }

    @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
    public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
        this.f36407b.execute(new C6379lh(this, billingResult, list, 3, false));
    }
}
