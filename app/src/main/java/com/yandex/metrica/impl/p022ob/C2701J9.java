package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C2909Ri;
import com.yandex.metrica.impl.p022ob.C3392kg;
import com.yandex.metrica.impl.p022ob.C3602si;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.J9 */
/* loaded from: classes2.dex */
public class C2701J9 extends AbstractC2651H9 {

    /* renamed from: c */
    private C3754ye f21525c;

    /* renamed from: d */
    private C3754ye f21526d;

    /* renamed from: e */
    private C3754ye f21527e;

    /* renamed from: f */
    private C3754ye f21528f;

    /* renamed from: g */
    private C3754ye f21529g;

    /* renamed from: h */
    @Deprecated
    private C3754ye f21530h;

    /* renamed from: i */
    private C3754ye f21531i;

    /* renamed from: j */
    @Deprecated
    private C3754ye f21532j;

    /* renamed from: k */
    private C3754ye f21533k;

    /* renamed from: l */
    private C3754ye f21534l;

    /* renamed from: m */
    private C3754ye f21535m;

    /* renamed from: n */
    private C3754ye f21536n;

    /* renamed from: o */
    private C3754ye f21537o;

    /* renamed from: p */
    private C3754ye f21538p;

    /* renamed from: q */
    private C3754ye f21539q;

    /* renamed from: r */
    private C3754ye f21540r;

    /* renamed from: s */
    private C3754ye f21541s;

    /* renamed from: t */
    private C3754ye f21542t;

    /* renamed from: u */
    private C3754ye f21543u;

    /* renamed from: v */
    private C3754ye f21544v;

    /* renamed from: w */
    static final C3754ye f21521w = new C3754ye("PREF_KEY_UID_", null);

    /* renamed from: x */
    private static final C3754ye f21522x = new C3754ye("PREF_KEY_HOST_URL_", null);

    /* renamed from: y */
    private static final C3754ye f21523y = new C3754ye("PREF_KEY_HOST_URLS_FROM_STARTUP", null);

    /* renamed from: z */
    private static final C3754ye f21524z = new C3754ye("PREF_KEY_HOST_URLS_FROM_CLIENT", null);

    /* renamed from: A */
    @Deprecated
    private static final C3754ye f21504A = new C3754ye("PREF_KEY_REPORT_URL_", null);

    /* renamed from: B */
    private static final C3754ye f21505B = new C3754ye("PREF_KEY_REPORT_URLS_", null);

    /* renamed from: C */
    @Deprecated
    private static final C3754ye f21506C = new C3754ye("PREF_L_URL", null);

    /* renamed from: D */
    private static final C3754ye f21507D = new C3754ye("PREF_L_URLS", null);

    /* renamed from: E */
    private static final C3754ye f21508E = new C3754ye("PREF_KEY_GET_AD_URL", null);

    /* renamed from: F */
    private static final C3754ye f21509F = new C3754ye("PREF_KEY_REPORT_AD_URL", null);

    /* renamed from: G */
    private static final C3754ye f21510G = new C3754ye("PREF_KEY_STARTUP_OBTAIN_TIME_", null);

    /* renamed from: H */
    private static final C3754ye f21511H = new C3754ye("PREF_KEY_STARTUP_ENCODED_CLIDS_", null);

    /* renamed from: I */
    static final C3754ye f21512I = new C3754ye("PREF_KEY_DEVICE_ID_", null);

    /* renamed from: J */
    private static final C3754ye f21513J = new C3754ye("STARTUP_CLIDS_MATCH_WITH_APP_CLIDS_", null);

    /* renamed from: K */
    @Deprecated
    private static final C3754ye f21514K = new C3754ye("PREF_KEY_PINNING_UPDATE_URL", null);

    /* renamed from: L */
    private static final C3754ye f21515L = new C3754ye("PREF_KEY_EASY_COLLECTING_ENABLED_", null);

    /* renamed from: M */
    private static final C3754ye f21516M = new C3754ye("PREF_KEY_COLLECTING_PACKAGE_INFO_ENABLED_", null);

    /* renamed from: N */
    private static final C3754ye f21517N = new C3754ye("PREF_KEY_PERMISSIONS_COLLECTING_ENABLED_", null);

