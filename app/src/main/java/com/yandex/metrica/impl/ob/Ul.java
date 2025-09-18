package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Ul {
    private final Om a;
    private final W0 b;
    private final Al c;
    private final boolean d;
    private boolean e;
    private long f;

    public Ul(boolean z) {
        this(z, new Nm(), Oh.a(), new Al());
    }

    public void a() {
        long jA = this.a.a();
        W0 w0 = this.b;
        Al al = this.c;
        long j = jA - this.f;
        boolean z = this.d;
        boolean z2 = this.e;
        al.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time_millis", j).put("force", z).put("rescanned", z2);
        } catch (Throwable unused) {
        }
        w0.reportEvent("ui_parsing_bridge_time", jSONObject.toString());
    }

    public void b() {
        this.f = this.a.a();
    }

    public Ul(boolean z, Om om, W0 w0, Al al) {
        this.e = false;
        this.d = z;
        this.a = om;
        this.b = w0;
        this.c = al;
    }

    public void a(boolean z) {
        this.e = z;
    }
}
