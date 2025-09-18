package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.mi */
/* loaded from: classes2.dex */
public final class C5302mi extends AbstractC5200ig {

    /* renamed from: b */
    public final C4615Ke f32229b;

    public C5302mi(C5139g5 c5139g5) {
        this(c5139g5, C5244ka.m20614h().m20632q());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5200ig
    /* renamed from: a */
    public final boolean mo19341a(C4821T5 c4821t5) {
        JSONObject jSONObjectOptJSONObject;
        try {
            jSONObjectOptJSONObject = new JSONObject(c4821t5.getValue()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObjectOptJSONObject = null;
        }
        this.f32229b.m19631b(C4543He.m19470a(jSONObjectOptJSONObject));
        return false;
    }

    public C5302mi(C5139g5 c5139g5, C4615Ke c4615Ke) {
        super(c5139g5);
        this.f32229b = c4615Ke;
    }
}