    /* renamed from: O */
    private static final C3754ye f21518O = new C3754ye("PREF_KEY_FEATURES_COLLECTING_ENABLED_", null);

    /* renamed from: P */
    private static final C3754ye f21519P = new C3754ye("SOCKET_CONFIG_", null);

    /* renamed from: Q */
    private static final C3754ye f21520Q = new C3754ye("LAST_STARTUP_REQUEST_CLIDS", null);

    public C2701J9(InterfaceC3774z8 interfaceC3774z8, String str) {
        super(interfaceC3774z8, str);
        this.f21525c = new C3754ye(f21512I.m17236b());
        this.f21526d = m14257c(f21521w.m17236b());
        this.f21527e = m14257c(f21522x.m17236b());
        this.f21528f = m14257c(f21523y.m17236b());
        this.f21529g = m14257c(f21524z.m17236b());
        this.f21530h = m14257c(f21504A.m17236b());
        this.f21531i = m14257c(f21505B.m17236b());
        this.f21532j = m14257c(f21506C.m17236b());
        this.f21533k = m14257c(f21507D.m17236b());
        this.f21534l = m14257c(f21508E.m17236b());
        this.f21535m = m14257c(f21509F.m17236b());
        this.f21536n = m14257c(f21510G.m17236b());
        this.f21537o = m14257c(f21511H.m17236b());
        this.f21538p = m14257c(f21513J.m17236b());
        this.f21539q = m14257c(f21515L.m17236b());
        this.f21540r = m14257c(f21516M.m17236b());
        this.f21541s = m14257c(f21517N.m17236b());
        this.f21542t = m14257c(f21518O.m17236b());
        this.f21544v = m14257c(f21520Q.m17236b());
        this.f21543u = m14257c(f21519P.m17236b());
    }

    /* renamed from: a */
    public C2701J9 m14423a(List<String> list) {
        return (C2701J9) m14253b(this.f21533k.m17234a(), C3762ym.m17294c(list));
    }

    /* renamed from: b */
    public C2701J9 m14426b(List<String> list) {
        return (C2701J9) m14253b(this.f21531i.m17234a(), C3762ym.m17294c(list));
    }

    /* renamed from: e */
    public void m14427e() {
        m14261e(f21514K.m17234a());
        m14261e(this.f21525c.m17234a());
        m14261e(this.f21534l.m17234a());
        m14261e(this.f21540r.m17234a());
        m14261e(this.f21539q.m17234a());
        m14261e(this.f21537o.m17234a());
        m14261e(this.f21542t.m17234a());
        m14261e(this.f21527e.m17234a());
        m14261e(this.f21529g.m17234a());
        m14261e(this.f21528f.m17234a());
        m14261e(this.f21544v.m17234a());
        m14261e(this.f21532j.m17234a());
        m14261e(this.f21533k.m17234a());
        m14261e(this.f21536n.m17234a());
        m14261e(this.f21541s.m17234a());
        m14261e(this.f21535m.m17234a());
        m14261e(this.f21530h.m17234a());
        m14261e(this.f21531i.m17234a());
        m14261e(this.f21543u.m17234a());
        m14261e(this.f21538p.m17234a());
        m14261e(this.f21526d.m17234a());
        m14261e(m14257c(new C3754ye("PREF_KEY_DISTRIBUTION_REFERRER_", null).m17236b()).m17234a());
        m14258c();
    }

