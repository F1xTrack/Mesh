package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.my.tracker.obfuscated.f0;
import com.my.tracker.obfuscated.n0;
import defpackage.C0532Go1;
import defpackage.RunnableC1313Qp0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class o0 {
    final Context a;
    final f0 b;
    final f0.c c = new C0532Go1(11, this);

    public final class a implements n0.b {
        private final List a;

        public a(List list) {
            this.a = list;
        }

        public /* synthetic */ void a(Map map) {
            for (p0 p0Var : this.a) {
                p0Var.a((JSONObject) map.get(p0Var.c()));
            }
            o0.this.b.d(this.a);
        }

        @Override // com.my.tracker.obfuscated.n0.b
        public void a(int i, Map map) {
            if (i == 1) {
                y2.b("GooglePlayPurchaseHandler error: can't retrieve information about products");
            } else {
                m.a(new B(this, 2, map));
            }
        }
    }

    private o0(f0 f0Var, Context context) {
        this.b = f0Var;
        this.a = context.getApplicationContext();
    }

    public void a() {
        this.b.a(this.c);
    }

    public void b(List list) {
        y2.a("GooglePlayPurchaseHandler: processing raw purchases");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p0 p0Var = (p0) it.next();
            String strC = p0Var.c();
            if (p0Var.g()) {
                y2.a("GooglePlayPurchaseHandler: inapp raw purchase, product id: " + strC);
                arrayList2.add(p0Var);
            } else {
                y2.a("GooglePlayPurchaseHandler: subs raw purchase, product id: " + strC);
                arrayList.add(p0Var);
            }
        }
        a((List) arrayList, false);
        a((List) arrayList2, true);
    }

    public /* synthetic */ void a(String str, String str2) {
        p0 p0VarA = p0.a(str, str2, w2.a());
        if (p0VarA == null) {
            return;
        }
        this.b.a(Collections.singletonList(p0VarA), this.c);
    }

    public /* synthetic */ void a(List list) {
        y2.a("GooglePlayPurchaseHandler: iterating over unchecked list of objects");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p0 p0VarA = n0.a(it.next());
            if (p0VarA == null) {
                y2.a("GooglePlayPurchaseHandler: null purchase data after processing");
            } else {
                arrayList.add(p0VarA);
            }
        }
        if (arrayList.isEmpty()) {
            y2.a("GooglePlayPurchaseHandler: skip empty purchases list");
        } else {
            this.b.a(arrayList, this.c);
        }
    }

    public static o0 a(f0 f0Var, Context context) {
        return new o0(f0Var, context);
    }

    public void a(int i, Intent intent) {
        if (!n0.g.booleanValue()) {
            y2.b("GooglePlayPurchaseHandler error: classes com.android.billingclient:billing aren't found");
            return;
        }
        if (i != -1) {
            y2.a("GooglePlayPurchaseHandler: result code isn't equal to RESULT_OK");
            return;
        }
        if (intent == null) {
            y2.a("GooglePlayPurchaseHandler: empty intent has been received");
            return;
        }
        String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
        if (TextUtils.isEmpty(stringExtra)) {
            y2.a("GooglePlayPurchaseHandler: empty purchase data in intent");
            return;
        }
        String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if (stringExtra2 == null) {
            y2.a("GooglePlayPurchaseHandler: null data signature in intent");
        } else {
            m.a(new RunnableC1313Qp0(this, stringExtra, stringExtra2, 26));
        }
    }

    public void a(int i, List list) {
        if (i != 0) {
            y2.a("GooglePlayPurchaseHandler: response code isn't equal to BILLING_OK_RESPONSE_CODE");
            return;
        }
        if (list == null || list.isEmpty()) {
            y2.a("GooglePlayPurchaseHandler: null or empty purchases list has been received");
        } else if (n0.g.booleanValue()) {
            m.a(new io.sentry.cache.f(this, 8, list));
        } else {
            y2.b("GooglePlayPurchaseHandler error: classes com.android.billingclient:billing aren't found");
        }
    }

    public void a(List list, boolean z) {
        if (list.isEmpty()) {
            y2.a(z ? "GooglePlayPurchaseHandler: empty inapp raw purchases list" : "GooglePlayPurchaseHandler: empty subs raw purchases list");
        } else {
            n0.a(list, z, new a(list), this.a);
        }
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {
        this.b.a(jSONObject, jSONObject2, str, map);
    }
}
