package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* loaded from: classes2.dex */
public final class Xg extends C4567g5 {
    public final String x;
    public final E6 y;

    public Xg(Context context, Z4 z4, C4 c4, E6 e6, C4583gl c4583gl, AbstractC4519e5 abstractC4519e5) {
        this(context, z4, new C4464c0(), new TimePassedChecker(), new C4686l5(context, z4, c4, abstractC4519e5, c4583gl, new Sg(e6), C4667ka.h().u().d(), PackageManagerUtils.getAppVersionCodeInt(context), C4667ka.h().i()), e6);
    }

    @Override // io.appmetrica.analytics.impl.C4567g5, io.appmetrica.analytics.impl.Ma, io.appmetrica.analytics.impl.Ba
    public final synchronized void a(C4 c4) {
        super.a(c4);
        this.y.a(this.x, c4.i);
    }

    public Xg(Context context, Z4 z4, C4464c0 c4464c0, TimePassedChecker timePassedChecker, C4686l5 c4686l5, E6 e6) {
        super(context, z4, c4464c0, timePassedChecker, c4686l5);
        this.x = z4.b();
        this.y = e6;
    }
}
