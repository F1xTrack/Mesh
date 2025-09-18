package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Mk */
/* loaded from: classes2.dex */
public final class C4669Mk extends HashMap {
    public C4669Mk() {
        put(EnumC4621Kk.UNKNOWN, StartupParamsCallback.Reason.UNKNOWN);
        put(EnumC4621Kk.NETWORK, StartupParamsCallback.Reason.NETWORK);
        put(EnumC4621Kk.PARSE, StartupParamsCallback.Reason.INVALID_RESPONSE);
    }
}
