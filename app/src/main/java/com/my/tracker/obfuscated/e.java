package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import com.my.tracker.obfuscated.d;
import com.my.tracker.obfuscated.f0;
import defpackage.N61;
import defpackage.RunnableC7474um;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e implements f0.a, d.b {
    final f0 a;
    final q1 b;
    final d c;

    private e(f0 f0Var, q1 q1Var, d.a aVar) {
        this.a = f0Var;
        this.b = q1Var;
        this.c = aVar.a(this);
    }

    @Override // com.my.tracker.obfuscated.d.b
    public void c(List list) {
        if (list.isEmpty()) {
            y2.a("AppGalleryPurchaseHandler: can't trackAppGalleryRawPurchases, appGalleryRawPurchases is empty");
        } else {
            this.a.c(list);
        }
    }

    public /* synthetic */ void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.b.b() < 86400000) {
            y2.a("AppGalleryPurchaseHandler: not yet time for tracking");
        } else {
            this.c.a();
            this.b.a(jCurrentTimeMillis);
        }
    }

    public void a() {
        this.a.a(this);
        c();
    }

    public void c() {
        m.a(new N61(15, this));
    }

    public /* synthetic */ void a(Object obj, String str, String str2, String str3, Map map) {
        JSONObject jSONObjectA = d.a(obj);
        if (jSONObjectA == null) {
            y2.a("AppGalleryPurchaseHandler: error parse productInfo object");
        } else {
            this.a.a(jSONObjectA, str, str2, str3, map);
        }
    }

    @Override // com.my.tracker.obfuscated.f0.a
    public void b(List list) {
        if (list.isEmpty()) {
            y2.a("AppGalleryPurchaseHandler: empty subs raw purchases list");
        } else {
            this.c.a(list);
        }
    }

    public static e a(f0 f0Var, q1 q1Var, Context context) {
        d.a aVarA = d.a(context.getApplicationContext());
        if (aVarA != null) {
            return new e(f0Var, q1Var, aVarA);
        }
        y2.a("AppGalleryPurchaseHandler: can't support appGallery purchases ");
        return null;
    }

    public void b(Object obj, String str, String str2, String str3, Map map) {
        m.a(new RunnableC7474um(this, obj, str, str2, str3, map));
    }

    public void a(int i, Intent intent) {
        if (i != -1) {
            y2.a("AppGalleryPurchaseHandler: result code isn't equal to RESULT_OK");
        } else if (intent == null) {
            y2.a("AppGalleryPurchaseHandler: empty intent has been received");
        } else {
            this.c.a(intent);
        }
    }

    @Override // com.my.tracker.obfuscated.d.b
    public void a(List list) {
        if (list.isEmpty()) {
            y2.a("AppGalleryPurchaseHandler: can't addAppGalleryRawPurchases, appGalleryRawPurchases is empty");
        } else {
            this.a.a(list, this);
        }
    }
}
