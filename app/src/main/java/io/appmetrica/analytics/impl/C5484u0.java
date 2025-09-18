package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.sentry.cache.RunnableC5994f;

/* renamed from: io.appmetrica.analytics.impl.u0 */
/* loaded from: classes2.dex */
public final class C5484u0 {

    /* renamed from: a */
    public final C5334o0 f32658a;

    /* renamed from: b */
    public final C5520vb f32659b;

    /* renamed from: c */
    public final C5545wb f32660c;

    /* renamed from: d */
    public final C5595yb f32661d;

    /* renamed from: e */
    public final IHandlerExecutor f32662e;

    public C5484u0() {
        C5334o0 c5334o0M20933c = C5388q4.m20928h().m20933c();
        this.f32658a = c5334o0M20933c;
        this.f32659b = new C5520vb(c5334o0M20933c);
        this.f32660c = new C5545wb(c5334o0M20933c);
        this.f32661d = new C5595yb();
        this.f32662e = C5388q4.m20928h().m20935e().m20407a();
    }

    /* renamed from: a */
    public final void m21107a(Context context) {
        this.f32659b.f32726a.mo19211a(context);
        Context applicationContext = context.getApplicationContext();
        C5545wb c5545wb = this.f32660c;
        c5545wb.f32766b.m19493a(applicationContext);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Session autotracking enabled", new Object[0]);
        C5388q4.m20928h().f32423f.m20089a();
        c5545wb.f32765a.getClass();
        C5309n0 c5309n0M20763a = C5309n0.m20763a(applicationContext, true);
        c5309n0M20763a.f32239d.mo20472a(null, c5309n0M20763a);
        this.f32662e.execute(new RunnableC5994f(this, 11, applicationContext));
        this.f32658a.getClass();
        synchronized (C5309n0.class) {
            C5309n0.f32235f = true;
        }
    }

    /* renamed from: a */
    public static final void m21106a(C5484u0 c5484u0, Context context) {
        c5484u0.f32658a.getClass();
        C5309n0.m20763a(context, false).m20789k().mo20998e();
    }
}
