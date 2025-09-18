package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.O9 */
/* loaded from: classes2.dex */
public final class C4706O9 {

    /* renamed from: a */
    public final String f30551a;

    /* renamed from: b */
    public final int f30552b;

    /* renamed from: c */
    public final boolean f30553c;

    public C4706O9(JSONObject jSONObject) {
        this.f30551a = jSONObject.getString("name");
        this.f30553c = jSONObject.getBoolean("required");
        this.f30552b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4706O9.class != obj.getClass()) {
            return false;
        }
        C4706O9 c4706o9 = (C4706O9) obj;
        if (this.f30552b != c4706o9.f30552b || this.f30553c != c4706o9.f30553c) {
            return false;
        }
        String str = this.f30551a;
        String str2 = c4706o9.f30551a;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        String str = this.f30551a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f30552b) * 31) + (this.f30553c ? 1 : 0);
    }

    public C4706O9(String str, int i, boolean z) {
        this.f30551a = str;
        this.f30552b = i;
        this.f30553c = z;
    }
}
