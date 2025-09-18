package com.huawei.hms.hatool;

/* renamed from: com.huawei.hms.hatool.v */
/* loaded from: classes.dex */
public class C2186v {

    /* renamed from: a */
    private static C2165m0 f19311a = new C2165m0();

    /* renamed from: a */
    public static void m12264a(int i) {
        f19311a.m12117a(i);
    }

    /* renamed from: b */
    public static void m12268b(String str, String str2) {
        if (!m12270b() || str == null || str2 == null) {
            return;
        }
        f19311a.m12119b(6, str, str2);
    }

    /* renamed from: c */
    public static void m12271c(String str, String str2) {
        if (!m12272c() || str == null || str2 == null) {
            return;
        }
        f19311a.m12119b(4, str, str2);
    }

    /* renamed from: d */
    public static void m12273d(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        f19311a.m12119b(4, str, str2);
    }

    /* renamed from: e */
    public static void m12275e(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        f19311a.m12119b(5, str, str2);
    }

    /* renamed from: f */
    public static void m12276f(String str, String str2) {
        if (!m12274d() || str == null || str2 == null) {
            return;
        }
        f19311a.m12119b(5, str, str2);
    }

    /* renamed from: a */
    public static void m12265a(String str, String str2) {
        if (!m12267a() || str == null || str2 == null) {
            return;
        }
        f19311a.m12119b(3, str, str2);
    }

    /* renamed from: b */
    public static void m12269b(String str, String str2, Object... objArr) {
        m12273d(str, String.format(str2, objArr));
    }

    /* renamed from: c */
    private static boolean m12272c() {
        return f19311a.m12120b(4);
    }

    /* renamed from: d */
    private static boolean m12274d() {
        return f19311a.m12120b(5);
    }

    /* renamed from: a */
    public static void m12266a(String str, String str2, Object... objArr) {
        if (!m12272c() || str == null || str2 == null) {
            return;
        }
        f19311a.m12119b(4, str, String.format(str2, objArr));
    }

    /* renamed from: b */
    private static boolean m12270b() {
        return f19311a.m12120b(6);
    }

    /* renamed from: a */
    private static boolean m12267a() {
        return f19311a.m12120b(3);
    }
}
