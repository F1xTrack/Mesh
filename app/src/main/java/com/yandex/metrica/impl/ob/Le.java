package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Le implements F0 {
    public final String a;
    public final JSONObject b;
    public final boolean c;
    public final boolean d;
    public final E0 e;

    public Le(String str, JSONObject jSONObject, boolean z, boolean z2, E0 e0) {
        this.a = str;
        this.b = jSONObject;
        this.c = z;
        this.d = z2;
        this.e = e0;
    }

    @Override // com.yandex.metrica.impl.ob.F0
    public E0 a() {
        return this.e;
    }

    public String toString() {
        return "PreloadInfoState{trackingId='" + this.a + "', additionalParameters=" + this.b + ", wasSet=" + this.c + ", autoTrackingEnabled=" + this.d + ", source=" + this.e + '}';
    }
}
