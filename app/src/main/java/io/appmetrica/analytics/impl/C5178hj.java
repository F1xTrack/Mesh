package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.hj */
/* loaded from: classes2.dex */
public final class C5178hj extends C5139g5 {
    public C5178hj(Context context, C5155gl c5155gl, C4964Z4 c4964z4, C4411C4 c4411c4, InterfaceC4398Bg interfaceC4398Bg, AbstractC5089e5 abstractC5089e5) {
        this(context, c4964z4, new C5034c0(), new TimePassedChecker(), new C5264l5(context, c4964z4, c4411c4, abstractC5089e5, c5155gl, interfaceC4398Bg, C5244ka.m20614h().m20636u().m21141d(), PackageManagerUtils.getAppVersionCodeInt(context), C5244ka.m20614h().m20624i()));
    }

    @Override // io.appmetrica.analytics.impl.C5139g5, io.appmetrica.analytics.impl.InterfaceC4392Ba
    /* renamed from: c */
    public final CounterConfigurationReporterType mo19230c() {
        return CounterConfigurationReporterType.SELF_SDK;
    }

    public C5178hj(Context context, C4964Z4 c4964z4, C5034c0 c5034c0, TimePassedChecker timePassedChecker, C5264l5 c5264l5) {
        super(context, c4964z4, c5034c0, timePassedChecker, c5264l5);
    }
}
