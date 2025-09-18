package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p018my.tracker.obfuscated.C2313f0;
import com.p018my.tracker.obfuscated.C2345n0;
import io.sentry.cache.RunnableC5994f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p000.C7655Go1;
import p000.RunnableC8176Qp0;

/* renamed from: com.my.tracker.obfuscated.o0 */
/* loaded from: classes2.dex */
public final class C2349o0 {

    /* renamed from: a */
    final Context f20070a;

    /* renamed from: b */
    final C2313f0 f20071b;

    /* renamed from: c */
    final C2313f0.c f20072c = new C7655Go1(11, this);

    /* renamed from: com.my.tracker.obfuscated.o0$a */
    public final class a implements C2345n0.b {

        /* renamed from: a */
        private final List f20073a;

        public a(List list) {
            this.f20073a = list;
        }

        /* renamed from: a */
        public /* synthetic */ void m13365a(Map map) {
            for (C2353p0 c2353p0 : this.f20073a) {
                c2353p0.m13374a((JSONObject) map.get(c2353p0.m13377c()));
            }
            C2349o0.this.f20071b.m13087d(this.f20073a);
        }

        @Override // com.p018my.tracker.obfuscated.C2345n0.b
        /* renamed from: a */
        public void mo13338a(int i, Map map) {
            if (i == 1) {
                AbstractC2391y2.m13572b("GooglePlayPurchaseHandler error: can't retrieve information about products");
            } else {
                AbstractC2340m.m13290a(new RunnableC2288B(this, 2, map));
            }
        }
    }

    private C2349o0(C2313f0 c2313f0, Context context) {
        this.f20071b = c2313f0;
        this.f20070a = context.getApplicationContext();
    }

    /* renamed from: a */
    public void m13358a() {
        this.f20071b.m13061a(this.f20072c);
    }

    /* renamed from: b */
    public void m13363b(List list) {
        AbstractC2391y2.m13568a("GooglePlayPurchaseHandler: processing raw purchases");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2353p0 c2353p0 = (C2353p0) it.next();
            String strM13377c = c2353p0.m13377c();
            if (c2353p0.m13381g()) {
                AbstractC2391y2.m13568a("GooglePlayPurchaseHandler: inapp raw purchase, product id: " + strM13377c);
                arrayList2.add(c2353p0);
            } else {
                AbstractC2391y2.m13568a("GooglePlayPurchaseHandler: subs raw purchase, product id: " + strM13377c);
                arrayList.add(c2353p0);
            }
        }
        m13361a((List) arrayList, false);
        m13361a((List) arrayList2, true);
    }

    /* renamed from: a */
    public /* synthetic */ void m13355a(String str, String str2) {
        C2353p0 c2353p0M13371a = C2353p0.m13371a(str, str2, AbstractC2383w2.m13528a());
        if (c2353p0M13371a == null) {
            return;
        }
        this.f20071b.m13069a(Collections.singletonList(c2353p0M13371a), this.f20072c);
    }

    /* renamed from: a */
    public /* synthetic */ void m13356a(List list) {
        AbstractC2391y2.m13568a("GooglePlayPurchaseHandler: iterating over unchecked list of objects");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2353p0 c2353p0M13324a = C2345n0.m13324a(it.next());
            if (c2353p0M13324a == null) {
                AbstractC2391y2.m13568a("GooglePlayPurchaseHandler: null purchase data after processing");
            } else {
                arrayList.add(c2353p0M13324a);
            }
        }
        if (arrayList.isEmpty()) {
            AbstractC2391y2.m13568a("GooglePlayPurchaseHandler: skip empty purchases list");
        } else {
            this.f20071b.m13069a(arrayList, this.f20072c);
        }
    }

    /* renamed from: a */
    public static C2349o0 m13353a(C2313f0 c2313f0, Context context) {
        return new C2349o0(c2313f0, context);
    }

    /* renamed from: a */
    public void m13359a(int i, Intent intent) {
        if (!C2345n0.f20050g.booleanValue()) {
            AbstractC2391y2.m13572b("GooglePlayPurchaseHandler error: classes com.android.billingclient:billing aren't found");
            return;
        }
        if (i != -1) {
            AbstractC2391y2.m13568a("GooglePlayPurchaseHandler: result code isn't equal to RESULT_OK");
            return;
        }
        if (intent == null) {
            AbstractC2391y2.m13568a("GooglePlayPurchaseHandler: empty intent has been received");
            return;
        }
        String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
        if (TextUtils.isEmpty(stringExtra)) {
            AbstractC2391y2.m13568a("GooglePlayPurchaseHandler: empty purchase data in intent");
            return;
        }
        String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if (stringExtra2 == null) {
            AbstractC2391y2.m13568a("GooglePlayPurchaseHandler: null data signature in intent");
        } else {
            AbstractC2340m.m13290a(new RunnableC8176Qp0(this, stringExtra, stringExtra2, 26));
        }
    }

    /* renamed from: a */
    public void m13360a(int i, List list) {
        if (i != 0) {
            AbstractC2391y2.m13568a("GooglePlayPurchaseHandler: response code isn't equal to BILLING_OK_RESPONSE_CODE");
            return;
        }
        if (list == null || list.isEmpty()) {
            AbstractC2391y2.m13568a("GooglePlayPurchaseHandler: null or empty purchases list has been received");
        } else if (C2345n0.f20050g.booleanValue()) {
            AbstractC2340m.m13290a(new RunnableC5994f(this, 8, list));
        } else {
            AbstractC2391y2.m13572b("GooglePlayPurchaseHandler error: classes com.android.billingclient:billing aren't found");
        }
    }

    /* renamed from: a */
    public void m13361a(List list, boolean z) {
        if (list.isEmpty()) {
            AbstractC2391y2.m13568a(z ? "GooglePlayPurchaseHandler: empty inapp raw purchases list" : "GooglePlayPurchaseHandler: empty subs raw purchases list");
        } else {
            C2345n0.m13327a(list, z, new a(list), this.f20070a);
        }
    }

    /* renamed from: a */
    public void m13362a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {
        this.f20071b.m13071a(jSONObject, jSONObject2, str, map);
    }
}
