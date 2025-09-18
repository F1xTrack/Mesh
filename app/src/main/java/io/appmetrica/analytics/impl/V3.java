package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;

/* loaded from: classes2.dex */
public final class V3 extends SimpleThreadSafeToggle {
    public final C4815qe a;

    public V3(C4815qe c4815qe) {
        super(c4815qe.e(), "[ClientApiTrackingStatusToggle]");
        this.a = c4815qe;
    }

    public final void a(boolean z) {
        updateState(z);
        this.a.d(z);
    }
}
