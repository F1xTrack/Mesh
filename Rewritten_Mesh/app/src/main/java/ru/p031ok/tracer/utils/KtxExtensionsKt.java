package ru.p031ok.tracer.utils;

import kotlin.Metadata;
import p000.AbstractC9225eJ0;

@Metadata(m22266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m22267d2 = {"testProbability", "", "", "(Ljava/lang/Long;)Z", "tracer-commons_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class KtxExtensionsKt {
    public static final boolean testProbability(Long l) {
        if (l == null) {
            return false;
        }
        long jLongValue = l.longValue();
        if (jLongValue < 0) {
            return false;
        }
        if (jLongValue == 0) {
            return true;
        }
        AbstractC9225eJ0.f26655a.getClass();
        return AbstractC9225eJ0.f26656b.mo17529e(jLongValue) == 0;
    }
}
