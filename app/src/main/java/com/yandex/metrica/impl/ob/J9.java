package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C2880kg;
import com.yandex.metrica.impl.ob.C3081si;
import com.yandex.metrica.impl.ob.Ri;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes2.dex */
public class J9 extends H9 {
    private C3232ye c;
    private C3232ye d;
    private C3232ye e;
    private C3232ye f;
    private C3232ye g;

    @Deprecated
    private C3232ye h;
    private C3232ye i;

    @Deprecated
    private C3232ye j;
    private C3232ye k;
    private C3232ye l;
    private C3232ye m;
    private C3232ye n;
    private C3232ye o;
    private C3232ye p;
    private C3232ye q;
    private C3232ye r;
    private C3232ye s;
    private C3232ye t;
    private C3232ye u;
    private C3232ye v;
    static final C3232ye w = new C3232ye("PREF_KEY_UID_", null);
    private static final C3232ye x = new C3232ye("PREF_KEY_HOST_URL_", null);
    private static final C3232ye y = new C3232ye("PREF_KEY_HOST_URLS_FROM_STARTUP", null);
    private static final C3232ye z = new C3232ye("PREF_KEY_HOST_URLS_FROM_CLIENT", null);

    @Deprecated
    private static final C3232ye A = new C3232ye("PREF_KEY_REPORT_URL_", null);
    private static final C3232ye B = new C3232ye("PREF_KEY_REPORT_URLS_", null);

    @Deprecated
    private static final C3232ye C = new C3232ye("PREF_L_URL", null);
    private static final C3232ye D = new C3232ye("PREF_L_URLS", null);
    private static final C3232ye E = new C3232ye("PREF_KEY_GET_AD_URL", null);
    private static final C3232ye F = new C3232ye("PREF_KEY_REPORT_AD_URL", null);
    private static final C3232ye G = new C3232ye("PREF_KEY_STARTUP_OBTAIN_TIME_", null);
    private static final C3232ye H = new C3232ye("PREF_KEY_STARTUP_ENCODED_CLIDS_", null);
    static final C3232ye I = new C3232ye("PREF_KEY_DEVICE_ID_", null);
    private static final C3232ye J = new C3232ye("STARTUP_CLIDS_MATCH_WITH_APP_CLIDS_", null);

    @Deprecated
    private static final C3232ye K = new C3232ye("PREF_KEY_PINNING_UPDATE_URL", null);
    private static final C3232ye L = new C3232ye("PREF_KEY_EASY_COLLECTING_ENABLED_", null);
    private static final C3232ye M = new C3232ye("PREF_KEY_COLLECTING_PACKAGE_INFO_ENABLED_", null);
    private static final C3232ye N = new C3232ye("PREF_KEY_PERMISSIONS_COLLECTING_ENABLED_", null);
    private static final C3232ye O = new C3232ye("PREF_KEY_FEATURES_COLLECTING_ENABLED_", null);
    private static final C3232ye P = new C3232ye("SOCKET_CONFIG_", null);
    private static final C3232ye Q = new C3232ye("LAST_STARTUP_REQUEST_CLIDS", null);

    public J9(InterfaceC3251z8 interfaceC3251z8, String str) {
        super(interfaceC3251z8, str);
        this.c = new C3232ye(I.b());
        this.d = c(w.b());
        this.e = c(x.b());
        this.f = c(y.b());
        this.g = c(z.b());
        this.h = c(A.b());
        this.i = c(B.b());
        this.j = c(C.b());
        this.k = c(D.b());
        this.l = c(E.b());
        this.m = c(F.b());
        this.n = c(G.b());
        this.o = c(H.b());
        this.p = c(J.b());
        this.q = c(L.b());
        this.r = c(M.b());
        this.s = c(N.b());
        this.t = c(O.b());
        this.v = c(Q.b());
        this.u = c(P.b());
    }

    public J9 a(List<String> list) {
        return (J9) b(this.k.a(), C3240ym.c(list));
    }