    @Deprecated
    /* renamed from: f */
    public C2909Ri m14428f() {
        C2909Ri.b bVar;
        C2909Ri.b bVar2;
        C2585Ei c2585Ei;
        C2909Ri.b bVarM15077j = new C2909Ri.b(new C3602si(new C3602si.a().m16778d(m14250a(this.f21539q.m17234a(), C3602si.b.f24759b)).m16787m(m14250a(this.f21540r.m17234a(), C3602si.b.f24760c)).m16788n(m14250a(this.f21541s.m17234a(), C3602si.b.f24761d)).m16780f(m14250a(this.f21542t.m17234a(), C3602si.b.f24762e)))).m15080l(m14259d(this.f21526d.m17234a())).m15063c(C3762ym.m17296c(m14259d(this.f21528f.m17234a()))).m15058b(C3762ym.m17296c(m14259d(this.f21529g.m17234a()))).m15069f(m14259d(this.f21537o.m17234a())).m15076i(C3762ym.m17296c(m14259d(this.f21531i.m17234a()))).m15068e(C3762ym.m17296c(m14259d(this.f21533k.m17234a()))).m15071g(m14259d(this.f21534l.m17234a())).m15077j(m14259d(this.f21535m.m17234a()));
        String strM14259d = m14259d(this.f21543u.m17234a());
        try {
        } catch (Throwable unused) {
            bVar = bVarM15077j;
        }
        if (TextUtils.isEmpty(strM14259d)) {
            bVar2 = bVarM15077j;
            c2585Ei = null;
            return bVar2.m15037a(c2585Ei).m15075i(m14259d(this.f21544v.m17234a())).m15064c(m14250a(this.f21538p.m17234a(), true)).m15060c(m14247a(this.f21536n.m17234a(), -1L)).m15054a();
        }
        JSONObject jSONObject = new JSONObject(strM14259d);
        C3392kg.p pVar = new C3392kg.p();
        long j = jSONObject.getLong("seconds_to_live");
        String string = jSONObject.getString("token");
        JSONArray jSONArray = jSONObject.getJSONArray("ports");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
        }
        bVar = bVarM15077j;
        try {
            c2585Ei = new C2585Ei(j, string, arrayList, new ArrayList(), jSONObject.getLong("first_delay_seconds"), jSONObject.getInt("launch_delay_seconds"), jSONObject.optLong("open_event_interval_seconds", pVar.f24082h), pVar.f24083i, pVar.f24084j, pVar.f24085k);
            bVar2 = bVar;
        } catch (Throwable unused2) {
            bVar2 = bVar;
            c2585Ei = null;
            return bVar2.m15037a(c2585Ei).m15075i(m14259d(this.f21544v.m17234a())).m15064c(m14250a(this.f21538p.m17234a(), true)).m15060c(m14247a(this.f21536n.m17234a(), -1L)).m15054a();
        }
        return bVar2.m15037a(c2585Ei).m15075i(m14259d(this.f21544v.m17234a())).m15064c(m14250a(this.f21538p.m17234a(), true)).m15060c(m14247a(this.f21536n.m17234a(), -1L)).m15054a();
    }

    @Deprecated
    /* renamed from: g */
    public String m14430g(String str) {
        return m14248a(this.f21530h.m17234a(), (String) null);
    }

    @Deprecated
    /* renamed from: h */
    public C2701J9 m14431h(String str) {
        return (C2701J9) m14253b(this.f21525c.m17234a(), str);
    }

    /* renamed from: i */
    public C2701J9 m14432i(String str) {
        return (C2701J9) m14253b(this.f21537o.m17234a(), str);
    }

    /* renamed from: j */
    public C2701J9 m14433j(String str) {
        return (C2701J9) m14253b(this.f21534l.m17234a(), str);
    }

    /* renamed from: k */
    public C2701J9 m14434k(String str) {
        return (C2701J9) m14253b(this.f21527e.m17234a(), str);
    }

    /* renamed from: l */
    public C2701J9 m14435l(String str) {
        return (C2701J9) m14253b(this.f21535m.m17234a(), str);
    }

    @Deprecated
    /* renamed from: m */
    public C2701J9 m14436m(String str) {
        return (C2701J9) m14253b(this.f21530h.m17234a(), str);
    }

    /* renamed from: n */
    public C2701J9 m14437n(String str) {
        return (C2701J9) m14253b(this.f21526d.m17234a(), str);
    }

    /* renamed from: a */
    public C2701J9 m14424a(boolean z) {
        return (C2701J9) m14255b(this.f21538p.m17234a(), z);
    }

    /* renamed from: b */
    public C2701J9 m14425b(long j) {
        return (C2701J9) m14252b(this.f21536n.m17234a(), j);
    }

    @Deprecated
    /* renamed from: f */
    public String m14429f(String str) {
        return m14248a(this.f21532j.m17234a(), (String) null);
    }
}
