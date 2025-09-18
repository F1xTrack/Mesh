package ru.ok.tracer.utils;

import defpackage.AbstractC3557eJ0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"testProbability", "", "", "(Ljava/lang/Long;)Z", "tracer-commons_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
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
        AbstractC3557eJ0.a.getClass();
        return AbstractC3557eJ0.b.e(jLongValue) == 0;
    }
}
