package ru.p031ok.tracer.base.limits;

import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJA\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m22267d2 = {"Lru/ok/tracer/base/limits/TracerFeatureLimits;", "", "", "globalShutdownMs", "", "featureName", "featureShutdownMs", "tag", "tagShutdownMs", "LTf1;", "setShutdownMs", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V", "", "isLimited", "(Ljava/lang/String;Ljava/lang/String;)Z", "Companion", "tracer-base_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface TracerFeatureLimits {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m22266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m22267d2 = {"Lru/ok/tracer/base/limits/TracerFeatureLimits$Companion;", "", "()V", "unlimited", "Lru/ok/tracer/base/limits/TracerFeatureLimits;", "tracer-base_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final TracerFeatureLimits unlimited() {
            return NoTracerFeatureLimits.INSTANCE;
        }
    }

    boolean isLimited(String featureName, String tag);

    void setShutdownMs(Long globalShutdownMs, String featureName, Long featureShutdownMs, String tag, Long tagShutdownMs);
}
