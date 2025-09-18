package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* renamed from: io.appmetrica.analytics.impl.jc */
/* loaded from: classes2.dex */
public final class C4645jc extends Q2 {
    public C4645jc(Context context, Re re, ReporterConfig reporterConfig, Nh nh, J9 j9) {
        this(context, nh, new Yg(re, new CounterConfiguration(reporterConfig), reporterConfig.userProfileID), j9, C4805q4.h().k(), new Nm(), new Vf(), new C4926v6(), new Y(), new C4453be(j9));
    }

    @Override // io.appmetrica.analytics.impl.Q2
    public final String k() {
        return "[ManualReporter]";
    }

    public C4645jc(Context context, Nh nh, Yg yg, J9 j9, Ub ub, Nm nm, Vf vf, C4926v6 c4926v6, Y y, C4453be c4453be) {
        super(context, nh, yg, j9, ub, nm, vf, c4926v6, y, c4453be);
        C4805q4.h().getClass();
    }
}
