package com.huawei.hms.hatool;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.huawei.hms.hatool.y */
/* loaded from: classes.dex */
public final class C2192y {

    /* renamed from: b */
    private static C2192y f19317b;

    /* renamed from: a */
    private volatile Map<String, C2174p0> f19318a = new HashMap();

    private C2192y() {
    }

    /* renamed from: a */
    private C2174p0 m12300a(String str) {
        if (!this.f19318a.containsKey(str)) {
            this.f19318a.put(str, new C2174p0());
        }
        return this.f19318a.get(str);
    }

    /* renamed from: b */
    private static synchronized void m12302b() {
        if (f19317b == null) {
            f19317b = new C2192y();
        }
    }

    /* renamed from: a */
    public C2174p0 m12303a(String str, long j) {
        C2174p0 c2174p0M12300a = m12300a(str);
        c2174p0M12300a.m12167a(j);
        return c2174p0M12300a;
    }

    /* renamed from: a */
    public static C2192y m12301a() {
        if (f19317b == null) {
            m12302b();
        }
        return f19317b;
    }
}
