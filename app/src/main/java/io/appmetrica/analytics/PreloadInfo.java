package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class PreloadInfo {

    /* renamed from: a */
    private final String f29517a;

    /* renamed from: b */
    private final Map f29518b;

    public static class Builder {

        /* renamed from: a */
        private final String f29519a;

        /* renamed from: b */
        private final HashMap f29520b;

        public /* synthetic */ Builder(String str, int i) {
            this(str);
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, 0);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.f29520b.put(str, str2);
            }
            return this;
        }

        private Builder(String str) {
            this.f29519a = str;
            this.f29520b = new HashMap();
        }
    }

    public /* synthetic */ PreloadInfo(Builder builder, int i) {
        this(builder);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, 0);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f29518b;
    }

    public String getTrackingId() {
        return this.f29517a;
    }

    private PreloadInfo(Builder builder) {
        this.f29517a = builder.f29519a;
        this.f29518b = CollectionUtils.unmodifiableMapCopy(builder.f29520b);
    }
}
