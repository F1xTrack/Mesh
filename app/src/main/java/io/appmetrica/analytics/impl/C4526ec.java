package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.ec, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4526ec extends C4567g5 implements Ja, Ia {
    public final C4613i3 A;
    public final Cf x;
    public final Gf y;
    public final E6 z;

    public C4526ec(Context context, C4583gl c4583gl, Z4 z4, C4 c4, Cf cf, E6 e6, AbstractC4519e5 abstractC4519e5) {
        this(context, z4, c4583gl, c4, new C4464c0(), new TimePassedChecker(), new C4550fc(context, z4, c4, abstractC4519e5, c4583gl, new Zb(e6), C4667ka.h().u().d(), PackageManagerUtils.getAppVersionCodeInt(context), C4667ka.h().u(), C4667ka.h().i()), cf, e6);
    }

    @Override // io.appmetrica.analytics.impl.C4567g5
    public final void C() {
        this.x.a(this.y);
    }

    public final boolean D() {
        boolean zOptBoolean;
        tn tnVar = this.v;
        synchronized (tnVar) {
            zOptBoolean = tnVar.a.a().optBoolean("referrer_handled", false);
        }
        return zOptBoolean;
    }

    @Override // io.appmetrica.analytics.impl.C4567g5, io.appmetrica.analytics.impl.Ma, io.appmetrica.analytics.impl.Ba
    public final synchronized void a(C4 c4) {
        super.a(c4);
        this.z.a(c4.i);
    }

    @Override // io.appmetrica.analytics.impl.C4567g5, io.appmetrica.analytics.impl.Ba
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MAIN;
    }

    @Override // io.appmetrica.analytics.impl.C4567g5, io.appmetrica.analytics.impl.Ma, io.appmetrica.analytics.impl.Rk
    public final void a(C4583gl c4583gl) {
        synchronized (this) {
            this.l.a(c4583gl);
            this.q.b();
        }
        this.A.a(c4583gl);
    }

    public C4526ec(Context context, Z4 z4, C4583gl c4583gl, C4 c4, C4464c0 c4464c0, TimePassedChecker timePassedChecker, C4550fc c4550fc, Cf cf, E6 e6) {
        super(context, z4, c4464c0, timePassedChecker, c4550fc);
        this.x = cf;
        V8 v8J = j();
        v8J.a(Wa.EVENT_TYPE_REGULAR, new Yf(v8J.b()));
        this.y = c4550fc.b(this);
        this.z = e6;
        C4613i3 c4613i3A = c4550fc.a(this);
        this.A = c4613i3A;
        c4613i3A.a(c4583gl, c4.m);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a() {
        tn tnVar = this.v;
        synchronized (tnVar) {
            un unVar = tnVar.a;
            unVar.a(unVar.a().put("referrer_handled", true));
        }
    }
}
