package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;

/* renamed from: io.appmetrica.analytics.impl.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4896u0 {
    public final C4753o0 a;
    public final C4931vb b;
    public final C4955wb c;
    public final C5003yb d;
    public final IHandlerExecutor e;

    public C4896u0() {
        C4753o0 c4753o0C = C4805q4.h().c();
        this.a = c4753o0C;
        this.b = new C4931vb(c4753o0C);
        this.c = new C4955wb(c4753o0C);
        this.d = new C5003yb();
        this.e = C4805q4.h().e().a();
    }

    public final void a(Context context) {
        this.b.a.a(context);
        Context applicationContext = context.getApplicationContext();
        C4955wb c4955wb = this.c;
        c4955wb.b.a(applicationContext);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Session autotracking enabled", new Object[0]);
        C4805q4.h().f.a();
        c4955wb.a.getClass();
        C4729n0 c4729n0A = C4729n0.a(applicationContext, true);
        c4729n0A.d.a(null, c4729n0A);
        this.e.execute(new io.sentry.cache.f(this, 11, applicationContext));
        this.a.getClass();
        synchronized (C4729n0.class) {
            C4729n0.f = true;
        }
    }

    public static final void a(C4896u0 c4896u0, Context context) {
        c4896u0.a.getClass();
        C4729n0.a(context, false).k().e();
    }
}
