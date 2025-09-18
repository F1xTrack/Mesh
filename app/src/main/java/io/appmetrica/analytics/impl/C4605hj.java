package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.hj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4605hj extends C4567g5 {
    public C4605hj(Context context, C4583gl c4583gl, Z4 z4, C4 c4, Bg bg, AbstractC4519e5 abstractC4519e5) {
        this(context, z4, new C4464c0(), new TimePassedChecker(), new C4686l5(context, z4, c4, abstractC4519e5, c4583gl, bg, C4667ka.h().u().d(), PackageManagerUtils.getAppVersionCodeInt(context), C4667ka.h().i()));
    }

    @Override // io.appmetrica.analytics.impl.C4567g5, io.appmetrica.analytics.impl.Ba
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.SELF_SDK;
    }

    public C4605hj(Context context, Z4 z4, C4464c0 c4464c0, TimePassedChecker timePassedChecker, C4686l5 c4686l5) {
        super(context, z4, c4464c0, timePassedChecker, c4686l5);
    }
}
