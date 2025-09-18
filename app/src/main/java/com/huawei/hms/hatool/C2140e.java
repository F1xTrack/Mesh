package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.p015rn.push.constants.LocalNotification;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.hatool.e */
/* loaded from: classes.dex */
public class C2140e {

    /* renamed from: b */
    private static C2140e f19166b;

    /* renamed from: c */
    private static Map<String, Long> f19167c = new HashMap();

    /* renamed from: a */
    private Context f19168a;

    /* renamed from: a */
    public static C2140e m11963a() {
        return m11964b();
    }

    /* renamed from: b */
    private static synchronized C2140e m11964b() {
        try {
            if (f19166b == null) {
                f19166b = new C2140e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19166b;
    }

    /* renamed from: b */
    private void m11965b(Context context) {
        String str;
        String strM12151d = AbstractC2170o.m12151d(context);
        AbstractC2177q0.m12182a(strM12151d);
        if (C2178q1.m12204b().m12205a()) {
            String strM11955a = C2137d.m11955a(context, "global_v2", "app_ver", "");
            C2137d.m11960b(context, "global_v2", "app_ver", strM12151d);
            AbstractC2177q0.m12184b(strM11955a);
            if (!TextUtils.isEmpty(strM11955a)) {
                if (strM11955a.equals(strM12151d)) {
                    return;
                }
                C2186v.m12271c("hmsSdk", "the appVers are different!");
                m11963a().m11971a("", "alltype", strM11955a);
                return;
            }
            str = "app ver is first save!";
        } else {
            str = "userManager.isUserUnlocked() == false";
        }
        C2186v.m12271c("hmsSdk", str);
    }

    /* renamed from: a */
    public void m11966a(Context context) {
        this.f19168a = context;
        m11965b(context);
        C2180s.m12212c().m12217b().m12017h(AbstractC2170o.m12144a());
    }

    /* renamed from: a */
    public void m11967a(String str, int i) {
        if (this.f19168a == null) {
            C2186v.m12275e("hmsSdk", "onReport() null context or SDK was not init.");
        } else {
            C2186v.m12271c("hmsSdk", "onReport: Before calling runtaskhandler()");
            m11971a(str, AbstractC2169n1.m12138a(i), AbstractC2177q0.m12193g());
        }
    }

    /* renamed from: a */
    public void m11968a(String str, int i, String str2, JSONObject jSONObject) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (2 == i) {
            jCurrentTimeMillis = AbstractC2169n1.m12136a("yyyy-MM-dd", jCurrentTimeMillis);
        }
        C2132b0.m11928c().m11929a(new C2129a0(str2, jSONObject, str, AbstractC2169n1.m12138a(i), jCurrentTimeMillis));
    }

    /* renamed from: a */
    public void m11969a(String str, int i, String str2, JSONObject jSONObject, long j) {
        new C2154i1(str, AbstractC2169n1.m12138a(i), str2, jSONObject.toString(), j).m12054a();
    }

    /* renamed from: a */
    public void m11970a(String str, String str2) {
        if (!AbstractC2130a1.m11905a(str, str2)) {
            C2186v.m12271c("hmsSdk", "auto report is closed tag:" + str);
            return;
        }
        long jM11914j = AbstractC2130a1.m11914j(str, str2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jM11914j <= 30000) {
            C2186v.m12276f("hmsSdk", "autoReport timeout. interval < 30s ");
            return;
        }
        C2186v.m12265a("hmsSdk", "begin to call onReport!");
        AbstractC2130a1.m11904a(str, str2, jCurrentTimeMillis);
        m11971a(str, str2, AbstractC2177q0.m12193g());
    }

    /* renamed from: a */
    public void m11971a(String str, String str2, String str3) {
        Context context = this.f19168a;
        if (context == null) {
            C2186v.m12275e("hmsSdk", "onReport() null context or SDK was not init.");
            return;
        }
        String strM12209b = C2179r0.m12209b(context);
        if (AbstractC2130a1.m11909e(str, str2) && !"WIFI".equals(strM12209b)) {
            C2186v.m12271c("hmsSdk", "strNetworkType is :" + strM12209b);
        } else if ("unknown".equals(strM12209b) || LocalNotification.Importance.NONE.equals(strM12209b) || "2G".equals(strM12209b)) {
            C2186v.m12275e("hmsSdk", "The network is bad.");
        } else {
            C2132b0.m11928c().m11929a(new C2187v0(str, str2, str3));
        }
    }
}
