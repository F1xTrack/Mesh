package com.yandex.metrica;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class PreloadInfo {

    /* renamed from: a */
    public String f20735a;

    /* renamed from: b */
    public Map f20736b;

    public static class Builder {

        /* renamed from: a */
        public String f20737a;

        /* renamed from: b */
        public HashMap f20738b;

        public PreloadInfo build() {
            PreloadInfo preloadInfo = new PreloadInfo();
            preloadInfo.f20735a = this.f20737a;
            preloadInfo.f20736b = Collections.unmodifiableMap(this.f20738b);
            return preloadInfo;
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.f20738b.put(str, str2);
            }
            return this;
        }
    }

    public static Builder newBuilder(String str) {
        Builder builder = new Builder();
        builder.f20737a = str;
        builder.f20738b = new HashMap();
        return builder;
    }

    public Map<String, String> getAdditionalParams() {
        return this.f20736b;
    }

    public String getTrackingId() {
        return this.f20735a;
    }
}
