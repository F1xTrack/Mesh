package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class t1 {
    final Context a;
    final o0 b;
    final e c;

    private t1(f0 f0Var, Context context) {
        this.b = o0.a(f0Var, context);
        this.c = e.a(f0Var, q1.a(context), context);
        this.a = context.getApplicationContext();
    }

    public void a(int i, Intent intent) {
        e eVar = this.c;
        if (eVar == null) {
            y2.a("PurchaseHandler: can't do appGalleryPurchaseHandler.onActivityResult(), appGallery purchases dependency not implemented");
        } else {
            eVar.a(i, intent);
        }
    }

    public void b(int i, Intent intent) {
        String installingPackageName;
        PackageManager packageManager = this.a.getPackageManager();
        try {
            String packageName = this.a.getPackageName();
            installingPackageName = Build.VERSION.SDK_INT >= 30 ? packageManager.getInstallSourceInfo(packageName).getInstallingPackageName() : packageManager.getInstallerPackageName(packageName);
        } catch (Throwable th) {
            y2.a("PurchaseHandler: can't detect installer package –" + th.getMessage());
            installingPackageName = "";
        }
        y2.a("PurchaseHandler: installer package is " + installingPackageName);
        installingPackageName.getClass();
        if (installingPackageName.equals("com.huawei.appmarket")) {
            y2.a("PurchaseHandler: appGalleryMarket detected");
        } else if (installingPackageName.equals("com.android.vending")) {
            y2.a("PurchaseHandler: googleStore detected");
            this.b.a(i, intent);
            return;
        } else {
            y2.a("PurchaseHandler: store not detected");
            this.b.a(i, intent);
        }
        a(i, intent);
    }

    public void a() {
        this.b.a();
        e eVar = this.c;
        if (eVar == null) {
            y2.a("PurchaseHandler: can't init appGalleryPurchaseHandler, appGallery purchases dependency not implemented");
        } else {
            eVar.a();
        }
    }

    public static t1 a(f0 f0Var, Context context) {
        return new t1(f0Var, context);
    }

    public void a(int i, List list) {
        this.b.a(i, list);
    }

    public void a(Object obj, String str, String str2, String str3, Map map) {
        e eVar = this.c;
        if (eVar == null) {
            y2.a("PurchaseHandler: can't trackAppGalleryPurchase, appGallery purchases dependency not implemented");
        } else {
            eVar.b(obj, str, str2, str3, map);
        }
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {
        this.b.a(jSONObject, jSONObject2, str, map);
    }
}
