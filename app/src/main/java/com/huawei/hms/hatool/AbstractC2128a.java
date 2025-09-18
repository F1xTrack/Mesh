package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;

/* renamed from: com.huawei.hms.hatool.a */
/* loaded from: classes.dex */
public abstract class AbstractC2128a {

    /* renamed from: a */
    private static C2195z0 f19129a;

    /* renamed from: a */
    private static synchronized C2195z0 m11898a() {
        try {
            if (f19129a == null) {
                f19129a = C2176q.m12177c().m12180b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19129a;
    }

    /* renamed from: b */
    public static void m11901b(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (m11898a() == null || !C2178q1.m12204b().m12205a()) {
            return;
        }
        if (i == 1 || i == 0) {
            f19129a.m12324b(i, str, linkedHashMap);
            return;
        }
        C2186v.m12273d("hmsSdk", "Data type no longer collects range.type: " + i);
    }

    /* renamed from: c */
    public static void m11903c() {
        if (m11898a() == null || !C2178q1.m12204b().m12205a()) {
            return;
        }
        f19129a.m12320a(-1);
    }

    /* renamed from: a */
    public static void m11899a(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (m11898a() == null || !C2178q1.m12204b().m12205a()) {
            return;
        }
        if (i == 1 || i == 0) {
            f19129a.m12321a(i, str, linkedHashMap);
            return;
        }
        C2186v.m12273d("hmsSdk", "Data type no longer collects range.type: " + i);
    }

    /* renamed from: b */
    public static boolean m11902b() {
        return C2176q.m12177c().m12179a();
    }

    @Deprecated
    /* renamed from: a */
    public static void m11900a(Context context, String str, String str2) {
        if (m11898a() != null) {
            f19129a.m12322a(context, str, str2);
        }
    }
}
