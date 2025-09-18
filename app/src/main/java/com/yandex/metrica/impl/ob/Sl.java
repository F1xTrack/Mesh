package com.yandex.metrica.impl.ob;

import android.app.Activity;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Sl {
    private final InterfaceC2910ll a;
    private final InterfaceC2860jl b;
    private final InterfaceC2885kl c;
    private final InterfaceC2811hl d;
    private final String e;

    public Sl(InterfaceC2910ll interfaceC2910ll, InterfaceC2860jl interfaceC2860jl, InterfaceC2885kl interfaceC2885kl, InterfaceC2811hl interfaceC2811hl, String str) {
        this.a = interfaceC2910ll;
        this.b = interfaceC2860jl;
        this.c = interfaceC2885kl;
        this.d = interfaceC2811hl;
        this.e = str;
    }

    public JSONObject a(Activity activity, Gl gl, Kl kl, C2661bl c2661bl, long j) {
        JSONObject jSONObjectA = this.a.a(activity, j);
        try {
            this.c.a(jSONObjectA, new JSONObject(), this.e);
            this.c.a(jSONObjectA, this.b.a(gl, kl, c2661bl, (jSONObjectA.toString().getBytes().length + (this.d.a(new JSONObject()).toString().getBytes().length - 2)) - 2), this.e);
        } catch (Throwable unused) {
        }
        return jSONObjectA;
    }
}
