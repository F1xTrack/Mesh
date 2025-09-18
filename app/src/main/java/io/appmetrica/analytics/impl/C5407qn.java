package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.qn */
/* loaded from: classes2.dex */
public final class C5407qn implements InterfaceC5382pn {

    /* renamed from: a */
    public final C5617z8 f32476a;

    public C5407qn() {
        this(new C5617z8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5382pn
    /* renamed from: a */
    public final byte[] mo19606a(C4585J8 c4585j8, C4473Eg c4473Eg) {
        if (!((C5139g5) c4473Eg.f30089m).m20410B() && !TextUtils.isEmpty(c4585j8.f30338b)) {
            try {
                JSONObject jSONObject = new JSONObject(c4585j8.f30338b);
                jSONObject.remove("preloadInfo");
                c4585j8.f30338b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f32476a.mo19606a(c4585j8, c4473Eg);
    }

    public C5407qn(C5617z8 c5617z8) {
        this.f32476a = c5617z8;
    }
}
