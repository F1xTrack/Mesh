package com.huawei.hms.hatool;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.huawei.hms.hatool.s */
/* loaded from: classes.dex */
public final class C2180s {

    /* renamed from: b */
    static Map<String, C2163l1> f19281b = new HashMap();

    /* renamed from: c */
    private static C2180s f19282c;

    /* renamed from: a */
    private C2148g1 f19283a = new C2148g1();

    private C2180s() {
    }

    /* renamed from: c */
    public static C2180s m12212c() {
        if (f19282c == null) {
            m12213d();
        }
        return f19282c;
    }

    /* renamed from: d */
    private static synchronized void m12213d() {
        if (f19282c == null) {
            f19282c = new C2180s();
        }
    }

    /* renamed from: a */
    public C2163l1 m12214a(String str) {
        return f19281b.get(str);
    }

    /* renamed from: b */
    public C2148g1 m12217b() {
        return this.f19283a;
    }

    /* renamed from: a */
    public Set<String> m12215a() {
        return f19281b.keySet();
    }

    /* renamed from: a */
    public void m12216a(String str, C2163l1 c2163l1) {
        f19281b.put(str, c2163l1);
    }
}
