package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class H0 {
    private Gm a = new Gm();
    private Ln b;

    public H0(Ln ln) {
        this.b = ln;
    }

    public void a(String str, String str2) {
        this.b.b(this.a, str, str2);
    }

    public String a() {
        if (this.a.isEmpty()) {
            return null;
        }
        return new JSONObject(this.a).toString();
    }
}
