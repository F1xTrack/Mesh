package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.F9 */
/* loaded from: classes2.dex */
public class C2601F9 extends AbstractC2651H9 {

    /* renamed from: A */
    static final C3754ye f21182A;

    /* renamed from: B */
    static final C3754ye f21183B;

    /* renamed from: C */
    static final C3754ye f21184C;

    /* renamed from: D */
    static final C3754ye f21185D;

    /* renamed from: E */
    static final C3754ye f21186E;

    /* renamed from: F */
    static final C3754ye f21187F;

    /* renamed from: G */
    static final C3754ye f21188G;

    /* renamed from: c */
    @Deprecated
    static final C3754ye f21189c = new C3754ye("UUID", null);

    /* renamed from: d */
    static final C3754ye f21190d = new C3754ye("UUID_RESULT", null);

    /* renamed from: e */
    @Deprecated
    static final C3754ye f21191e = new C3754ye("DEVICE_ID", null);

    /* renamed from: f */
    static final C3754ye f21192f = new C3754ye("DEVICE_ID_RESULT", null);

    /* renamed from: g */
    @Deprecated
    static final C3754ye f21193g = new C3754ye("DEVICE_ID_HASH", null);

    /* renamed from: h */
    static final C3754ye f21194h = new C3754ye("DEVICE_ID_HASH_RESULT", null);

    /* renamed from: i */
    @Deprecated
    static final C3754ye f21195i = new C3754ye("AD_URL_GET", null);

    /* renamed from: j */
    static final C3754ye f21196j = new C3754ye("AD_URL_GET_RESULT", null);

    /* renamed from: k */
    @Deprecated
    static final C3754ye f21197k = new C3754ye("AD_URL_REPORT", null);

    /* renamed from: l */
    static final C3754ye f21198l = new C3754ye("AD_URL_REPORT_RESULT", null);

    /* renamed from: m */
    static final C3754ye f21199m = new C3754ye("CUSTOM_HOSTS", null);

    /* renamed from: n */
    static final C3754ye f21200n = new C3754ye("SERVER_TIME_OFFSET", null);

    /* renamed from: o */
    @Deprecated
    static final C3754ye f21201o = new C3754ye("CLIDS", null);

    /* renamed from: p */
    static final C3754ye f21202p = new C3754ye("RESPONSE_CLIDS_RESULT", null);

    /* renamed from: q */
    static final C3754ye f21203q = new C3754ye("CUSTOM_SDK_HOSTS", null);

    /* renamed from: r */
    static final C3754ye f21204r = new C3754ye("CLIENT_CLIDS", null);

    /* renamed from: s */
    static final C3754ye f21205s = new C3754ye("DEFERRED_DEEP_LINK_WAS_CHECKED", null);

    /* renamed from: t */
    static final C3754ye f21206t;

    /* renamed from: u */
    static final C3754ye f21207u;

    /* renamed from: v */
    static final C3754ye f21208v;

    /* renamed from: w */
    static final C3754ye f21209w;

    /* renamed from: x */
    static final C3754ye f21210x;

    /* renamed from: y */
    static final C3754ye f21211y;

    /* renamed from: z */
    static final C3754ye f21212z;

