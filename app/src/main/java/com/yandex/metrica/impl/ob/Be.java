package com.yandex.metrica.impl.ob;

import defpackage.AbstractC7209tN0;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Be implements C0<a, Le> {
    public final Le a;
    public final List<a> b;

    public static class a {
        public final String a;
        public final JSONObject b;
        public final E0 c;

        public a(String str, JSONObject jSONObject, E0 e0) {
            this.a = str;
            this.b = jSONObject;
            this.c = e0;
        }

        public String toString() {
            return "Candidate{trackingId='" + this.a + "', additionalParams=" + this.b + ", source=" + this.c + '}';
        }
    }

    public Be(Le le, List<a> list) {
        this.a = le;
        this.b = list;
    }

    @Override // com.yandex.metrica.impl.ob.C0
    public List<a> a() {
        return this.b;
    }

    @Override // com.yandex.metrica.impl.ob.C0
    public Le b() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PreloadInfoData{chosenPreloadInfo=");
        sb.append(this.a);
        sb.append(", candidates=");
        return AbstractC7209tN0.A(sb, this.b, '}');
    }
}
