package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import android.util.Pair;
import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.yandex.metrica.impl.p022ob.C3392kg;
import com.yandex.metrica.impl.p022ob.C3498oi;
import com.yandex.metrica.impl.p022ob.C3681vj;
import com.yandex.metrica.impl.p022ob.C3762ym;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.uj */
/* loaded from: classes2.dex */
public class C3655uj {

    /* renamed from: a */
    private final C3369jj f24934a;

    /* renamed from: b */
    private final C3343ij f24935b;

    /* renamed from: c */
    private final C3525pj f24936c;

    /* renamed from: d */
    private final C3603sj f24937d;

    /* renamed from: e */
    private final C3577rj f24938e;

    /* renamed from: f */
    private final C3499oj f24939f;

    /* renamed from: g */
    private final C3629tj f24940g;

    /* renamed from: h */
    private final C3395kj f24941h;

    /* renamed from: i */
    private final C3733xj f24942i;

    /* renamed from: j */
    private final C3447mj f24943j;

    /* renamed from: k */
    private final C3473nj f24944k;

    /* renamed from: l */
    private final C3551qj f24945l;

    /* renamed from: m */
    private final C2627Ga f24946m;

    /* renamed from: n */
    private final C3785zj f24947n;

    /* renamed from: o */
    private final C3759yj f24948o;

    /* renamed from: p */
    private final C3213dj f24949p;

    /* renamed from: q */
    private final C3239ej f24950q;

    /* renamed from: r */
    private final C3265fj f24951r;

    /* renamed from: s */
    private final C3187cj f24952s;

    /* renamed from: t */
    private final C3421lj f24953t;

    /* renamed from: u */
    private final C3291gj f24954u;

    /* renamed from: v */
    private final C3317hj f24955v;

    /* renamed from: w */
    private final C3707wj f24956w;

    public C3655uj() {
        this(new C3421lj());
    }

    /* renamed from: a */
    public C3681vj m16931a(byte[] bArr) {
        String strOptString;
        String strOptString2;
        C3681vj c3681vj = new C3681vj();
        try {
            this.f24953t.getClass();
            C3762ym.a aVar = new C3762ym.a(new String(bArr, "UTF-8"));
            JSONObject jSONObjectOptJSONObject = aVar.optJSONObject(AnalyticsBaseParamsConstantsKt.DEVICE_ID);
            if (jSONObjectOptJSONObject != null) {
                strOptString = jSONObjectOptJSONObject.optString("hash");
                strOptString2 = jSONObjectOptJSONObject.optString("value");
            } else {
                strOptString = "";
                strOptString2 = "";
            }
            c3681vj.m17064d(strOptString2);
            c3681vj.m17061c(strOptString);
            m16930a(c3681vj, aVar);
            c3681vj.m17047a(C3681vj.a.OK);
            return c3681vj;
        } catch (Throwable unused) {
            C3681vj c3681vj2 = new C3681vj();
            c3681vj2.m17047a(C3681vj.a.BAD);
            return c3681vj2;
        }
    }

    public C3655uj(C3421lj c3421lj) {
        this(c3421lj, new C3369jj(), new C3343ij(), new C3525pj(), new C3603sj(), new C3577rj(), new C3499oj(), new C3629tj(), new C3395kj(), new C3733xj(), new C3447mj(), new C3473nj(), new C3551qj(), new C2627Ga(), new C3785zj(), new C3759yj(), new C3239ej(), new C3265fj(), new C3213dj(), new C3187cj(), new C3291gj(), new C3317hj(), new C3707wj());
    }

