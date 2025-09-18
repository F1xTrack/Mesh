package com.huawei.hms.hatool;

import java.util.Map;

/* renamed from: com.huawei.hms.hatool.a1 */
/* loaded from: classes.dex */
public abstract class AbstractC2130a1 {
    /* renamed from: a */
    public static void m11904a(String str, String str2, long j) {
        C2181s0 c2181s0M11912h = m11912h(str, str2);
        if (c2181s0M11912h != null) {
            c2181s0M11912h.m12219a(j);
        }
    }

    /* renamed from: b */
    public static int m11906b(String str, String str2) {
        C2181s0 c2181s0M11912h = m11912h(str, str2);
        if (c2181s0M11912h != null) {
            return c2181s0M11912h.m12231d();
        }
        return 7;
    }

    /* renamed from: c */
    public static boolean m11907c(String str, String str2) {
        C2181s0 c2181s0M11912h = m11912h(str, str2);
        if (c2181s0M11912h != null) {
            return c2181s0M11912h.m12240g();
        }
        return true;
    }

    /* renamed from: d */
    public static String m11908d(String str, String str2) {
        C2181s0 c2181s0M11912h = m11912h(str, str2);
        return c2181s0M11912h != null ? c2181s0M11912h.m12237f() : "";
    }

    /* renamed from: e */
    public static boolean m11909e(String str, String str2) {
        C2181s0 c2181s0M11912h = m11912h(str, str2);
        if (c2181s0M11912h != null) {
            return c2181s0M11912h.m12242i();
        }
        return false;
    }

    /* renamed from: f */
    public static String m11910f(String str, String str2) {
        C2181s0 c2181s0M11912h = m11912h(str, str2);
        return c2181s0M11912h != null ? c2181s0M11912h.m12241h() : "";
    }

    /* renamed from: g */
    public static String m11911g(String str, String str2) {
        C2181s0 c2181s0M11912h = m11912h(str, str2);
        return c2181s0M11912h != null ? c2181s0M11912h.m12247n() : "";
    }

    /* renamed from: h */
    private static C2181s0 m11912h(String str, String str2) {
        C2163l1 c2163l1M12214a = C2180s.m12212c().m12214a(str);
        if (c2163l1M12214a == null) {
            return null;
        }
        if (!"alltype".equals(str2)) {
            return c2163l1M12214a.m12106a(str2);
        }
        C2181s0 c2181s0M12106a = c2163l1M12214a.m12106a("oper");
        return c2181s0M12106a == null ? c2163l1M12214a.m12106a("maint") : c2181s0M12106a;
    }

    /* renamed from: i */
    public static Map<String, String> m11913i(String str, String str2) {
        C2181s0 c2181s0M11912h = m11912h(str, str2);
        if (c2181s0M11912h != null) {
            return c2181s0M11912h.m12244k();
        }
        return null;
    }

    /* renamed from: j */
    public static long m11914j(String str, String str2) {
        C2181s0 c2181s0M11912h = m11912h(str, str2);
        if (c2181s0M11912h != null) {
            return c2181s0M11912h.m12245l();
        }
        return 0L;
    }

    /* renamed from: k */
    public static int m11915k(String str, String str2) {
        C2181s0 c2181s0M11912h = m11912h(str, str2);
        if (c2181s0M11912h != null) {
            return c2181s0M11912h.m12224b();
        }
        return 10;
    }

    /* renamed from: l */
    public static String m11916l(String str, String str2) {
        C2181s0 c2181s0M11912h = m11912h(str, str2);
        return c2181s0M11912h != null ? c2181s0M11912h.m12248o() : "";
    }

    /* renamed from: m */
    public static String m11917m(String str, String str2) {
        C2181s0 c2181s0M11912h = m11912h(str, str2);
        return c2181s0M11912h != null ? c2181s0M11912h.m12250q() : "";
    }

    /* renamed from: n */
    public static String m11918n(String str, String str2) {
        C2181s0 c2181s0M11912h = m11912h(str, str2);
        return c2181s0M11912h != null ? c2181s0M11912h.m12246m() : "";
    }

    /* renamed from: o */
    public static String m11919o(String str, String str2) {
        C2181s0 c2181s0M11912h = m11912h(str, str2);
        return c2181s0M11912h != null ? c2181s0M11912h.m12249p() : "";
    }

    /* renamed from: a */
    public static boolean m11905a(String str, String str2) {
        C2181s0 c2181s0M11912h = m11912h(str, str2);
        if (c2181s0M11912h != null) {
            return c2181s0M11912h.m12223a();
        }
        return true;
    }
}
