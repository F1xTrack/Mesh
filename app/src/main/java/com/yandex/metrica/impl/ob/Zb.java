package com.yandex.metrica.impl.ob;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Zb {
    private final String a;
    private final int b;
    private final boolean c;

    public Zb(JSONObject jSONObject) throws JSONException {
        this.a = jSONObject.getString("name");
        this.c = jSONObject.getBoolean("required");
        this.b = jSONObject.optInt("version", -1);
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("name", this.a).put("required", this.c);
        int i = this.b;
        if (i != -1) {
            jSONObjectPut.put("version", i);
        }
        return jSONObjectPut;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Zb.class != obj.getClass()) {
            return false;
        }
        Zb zb = (Zb) obj;
        if (this.b != zb.b || this.c != zb.c) {
            return false;
        }
        String str = this.a;
        String str2 = zb.a;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.b) * 31) + (this.c ? 1 : 0);
    }

    public Zb(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }
}
