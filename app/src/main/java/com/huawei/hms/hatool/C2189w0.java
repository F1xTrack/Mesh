package com.huawei.hms.hatool;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC7177y3;

/* renamed from: com.huawei.hms.hatool.w0 */
/* loaded from: classes.dex */
public class C2189w0 {
    /* renamed from: a */
    private static void m12283a(String str, String str2) {
        C2132b0.m11926a().m11929a(new C2157j1(str, str2));
    }

    /* renamed from: b */
    public static void m12285b(String str, String str2) {
        C2168n0 c2168n0M12278a;
        String str3;
        String strReplace = "{url}/getPublicKey?keytype=4".replace("{url}", AbstractC2130a1.m11910f(str, str2));
        String strM12191f = AbstractC2177q0.m12191f();
        HashMap map = new HashMap();
        map.put("App-Id", strM12191f);
        try {
            c2168n0M12278a = AbstractC2188w.m12278a(strReplace, new byte[0], map);
        } catch (Exception e) {
            C2186v.m12275e("GetPublicKey", "get pubKey response Exception :" + e.getMessage());
            c2168n0M12278a = null;
        }
        if (c2168n0M12278a == null) {
            str3 = "get pubKey response is null";
        } else if (c2168n0M12278a.m12135b() == 200) {
            if (TextUtils.isEmpty(c2168n0M12278a.m12134a())) {
                return;
            }
            m12287d(c2168n0M12278a.m12134a(), str2);
            return;
        } else {
            str3 = "get pubKey fail HttpCode :" + c2168n0M12278a.m12135b();
        }
        C2186v.m12275e("GetPublicKey", str3);
    }

    /* renamed from: c */
    public static String m12286c(String str, String str2) {
        String strM12203o;
        String strM12185c = AbstractC2177q0.m12185c();
        if (TextUtils.isEmpty(strM12185c)) {
            strM12185c = C2137d.m11955a(AbstractC2177q0.m12197i(), "Privacy_MY", "public_key_version", "");
            AbstractC2177q0.m12194g(strM12185c);
        }
        if (!"2.0".equals(strM12185c)) {
            m12283a(str, str2);
            return null;
        }
        if ("maint".equals(str2)) {
            strM12203o = AbstractC2177q0.m12202n();
            if (TextUtils.isEmpty(strM12203o)) {
                strM12203o = AbstractC7177y3.m26038b("HiAnalytics_Sdk_Public_Sp_Key", C2137d.m11955a(AbstractC2177q0.m12197i(), "Privacy_MY", "public_key_maint", ""));
                AbstractC2177q0.m12188d(strM12203o);
            }
        } else {
            strM12203o = AbstractC2177q0.m12203o();
            if (TextUtils.isEmpty(strM12203o)) {
                strM12203o = AbstractC7177y3.m26038b("HiAnalytics_Sdk_Public_Sp_Key", C2137d.m11955a(AbstractC2177q0.m12197i(), "Privacy_MY", "public_key_oper", ""));
                AbstractC2177q0.m12190e(strM12203o);
            }
        }
        if (!TextUtils.isEmpty(strM12203o) && !m12284a()) {
            return strM12203o;
        }
        m12283a(str, str2);
        return null;
    }

    /* renamed from: d */
    private static void m12287d(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("publicKey");
            String strOptString2 = jSONObject.optString("publicKeyOM");
            String strOptString3 = jSONObject.optString("pubkey_version");
            String str3 = System.currentTimeMillis() + "";
            String strOptString4 = jSONObject.optString("timeInterval");
            C2137d.m11960b(AbstractC2177q0.m12197i(), "Privacy_MY", "public_key_oper", AbstractC7177y3.m26040d("HiAnalytics_Sdk_Public_Sp_Key", strOptString));
            C2137d.m11960b(AbstractC2177q0.m12197i(), "Privacy_MY", "public_key_maint", AbstractC7177y3.m26040d("HiAnalytics_Sdk_Public_Sp_Key", strOptString2));
            C2137d.m11960b(AbstractC2177q0.m12197i(), "Privacy_MY", "public_key_time_interval", strOptString4);
            C2137d.m11960b(AbstractC2177q0.m12197i(), "Privacy_MY", "public_key_version", strOptString3);
            C2137d.m11960b(AbstractC2177q0.m12197i(), "Privacy_MY", "public_key_time_last", str3);
            AbstractC2177q0.m12190e(strOptString);
            AbstractC2177q0.m12188d(strOptString2);
            AbstractC2177q0.m12194g(strOptString3);
            AbstractC2177q0.m12186c(str3);
            AbstractC2177q0.m12192f(strOptString4);
        } catch (JSONException e) {
            C2186v.m12275e("GetPublicKey", "get pubKey parse json JSONException :" + e.getMessage());
        }
    }

    /* renamed from: a */
    public static boolean m12284a() throws NumberFormatException {
        String strM12181a = AbstractC2177q0.m12181a();
        if (TextUtils.isEmpty(strM12181a)) {
            strM12181a = C2137d.m11955a(AbstractC2177q0.m12197i(), "Privacy_MY", "public_key_time_interval", "");
            AbstractC2177q0.m12192f(strM12181a);
        }
        String strM12201m = AbstractC2177q0.m12201m();
        if (TextUtils.isEmpty(strM12201m)) {
            strM12201m = C2137d.m11955a(AbstractC2177q0.m12197i(), "Privacy_MY", "public_key_time_last", "");
            AbstractC2177q0.m12186c(strM12201m);
        }
        if (!TextUtils.isEmpty(strM12181a) && !TextUtils.isEmpty(strM12201m)) {
            try {
                return System.currentTimeMillis() - Long.parseLong(strM12201m) > ((long) Integer.parseInt(strM12181a));
            } catch (NumberFormatException e) {
                C2186v.m12275e("GetPublicKey", "checkCachePubKey NumberFormatException :" + e.getMessage());
            }
        }
        return true;
    }
}