    public C3655uj(C3421lj c3421lj, C3369jj c3369jj, C3343ij c3343ij, C3525pj c3525pj, C3603sj c3603sj, C3577rj c3577rj, C3499oj c3499oj, C3629tj c3629tj, C3395kj c3395kj, C3733xj c3733xj, C3447mj c3447mj, C3473nj c3473nj, C3551qj c3551qj, C2627Ga c2627Ga, C3785zj c3785zj, C3759yj c3759yj, C3239ej c3239ej, C3265fj c3265fj, C3213dj c3213dj, C3187cj c3187cj, C3291gj c3291gj, C3317hj c3317hj, C3707wj c3707wj) {
        this.f24934a = c3369jj;
        this.f24935b = c3343ij;
        this.f24936c = c3525pj;
        this.f24937d = c3603sj;
        this.f24938e = c3577rj;
        this.f24939f = c3499oj;
        this.f24940g = c3629tj;
        this.f24941h = c3395kj;
        this.f24942i = c3733xj;
        this.f24943j = c3447mj;
        this.f24944k = c3473nj;
        this.f24945l = c3551qj;
        this.f24946m = c2627Ga;
        this.f24947n = c3785zj;
        this.f24948o = c3759yj;
        this.f24950q = c3239ej;
        this.f24951r = c3265fj;
        this.f24949p = c3213dj;
        this.f24952s = c3187cj;
        this.f24953t = c3421lj;
        this.f24954u = c3291gj;
        this.f24955v = c3317hj;
        this.f24956w = c3707wj;
    }

