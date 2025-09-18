package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* renamed from: io.appmetrica.analytics.impl.Xg */
/* loaded from: classes2.dex */
public final class C4928Xg extends C5139g5 {

    /* renamed from: x */
    public final String f31048x;

    /* renamed from: y */
    public final C4463E6 f31049y;

    public C4928Xg(Context context, C4964Z4 c4964z4, C4411C4 c4411c4, C4463E6 c4463e6, C5155gl c5155gl, AbstractC5089e5 abstractC5089e5) {
        this(context, c4964z4, new C5034c0(), new TimePassedChecker(), new C5264l5(context, c4964z4, c4411c4, abstractC5089e5, c5155gl, new C4808Sg(c4463e6), C5244ka.m20614h().m20636u().m21141d(), PackageManagerUtils.getAppVersionCodeInt(context), C5244ka.m20614h().m20624i()), c4463e6);
    }

    @Override // io.appmetrica.analytics.impl.C5139g5, io.appmetrica.analytics.impl.InterfaceC4659Ma, io.appmetrica.analytics.impl.InterfaceC4392Ba
    /* renamed from: a */
    public final synchronized void mo19228a(C4411C4 c4411c4) {
        super.mo19228a(c4411c4);
        this.f31049y.m19339a(this.f31048x, c4411c4.f29946i);
    }

    public C4928Xg(Context context, C4964Z4 c4964z4, C5034c0 c5034c0, TimePassedChecker timePassedChecker, C5264l5 c5264l5, C4463E6 c4463e6) {
        super(context, c4964z4, c5034c0, timePassedChecker, c5264l5);
        this.f31048x = c4964z4.m20055b();
        this.f31049y = c4463e6;
    }
}
