package ru.p031ok.tracer.base.limits;

import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m22267d2 = {"Lru/ok/tracer/base/limits/NoTracerFeatureLimits;", "Lru/ok/tracer/base/limits/TracerFeatureLimits;", "<init>", "()V", "", "globalShutdownMs", "", "featureName", "featureShutdownMs", "tag", "tagShutdownMs", "LTf1;", "setShutdownMs", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V", "", "isLimited", "(Ljava/lang/String;Ljava/lang/String;)Z", "tracer-base_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
final class NoTracerFeatureLimits implements TracerFeatureLimits {
    public static final NoTracerFeatureLimits INSTANCE = new NoTracerFeatureLimits();

    private NoTracerFeatureLimits() {
    }

    @Override // ru.p031ok.tracer.base.limits.TracerFeatureLimits
    public boolean isLimited(String featureName, String tag) {
        return false;
    }

    @Override // ru.p031ok.tracer.base.limits.TracerFeatureLimits
    public void setShutdownMs(Long globalShutdownMs, String featureName, Long featureShutdownMs, String tag, Long tagShutdownMs) {
    }
}
