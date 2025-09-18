package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Wl;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.nm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2961nm extends Wl {
    public volatile String h;
    public volatile String i;

    public C2961nm(String str, String str2, Wl.b bVar, int i, boolean z) {
        super(str, str2, null, i, z, Wl.c.VIEW, Wl.a.WEBVIEW);
        this.h = null;
        this.i = null;
    }

    @Override // com.yandex.metrica.impl.ob.Wl
    public boolean a() {
        return true;
    }

    @Override // com.yandex.metrica.impl.ob.Wl
    public String toString() {
        return "WebViewElement{url='" + this.h + "', originalUrl='" + this.i + "', mClassName='" + this.a + "', mId='" + this.b + "', mParseFilterReason=" + this.c + ", mDepth=" + this.d + ", mListItem=" + this.e + ", mViewType=" + this.f + ", mClassType=" + this.g + "} ";
    }

    @Override // com.yandex.metrica.impl.ob.Wl
    public JSONArray a(Kl kl) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", "HTML");
            if (kl.j) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("u", U2.a(this.h, kl.o));
                jSONObject2.putOpt("ou", U2.a(this.i, kl.o));
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
