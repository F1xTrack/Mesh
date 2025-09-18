package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.Ln */
/* loaded from: classes2.dex */
public class C2765Ln {

    /* renamed from: a */
    private final C2740Kn f21668a;

    /* renamed from: b */
    private final C2715Jn f21669b;

    public C2765Ln(C2689Im c2689Im, String str) {
        this(new C2740Kn(30, 50, 4000, str, c2689Im), new C2715Jn(4500, str, c2689Im));
    }

    /* renamed from: a */
    public synchronized boolean m14556a(C2639Gm c2639Gm, String str, String str2) {
        try {
            if (c2639Gm.size() >= this.f21668a.m14495a().m14213a() && (this.f21668a.m14495a().m14213a() != c2639Gm.size() || !c2639Gm.containsKey(str))) {
                this.f21668a.m14496a(str);
            } else {
                if (!this.f21669b.m14449a(c2639Gm, str, str2)) {
                    c2639Gm.put(str, str2);
                    return true;
                }
                this.f21669b.m14448a(str);
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public boolean m14557b(C2639Gm c2639Gm, String str, String str2) {
        if (c2639Gm == null) {
            return false;
        }
        String strMo14016a = this.f21668a.m14497b().mo14016a(str);
        String strMo14016a2 = this.f21668a.m14498c().mo14016a(str2);
        if (!c2639Gm.containsKey(strMo14016a)) {
            if (strMo14016a2 != null) {
                return m14556a(c2639Gm, strMo14016a, strMo14016a2);
            }
            return false;
        }
        String str3 = c2639Gm.get(strMo14016a);
        if (strMo14016a2 == null || !strMo14016a2.equals(str3)) {
            return m14556a(c2639Gm, strMo14016a, strMo14016a2);
        }
        return false;
    }

    public C2765Ln(C2740Kn c2740Kn, C2715Jn c2715Jn) {
        this.f21668a = c2740Kn;
        this.f21669b = c2715Jn;
    }
}
