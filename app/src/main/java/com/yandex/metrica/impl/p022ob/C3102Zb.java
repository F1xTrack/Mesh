package com.yandex.metrica.impl.p022ob;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Zb */
/* loaded from: classes2.dex */
public final class C3102Zb {

    /* renamed from: a */
    private final String f22949a;

    /* renamed from: b */
    private final int f22950b;

    /* renamed from: c */
    private final boolean f22951c;

    public C3102Zb(JSONObject jSONObject) throws JSONException {
        this.f22949a = jSONObject.getString("name");
        this.f22951c = jSONObject.getBoolean("required");
        this.f22950b = jSONObject.optInt("version", -1);
    }

    /* renamed from: a */
    public JSONObject m15539a() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("name", this.f22949a).put("required", this.f22951c);
        int i = this.f22950b;
        if (i != -1) {
            jSONObjectPut.put("version", i);
        }
        return jSONObjectPut;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3102Zb.class != obj.getClass()) {
            return false;
        }
        C3102Zb c3102Zb = (C3102Zb) obj;
        if (this.f22950b != c3102Zb.f22950b || this.f22951c != c3102Zb.f22951c) {
            return false;
        }
        String str = this.f22949a;
        String str2 = c3102Zb.f22949a;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.f22949a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f22950b) * 31) + (this.f22951c ? 1 : 0);
    }

    public C3102Zb(String str, int i, boolean z) {
        this.f22949a = str;
        this.f22950b = i;
        this.f22951c = z;
    }
}
