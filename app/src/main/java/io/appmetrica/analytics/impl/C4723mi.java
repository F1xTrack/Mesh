package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.mi */
/* loaded from: classes2.dex */
public final class C4723mi extends AbstractC4625ig {
    public final Ke b;

    public C4723mi(C4567g5 c4567g5) {
        this(c4567g5, C4667ka.h().q());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4625ig
    public final boolean a(T5 t5) {
        JSONObject jSONObjectOptJSONObject;
        try {
            jSONObjectOptJSONObject = new JSONObject(t5.getValue()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObjectOptJSONObject = null;
        }
        this.b.b(He.a(jSONObjectOptJSONObject));
        return false;
    }

    public C4723mi(C4567g5 c4567g5, Ke ke) {
        super(c4567g5);
        this.b = ke;
    }
}