    public J9 b(List<String> list) {
        return (J9) b(this.i.a(), C3240ym.c(list));
    }

    public void e() {
        e(K.a());
        e(this.c.a());
        e(this.l.a());
        e(this.r.a());
        e(this.q.a());
        e(this.o.a());
        e(this.t.a());
        e(this.e.a());
        e(this.g.a());
        e(this.f.a());
        e(this.v.a());
        e(this.j.a());
        e(this.k.a());
        e(this.n.a());
        e(this.s.a());
        e(this.m.a());
        e(this.h.a());
        e(this.i.a());
        e(this.u.a());
        e(this.p.a());
        e(this.d.a());
        e(c(new C3232ye("PREF_KEY_DISTRIBUTION_REFERRER_", null).b()).a());
        c();
    }

    @Deprecated
    public Ri f() {
        Ri.b bVar;
        Ri.b bVar2;
        Ei ei;
        Ri.b bVarJ = new Ri.b(new C3081si(new C3081si.a().d(a(this.q.a(), C3081si.b.b)).m(a(this.r.a(), C3081si.b.c)).n(a(this.s.a(), C3081si.b.d)).f(a(this.t.a(), C3081si.b.e)))).l(d(this.d.a())).c(C3240ym.c(d(this.f.a()))).b(C3240ym.c(d(this.g.a()))).f(d(this.o.a())).i(C3240ym.c(d(this.i.a()))).e(C3240ym.c(d(this.k.a()))).g(d(this.l.a())).j(d(this.m.a()));
        String strD = d(this.u.a());
        try {
        } catch (Throwable unused) {
            bVar = bVarJ;
        }
        if (TextUtils.isEmpty(strD)) {
            bVar2 = bVarJ;
            ei = null;
            return bVar2.a(ei).i(d(this.v.a())).c(a(this.p.a(), true)).c(a(this.n.a(), -1L)).a();
        }
        JSONObject jSONObject = new JSONObject(strD);
        C2880kg.p pVar = new C2880kg.p();
        long j = jSONObject.getLong("seconds_to_live");
        String string = jSONObject.getString("token");
        JSONArray jSONArray = jSONObject.getJSONArray("ports");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
        }
        bVar = bVarJ;
        try {
            ei = new Ei(j, string, arrayList, new ArrayList(), jSONObject.getLong("first_delay_seconds"), jSONObject.getInt("launch_delay_seconds"), jSONObject.optLong("open_event_interval_seconds", pVar.h), pVar.i, pVar.j, pVar.k);
            bVar2 = bVar;
        } catch (Throwable unused2) {
            bVar2 = bVar;
            ei = null;
            return bVar2.a(ei).i(d(this.v.a())).c(a(this.p.a(), true)).c(a(this.n.a(), -1L)).a();
        }
        return bVar2.a(ei).i(d(this.v.a())).c(a(this.p.a(), true)).c(a(this.n.a(), -1L)).a();
    }

    @Deprecated
    public String g(String str) {
        return a(this.h.a(), (String) null);
    }

    @Deprecated
    public J9 h(String str) {
        return (J9) b(this.c.a(), str);
    }

    public J9 i(String str) {
        return (J9) b(this.o.a(), str);
    }

    public J9 j(String str) {
        return (J9) b(this.l.a(), str);
    }

    public J9 k(String str) {
        return (J9) b(this.e.a(), str);
    }

    public J9 l(String str) {
        return (J9) b(this.m.a(), str);
    }

    @Deprecated
    public J9 m(String str) {
        return (J9) b(this.h.a(), str);
    }

    public J9 n(String str) {
        return (J9) b(this.d.a(), str);
    }

    public J9 a(boolean z2) {
        return (J9) b(this.p.a(), z2);
    }

    public J9 b(long j) {
        return (J9) b(this.n.a(), j);
    }

    @Deprecated
    public String f(String str) {
        return a(this.j.a(), (String) null);
    }
}
