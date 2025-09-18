package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import com.p018my.tracker.obfuscated.C2304d;
import com.p018my.tracker.obfuscated.C2313f0;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p000.N61;
import p000.RunnableC6970um;

/* renamed from: com.my.tracker.obfuscated.e */
/* loaded from: classes2.dex */
public final class C2308e implements C2313f0.a, C2304d.b {

    /* renamed from: a */
    final C2313f0 f19885a;

    /* renamed from: b */
    final C2358q1 f19886b;

    /* renamed from: c */
    final C2304d f19887c;

    private C2308e(C2313f0 c2313f0, C2358q1 c2358q1, C2304d.a aVar) {
        this.f19885a = c2313f0;
        this.f19886b = c2358q1;
        this.f19887c = aVar.m12834a(this);
    }

    @Override // com.p018my.tracker.obfuscated.C2304d.b
    /* renamed from: c */
    public void mo12836c(List list) {
        if (list.isEmpty()) {
            AbstractC2391y2.m13568a("AppGalleryPurchaseHandler: can't trackAppGalleryRawPurchases, appGalleryRawPurchases is empty");
        } else {
            this.f19885a.m13083c(list);
        }
    }

    /* renamed from: b */
    public /* synthetic */ void m12873b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f19886b.m13415b() < 86400000) {
            AbstractC2391y2.m13568a("AppGalleryPurchaseHandler: not yet time for tracking");
        } else {
            this.f19887c.m12828a();
            this.f19886b.m13410a(jCurrentTimeMillis);
        }
    }

    /* renamed from: a */
    public void m12875a() {
        this.f19885a.m13060a(this);
        m12879c();
    }

    /* renamed from: c */
    public void m12879c() {
        AbstractC2340m.m13290a(new N61(15, this));
    }

    /* renamed from: a */
    public /* synthetic */ void m12872a(Object obj, String str, String str2, String str3, Map map) {
        JSONObject jSONObjectM12814a = C2304d.m12814a(obj);
        if (jSONObjectM12814a == null) {
            AbstractC2391y2.m13568a("AppGalleryPurchaseHandler: error parse productInfo object");
        } else {
            this.f19885a.m13070a(jSONObjectM12814a, str, str2, str3, map);
        }
    }

    @Override // com.p018my.tracker.obfuscated.C2313f0.a
    /* renamed from: b */
    public void mo12878b(List list) {
        if (list.isEmpty()) {
            AbstractC2391y2.m13568a("AppGalleryPurchaseHandler: empty subs raw purchases list");
        } else {
            this.f19887c.m12831a(list);
        }
    }

    /* renamed from: a */
    public static C2308e m12870a(C2313f0 c2313f0, C2358q1 c2358q1, Context context) {
        C2304d.a aVarM12812a = C2304d.m12812a(context.getApplicationContext());
        if (aVarM12812a != null) {
            return new C2308e(c2313f0, c2358q1, aVarM12812a);
        }
        AbstractC2391y2.m13568a("AppGalleryPurchaseHandler: can't support appGallery purchases ");
        return null;
    }

    /* renamed from: b */
    public void m12877b(Object obj, String str, String str2, String str3, Map map) {
        AbstractC2340m.m13290a(new RunnableC6970um(this, obj, str, str2, str3, map));
    }

    /* renamed from: a */
    public void m12876a(int i, Intent intent) {
        if (i != -1) {
            AbstractC2391y2.m13568a("AppGalleryPurchaseHandler: result code isn't equal to RESULT_OK");
        } else if (intent == null) {
            AbstractC2391y2.m13568a("AppGalleryPurchaseHandler: empty intent has been received");
        } else {
            this.f19887c.m12829a(intent);
        }
    }

    @Override // com.p018my.tracker.obfuscated.C2304d.b
    /* renamed from: a */
    public void mo12835a(List list) {
        if (list.isEmpty()) {
            AbstractC2391y2.m13568a("AppGalleryPurchaseHandler: can't addAppGalleryRawPurchases, appGalleryRawPurchases is empty");
        } else {
            this.f19885a.m13068a(list, this);
        }
    }
}