    /* renamed from: a */
    private void m16930a(C3681vj c3681vj, C3762ym.a aVar) throws JSONException {
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
                c3681vj.m17076h(jSONObjectOptJSONObject4.optString("url", null));
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject2.optJSONObject("host");
            if (jSONObjectOptJSONObject5 != null) {
                c3681vj.m17050a(jSONObjectOptJSONObject5.optString("url", null));
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
            c3681vj.m17067e(C3762ym.m17295c(map));
        }
        JSONObject jSONObjectOptJSONObject8 = aVar.optJSONObject(CommonUrlParts.LOCALE);
        c3681vj.m17057b((jSONObjectOptJSONObject8 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject8.optJSONObject("country")) == null || !jSONObjectOptJSONObject.optBoolean("reliable", false)) ? "" : jSONObjectOptJSONObject.optString("value", ""));
        JSONObject jSONObjectOptJSONObject9 = aVar.optJSONObject(CrashHianalyticsData.TIME);
        if (jSONObjectOptJSONObject9 != null) {
            try {
                c3681vj.m17049a(Long.valueOf(jSONObjectOptJSONObject9.getLong("max_valid_difference_seconds")));
            } catch (Throwable unused2) {
            }
        }
        C3392kg.r rVar = new C3392kg.r();
        JSONObject jSONObjectOptJSONObject10 = aVar.optJSONObject("stat_sending");
        if (jSONObjectOptJSONObject10 != null) {
            rVar.f24087b = C3762ym.m17264a(C3762ym.m17297d(jSONObjectOptJSONObject10, "disabled_reporting_interval_seconds"), TimeUnit.SECONDS, rVar.f24087b);
        }
        c3681vj.m17038a(this.f24946m.mo13846a(rVar));
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
        c3681vj.m17065d(arrayList);
        this.f24935b.m16099a(c3681vj, aVar);
        this.f24934a.m16192a(c3681vj, aVar);
        this.f24936c.getClass();
        JSONObject jSONObjectOptJSONObject12 = aVar.optJSONObject("permissions");
        if (jSONObjectOptJSONObject12 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject12.optJSONArray("list")) != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject13 = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject13 != null) {
                    String strOptString = jSONObjectOptJSONObject13.optString("name");
                    boolean zOptBoolean = jSONObjectOptJSONObject13.optBoolean("enabled");
                    if (TextUtils.isEmpty(strOptString)) {
                        c3681vj.m17051a("", false);
                    } else {
                        c3681vj.m17051a(strOptString, zOptBoolean);
                    }
                }
            }
        }
        this.f24937d.m16799a(c3681vj, aVar);
        this.f24938e.getClass();
        C3392kg c3392kg = new C3392kg();
        JSONObject jSONObjectOptJSONObject14 = aVar.optJSONObject("retry_policy");
        int iOptInt = c3392kg.f23933K;
        int iOptInt2 = c3392kg.f23934L;
        if (jSONObjectOptJSONObject14 != null) {
            iOptInt = jSONObjectOptJSONObject14.optInt("max_interval_seconds", iOptInt);
            iOptInt2 = jSONObjectOptJSONObject14.optInt("exponential_multiplier", c3392kg.f23934L);
        }
        c3681vj.m17031a(new C2535Ci(iOptInt, iOptInt2));
        this.f24939f.getClass();
        if (c3681vj.m17066e().f24710c) {
            JSONObject jSONObjectOptJSONObject15 = aVar.optJSONObject("permissions_collecting");
            C3392kg.m mVar = new C3392kg.m();
            if (jSONObjectOptJSONObject15 != null) {
                jOptLong = jSONObjectOptJSONObject15.optLong("check_interval_seconds", mVar.f24060b);
                jOptLong2 = jSONObjectOptJSONObject15.optLong("force_send_interval_seconds", mVar.f24061c);
            } else {
                jOptLong = mVar.f24060b;
                jOptLong2 = mVar.f24061c;
            }
            c3681vj.m17030a(new C2485Ai(jOptLong, jOptLong2));
        }
        this.f24940g.m16872a(c3681vj, aVar);
        this.f24941h.m16335a(c3681vj, aVar);
        this.f24943j.m16434a(c3681vj, aVar);
        this.f24944k.getClass();
        if (c3681vj.m17066e().f24716i) {
            C3646ua c3646ua = new C3646ua();
            C3392kg.y yVar = new C3392kg.y();
            JSONObject jSONObjectOptJSONObject16 = aVar.optJSONObject("wakeup");
            if (jSONObjectOptJSONObject16 != null) {
                yVar.f24121b = C3762ym.m17264a(C3762ym.m17297d(jSONObjectOptJSONObject16, "collection_duration_seconds"), TimeUnit.SECONDS, yVar.f24121b);
                yVar.f24122c = C3762ym.m17282a(jSONObjectOptJSONObject16, "aggressive_relaunch", yVar.f24122c);
                JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject16.optJSONArray("collection_interval_ranges_seconds");
                C3392kg.y.a[] aVarArr = yVar.f24123d;
                if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
                    try {
                        aVarArr = new C3392kg.y.a[jSONArrayOptJSONArray3.length()];
                        for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                            aVarArr[i3] = new C3392kg.y.a();
                            JSONObject jSONObject2 = jSONArrayOptJSONArray3.getJSONObject(i3);
                            C3392kg.y.a aVar2 = aVarArr[i3];
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            aVar2.f24125b = timeUnit.toMillis(jSONObject2.getLong("min"));
                            aVarArr[i3].f24126c = timeUnit.toMillis(jSONObject2.getLong("max"));
                        }
                    } catch (Throwable unused4) {
                    }
                }
                yVar.f24123d = aVarArr;
            }
            c3681vj.m17033a(c3646ua.mo13846a(yVar));
        }
        this.f24945l.m16632a(c3681vj, aVar);
        this.f24947n.m17339a(c3681vj, aVar);
        c3681vj.m17056b(this.f24948o.m17263a(aVar, "ui_event_sending", C3688w0.m17107b()));
        c3681vj.m17060c(this.f24948o.m17263a(aVar, "ui_raw_event_sending", C3688w0.m17107b()));
        c3681vj.m17036a(this.f24948o.m17263a(aVar, "ui_collecting_for_bridge", C3688w0.m17106a()));
        this.f24949p.m15802a(c3681vj, aVar);
        c3681vj.m17039a(this.f24942i.m17192a(aVar, "throttling"));
        c3681vj.m17044a(this.f24950q.m15857a(aVar));
        this.f24951r.m15946a(c3681vj, aVar);
        this.f24952s.getClass();
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
                        arrayList2.add(new Pair(strOptString2, strOptString3 == null ? null : new C3498oi.a(strOptString3)));
                    }
                }
            }
            c3681vj.m17042a(new C3498oi(arrayList2));
        }
        this.f24954u.m16005a(c3681vj, aVar);
        if (c3681vj.m17066e().f24731x) {
            this.f24955v.m16056a(c3681vj, aVar);
        }
        this.f24956w.m17148a(c3681vj, aVar);
    }
}
