package com.yandex.metrica.impl.p022ob;

import android.app.Activity;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Sl */
/* loaded from: classes2.dex */
public class C2937Sl {

    /* renamed from: a */
    private final InterfaceC3423ll f22331a;

    /* renamed from: b */
    private final InterfaceC3371jl f22332b;

    /* renamed from: c */
    private final InterfaceC3397kl f22333c;

    /* renamed from: d */
    private final InterfaceC3319hl f22334d;

    /* renamed from: e */
    private final String f22335e;

    public C2937Sl(InterfaceC3423ll interfaceC3423ll, InterfaceC3371jl interfaceC3371jl, InterfaceC3397kl interfaceC3397kl, InterfaceC3319hl interfaceC3319hl, String str) {
        this.f22331a = interfaceC3423ll;
        this.f22332b = interfaceC3371jl;
        this.f22333c = interfaceC3397kl;
        this.f22334d = interfaceC3319hl;
        this.f22335e = str;
    }

    /* renamed from: a */
    public JSONObject m15139a(Activity activity, C2638Gl c2638Gl, C2738Kl c2738Kl, C3163bl c3163bl, long j) {
        JSONObject jSONObjectMo14673a = this.f22331a.mo14673a(activity, j);
        try {
            this.f22333c.mo14629a(jSONObjectMo14673a, new JSONObject(), this.f22335e);
            this.f22333c.mo14629a(jSONObjectMo14673a, this.f22332b.mo15087a(c2638Gl, c2738Kl, c3163bl, (jSONObjectMo14673a.toString().getBytes().length + (this.f22334d.mo14206a(new JSONObject()).toString().getBytes().length - 2)) - 2), this.f22335e);
        } catch (Throwable unused) {
        }
        return jSONObjectMo14673a;
    }
}
