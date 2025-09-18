package com.my.tracker.obfuscated;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import defpackage.C0532Go1;
import defpackage.C2171ad1;
import defpackage.RunnableC1313Qp0;
import defpackage.RunnableC6880rf;
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

/* loaded from: classes2.dex */
public final class n0 {
    public static final Boolean g;
    private static final Set h;
    final BillingClientStateListener a;
    private final AtomicBoolean b = new AtomicBoolean();
    private final List c;
    private final String d;
    private final b e;
    private final BillingClient f;

    public class a implements BillingClientStateListener {
        final AtomicInteger a = new AtomicInteger(0);
        final /* synthetic */ b b;

        public a(b bVar) {
            this.b = bVar;
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingServiceDisconnected() {
            if (this.a.incrementAndGet() >= 3 || !n0.this.c()) {
                y2.a("GooglePlayProductHelper: exceeded numbers of billing client connection attempts");
                this.b.a(1, Collections.EMPTY_MAP);
                n0.this.a();
            }
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingSetupFinished(BillingResult billingResult) {
            if (billingResult == null || billingResult.getResponseCode() != 0) {
                y2.a("GooglePlayProductHelper: error while connecting with billing client");
                onBillingServiceDisconnected();
            } else {
                y2.a("GooglePlayProductHelper: connection with billing client has been established");
                this.a.set(0);
                n0.this.b();
            }
        }
    }

    public interface b {
        void a(int i, Map map);
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
            com.my.tracker.obfuscated.n0.g = r1
            if (r0 == 0) goto L23
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L20:
            com.my.tracker.obfuscated.n0.h = r0
            goto L26
        L23:
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            goto L20
        L26:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.n0.<clinit>():void");
    }

    private n0(List list, String str, b bVar, Context context) {
        this.c = list;
        this.e = bVar;
        this.f = BillingClient.newBuilder(context).setListener(new C2171ad1(6)).enablePendingPurchases().build();
        this.d = str;
        this.a = new a(bVar);
    }

    public static /* synthetic */ void a(BillingResult billingResult, List list) {
    }

    public /* synthetic */ void c(BillingResult billingResult, List list) {
        m.a(new RunnableC1313Qp0(this, billingResult, list, 25));
        a();
    }

    /* renamed from: d */
    public void b(BillingResult billingResult, List list) {
        if (!this.b.compareAndSet(false, true)) {
            y2.a("GooglePlayProductHelper: skuDetails has already been received");
            return;
        }
        int responseCode = billingResult != null ? billingResult.getResponseCode() : 6;
        if (responseCode != 0) {
            y2.a("GooglePlayProductHelper: getSkuDetails completed with errorCode: " + responseCode + ", message: " + (billingResult != null ? billingResult.getDebugMessage() : "{empty message}"));
            this.e.a(1, Collections.EMPTY_MAP);
            return;
        }
        if (list == null || list.isEmpty()) {
            y2.a("GooglePlayProductHelper: null list of skuDetail has been received");
            this.e.a(0, Collections.EMPTY_MAP);
            return;
        }
        HashMap map = new HashMap();
        y2.a("GooglePlayProductHelper: populating map of skuDetails data");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SkuDetails skuDetails = (SkuDetails) it.next();
            try {
                map.put(skuDetails.getSku(), new JSONObject(skuDetails.getOriginalJson()));
            } catch (Throwable th) {
                y2.b("GooglePlayProductHelper error: exception while parsing skuData", th);
            }
        }
        this.e.a(0, map);
    }

    public static p0 a(Object obj) {
        if (!g.booleanValue()) {
            y2.b("GooglePlayProductHelper: purchase helper is disabled");
            return null;
        }
        try {
            if (obj instanceof Purchase) {
                Purchase purchase = (Purchase) obj;
                return p0.a(purchase.getOriginalJson(), purchase.getSignature(), w2.a());
            }
        } catch (Throwable th) {
            y2.b("GooglePlayProductHelper error: exception occurred while processing uncasted object", th);
        }
        return null;
    }

    public void b() {
        try {
            y2.a("GooglePlayProductHelper: querying for " + this.d);
            this.f.querySkuDetailsAsync(SkuDetailsParams.newBuilder().setSkusList(this.c).setType(this.d).build(), new C0532Go1(10, this));
        } catch (Throwable th) {
            y2.b("GooglePlayProductHelper error: exception while querying details for " + this.d, th);
            a();
        }
    }

    public boolean c() {
        try {
            y2.a("GooglePlayProductHelper: start connection with billing client");
            this.f.startConnection(this.a);
            h.add(this);
            return true;
        } catch (Throwable th) {
            y2.b("GooglePlayProductHelper error: exception while start connection:", th);
            return false;
        }
    }

    public void a() {
        try {
            y2.a("GooglePlayProductHelper: end connection with billing client");
            h.remove(this);
            this.f.endConnection();
        } catch (Throwable th) {
            y2.b("GooglePlayProductHelper error: exception while end connection:", th);
        }
    }

    public static void a(List list, boolean z, b bVar, Context context) {
        if (list.isEmpty()) {
            y2.a("GooglePlayProductHelper: empty purchases list");
            bVar.a(0, Collections.EMPTY_MAP);
            return;
        }
        String str = z ? "subs" : "inapp";
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strC = ((p0) it.next()).c();
            if (!arrayList.contains(strC)) {
                arrayList.add(strC);
            }
        }
        m.f(new RunnableC6880rf(arrayList, str, bVar, context, 21));
    }

    public static /* synthetic */ void a(List list, String str, b bVar, Context context) {
        n0 n0Var;
        try {
            n0Var = new n0(list, str, bVar, context);
        } catch (Throwable th) {
            y2.b("GooglePlayProductHelper error: error while creating ProductHelper", th);
        }
        if (n0Var.c()) {
            return;
        }
        n0Var.a();
        bVar.a(1, Collections.EMPTY_MAP);
    }
}
