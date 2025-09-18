package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import com.yandex.metrica.PreloadInfo;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Pe */
/* loaded from: classes2.dex */
public class C2856Pe {

    /* renamed from: a */
    private C2756Le f21953a;

    public C2856Pe(PreloadInfo preloadInfo, C2689Im c2689Im, boolean z) {
        if (preloadInfo != null) {
            if (!TextUtils.isEmpty(preloadInfo.getTrackingId())) {
                this.f21953a = new C2756Le(preloadInfo.getTrackingId(), new JSONObject(preloadInfo.getAdditionalParams()), true, z, EnumC2567E0.APP);
            } else if (c2689Im.m17370c()) {
                c2689Im.m17362a("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.");
            }
        }
    }

    /* renamed from: a */
    public JSONObject m14786a(JSONObject jSONObject) {
        C2756Le c2756Le = this.f21953a;
        if (c2756Le != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("trackingId", c2756Le.f21638a);
                    jSONObject2.put("additionalParams", c2756Le.f21639b);
                    jSONObject2.put("wasSet", c2756Le.f21640c);
                    jSONObject2.put("autoTracking", c2756Le.f21641d);
                    jSONObject2.put("source", c2756Le.f21642e.m14026a());
                } catch (Throwable unused) {
                }
                jSONObject.put("preloadInfo", jSONObject2);
            } catch (Throwable unused2) {
            }
        }
        return jSONObject;
    }
}
