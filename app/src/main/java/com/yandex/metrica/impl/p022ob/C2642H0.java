package com.yandex.metrica.impl.p022ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.H0 */
/* loaded from: classes2.dex */
public class C2642H0 {

    /* renamed from: a */
    private C2639Gm f21334a = new C2639Gm();

    /* renamed from: b */
    private C2765Ln f21335b;

    public C2642H0(C2765Ln c2765Ln) {
        this.f21335b = c2765Ln;
    }

    /* renamed from: a */
    public void m14215a(String str, String str2) {
        this.f21335b.m14557b(this.f21334a, str, str2);
    }

    /* renamed from: a */
    public String m14214a() {
        if (this.f21334a.isEmpty()) {
            return null;
        }
        return new JSONObject(this.f21334a).toString();
    }
}
