package com.huawei.hms.hatool;

import android.content.Context;

/* renamed from: com.huawei.hms.hatool.m */
/* loaded from: classes.dex */
public final class C2164m {

    /* renamed from: b */
    private static C2164m f19247b;

    /* renamed from: c */
    private static final Object f19248c = new Object();

    /* renamed from: a */
    private Context f19249a;

    private C2164m() {
    }

    /* renamed from: a */
    public static C2164m m12112a() {
        if (f19247b == null) {
            m12113b();
        }
        return f19247b;
    }

    /* renamed from: b */
    private static synchronized void m12113b() {
        if (f19247b == null) {
            f19247b = new C2164m();
        }
    }

    /* renamed from: a */
    public void m12114a(Context context) {
        synchronized (f19248c) {
            try {
                if (this.f19249a != null) {
                    C2186v.m12276f("hmsSdk", "DataManager already initialized.");
                    return;
                }
                this.f19249a = context;
                C2180s.m12212c().m12217b().m12002a(this.f19249a);
                C2180s.m12212c().m12217b().m12021j(context.getPackageName());
                C2155j.m12055a().m12058a(context);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m12115a(String str) {
        C2186v.m12271c("hmsSdk", "HiAnalyticsDataManager.setAppid(String appid) is execute.");
        Context context = this.f19249a;
        if (context == null) {
            C2186v.m12275e("hmsSdk", "sdk is not init");
        } else {
            C2180s.m12212c().m12217b().m12019i(C2142e1.m11982a("appID", str, "[a-zA-Z0-9_][a-zA-Z0-9. _-]{0,255}", context.getPackageName()));
        }
    }
}
