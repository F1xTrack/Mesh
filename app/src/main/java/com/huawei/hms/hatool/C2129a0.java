package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.hatool.a0 */
/* loaded from: classes.dex */
public class C2129a0 implements InterfaceRunnableC2146g {

    /* renamed from: a */
    private Context f19130a = AbstractC2177q0.m12197i();

    /* renamed from: b */
    private String f19131b;

    /* renamed from: c */
    private JSONObject f19132c;

    /* renamed from: d */
    private String f19133d;

    /* renamed from: e */
    private String f19134e;

    /* renamed from: f */
    private String f19135f;

    /* renamed from: g */
    private String f19136g;

    /* renamed from: h */
    private Boolean f19137h;

    public C2129a0(String str, JSONObject jSONObject, String str2, String str3, long j) {
        this.f19131b = str;
        this.f19132c = jSONObject;
        this.f19133d = str2;
        this.f19134e = str3;
        this.f19135f = String.valueOf(j);
        if (AbstractC2194z.m12315i(str2, "oper")) {
            C2174p0 c2174p0M12303a = C2192y.m12301a().m12303a(str2, j);
            this.f19136g = c2174p0M12303a.m12166a();
            this.f19137h = Boolean.valueOf(c2174p0M12303a.m12168b());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        C2186v.m12271c("hmsSdk", "Begin to run EventRecordTask...");
        int iM12195h = AbstractC2177q0.m12195h();
        int iM11915k = AbstractC2130a1.m11915k(this.f19133d, this.f19134e);
        if (C2135c0.m11945a(this.f19130a, "stat_v2_1", iM12195h * 1048576)) {
            C2186v.m12271c("hmsSdk", "stat sp file reach max limited size, discard new event");
            C2140e.m11963a().m11970a("", "alltype");
            return;
        }
        C2133b1 c2133b1 = new C2133b1();
        c2133b1.m11934b(this.f19131b);
        c2133b1.m11931a(this.f19132c.toString());
        c2133b1.m11938d(this.f19134e);
        c2133b1.m11936c(this.f19135f);
        c2133b1.m11940f(this.f19136g);
        Boolean bool = this.f19137h;
        c2133b1.m11939e(bool == null ? null : String.valueOf(bool));
        try {
            JSONObject jSONObjectM11937d = c2133b1.m11937d();
            String strM12139a = AbstractC2169n1.m12139a(this.f19133d, this.f19134e);
            String strM11955a = C2137d.m11955a(this.f19130a, "stat_v2_1", strM12139a, "");
            try {
                jSONArray = !TextUtils.isEmpty(strM11955a) ? new JSONArray(strM11955a) : new JSONArray();
            } catch (JSONException unused) {
                C2186v.m12273d("hmsSdk", "Cached data corrupted: stat_v2_1");
                jSONArray = new JSONArray();
            }
            jSONArray.put(jSONObjectM11937d);
            C2137d.m11960b(this.f19130a, "stat_v2_1", strM12139a, jSONArray.toString());
            if (jSONArray.toString().length() > iM11915k * 1024) {
                C2140e.m11963a().m11970a(this.f19133d, this.f19134e);
            }
        } catch (JSONException unused2) {
            C2186v.m12275e("hmsSdk", "eventRecord toJson error! The record failed.");
        }
    }
}
