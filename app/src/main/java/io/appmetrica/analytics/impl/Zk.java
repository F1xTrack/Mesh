package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
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

/* loaded from: classes2.dex */
public final class Zk {
    public final C4906ua a;
    public final T9 b;
    public final Vh c;
    public final Rd d;
    public final Jl e;
    public final C4803q2 f;
    public final C4971x3 g;
    public final C4755o2 h;
    public final C4475cb i;
    public final Gl j;
    public final Vc k;
    public final A9 l;

    public Zk() {
        this(new C4475cb(), new C4906ua(), new T9(), new Vh(), new Rd(), new Jl(), new C4971x3(), new C4803q2(), new C4755o2(), new Gl(), new Vc(), new A9());
    }

    public final void a(C4535el c4535el, C4425ab c4425ab) {
        long jOptLong;
        long jOptLong2;
        String string;
        ArrayList arrayListA;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4 = c4425ab.optJSONObject("queries");
        if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject4.optJSONObject("list")) != null && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("host")) != null) {
            c4535el.g = jSONObjectOptJSONObject3.optString("url", null);
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = c4425ab.get("distribution_customization");
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
            c4535el.j = Hl.a((Map) map);
        }
        JSONObject jSONObjectOptJSONObject7 = c4425ab.optJSONObject(CommonUrlParts.LOCALE);
        String string2 = "";
        c4535el.m = (jSONObjectOptJSONObject7 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject7.optJSONObject("country")) == null || !jSONObjectOptJSONObject.optBoolean("reliable", false)) ? "" : jSONObjectOptJSONObject.optString("value", "");
        JSONObject jSONObjectOptJSONObject8 = c4425ab.optJSONObject(CrashHianalyticsData.TIME);
        if (jSONObjectOptJSONObject8 != null) {
            try {
                c4535el.l = Long.valueOf(jSONObjectOptJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (Throwable unused2) {
            }
        }
        C4989xl c4989xl = new C4989xl();
        JSONObject jSONObjectOptJSONObject9 = c4425ab.optJSONObject("stat_sending");
        if (jSONObjectOptJSONObject9 != null) {
            c4989xl.a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject9, "disabled_reporting_interval_seconds", c4989xl.a);
        }
        this.e.getClass();
        c4535el.p = new Il(c4989xl.a);
        this.b.getClass();
        C4893tl c4893tl = new C4893tl();
        try {
            Object jSONObject2 = new JSONObject();
            try {
                jSONObject2 = c4425ab.get("features");
            } catch (Throwable unused3) {
            }
            JSONObject jSONObjectOptJSONObject10 = ((JSONObject) jSONObject2).optJSONObject("list");
            if (jSONObjectOptJSONObject10 != null) {
                C4972x4 c4972x4 = new C4972x4();
                c4972x4.a = T9.a(jSONObjectOptJSONObject10, "permissions_collecting", c4893tl.a);
                c4972x4.b = T9.a(jSONObjectOptJSONObject10, "features_collecting", c4893tl.b);
                c4972x4.c = T9.a(jSONObjectOptJSONObject10, "google_aid", c4893tl.c);
                c4972x4.d = T9.a(jSONObjectOptJSONObject10, "sim_info", c4893tl.d);
                c4972x4.e = T9.a(jSONObjectOptJSONObject10, "huawei_oaid", c4893tl.e);
                c4972x4.f = jSONObjectOptJSONObject10.has("ssl_pinning") ? Boolean.valueOf(jSONObjectOptJSONObject10.getJSONObject("ssl_pinning").getBoolean("enabled")) : null;
                c4535el.b = new C5020z4(c4972x4);
            }
        } catch (Throwable unused4) {
        }
        this.a.getClass();
        try {
            Object jSONObject3 = new JSONObject();
            try {
                jSONObject3 = c4425ab.get("query_hosts");
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
                    c4535el.d = string;
                }
                ArrayList arrayListA2 = C4906ua.a(jSONObjectOptJSONObject11, "report");
                if (!hn.a((Collection) arrayListA2)) {
                    c4535el.e = arrayListA2;
                }
                try {
                    string2 = jSONObjectOptJSONObject11.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused7) {
                }
                if (!TextUtils.isEmpty(string2)) {
                    c4535el.f = string2;
                }
                ArrayList arrayListA3 = C4906ua.a(jSONObjectOptJSONObject11, "startup");
                if (!hn.a((Collection) arrayListA3)) {
                    c4535el.c = arrayListA3;
                }
                ArrayList arrayListA4 = C4906ua.a(jSONObjectOptJSONObject11, "diagnostic");
                if (!hn.a((Collection) arrayListA4)) {
                    c4535el.n = arrayListA4;
                }
                HashMap map2 = new HashMap();
                Iterator<String> itKeys2 = jSONObjectOptJSONObject11.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (!C4906ua.a.contains(next2) && (arrayListA = C4906ua.a(jSONObjectOptJSONObject11, next2)) != null) {
                        map2.put(next2, arrayListA);
                    }
                }
                c4535el.o = map2;
            }
        } catch (Throwable unused8) {
        }
        this.c.getClass();
        C5013yl c5013yl = new C5013yl();
        JSONObject jSONObjectOptJSONObject12 = c4425ab.optJSONObject("retry_policy");
        int iOptInt = c5013yl.w;
        int iOptInt2 = c5013yl.x;
        if (jSONObjectOptJSONObject12 != null) {
            iOptInt = jSONObjectOptJSONObject12.optInt("max_interval_seconds", iOptInt);
            iOptInt2 = jSONObjectOptJSONObject12.optInt("exponential_multiplier", c5013yl.x);
        }
        c4535el.q = new RetryPolicyConfig(iOptInt, iOptInt2);
        this.d.getClass();
        if (c4535el.b.a) {
            JSONObject jSONObjectOptJSONObject13 = c4425ab.optJSONObject("permissions_collecting");
            C4941vl c4941vl = new C4941vl();
            if (jSONObjectOptJSONObject13 != null) {
                jOptLong = jSONObjectOptJSONObject13.optLong("check_interval_seconds", c4941vl.a);
                jOptLong2 = jSONObjectOptJSONObject13.optLong("force_send_interval_seconds", c4941vl.b);
            } else {
                jOptLong = c4941vl.a;
                jOptLong2 = c4941vl.b;
            }
            c4535el.k = new Pd(jOptLong, jOptLong2);
        }
        C4779p2 c4779p2 = this.f.a;
        C4798pl c4798pl = new C4798pl();
        JSONObject jSONObjectOptJSONObject14 = c4425ab.optJSONObject("auto_inapp_collecting");
        if (jSONObjectOptJSONObject14 != null) {
            c4798pl.a = jSONObjectOptJSONObject14.optInt("send_frequency_seconds", c4798pl.a);
            c4798pl.b = jSONObjectOptJSONObject14.optInt("first_collecting_inapp_max_age_seconds", c4798pl.b);
        }
        c4779p2.getClass();
        c4535el.r = new BillingConfig(c4798pl.a, c4798pl.b);
        C4971x3 c4971x3 = this.g;
        c4971x3.getClass();
        C4822ql c4822ql = new C4822ql();
        JSONObject jSONObjectOptJSONObject15 = c4425ab.optJSONObject("cache_control");
        if (jSONObjectOptJSONObject15 != null) {
            c4822ql.a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject15, "last_known_location_ttl", c4822ql.a);
        }
        c4971x3.a.getClass();
        c4535el.s = new C4899u3(c4822ql.a);
        this.h.getClass();
        C4755o2.a(c4535el, c4425ab);
        Gl gl = this.j;
        gl.getClass();
        JSONObject jSONObjectOptJSONObject16 = c4425ab.optJSONObject("startup_update");
        C4965wl c4965wl = new C4965wl();
        Integer numA = AbstractC4450bb.a(jSONObjectOptJSONObject16, "interval_seconds", null);
        if (numA != null) {
            c4965wl.a = numA.intValue();
        }
        gl.a.getClass();
        c4535el.u = new El(c4965wl.a);
        Map<String, Ic> mapB = this.k.a.b();
        Uc uc = new Uc(c4425ab);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Ic> entry : mapB.entrySet()) {
            Object objInvoke = uc.invoke(entry);
            if (objInvoke != null) {
                linkedHashMap.put(entry.getKey(), objInvoke);
            }
        }
        c4535el.v = linkedHashMap;
        C5025z9 c5025z9 = this.l.a;
        C4869sl c4869sl = new C4869sl();
        JSONObject jSONObjectOptJSONObject17 = c4425ab.optJSONObject("external_attribution");
        if (jSONObjectOptJSONObject17 != null) {
            c4869sl.a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject17, "collecting_interval_seconds", c4869sl.a);
        }
        c5025z9.getClass();
        c4535el.w = new C5001y9(c4869sl.a);
    }

    public Zk(C4475cb c4475cb, C4906ua c4906ua, T9 t9, Vh vh, Rd rd, Jl jl, C4971x3 c4971x3, C4803q2 c4803q2, C4755o2 c4755o2, Gl gl, Vc vc, A9 a9) {
        this.a = c4906ua;
        this.b = t9;
        this.c = vh;
        this.d = rd;
        this.e = jl;
        this.g = c4971x3;
        this.f = c4803q2;
        this.h = c4755o2;
        this.i = c4475cb;
        this.j = gl;
        this.k = vc;
        this.l = a9;
    }
}
