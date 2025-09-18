package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.t1 */
/* loaded from: classes2.dex */
public final class C2370t1 {

    /* renamed from: a */
    final Context f20126a;

    /* renamed from: b */
    final C2349o0 f20127b;

    /* renamed from: c */
    final C2308e f20128c;

    private C2370t1(C2313f0 c2313f0, Context context) {
        this.f20127b = C2349o0.m13353a(c2313f0, context);
        this.f20128c = C2308e.m12870a(c2313f0, C2358q1.m13407a(context), context);
        this.f20126a = context.getApplicationContext();
    }

    /* renamed from: a */
    public void m13505a(int i, Intent intent) {
        C2308e c2308e = this.f20128c;
        if (c2308e == null) {
            AbstractC2391y2.m13568a("PurchaseHandler: can't do appGalleryPurchaseHandler.onActivityResult(), appGallery purchases dependency not implemented");
        } else {
            c2308e.m12876a(i, intent);
        }
    }

    /* renamed from: b */
    public void m13509b(int i, Intent intent) {
        String installingPackageName;
        PackageManager packageManager = this.f20126a.getPackageManager();
        try {
            String packageName = this.f20126a.getPackageName();
            installingPackageName = Build.VERSION.SDK_INT >= 30 ? packageManager.getInstallSourceInfo(packageName).getInstallingPackageName() : packageManager.getInstallerPackageName(packageName);
        } catch (Throwable th) {
            AbstractC2391y2.m13568a("PurchaseHandler: can't detect installer package –" + th.getMessage());
            installingPackageName = "";
        }
        AbstractC2391y2.m13568a("PurchaseHandler: installer package is " + installingPackageName);
        installingPackageName.getClass();
        if (installingPackageName.equals("com.huawei.appmarket")) {
            AbstractC2391y2.m13568a("PurchaseHandler: appGalleryMarket detected");
        } else if (installingPackageName.equals("com.android.vending")) {
            AbstractC2391y2.m13568a("PurchaseHandler: googleStore detected");
            this.f20127b.m13359a(i, intent);
            return;
        } else {
            AbstractC2391y2.m13568a("PurchaseHandler: store not detected");
            this.f20127b.m13359a(i, intent);
        }
        m13505a(i, intent);
    }

    /* renamed from: a */
    public void m13504a() {
        this.f20127b.m13358a();
        C2308e c2308e = this.f20128c;
        if (c2308e == null) {
            AbstractC2391y2.m13568a("PurchaseHandler: can't init appGalleryPurchaseHandler, appGallery purchases dependency not implemented");
        } else {
            c2308e.m12875a();
        }
    }

    /* renamed from: a */
    public static C2370t1 m13503a(C2313f0 c2313f0, Context context) {
        return new C2370t1(c2313f0, context);
    }

    /* renamed from: a */
    public void m13506a(int i, List list) {
        this.f20127b.m13360a(i, list);
    }

    /* renamed from: a */
    public void m13507a(Object obj, String str, String str2, String str3, Map map) {
        C2308e c2308e = this.f20128c;
        if (c2308e == null) {
            AbstractC2391y2.m13568a("PurchaseHandler: can't trackAppGalleryPurchase, appGallery purchases dependency not implemented");
        } else {
            c2308e.m12877b(obj, str, str2, str3, map);
        }
    }

    /* renamed from: a */
    public void m13508a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {
        this.f20127b.m13362a(jSONObject, jSONObject2, str, map);
    }
}
