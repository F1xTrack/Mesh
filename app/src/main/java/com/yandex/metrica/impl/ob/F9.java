package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class F9 extends H9 {
    static final C3232ye A;
    static final C3232ye B;
    static final C3232ye C;
    static final C3232ye D;
    static final C3232ye E;
    static final C3232ye F;
    static final C3232ye G;

    @Deprecated
    static final C3232ye c = new C3232ye("UUID", null);
    static final C3232ye d = new C3232ye("UUID_RESULT", null);

    @Deprecated
    static final C3232ye e = new C3232ye("DEVICE_ID", null);
    static final C3232ye f = new C3232ye("DEVICE_ID_RESULT", null);

    @Deprecated
    static final C3232ye g = new C3232ye("DEVICE_ID_HASH", null);
    static final C3232ye h = new C3232ye("DEVICE_ID_HASH_RESULT", null);

    @Deprecated
    static final C3232ye i = new C3232ye("AD_URL_GET", null);
    static final C3232ye j = new C3232ye("AD_URL_GET_RESULT", null);

    @Deprecated
    static final C3232ye k = new C3232ye("AD_URL_REPORT", null);
    static final C3232ye l = new C3232ye("AD_URL_REPORT_RESULT", null);
    static final C3232ye m = new C3232ye("CUSTOM_HOSTS", null);
    static final C3232ye n = new C3232ye("SERVER_TIME_OFFSET", null);

    @Deprecated
    static final C3232ye o = new C3232ye("CLIDS", null);
    static final C3232ye p = new C3232ye("RESPONSE_CLIDS_RESULT", null);
    static final C3232ye q = new C3232ye("CUSTOM_SDK_HOSTS", null);
    static final C3232ye r = new C3232ye("CLIENT_CLIDS", null);
    static final C3232ye s = new C3232ye("DEFERRED_DEEP_LINK_WAS_CHECKED", null);
    static final C3232ye t;
    static final C3232ye u;
    static final C3232ye v;
    static final C3232ye w;
    static final C3232ye x;
    static final C3232ye y;
    static final C3232ye z;

    static {
        new C3232ye("DEPRECATED_NATIVE_CRASHES_CHECKED", null);
        t = new C3232ye("API_LEVEL", null);
        u = new C3232ye("ADS_REQUESTED_CONTEXT", null);
        v = new C3232ye("CONTEXT_HISTORY", null);
        w = new C3232ye("ACCESS_CONFIG", null);
        x = new C3232ye("DIAGNOSTICS_CONFIGS_HOLDER", null);
        y = new C3232ye("NEXT_STARTUP_TIME", null);
        z = new C3232ye("LAST_UI_CONTEXT_ID", null);
        A = new C3232ye("GAID", null);
        B = new C3232ye("HOAID", null);
        C = new C3232ye("YANDEX_ADV_ID", null);
        D = new C3232ye("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);
        E = new C3232ye("SCREEN_INFO", null);
        F = new C3232ye("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);
        G = new C3232ye("FEATURES", null);
    }

    public F9(InterfaceC3251z8 interfaceC3251z8) {
        super(interfaceC3251z8);
    }

    public F9 a(C2766g1 c2766g1) {
        return a(j.a(), c2766g1);
    }

    public boolean b(boolean z2) {
        return a(D.a(), z2);
    }

    public F9 c(C2766g1 c2766g1) {
        return a(q.a(), c2766g1);
    }

    public long d(long j2) {
        return a(n.b(), j2);
    }

    public C2766g1 e() {
        return h(j.a());
    }

    public C2766g1 f() {
        return h(l.a());
    }

    @Deprecated
    public String g(String str) {
        return a(k.a(), (String) null);
    }

    public List<String> h() {
        String strA = a(m.a(), (String) null);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return C3240ym.c(strA);
    }

    public C2766g1 i() {
        return h(q.a());
    }

    public C2766g1 j() {
        return h(h.a());
    }

    public C2766g1 k() {
        return h(f.a());
    }

    @Deprecated
    public String l(String str) {
        return a(g.a(), (String) null);
    }

    public C3211xi m() {
        String strA = a(G.a(), (String) null);
        try {
            if (!TextUtils.isEmpty(strA)) {
                JSONObject jSONObject = new JSONObject(strA);
                return new C3211xi(C3240ym.b(jSONObject, "libSslEnabled"), EnumC2716e1.a(C3240ym.e(jSONObject, "STATUS")), C3240ym.e(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new C3211xi(null, EnumC2716e1.UNKNOWN, null);
    }

    public C2766g1 n() {
        return h(A.a());
    }

    public C2766g1 o() {
        return h(B.a());
    }

    @Deprecated
    public F9 p(String str) {
        return (F9) b(o.a(), str);
    }

    public C2766g1 q() {
        return h(p.a());
    }

    @Deprecated
    public F9 r(String str) {
        return (F9) b(e.a(), str);
    }

    @Deprecated
    public F9 s(String str) {
        return (F9) b(c.a(), str);
    }

    public C2766g1 t() {
        return h(d.a());
    }

    public C2766g1 u() {
        return h(C.a());
    }

    public boolean v() {
        return a(s.a(), false);
    }

    public boolean w() {
        return a(F.a(), false);
    }

    public F9 x() {
        return (F9) b(s.a(), true);
    }

    public void y() {
        b(F.a(), true);
    }

    public F9 a(C3211xi c3211xi) {
        String strA = G.a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", c3211xi.b()).put("STATUS", c3211xi.c().a()).putOpt("ERROR_EXPLANATION", c3211xi.a());
        } catch (Throwable unused) {
        }
        return (F9) b(strA, jSONObject.toString());
    }

    public long b(long j2) {
        return a(t.a(), j2);
    }

    public F9 c(boolean z2) {
        return (F9) b(u.a(), z2);
    }

    public F9 d(C2766g1 c2766g1) {
        return a(h.a(), c2766g1);
    }

    public F9 e(C2766g1 c2766g1) {
        return a(f.a(), c2766g1);
    }

    @Deprecated
    public String f(String str) {
        return a(i.a(), (String) null);
    }

    public F9 g(C2766g1 c2766g1) {
        return a(B.a(), c2766g1);
    }

    @Deprecated
    public String i(String str) {
        return a(o.a(), (String) null);
    }

    public F9 j(C2766g1 c2766g1) {
        return a(C.a(), c2766g1);
    }

    @Deprecated
    public String k(String str) {
        return a(e.a(), (String) null);
    }

    public Xa l() {
        Xa xaA = null;
        try {
            String strA = a(x.a(), (String) null);
            if (strA != null) {
                xaA = C3240ym.a(new JSONObject(strA));
            }
        } catch (Throwable unused) {
        }
        return xaA == null ? new Xa() : xaA;
    }

    @Deprecated
    public F9 n(String str) {
        return (F9) b(i.a(), str);
    }

    @Deprecated
    public F9 o(String str) {
        return (F9) b(k.a(), str);
    }

    public long p() {
        return a(y.a(), 0L);
    }

    public F9 q(String str) {
        return (F9) b(r.a(), str);
    }

    public C3170w2 r() {
        return C3240ym.f(d(E.a()));
    }

    public Il s() {
        try {
            String strA = a(w.a(), (String) null);
            if (strA != null) {
                return C3240ym.c(new JSONObject(strA));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public F9 b(C2766g1 c2766g1) {
        return a(l.a(), c2766g1);
    }

    public long c(long j2) {
        return a(z.a(), j2);
    }

    public F9 d(boolean z2) {
        return (F9) b(D.a(), z2);
    }

    public F9 e(long j2) {
        return (F9) b(t.a(), j2);
    }

    public F9 f(C2766g1 c2766g1) {
        return a(A.a(), c2766g1);
    }

    public List<String> g() {
        LinkedList linkedList = new LinkedList();
        List<String> listA = a(v.a(), linkedList);
        return listA == null ? linkedList : listA;
    }

    public F9 h(C2766g1 c2766g1) {
        return a(p.a(), c2766g1);
    }

    public F9 i(C2766g1 c2766g1) {
        return a(d.a(), c2766g1);
    }

    public String j(String str) {
        return a(r.a(), (String) null);
    }

    public F9 b(List<String> list) {
        return (F9) b(m.a(), C3240ym.c(list));
    }

    public F9 f(long j2) {
        return (F9) b(z.a(), j2);
    }

    public F9 h(long j2) {
        return (F9) b(n.a(), j2);
    }

    private C2766g1 h(String str) {
        C2766g1 c2766g1;
        String strA;
        try {
            strA = a(str, (String) null);
        } catch (Throwable unused) {
        }
        if (strA != null) {
            JSONObject jSONObject = new JSONObject(strA);
            c2766g1 = new C2766g1(C3240ym.e(jSONObject, "ID"), EnumC2716e1.a(C3240ym.e(jSONObject, "STATUS")), C3240ym.e(jSONObject, "ERROR_EXPLANATION"));
        } else {
            c2766g1 = null;
        }
        return c2766g1 == null ? new C2766g1(null, EnumC2716e1.UNKNOWN, "no identifier in preferences") : c2766g1;
    }

    public F9 g(long j2) {
        return (F9) b(y.a(), j2);
    }

    @Deprecated
    public String m(String str) {
        return a(c.a(), (String) null);
    }

    public boolean a(boolean z2) {
        return a(u.a(), z2);
    }

    public F9 a(List<String> list) {
        return (F9) b(v.a(), list);
    }

    public F9 a(Il il) {
        String string;
        if (il != null) {
            try {
                string = C3240ym.a(il).toString();
            } catch (Throwable unused) {
            }
        } else {
            string = null;
        }
        if (string != null) {
            b(w.a(), string);
        }
        return this;
    }

    public F9 a(Xa xa) {
        return (F9) b(x.a(), C3240ym.a(xa).toString());
    }

    public void a(C3170w2 c3170w2) {
        b(E.a(), C3240ym.a(c3170w2));
    }

    private F9 a(String str, C2766g1 c2766g1) {
        String string;
        if (c2766g1 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ID", c2766g1.a).put("STATUS", c2766g1.b.a()).put("ERROR_EXPLANATION", c2766g1.c);
                } catch (Throwable unused) {
                }
                string = jSONObject.toString();
            } catch (Throwable unused2) {
            }
        } else {
            string = null;
        }
        if (string != null) {
            b(str, string);
        }
        return this;
    }
}
