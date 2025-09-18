package com.yandex.metrica.impl.ob;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class C9 {
    private final I8 a;

    public C9(I8 i8) {
        this.a = i8;
    }

    public final int a(int i) {
        JSONObject jSONObjectF = this.a.f();
        if (jSONObjectF != null) {
            return jSONObjectF.optInt(String.valueOf(i));
        }
        return 0;
    }

    public final void a(int i, int i2) throws JSONException {
        JSONObject jSONObjectF = this.a.f();
        if (jSONObjectF == null) {
            jSONObjectF = new JSONObject();
        }
        jSONObjectF.put(String.valueOf(i), i2);
        this.a.b(jSONObjectF);
    }
}