    static {
        new C3754ye("DEPRECATED_NATIVE_CRASHES_CHECKED", null);
        f21206t = new C3754ye("API_LEVEL", null);
        f21207u = new C3754ye("ADS_REQUESTED_CONTEXT", null);
        f21208v = new C3754ye("CONTEXT_HISTORY", null);
        f21209w = new C3754ye("ACCESS_CONFIG", null);
        f21210x = new C3754ye("DIAGNOSTICS_CONFIGS_HOLDER", null);
        f21211y = new C3754ye("NEXT_STARTUP_TIME", null);
        f21212z = new C3754ye("LAST_UI_CONTEXT_ID", null);
        f21182A = new C3754ye("GAID", null);
        f21183B = new C3754ye("HOAID", null);
        f21184C = new C3754ye("YANDEX_ADV_ID", null);
        f21185D = new C3754ye("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);
        f21186E = new C3754ye("SCREEN_INFO", null);
        f21187F = new C3754ye("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);
        f21188G = new C3754ye("FEATURES", null);
    }

    public C2601F9(InterfaceC3774z8 interfaceC3774z8) {
        super(interfaceC3774z8);
    }

    /* renamed from: a */
    public C2601F9 m14071a(C3273g1 c3273g1) {
        return m14067a(f21196j.m17234a(), c3273g1);
    }

    /* renamed from: b */
    public boolean m14079b(boolean z) {
        return m14250a(f21185D.m17234a(), z);
    }

    /* renamed from: c */
    public C2601F9 m14081c(C3273g1 c3273g1) {
        return m14067a(f21203q.m17234a(), c3273g1);
    }

    /* renamed from: d */
    public long m14083d(long j) {
        return m14247a(f21200n.m17236b(), j);
    }

    /* renamed from: e */
    public C3273g1 m14088e() {
        return m14068h(f21196j.m17234a());
    }

    /* renamed from: f */
    public C3273g1 m14091f() {
        return m14068h(f21198l.m17234a());
    }

    @Deprecated
    /* renamed from: g */
    public String m14095g(String str) {
        return m14248a(f21197k.m17234a(), (String) null);
    }

    /* renamed from: h */
    public List<String> m14099h() {
        String strM14248a = m14248a(f21199m.m17234a(), (String) null);
        if (TextUtils.isEmpty(strM14248a)) {
            return null;
        }
        return C3762ym.m17296c(strM14248a);
    }

    /* renamed from: i */
    public C3273g1 m14101i() {
        return m14068h(f21203q.m17234a());
    }

    /* renamed from: j */
    public C3273g1 m14104j() {
        return m14068h(f21194h.m17234a());
    }

    /* renamed from: k */
    public C3273g1 m14106k() {
        return m14068h(f21192f.m17234a());
    }

    @Deprecated
    /* renamed from: l */
    public String m14109l(String str) {
        return m14248a(f21193g.m17234a(), (String) null);
    }

    /* renamed from: m */
    public C3732xi m14110m() {
        String strM14248a = m14248a(f21188G.m17234a(), (String) null);
        try {
            if (!TextUtils.isEmpty(strM14248a)) {
                JSONObject jSONObject = new JSONObject(strM14248a);
                return new C3732xi(C3762ym.m17284b(jSONObject, "libSslEnabled"), EnumC3221e1.m15810a(C3762ym.m17300e(jSONObject, "STATUS")), C3762ym.m17300e(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new C3732xi(null, EnumC3221e1.UNKNOWN, null);
    }

    /* renamed from: n */
    public C3273g1 m14113n() {
        return m14068h(f21182A.m17234a());
    }

    /* renamed from: o */
    public C3273g1 m14115o() {
        return m14068h(f21183B.m17234a());
    }

    @Deprecated
    /* renamed from: p */
    public C2601F9 m14117p(String str) {
        return (C2601F9) m14253b(f21201o.m17234a(), str);
    }

    /* renamed from: q */
    public C3273g1 m14119q() {
        return m14068h(f21202p.m17234a());
    }

    @Deprecated
    /* renamed from: r */
    public C2601F9 m14120r(String str) {
        return (C2601F9) m14253b(f21191e.m17234a(), str);
    }

    @Deprecated
    /* renamed from: s */
    public C2601F9 m14122s(String str) {
        return (C2601F9) m14253b(f21189c.m17234a(), str);
    }

    /* renamed from: t */
    public C3273g1 m14124t() {
        return m14068h(f21190d.m17234a());
    }

    /* renamed from: u */
    public C3273g1 m14125u() {
        return m14068h(f21184C.m17234a());
    }

    /* renamed from: v */
    public boolean m14126v() {
        return m14250a(f21205s.m17234a(), false);
    }

    /* renamed from: w */
    public boolean m14127w() {
        return m14250a(f21187F.m17234a(), false);
    }

    /* renamed from: x */
    public C2601F9 m14128x() {
        return (C2601F9) m14255b(f21205s.m17234a(), true);
    }

    /* renamed from: y */
    public void m14129y() {
        m14255b(f21187F.m17234a(), true);
    }

    /* renamed from: a */
    public C2601F9 m14072a(C3732xi c3732xi) {
        String strM17234a = f21188G.m17234a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", c3732xi.m17190b()).put("STATUS", c3732xi.m17191c().m15811a()).putOpt("ERROR_EXPLANATION", c3732xi.m17189a());
        } catch (Throwable unused) {
        }
        return (C2601F9) m14253b(strM17234a, jSONObject.toString());
    }

    /* renamed from: b */
    public long m14076b(long j) {
        return m14247a(f21206t.m17234a(), j);
    }

    /* renamed from: c */
    public C2601F9 m14082c(boolean z) {
        return (C2601F9) m14255b(f21207u.m17234a(), z);
    }

    /* renamed from: d */
    public C2601F9 m14084d(C3273g1 c3273g1) {
        return m14067a(f21194h.m17234a(), c3273g1);
    }

    /* renamed from: e */
    public C2601F9 m14087e(C3273g1 c3273g1) {
        return m14067a(f21192f.m17234a(), c3273g1);
    }

    @Deprecated
    /* renamed from: f */
    public String m14092f(String str) {
        return m14248a(f21195i.m17234a(), (String) null);
    }

    /* renamed from: g */
    public C2601F9 m14094g(C3273g1 c3273g1) {
        return m14067a(f21183B.m17234a(), c3273g1);
    }

    @Deprecated
    /* renamed from: i */
    public String m14102i(String str) {
        return m14248a(f21201o.m17234a(), (String) null);
    }

    /* renamed from: j */
    public C2601F9 m14103j(C3273g1 c3273g1) {
        return m14067a(f21184C.m17234a(), c3273g1);
    }

    @Deprecated
    /* renamed from: k */
    public String m14107k(String str) {
        return m14248a(f21191e.m17234a(), (String) null);
    }

    /* renamed from: l */
    public C3051Xa m14108l() {
        C3051Xa c3051XaM17267a = null;
        try {
            String strM14248a = m14248a(f21210x.m17234a(), (String) null);
            if (strM14248a != null) {
                c3051XaM17267a = C3762ym.m17267a(new JSONObject(strM14248a));
            }
        } catch (Throwable unused) {
        }
        return c3051XaM17267a == null ? new C3051Xa() : c3051XaM17267a;
    }

    @Deprecated
    /* renamed from: n */
    public C2601F9 m14112n(String str) {
        return (C2601F9) m14253b(f21195i.m17234a(), str);
    }

    @Deprecated
    /* renamed from: o */
    public C2601F9 m14114o(String str) {
        return (C2601F9) m14253b(f21197k.m17234a(), str);
    }

    /* renamed from: p */
    public long m14116p() {
        return m14247a(f21211y.m17234a(), 0L);
    }

    /* renamed from: q */
    public C2601F9 m14118q(String str) {
        return (C2601F9) m14253b(f21204r.m17234a(), str);
    }

    /* renamed from: r */
    public C3690w2 m14121r() {
        return C3762ym.m17303f(m14259d(f21186E.m17234a()));
    }

    /* renamed from: s */
    public C2688Il m14123s() {
        try {
            String strM14248a = m14248a(f21209w.m17234a(), (String) null);
            if (strM14248a != null) {
                return C3762ym.m17292c(new JSONObject(strM14248a));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public C2601F9 m14077b(C3273g1 c3273g1) {
        return m14067a(f21198l.m17234a(), c3273g1);
    }

    /* renamed from: c */
    public long m14080c(long j) {
        return m14247a(f21212z.m17234a(), j);
    }

    /* renamed from: d */
    public C2601F9 m14085d(boolean z) {
        return (C2601F9) m14255b(f21185D.m17234a(), z);
    }

    /* renamed from: e */
    public C2601F9 m14086e(long j) {
        return (C2601F9) m14252b(f21206t.m17234a(), j);
    }

    /* renamed from: f */
    public C2601F9 m14090f(C3273g1 c3273g1) {
        return m14067a(f21182A.m17234a(), c3273g1);
    }

    /* renamed from: g */
    public List<String> m14096g() {
        LinkedList linkedList = new LinkedList();
        List<String> listM14249a = m14249a(f21208v.m17234a(), linkedList);
        return listM14249a == null ? linkedList : listM14249a;
    }

    /* renamed from: h */
    public C2601F9 m14098h(C3273g1 c3273g1) {
        return m14067a(f21202p.m17234a(), c3273g1);
    }

    /* renamed from: i */
    public C2601F9 m14100i(C3273g1 c3273g1) {
        return m14067a(f21190d.m17234a(), c3273g1);
    }

    /* renamed from: j */
    public String m14105j(String str) {
        return m14248a(f21204r.m17234a(), (String) null);
    }

    /* renamed from: b */
    public C2601F9 m14078b(List<String> list) {
        return (C2601F9) m14253b(f21199m.m17234a(), C3762ym.m17294c(list));
    }

    /* renamed from: f */
    public C2601F9 m14089f(long j) {
        return (C2601F9) m14252b(f21212z.m17234a(), j);
    }

    /* renamed from: h */
    public C2601F9 m14097h(long j) {
        return (C2601F9) m14252b(f21200n.m17234a(), j);
    }

    /* renamed from: h */
    private C3273g1 m14068h(String str) {
        C3273g1 c3273g1;
        String strM14248a;
        try {
            strM14248a = m14248a(str, (String) null);
        } catch (Throwable unused) {
        }
        if (strM14248a != null) {
            JSONObject jSONObject = new JSONObject(strM14248a);
            c3273g1 = new C3273g1(C3762ym.m17300e(jSONObject, "ID"), EnumC3221e1.m15810a(C3762ym.m17300e(jSONObject, "STATUS")), C3762ym.m17300e(jSONObject, "ERROR_EXPLANATION"));
        } else {
            c3273g1 = null;
        }
        return c3273g1 == null ? new C3273g1(null, EnumC3221e1.UNKNOWN, "no identifier in preferences") : c3273g1;
    }

    /* renamed from: g */
    public C2601F9 m14093g(long j) {
        return (C2601F9) m14252b(f21211y.m17234a(), j);
    }

    @Deprecated
    /* renamed from: m */
    public String m14111m(String str) {
        return m14248a(f21189c.m17234a(), (String) null);
    }

    /* renamed from: a */
    public boolean m14075a(boolean z) {
        return m14250a(f21207u.m17234a(), z);
    }

    /* renamed from: a */
    public C2601F9 m14073a(List<String> list) {
        return (C2601F9) m14254b(f21208v.m17234a(), list);
    }

    /* renamed from: a */
    public C2601F9 m14069a(C2688Il c2688Il) {
        String string;
        if (c2688Il != null) {
            try {
                string = C3762ym.m17277a(c2688Il).toString();
            } catch (Throwable unused) {
            }
        } else {
            string = null;
        }
        if (string != null) {
            m14253b(f21209w.m17234a(), string);
        }
        return this;
    }

    /* renamed from: a */
    public C2601F9 m14070a(C3051Xa c3051Xa) {
        return (C2601F9) m14253b(f21210x.m17234a(), C3762ym.m17281a(c3051Xa).toString());
    }

    /* renamed from: a */
    public void m14074a(C3690w2 c3690w2) {
        m14253b(f21186E.m17234a(), C3762ym.m17271a(c3690w2));
    }

    /* renamed from: a */
    private C2601F9 m14067a(String str, C3273g1 c3273g1) {
        String string;
        if (c3273g1 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ID", c3273g1.f23462a).put("STATUS", c3273g1.f23463b.m15811a()).put("ERROR_EXPLANATION", c3273g1.f23464c);
                } catch (Throwable unused) {
                }
                string = jSONObject.toString();
            } catch (Throwable unused2) {
            }
        } else {
            string = null;
        }
        if (string != null) {
            m14253b(str, string);
        }
        return this;
    }
}
