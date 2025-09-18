package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class O9 {
    public final String a;
    public final int b;
    public final boolean c;

    public O9(JSONObject jSONObject) {
        this.a = jSONObject.getString("name");
        this.c = jSONObject.getBoolean("required");
        this.b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || O9.class != obj.getClass()) {
            return false;
        }
        O9 o9 = (O9) obj;
        if (this.b != o9.b || this.c != o9.c) {
            return false;
        }
        String str = this.a;
        String str2 = o9.a;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        String str = this.a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.b) * 31) + (this.c ? 1 : 0);
    }

    public O9(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }
}
