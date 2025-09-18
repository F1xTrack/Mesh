package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.content.pm.PackageManager;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.C5 */
/* loaded from: classes2.dex */
public class C2522C5 extends AbstractC3589s5 {

    /* renamed from: b */
    private final C3170c2 f20968b;

    /* renamed from: c */
    private final C2675I8 f20969c;

    /* renamed from: d */
    private final C3039Wn f20970d;

    public C2522C5(C3250f4 c3250f4) {
        this(c3250f4, c3250f4.m15923w(), C2842P0.m14728i().m14742m(), new C3039Wn());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3459n5
    /* renamed from: a */
    public boolean mo13844a(C3376k0 c3376k0) {
        String strM15441a;
        C3250f4 c3250f4M16718a = m16718a();
        if (this.f20969c.m14302n()) {
            return false;
        }
        C3376k0 c3376k0M16220e = c3250f4M16718a.m15914m().m16143Q() ? C3376k0.m16220e(c3376k0) : C3376k0.m16218c(c3376k0);
        JSONObject jSONObject = new JSONObject();
        C3039Wn c3039Wn = this.f20970d;
        Context contextM15908g = c3250f4M16718a.m15908g();
        String strM15701b = c3250f4M16718a.m15906e().m15701b();
        c3039Wn.getClass();
        JSONObject jSONObject2 = null;
        try {
            PackageManager packageManager = contextM15908g.getPackageManager();
            strM15441a = C2968U2.m15243a(30) ? C3064Xn.m15441a(packageManager, strM15701b) : packageManager.getInstallerPackageName(strM15701b);
        } catch (Throwable unused) {
            strM15441a = null;
        }
        if (strM15441a == null) {
            strM15441a = "";
        }
        try {
            jSONObject.put("appInstaller", strM15441a);
            C2756Le c2756LeM13874a = this.f20968b.m13874a();
            if (c2756LeM13874a.f21640c) {
                jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("trackingId", c2756LeM13874a.f21638a);
                    if (c2756LeM13874a.f21639b.length() > 0) {
                        jSONObject2.put("additionalParams", c2756LeM13874a.f21639b);
                    }
                } catch (Throwable unused2) {
                }
            }
            jSONObject.put("preloadInfo", jSONObject2);
        } catch (Throwable unused3) {
        }
        c3250f4M16718a.m15919r().m16893b(c3376k0M16220e.mo15103f(jSONObject.toString()));
        this.f20969c.m14288b(true);
        return false;
    }

    public C2522C5(C3250f4 c3250f4, C2675I8 c2675i8, C3170c2 c3170c2, C3039Wn c3039Wn) {
        super(c3250f4);
        this.f20969c = c2675i8;
        this.f20968b = c3170c2;
        this.f20970d = c3039Wn;
    }
}
