package com.yandex.metrica.impl.p022ob;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.C9 */
/* loaded from: classes2.dex */
public final class C2526C9 {

    /* renamed from: a */
    private final C2675I8 f20975a;

    public C2526C9(C2675I8 c2675i8) {
        this.f20975a = c2675i8;
    }

    /* renamed from: a */
    public final int m13959a(int i) {
        JSONObject jSONObjectM14294f = this.f20975a.m14294f();
        if (jSONObjectM14294f != null) {
            return jSONObjectM14294f.optInt(String.valueOf(i));
        }
        return 0;
    }

    /* renamed from: a */
    public final void m13960a(int i, int i2) throws JSONException {
        JSONObject jSONObjectM14294f = this.f20975a.m14294f();
        if (jSONObjectM14294f == null) {
            jSONObjectM14294f = new JSONObject();
        }
        jSONObjectM14294f.put(String.valueOf(i), i2);
        this.f20975a.m14287b(jSONObjectM14294f);
    }
}
