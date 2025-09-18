package com.p018my.tracker.obfuscated;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import p000.C7655Go1;
import p000.C8749ad1;
import p000.RunnableC6757rf;
import p000.RunnableC8176Qp0;

/* renamed from: com.my.tracker.obfuscated.n0 */
/* loaded from: classes2.dex */
public final class C2345n0 {

    /* renamed from: g */
    public static final Boolean f20050g;

    /* renamed from: h */
    private static final Set f20051h;

    /* renamed from: a */
    final BillingClientStateListener f20052a;

    /* renamed from: b */
    private final AtomicBoolean f20053b = new AtomicBoolean();

    /* renamed from: c */
    private final List f20054c;

    /* renamed from: d */
    private final String f20055d;

    /* renamed from: e */
    private final b f20056e;

    /* renamed from: f */
    private final BillingClient f20057f;

    /* renamed from: com.my.tracker.obfuscated.n0$a */
    public class a implements BillingClientStateListener {

        /* renamed from: a */
        final AtomicInteger f20058a = new AtomicInteger(0);

        /* renamed from: b */
        final /* synthetic */ b f20059b;

        public a(b bVar) {
            this.f20059b = bVar;
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingServiceDisconnected() {
            if (this.f20058a.incrementAndGet() >= 3 || !C2345n0.this.m13336c()) {
                AbstractC2391y2.m13568a("GooglePlayProductHelper: exceeded numbers of billing client connection attempts");
                this.f20059b.mo13338a(1, Collections.EMPTY_MAP);
                C2345n0.this.m13334a();
            }
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingSetupFinished(BillingResult billingResult) {
            if (billingResult == null || billingResult.getResponseCode() != 0) {
                AbstractC2391y2.m13568a("GooglePlayProductHelper: error while connecting with billing client");
                onBillingServiceDisconnected();
            } else {
                AbstractC2391y2.m13568a("GooglePlayProductHelper: connection with billing client has been established");
                this.f20058a.set(0);
                C2345n0.this.m13335b();
            }
        }
    }

    /* renamed from: com.my.tracker.obfuscated.n0$b */
    public interface b {
        /* renamed from: a */
        void mo13338a(int i, Map map);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0012  */
    static {
        /*
            java.lang.Class<com.android.billingclient.api.BillingClient> r0 = com.android.billingclient.api.BillingClient.class
            java.lang.Class<com.android.billingclient.api.Purchase> r1 = com.android.billingclient.api.Purchase.class
            boolean r1 = r1.equals(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L12
            boolean r0 = r0.equals(r0)     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            com.p018my.tracker.obfuscated.C2345n0.f20050g = r1
            if (r0 == 0) goto L23
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L20:
            com.p018my.tracker.obfuscated.C2345n0.f20051h = r0
            goto L26
        L23:
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            goto L20
        L26:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p018my.tracker.obfuscated.C2345n0.<clinit>():void");
    }

    private C2345n0(List list, String str, b bVar, Context context) {
        this.f20054c = list;
        this.f20056e = bVar;
        this.f20057f = BillingClient.newBuilder(context).setListener(new C8749ad1(6)).enablePendingPurchases().build();
        this.f20055d = str;
        this.f20052a = new a(bVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m13325a(BillingResult billingResult, List list) {
    }

    /* renamed from: c */
    public /* synthetic */ void m13329c(BillingResult billingResult, List list) {
        AbstractC2340m.m13290a(new RunnableC8176Qp0(this, billingResult, list, 25));
        m13334a();
    }

    /* renamed from: d */
    public void m13328b(BillingResult billingResult, List list) {
        if (!this.f20053b.compareAndSet(false, true)) {
            AbstractC2391y2.m13568a("GooglePlayProductHelper: skuDetails has already been received");
            return;
        }
        int responseCode = billingResult != null ? billingResult.getResponseCode() : 6;
        if (responseCode != 0) {
            AbstractC2391y2.m13568a("GooglePlayProductHelper: getSkuDetails completed with errorCode: " + responseCode + ", message: " + (billingResult != null ? billingResult.getDebugMessage() : "{empty message}"));
            this.f20056e.mo13338a(1, Collections.EMPTY_MAP);
            return;
        }
        if (list == null || list.isEmpty()) {
            AbstractC2391y2.m13568a("GooglePlayProductHelper: null list of skuDetail has been received");
            this.f20056e.mo13338a(0, Collections.EMPTY_MAP);
            return;
        }
        HashMap map = new HashMap();
        AbstractC2391y2.m13568a("GooglePlayProductHelper: populating map of skuDetails data");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SkuDetails skuDetails = (SkuDetails) it.next();
            try {
                map.put(skuDetails.getSku(), new JSONObject(skuDetails.getOriginalJson()));
            } catch (Throwable th) {
                AbstractC2391y2.m13573b("GooglePlayProductHelper error: exception while parsing skuData", th);
            }
        }
        this.f20056e.mo13338a(0, map);
    }

    /* renamed from: a */
    public static C2353p0 m13324a(Object obj) {
        if (!f20050g.booleanValue()) {
            AbstractC2391y2.m13572b("GooglePlayProductHelper: purchase helper is disabled");
            return null;
        }
        try {
            if (obj instanceof Purchase) {
                Purchase purchase = (Purchase) obj;
                return C2353p0.m13371a(purchase.getOriginalJson(), purchase.getSignature(), AbstractC2383w2.m13528a());
            }
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("GooglePlayProductHelper error: exception occurred while processing uncasted object", th);
        }
        return null;
    }

    /* renamed from: b */
    public void m13335b() {
        try {
            AbstractC2391y2.m13568a("GooglePlayProductHelper: querying for " + this.f20055d);
            this.f20057f.querySkuDetailsAsync(SkuDetailsParams.newBuilder().setSkusList(this.f20054c).setType(this.f20055d).build(), new C7655Go1(10, this));
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("GooglePlayProductHelper error: exception while querying details for " + this.f20055d, th);
            m13334a();
        }
    }

    /* renamed from: c */
    public boolean m13336c() {
        try {
            AbstractC2391y2.m13568a("GooglePlayProductHelper: start connection with billing client");
            this.f20057f.startConnection(this.f20052a);
            f20051h.add(this);
            return true;
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("GooglePlayProductHelper error: exception while start connection:", th);
            return false;
        }
    }

    /* renamed from: a */
    public void m13334a() {
        try {
            AbstractC2391y2.m13568a("GooglePlayProductHelper: end connection with billing client");
            f20051h.remove(this);
            this.f20057f.endConnection();
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("GooglePlayProductHelper error: exception while end connection:", th);
        }
    }

    /* renamed from: a */
    public static void m13327a(List list, boolean z, b bVar, Context context) {
        if (list.isEmpty()) {
            AbstractC2391y2.m13568a("GooglePlayProductHelper: empty purchases list");
            bVar.mo13338a(0, Collections.EMPTY_MAP);
            return;
        }
        String str = z ? "subs" : "inapp";
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strM13377c = ((C2353p0) it.next()).m13377c();
            if (!arrayList.contains(strM13377c)) {
                arrayList.add(strM13377c);
            }
        }
        AbstractC2340m.m13295f(new RunnableC6757rf(arrayList, str, bVar, context, 21));
    }

    /* renamed from: a */
    public static /* synthetic */ void m13326a(List list, String str, b bVar, Context context) {
        C2345n0 c2345n0;
        try {
            c2345n0 = new C2345n0(list, str, bVar, context);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("GooglePlayProductHelper error: error while creating ProductHelper", th);
        }
        if (c2345n0.m13336c()) {
            return;
        }
        c2345n0.m13334a();
        bVar.mo13338a(1, Collections.EMPTY_MAP);
    }
}
