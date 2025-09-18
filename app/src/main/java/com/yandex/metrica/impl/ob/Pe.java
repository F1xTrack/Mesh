package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.PreloadInfo;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Pe {
    private Le a;

    public Pe(PreloadInfo preloadInfo, Im im, boolean z) {
        if (preloadInfo != null) {
            if (!TextUtils.isEmpty(preloadInfo.getTrackingId())) {
                this.a = new Le(preloadInfo.getTrackingId(), new JSONObject(preloadInfo.getAdditionalParams()), true, z, E0.APP);
            } else if (im.c()) {
                im.a("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.");
            }
        }
    }

    public JSONObject a(JSONObject jSONObject) {
        Le le = this.a;
        if (le != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("trackingId", le.a);
                    jSONObject2.put("additionalParams", le.b);
                    jSONObject2.put("wasSet", le.c);
                    jSONObject2.put("autoTracking", le.d);
                    jSONObject2.put("source", le.e.a());
                } catch (Throwable unused) {
                }
                jSONObject.put("preloadInfo", jSONObject2);
            } catch (Throwable unused2) {
            }
        }
        return jSONObject;
    }
}
