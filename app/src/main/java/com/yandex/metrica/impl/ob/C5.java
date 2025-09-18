package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.PackageManager;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class C5 extends AbstractC3068s5 {
    private final C2667c2 b;
    private final I8 c;
    private final Wn d;

    public C5(C2744f4 c2744f4) {
        this(c2744f4, c2744f4.w(), P0.i().m(), new Wn());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2944n5
    public boolean a(C2864k0 c2864k0) {
        String strA;
        C2744f4 c2744f4A = a();
        if (this.c.n()) {
            return false;
        }
        C2864k0 c2864k0E = c2744f4A.m().Q() ? C2864k0.e(c2864k0) : C2864k0.c(c2864k0);
        JSONObject jSONObject = new JSONObject();
        Wn wn = this.d;
        Context contextG = c2744f4A.g();
        String strB = c2744f4A.e().b();
        wn.getClass();
        JSONObject jSONObject2 = null;
        try {
            PackageManager packageManager = contextG.getPackageManager();
            strA = U2.a(30) ? Xn.a(packageManager, strB) : packageManager.getInstallerPackageName(strB);
        } catch (Throwable unused) {
            strA = null;
        }
        if (strA == null) {
            strA = "";
        }
        try {
            jSONObject.put("appInstaller", strA);
            Le leA = this.b.a();
            if (leA.c) {
                jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("trackingId", leA.a);
                    if (leA.b.length() > 0) {
                        jSONObject2.put("additionalParams", leA.b);
                    }
                } catch (Throwable unused2) {
                }
            }
            jSONObject.put("preloadInfo", jSONObject2);
        } catch (Throwable unused3) {
        }
        c2744f4A.r().b(c2864k0E.f(jSONObject.toString()));
        this.c.b(true);
        return false;
    }

    public C5(C2744f4 c2744f4, I8 i8, C2667c2 c2667c2, Wn wn) {
        super(c2744f4);
        this.c = i8;
        this.b = c2667c2;
        this.d = wn;
    }
}
