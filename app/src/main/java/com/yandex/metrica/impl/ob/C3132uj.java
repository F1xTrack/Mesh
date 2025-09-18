package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import android.util.Pair;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.yandex.metrica.impl.ob.C2880kg;
import com.yandex.metrica.impl.ob.C2982oi;
import com.yandex.metrica.impl.ob.C3162vj;
import com.yandex.metrica.impl.ob.C3240ym;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.uj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3132uj {
    private final C2858jj a;
    private final C2833ij b;
    private final C3008pj c;
    private final C3082sj d;
    private final C3057rj e;
    private final C2983oj f;
    private final C3107tj g;
    private final C2883kj h;
    private final C3212xj i;
    private final C2933mj j;
    private final C2958nj k;
    private final C3033qj l;
    private final Ga m;
    private final C3262zj n;
    private final C3237yj o;
    private final C2709dj p;
    private final C2734ej q;
    private final C2759fj r;
    private final C2684cj s;
    private final C2908lj t;
    private final C2784gj u;
    private final C2809hj v;
    private final C3187wj w;

    public C3132uj() {
        this(new C2908lj());
    }

    public C3162vj a(byte[] bArr) {
        String strOptString;
        String strOptString2;
        C3162vj c3162vj = new C3162vj();
        try {
            this.t.getClass();
            C3240ym.a aVar = new C3240ym.a(new String(bArr, "UTF-8"));
            JSONObject jSONObjectOptJSONObject = aVar.optJSONObject(AnalyticsBaseParamsConstantsKt.DEVICE_ID);
            if (jSONObjectOptJSONObject != null) {
                strOptString = jSONObjectOptJSONObject.optString("hash");
                strOptString2 = jSONObjectOptJSONObject.optString("value");
            } else {
                strOptString = "";
                strOptString2 = "";
            }
            c3162vj.d(strOptString2);
            c3162vj.c(strOptString);
            a(c3162vj, aVar);
            c3162vj.a(C3162vj.a.OK);
            return c3162vj;
        } catch (Throwable unused) {
            C3162vj c3162vj2 = new C3162vj();
            c3162vj2.a(C3162vj.a.BAD);
            return c3162vj2;
        }
    }

    public C3132uj(C2908lj c2908lj) {
        this(c2908lj, new C2858jj(), new C2833ij(), new C3008pj(), new C3082sj(), new C3057rj(), new C2983oj(), new C3107tj(), new C2883kj(), new C3212xj(), new C2933mj(), new C2958nj(), new C3033qj(), new Ga(), new C3262zj(), new C3237yj(), new C2734ej(), new C2759fj(), new C2709dj(), new C2684cj(), new C2784gj(), new C2809hj(), new C3187wj());
    }

    public C3132uj(C2908lj c2908lj, C2858jj c2858jj, C2833ij c2833ij, C3008pj c3008pj, C3082sj c3082sj, C3057rj c3057rj, C2983oj c2983oj, C3107tj c3107tj, C2883kj c2883kj, C3212xj c3212xj, C2933mj c2933mj, C2958nj c2958nj, C3033qj c3033qj, Ga ga, C3262zj c3262zj, C3237yj c3237yj, C2734ej c2734ej, C2759fj c2759fj, C2709dj c2709dj, C2684cj c2684cj, C2784gj c2784gj, C2809hj c2809hj, C3187wj c3187wj) {
        this.a = c2858jj;
        this.b = c2833ij;
        this.c = c3008pj;
        this.d = c3082sj;
        this.e = c3057rj;
        this.f = c2983oj;
        this.g = c3107tj;
        this.h = c2883kj;
        this.i = c3212xj;
        this.j = c2933mj;
        this.k = c2958nj;
        this.l = c3033qj;
        this.m = ga;
        this.n = c3262zj;
        this.o = c3237yj;
        this.q = c2734ej;
        this.r = c2759fj;
        this.p = c2709dj;
        this.s = c2684cj;
        this.t = c2908lj;
        this.u = c2784gj;
        this.v = c2809hj;
        this.w = c3187wj;
    }

    private void a(C3162vj c3162vj, C3240ym.a aVar) throws JSONException {
        long jOptLong;
        long jOptLong2;
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3 = aVar.optJSONObject("queries");
        if (jSONObjectOptJSONObject3 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject3.optJSONObject("list")) != null) {
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject("sdk_list");
            if (jSONObjectOptJSONObject4 != null) {
                c3162vj.h(jSONObjectOptJSONObject4.optString("url", null));
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject2.optJSONObject("host");
            if (jSONObjectOptJSONObject5 != null) {
                c3162vj.a(jSONObjectOptJSONObject5.optString("url", null));
            }
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = aVar.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject jSONObjectOptJSONObject6 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (jSONObjectOptJSONObject6 != null) {
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject6.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject6.optJSONObject(next);
                if (jSONObjectOptJSONObject7 != null && jSONObjectOptJSONObject7.has("value")) {
                    map.put(next, jSONObjectOptJSONObject7.getString("value"));
                }
            }
            c3162vj.e(C3240ym.c(map));
        }
        JSONObject jSONObjectOptJSONObject8 = aVar.optJSONObject(CommonUrlParts.LOCALE);
        c3162vj.b((jSONObjectOptJSONObject8 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject8.optJSONObject("country")) == null || !jSONObjectOptJSONObject.optBoolean("reliable", false)) ? "" : jSONObjectOptJSONObject.optString("value", ""));
        JSONObject jSONObjectOptJSONObject9 = aVar.optJSONObject(CrashHianalyticsData.TIME);
        if (jSONObjectOptJSONObject9 != null) {
            try {
                c3162vj.a(Long.valueOf(jSONObjectOptJSONObject9.getLong("max_valid_difference_seconds")));
            } catch (Throwable unused2) {
            }
        }
        C2880kg.r rVar = new C2880kg.r();
        JSONObject jSONObjectOptJSONObject10 = aVar.optJSONObject("stat_sending");
        if (jSONObjectOptJSONObject10 != null) {
            rVar.b = C3240ym.a(C3240ym.d(jSONObjectOptJSONObject10, "disabled_reporting_interval_seconds"), TimeUnit.SECONDS, rVar.b);
        }
        c3162vj.a(this.m.a(rVar));
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectOptJSONObject11 = aVar.optJSONObject("mediascope_api_keys");
        if (jSONObjectOptJSONObject11 != null && (jSONArrayOptJSONArray2 = jSONObjectOptJSONObject11.optJSONArray("list")) != null) {
            for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                try {
                    arrayList.add(jSONArrayOptJSONArray2.getString(i));
                } catch (Throwable unused3) {
                }
            }
        }
        c3162vj.d(arrayList);
        this.b.a(c3162vj, aVar);
        this.a.a(c3162vj, aVar);
        this.c.getClass();
        JSONObject jSONObjectOptJSONObject12 = aVar.optJSONObject("permissions");
        if (jSONObjectOptJSONObject12 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject12.optJSONArray("list")) != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject13 = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject13 != null) {
                    String strOptString = jSONObjectOptJSONObject13.optString("name");
                    boolean zOptBoolean = jSONObjectOptJSONObject13.optBoolean("enabled");
                    if (TextUtils.isEmpty(strOptString)) {
                        c3162vj.a("", false);
                    } else {
                        c3162vj.a(strOptString, zOptBoolean);
                    }
                }
            }
        }
        this.d.a(c3162vj, aVar);
        this.e.getClass();
        C2880kg c2880kg = new C2880kg();
        JSONObject jSONObjectOptJSONObject14 = aVar.optJSONObject("retry_policy");
        int iOptInt = c2880kg.K;
        int iOptInt2 = c2880kg.L;
        if (jSONObjectOptJSONObject14 != null) {
            iOptInt = jSONObjectOptJSONObject14.optInt("max_interval_seconds", iOptInt);
            iOptInt2 = jSONObjectOptJSONObject14.optInt("exponential_multiplier", c2880kg.L);
        }
        c3162vj.a(new Ci(iOptInt, iOptInt2));
        this.f.getClass();
        if (c3162vj.e().c) {
            JSONObject jSONObjectOptJSONObject15 = aVar.optJSONObject("permissions_collecting");
            C2880kg.m mVar = new C2880kg.m();
            if (jSONObjectOptJSONObject15 != null) {
                jOptLong = jSONObjectOptJSONObject15.optLong("check_interval_seconds", mVar.b);
                jOptLong2 = jSONObjectOptJSONObject15.optLong("force_send_interval_seconds", mVar.c);
            } else {
                jOptLong = mVar.b;
                jOptLong2 = mVar.c;
            }
            c3162vj.a(new Ai(jOptLong, jOptLong2));
        }
        this.g.a(c3162vj, aVar);
        this.h.a(c3162vj, aVar);
        this.j.a(c3162vj, aVar);
        this.k.getClass();
        if (c3162vj.e().i) {
            C3123ua c3123ua = new C3123ua();
            C2880kg.y yVar = new C2880kg.y();
            JSONObject jSONObjectOptJSONObject16 = aVar.optJSONObject("wakeup");
            if (jSONObjectOptJSONObject16 != null) {
                yVar.b = C3240ym.a(C3240ym.d(jSONObjectOptJSONObject16, "collection_duration_seconds"), TimeUnit.SECONDS, yVar.b);
                yVar.c = C3240ym.a(jSONObjectOptJSONObject16, "aggressive_relaunch", yVar.c);
                JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject16.optJSONArray("collection_interval_ranges_seconds");
                C2880kg.y.a[] aVarArr = yVar.d;
                if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
                    try {
                        aVarArr = new C2880kg.y.a[jSONArrayOptJSONArray3.length()];
                        for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                            aVarArr[i3] = new C2880kg.y.a();
                            JSONObject jSONObject2 = jSONArrayOptJSONArray3.getJSONObject(i3);
                            C2880kg.y.a aVar2 = aVarArr[i3];
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            aVar2.b = timeUnit.toMillis(jSONObject2.getLong("min"));
                            aVarArr[i3].c = timeUnit.toMillis(jSONObject2.getLong("max"));
                        }
                    } catch (Throwable unused4) {
                    }
                }
                yVar.d = aVarArr;
            }
            c3162vj.a(c3123ua.a(yVar));
        }
        this.l.a(c3162vj, aVar);
        this.n.a(c3162vj, aVar);
        c3162vj.b(this.o.a(aVar, "ui_event_sending", C3168w0.b()));
        c3162vj.c(this.o.a(aVar, "ui_raw_event_sending", C3168w0.b()));
        c3162vj.a(this.o.a(aVar, "ui_collecting_for_bridge", C3168w0.a()));
        this.p.a(c3162vj, aVar);
        c3162vj.a(this.i.a(aVar, "throttling"));
        c3162vj.a(this.q.a(aVar));
        this.r.a(c3162vj, aVar);
        this.s.getClass();
        JSONObject jSONObjectOptJSONObject17 = aVar.optJSONObject("attribution");
        if (jSONObjectOptJSONObject17 != null) {
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject17.optJSONArray("deeplink_conditions");
            if (jSONArrayOptJSONArray4 != null) {
                for (int i4 = 0; i4 < jSONArrayOptJSONArray4.length(); i4++) {
                    JSONObject jSONObjectOptJSONObject18 = jSONArrayOptJSONArray4.optJSONObject(i4);
                    String strOptString2 = jSONObjectOptJSONObject18.optString("key", null);
                    if (!TextUtils.isEmpty(strOptString2)) {
                        String strOptString3 = jSONObjectOptJSONObject18.optString("value", null);
                        arrayList2.add(new Pair(strOptString2, strOptString3 == null ? null : new C2982oi.a(strOptString3)));
                    }
                }
            }
            c3162vj.a(new C2982oi(arrayList2));
        }
        this.u.a(c3162vj, aVar);
        if (c3162vj.e().x) {
            this.v.a(c3162vj, aVar);
        }
        this.w.a(c3162vj, aVar);
    }
}
