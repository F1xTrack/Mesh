package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class Mk extends HashMap {
    public Mk() {
        put(Kk.UNKNOWN, StartupParamsCallback.Reason.UNKNOWN);
        put(Kk.NETWORK, StartupParamsCallback.Reason.NETWORK);
        put(Kk.PARSE, StartupParamsCallback.Reason.INVALID_RESPONSE);
    }
}
