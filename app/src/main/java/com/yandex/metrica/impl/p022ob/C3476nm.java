package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3037Wl;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.nm */
/* loaded from: classes2.dex */
public class C3476nm extends C3037Wl {

    /* renamed from: h */
    public volatile String f24329h;

    /* renamed from: i */
    public volatile String f24330i;

    public C3476nm(String str, String str2, C3037Wl.b bVar, int i, boolean z) {
        super(str, str2, null, i, z, C3037Wl.c.VIEW, C3037Wl.a.WEBVIEW);
        this.f24329h = null;
        this.f24330i = null;
    }

    @Override // com.yandex.metrica.impl.p022ob.C3037Wl
    /* renamed from: a */
    public boolean mo14049a() {
        return true;
    }

    @Override // com.yandex.metrica.impl.p022ob.C3037Wl
    public String toString() {
        return "WebViewElement{url='" + this.f24329h + "', originalUrl='" + this.f24330i + "', mClassName='" + this.f22707a + "', mId='" + this.f22708b + "', mParseFilterReason=" + this.f22709c + ", mDepth=" + this.f22710d + ", mListItem=" + this.f22711e + ", mViewType=" + this.f22712f + ", mClassType=" + this.f22713g + "} ";
    }

    @Override // com.yandex.metrica.impl.p022ob.C3037Wl
    /* renamed from: a */
    public JSONArray mo14048a(C2738Kl c2738Kl) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", "HTML");
            if (c2738Kl.f21601j) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("u", C2968U2.m15232a(this.f24329h, c2738Kl.f21606o));
                jSONObject2.putOpt("ou", C2968U2.m15232a(this.f24330i, c2738Kl.f21606o));
                if (jSONObject2.length() > 0) {
                    jSONObject.put("i", jSONObject2);
                }
            }
            jSONArray.put(jSONObject);
        } catch (Throwable unused) {
        }
        return jSONArray;
    }
}
