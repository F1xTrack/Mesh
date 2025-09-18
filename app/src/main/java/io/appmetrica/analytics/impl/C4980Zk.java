package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Zk */
/* loaded from: classes2.dex */
public final class C4980Zk {

    /* renamed from: a */
    public final C5494ua f31216a;

    /* renamed from: b */
    public final C4825T9 f31217b;

    /* renamed from: c */
    public final C4881Vh f31218c;

    /* renamed from: d */
    public final C4781Rd f31219d;

    /* renamed from: e */
    public final C4598Jl f31220e;

    /* renamed from: f */
    public final C5386q2 f31221f;

    /* renamed from: g */
    public final C5562x3 f31222g;

    /* renamed from: h */
    public final C5336o2 f31223h;

    /* renamed from: i */
    public final C5045cb f31224i;

    /* renamed from: j */
    public final C4526Gl f31225j;

    /* renamed from: k */
    public final C4876Vc f31226k;

    /* renamed from: l */
    public final C4366A9 f31227l;

    public C4980Zk() {
        this(new C5045cb(), new C5494ua(), new C4825T9(), new C4881Vh(), new C4781Rd(), new C4598Jl(), new C5562x3(), new C5386q2(), new C5336o2(), new C4526Gl(), new C4876Vc(), new C4366A9());
    }

