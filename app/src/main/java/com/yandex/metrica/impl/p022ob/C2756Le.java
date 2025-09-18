package com.yandex.metrica.impl.p022ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Le */
/* loaded from: classes2.dex */
public class C2756Le implements InterfaceC2592F0 {

    /* renamed from: a */
    public final String f21638a;

    /* renamed from: b */
    public final JSONObject f21639b;

    /* renamed from: c */
    public final boolean f21640c;

    /* renamed from: d */
    public final boolean f21641d;

    /* renamed from: e */
    public final EnumC2567E0 f21642e;

    public C2756Le(String str, JSONObject jSONObject, boolean z, boolean z2, EnumC2567E0 enumC2567E0) {
        this.f21638a = str;
        this.f21639b = jSONObject;
        this.f21640c = z;
        this.f21641d = z2;
        this.f21642e = enumC2567E0;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2592F0
    /* renamed from: a */
    public EnumC2567E0 mo14053a() {
        return this.f21642e;
    }

    public String toString() {
        return "PreloadInfoState{trackingId='" + this.f21638a + "', additionalParameters=" + this.f21639b + ", wasSet=" + this.f21640c + ", autoTrackingEnabled=" + this.f21641d + ", source=" + this.f21642e + '}';
    }
}
