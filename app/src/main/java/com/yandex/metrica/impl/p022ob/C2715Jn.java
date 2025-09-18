package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.Jn */
/* loaded from: classes2.dex */
public class C2715Jn {

    /* renamed from: a */
    private final String f21559a;

    /* renamed from: b */
    private final C2689Im f21560b;

    public C2715Jn(int i, String str, C2689Im c2689Im) {
        this.f21559a = str;
        this.f21560b = c2689Im;
    }

    /* renamed from: a */
    public boolean m14449a(C2639Gm c2639Gm, String str, String str2) {
        int iM14210a = c2639Gm.m14210a();
        if (str2 != null) {
            iM14210a += str2.length();
        }
        if (c2639Gm.containsKey(str)) {
            String str3 = c2639Gm.get(str);
            if (str3 != null) {
                iM14210a -= str3.length();
            }
        } else {
            iM14210a += str.length();
        }
        return iM14210a > 4500;
    }

    /* renamed from: a */
    public void m14448a(String str) {
        if (this.f21560b.m17370c()) {
            this.f21560b.m17369c("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", this.f21559a, 4500, str);
        }
    }
}