    /* renamed from: a */
    public final void m20094a(C5105el c5105el, C4995ab c4995ab) {
        long jOptLong;
        long jOptLong2;
        String string;
        ArrayList arrayListM21122a;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4 = c4995ab.optJSONObject("queries");
        if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject4.optJSONObject("list")) != null && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("host")) != null) {
            c5105el.f31620g = jSONObjectOptJSONObject3.optString("url", null);
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = c4995ab.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject jSONObjectOptJSONObject5 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (jSONObjectOptJSONObject5 != null) {
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject5.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject(next);
                if (jSONObjectOptJSONObject6 != null && jSONObjectOptJSONObject6.has("value")) {
                    map.put(next, jSONObjectOptJSONObject6.getString("value"));
                }
            }
            c5105el.f31623j = AbstractC4550Hl.m19475a((Map) map);
        }
        JSONObject jSONObjectOptJSONObject7 = c4995ab.optJSONObject(CommonUrlParts.LOCALE);
        String string2 = "";
        c5105el.f31626m = (jSONObjectOptJSONObject7 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject7.optJSONObject("country")) == null || !jSONObjectOptJSONObject.optBoolean("reliable", false)) ? "" : jSONObjectOptJSONObject.optString("value", "");
        JSONObject jSONObjectOptJSONObject8 = c4995ab.optJSONObject(CrashHianalyticsData.TIME);
        if (jSONObjectOptJSONObject8 != null) {
            try {
                c5105el.f31625l = Long.valueOf(jSONObjectOptJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (Throwable unused2) {
            }
        }
        C5580xl c5580xl = new C5580xl();
        JSONObject jSONObjectOptJSONObject9 = c4995ab.optJSONObject("stat_sending");
        if (jSONObjectOptJSONObject9 != null) {
            c5580xl.f32832a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject9, "disabled_reporting_interval_seconds", c5580xl.f32832a);
        }
        this.f31220e.getClass();
        c5105el.f31629p = new C4574Il(c5580xl.f32832a);
        this.f31217b.getClass();
        C5480tl c5480tl = new C5480tl();
        try {
            Object jSONObject2 = new JSONObject();
            try {
                jSONObject2 = c4995ab.get("features");
            } catch (Throwable unused3) {
            }
            JSONObject jSONObjectOptJSONObject10 = ((JSONObject) jSONObject2).optJSONObject("list");
            if (jSONObjectOptJSONObject10 != null) {
                C5563x4 c5563x4 = new C5563x4();
                c5563x4.f32796a = C4825T9.m19871a(jSONObjectOptJSONObject10, "permissions_collecting", c5480tl.f32649a);
                c5563x4.f32797b = C4825T9.m19871a(jSONObjectOptJSONObject10, "features_collecting", c5480tl.f32650b);
                c5563x4.f32798c = C4825T9.m19871a(jSONObjectOptJSONObject10, "google_aid", c5480tl.f32651c);
                c5563x4.f32799d = C4825T9.m19871a(jSONObjectOptJSONObject10, "sim_info", c5480tl.f32652d);
                c5563x4.f32800e = C4825T9.m19871a(jSONObjectOptJSONObject10, "huawei_oaid", c5480tl.f32653e);
                c5563x4.f32801f = jSONObjectOptJSONObject10.has("ssl_pinning") ? Boolean.valueOf(jSONObjectOptJSONObject10.getJSONObject("ssl_pinning").getBoolean("enabled")) : null;
                c5105el.f31615b = new C5613z4(c5563x4);
            }
        } catch (Throwable unused4) {
        }
        this.f31216a.getClass();
        try {
            Object jSONObject3 = new JSONObject();
            try {
                jSONObject3 = c4995ab.get("query_hosts");
            } catch (Throwable unused5) {
            }
            JSONObject jSONObjectOptJSONObject11 = ((JSONObject) jSONObject3).optJSONObject("list");
            if (jSONObjectOptJSONObject11 != null) {
                try {
                    string = jSONObjectOptJSONObject11.getJSONObject("get_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused6) {
                    string = "";
                }
                if (!TextUtils.isEmpty(string)) {
                    c5105el.f31617d = string;
                }
                ArrayList arrayListM21122a2 = C5494ua.m21122a(jSONObjectOptJSONObject11, "report");
                if (!AbstractC5182hn.m20513a((Collection) arrayListM21122a2)) {
                    c5105el.f31618e = arrayListM21122a2;
                }
                try {
                    string2 = jSONObjectOptJSONObject11.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused7) {
                }
                if (!TextUtils.isEmpty(string2)) {
                    c5105el.f31619f = string2;
                }
                ArrayList arrayListM21122a3 = C5494ua.m21122a(jSONObjectOptJSONObject11, "startup");
                if (!AbstractC5182hn.m20513a((Collection) arrayListM21122a3)) {
                    c5105el.f31616c = arrayListM21122a3;
                }
                ArrayList arrayListM21122a4 = C5494ua.m21122a(jSONObjectOptJSONObject11, "diagnostic");
                if (!AbstractC5182hn.m20513a((Collection) arrayListM21122a4)) {
                    c5105el.f31627n = arrayListM21122a4;
                }
                HashMap map2 = new HashMap();
                Iterator<String> itKeys2 = jSONObjectOptJSONObject11.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (!C5494ua.f32681a.contains(next2) && (arrayListM21122a = C5494ua.m21122a(jSONObjectOptJSONObject11, next2)) != null) {
                        map2.put(next2, arrayListM21122a);
                    }
                }
                c5105el.f31628o = map2;
            }
        } catch (Throwable unused8) {
        }
        this.f31218c.getClass();
        C5605yl c5605yl = new C5605yl();
        JSONObject jSONObjectOptJSONObject12 = c4995ab.optJSONObject("retry_policy");
        int iOptInt = c5605yl.f32893w;
        int iOptInt2 = c5605yl.f32894x;
        if (jSONObjectOptJSONObject12 != null) {
            iOptInt = jSONObjectOptJSONObject12.optInt("max_interval_seconds", iOptInt);
            iOptInt2 = jSONObjectOptJSONObject12.optInt("exponential_multiplier", c5605yl.f32894x);
        }
        c5105el.f31630q = new RetryPolicyConfig(iOptInt, iOptInt2);
        this.f31219d.getClass();
        if (c5105el.f31615b.f32907a) {
            JSONObject jSONObjectOptJSONObject13 = c4995ab.optJSONObject("permissions_collecting");
            C5530vl c5530vl = new C5530vl();
            if (jSONObjectOptJSONObject13 != null) {
                jOptLong = jSONObjectOptJSONObject13.optLong("check_interval_seconds", c5530vl.f32743a);
                jOptLong2 = jSONObjectOptJSONObject13.optLong("force_send_interval_seconds", c5530vl.f32744b);
            } else {
                jOptLong = c5530vl.f32743a;
                jOptLong2 = c5530vl.f32744b;
            }
            c5105el.f31624k = new C4734Pd(jOptLong, jOptLong2);
        }
        C5361p2 c5361p2 = this.f31221f.f32416a;
        C5380pl c5380pl = new C5380pl();
        JSONObject jSONObjectOptJSONObject14 = c4995ab.optJSONObject("auto_inapp_collecting");
        if (jSONObjectOptJSONObject14 != null) {
            c5380pl.f32406a = jSONObjectOptJSONObject14.optInt("send_frequency_seconds", c5380pl.f32406a);
            c5380pl.f32407b = jSONObjectOptJSONObject14.optInt("first_collecting_inapp_max_age_seconds", c5380pl.f32407b);
        }
        c5361p2.getClass();
        c5105el.f31631r = new BillingConfig(c5380pl.f32406a, c5380pl.f32407b);
        C5562x3 c5562x3 = this.f31222g;
        c5562x3.getClass();
        C5405ql c5405ql = new C5405ql();
        JSONObject jSONObjectOptJSONObject15 = c4995ab.optJSONObject("cache_control");
        if (jSONObjectOptJSONObject15 != null) {
            c5405ql.f32471a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject15, "last_known_location_ttl", c5405ql.f32471a);
        }
        c5562x3.f32795a.getClass();
        c5105el.f31632s = new C5487u3(c5405ql.f32471a);
        this.f31223h.getClass();
        C5336o2.m20847a(c5105el, c4995ab);
        C4526Gl c4526Gl = this.f31225j;
        c4526Gl.getClass();
        JSONObject jSONObjectOptJSONObject16 = c4995ab.optJSONObject("startup_update");
        C5555wl c5555wl = new C5555wl();
        Integer numM20168a = AbstractC5020bb.m20168a(jSONObjectOptJSONObject16, "interval_seconds", null);
        if (numM20168a != null) {
            c5555wl.f32781a = numM20168a.intValue();
        }
        c4526Gl.f30201a.getClass();
        c5105el.f31634u = new C4478El(c5555wl.f32781a);
        Map<String, C4565Ic> mapMo19191b = this.f31226k.f30857a.mo19191b();
        C4852Uc c4852Uc = new C4852Uc(c4995ab);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C4565Ic> entry : mapMo19191b.entrySet()) {
            Object objInvoke = c4852Uc.invoke(entry);
            if (objInvoke != null) {
                linkedHashMap.put(entry.getKey(), objInvoke);
            }
        }
        c5105el.f31635v = linkedHashMap;
        C5618z9 c5618z9 = this.f31227l.f29850a;
        C5455sl c5455sl = new C5455sl();
        JSONObject jSONObjectOptJSONObject17 = c4995ab.optJSONObject("external_attribution");
        if (jSONObjectOptJSONObject17 != null) {
            c5455sl.f32579a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject17, "collecting_interval_seconds", c5455sl.f32579a);
        }
        c5618z9.getClass();
        c5105el.f31636w = new C5593y9(c5455sl.f32579a);
    }

    public C4980Zk(C5045cb c5045cb, C5494ua c5494ua, C4825T9 c4825t9, C4881Vh c4881Vh, C4781Rd c4781Rd, C4598Jl c4598Jl, C5562x3 c5562x3, C5386q2 c5386q2, C5336o2 c5336o2, C4526Gl c4526Gl, C4876Vc c4876Vc, C4366A9 c4366a9) {
        this.f31216a = c5494ua;
        this.f31217b = c4825t9;
        this.f31218c = c4881Vh;
        this.f31219d = c4781Rd;
        this.f31220e = c4598Jl;
        this.f31222g = c5562x3;
        this.f31221f = c5386q2;
        this.f31223h = c5336o2;
        this.f31224i = c5045cb;
        this.f31225j = c4526Gl;
        this.f31226k = c4876Vc;
        this.f31227l = c4366a9;
    }
}
