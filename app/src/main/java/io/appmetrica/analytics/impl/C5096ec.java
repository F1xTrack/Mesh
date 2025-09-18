package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.ec */
/* loaded from: classes2.dex */
public final class C5096ec extends C5139g5 implements InterfaceC4587Ja, InterfaceC4563Ia {

    /* renamed from: A */
    public final C5187i3 f31586A;

    /* renamed from: x */
    public final C4422Cf f31587x;

    /* renamed from: y */
    public final C4520Gf f31588y;

    /* renamed from: z */
    public final C4463E6 f31589z;

    public C5096ec(Context context, C5155gl c5155gl, C4964Z4 c4964z4, C4411C4 c4411c4, C4422Cf c4422Cf, C4463E6 c4463e6, AbstractC5089e5 abstractC5089e5) {
        this(context, c4964z4, c5155gl, c4411c4, new C5034c0(), new TimePassedChecker(), new C5121fc(context, c4964z4, c4411c4, abstractC5089e5, c5155gl, new C4971Zb(c4463e6), C5244ka.m20614h().m20636u().m21141d(), PackageManagerUtils.getAppVersionCodeInt(context), C5244ka.m20614h().m20636u(), C5244ka.m20614h().m20624i()), c4422Cf, c4463e6);
    }

    @Override // io.appmetrica.analytics.impl.C5139g5
    /* renamed from: C */
    public final void mo20346C() {
        this.f31587x.m19279a(this.f31588y);
    }

    /* renamed from: D */
    public final boolean m20347D() {
        boolean zOptBoolean;
        C5482tn c5482tn = this.f31743v;
        synchronized (c5482tn) {
            zOptBoolean = c5482tn.f32656a.m21151a().optBoolean("referrer_handled", false);
        }
        return zOptBoolean;
    }

    @Override // io.appmetrica.analytics.impl.C5139g5, io.appmetrica.analytics.impl.InterfaceC4659Ma, io.appmetrica.analytics.impl.InterfaceC4392Ba
    /* renamed from: a */
    public final synchronized void mo19228a(C4411C4 c4411c4) {
        super.mo19228a(c4411c4);
        this.f31589z.m19338a(c4411c4.f29946i);
    }

    @Override // io.appmetrica.analytics.impl.C5139g5, io.appmetrica.analytics.impl.InterfaceC4392Ba
    /* renamed from: c */
    public final CounterConfigurationReporterType mo19230c() {
        return CounterConfigurationReporterType.MAIN;
    }

    @Override // io.appmetrica.analytics.impl.C5139g5, io.appmetrica.analytics.impl.InterfaceC4659Ma, io.appmetrica.analytics.impl.InterfaceC4788Rk
    /* renamed from: a */
    public final void mo19574a(C5155gl c5155gl) {
        synchronized (this) {
            this.f31733l.m21115a(c5155gl);
            this.f31738q.m20860b();
        }
        this.f31586A.mo19206a(c5155gl);
    }

    public C5096ec(Context context, C4964Z4 c4964z4, C5155gl c5155gl, C4411C4 c4411c4, C5034c0 c5034c0, TimePassedChecker timePassedChecker, C5121fc c5121fc, C4422Cf c4422Cf, C4463E6 c4463e6) {
        super(context, c4964z4, c5034c0, timePassedChecker, c5121fc);
        this.f31587x = c4422Cf;
        C4872V8 c4872v8M20419j = m20419j();
        c4872v8M20419j.m19912a(EnumC4898Wa.EVENT_TYPE_REGULAR, new C4951Yf(c4872v8M20419j.m19913b()));
        this.f31588y = c5121fc.m20387b(this);
        this.f31589z = c4463e6;
        C5187i3 c5187i3M20386a = c5121fc.m20386a(this);
        this.f31586A = c5187i3M20386a;
        c5187i3M20386a.m20563a(c5155gl, c4411c4.f29950m);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4563Ia
    /* renamed from: a */
    public final void mo19498a() {
        C5482tn c5482tn = this.f31743v;
        synchronized (c5482tn) {
            C5507un c5507un = c5482tn.f32656a;
            c5507un.m21152a(c5507un.m21151a().put("referrer_handled", true));
        }
    }
}
