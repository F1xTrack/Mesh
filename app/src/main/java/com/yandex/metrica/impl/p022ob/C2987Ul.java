package com.yandex.metrica.impl.p022ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Ul */
/* loaded from: classes2.dex */
public class C2987Ul {

    /* renamed from: a */
    private final InterfaceC2839Om f22496a;

    /* renamed from: b */
    private final InterfaceC3016W0 f22497b;

    /* renamed from: c */
    private final C2488Al f22498c;

    /* renamed from: d */
    private final boolean f22499d;

    /* renamed from: e */
    private boolean f22500e;

    /* renamed from: f */
    private long f22501f;

    public C2987Ul(boolean z) {
        this(z, new C2814Nm(), C2834Oh.m14711a(), new C2488Al());
    }

    /* renamed from: a */
    public void m15287a() {
        long jMo14674a = this.f22496a.mo14674a();
        InterfaceC3016W0 interfaceC3016W0 = this.f22497b;
        C2488Al c2488Al = this.f22498c;
        long j = jMo14674a - this.f22501f;
        boolean z = this.f22499d;
        boolean z2 = this.f22500e;
        c2488Al.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time_millis", j).put("force", z).put("rescanned", z2);
        } catch (Throwable unused) {
        }
        interfaceC3016W0.reportEvent("ui_parsing_bridge_time", jSONObject.toString());
    }

    /* renamed from: b */
    public void m15289b() {
        this.f22501f = this.f22496a.mo14674a();
    }

    public C2987Ul(boolean z, InterfaceC2839Om interfaceC2839Om, InterfaceC3016W0 interfaceC3016W0, C2488Al c2488Al) {
        this.f22500e = false;
        this.f22499d = z;
        this.f22496a = interfaceC2839Om;
        this.f22497b = interfaceC3016W0;
        this.f22498c = c2488Al;
    }

    /* renamed from: a */
    public void m15288a(boolean z) {
        this.f22500e = z;
    }
}
