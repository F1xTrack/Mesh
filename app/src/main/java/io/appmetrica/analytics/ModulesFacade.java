package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.impl.AbstractC4498Fh;
import io.appmetrica.analytics.impl.C4637Lc;
import io.appmetrica.analytics.impl.C4685Nc;
import io.appmetrica.analytics.impl.C4709Oc;
import io.appmetrica.analytics.impl.C4733Pc;
import io.appmetrica.analytics.impl.C4757Qc;
import io.appmetrica.analytics.impl.C4780Rc;
import io.appmetrica.analytics.impl.C5309n0;

/* loaded from: classes2.dex */
public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;

    /* renamed from: a */
    private static C4780Rc f29515a = new C4780Rc();

    public static IModuleReporter getModuleReporter(Context context, String str) {
        C4780Rc c4780Rc = f29515a;
        C4637Lc c4637Lc = c4780Rc.f30692b;
        c4637Lc.f30444b.mo19211a(context);
        c4637Lc.f30446d.mo19211a(str);
        c4780Rc.f30693c.f31031a.m19493a(context.getApplicationContext().getApplicationContext());
        return AbstractC4498Fh.f30147a.m19450a(context.getApplicationContext(), str);
    }

    public static boolean isActivatedForApp() {
        boolean z;
        C4780Rc c4780Rc = f29515a;
        c4780Rc.f30692b.getClass();
        c4780Rc.f30693c.getClass();
        c4780Rc.f30691a.getClass();
        synchronized (C5309n0.class) {
            z = C5309n0.f32235f;
        }
        return z;
    }

    public static void reportAdRevenue(AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, Boolean.TRUE);
    }

    public static void reportEvent(ModuleEvent moduleEvent) {
        C4780Rc c4780Rc = f29515a;
        c4780Rc.f30692b.f30443a.mo19211a(null);
        c4780Rc.f30693c.getClass();
        c4780Rc.f30694d.execute(new C4709Oc(c4780Rc, moduleEvent));
    }

    public static void reportExternalAttribution(int i, String str) {
        C4780Rc c4780Rc = f29515a;
        c4780Rc.f30692b.getClass();
        c4780Rc.f30693c.getClass();
        c4780Rc.f30694d.execute(new C4733Pc(c4780Rc, i, str));
    }

    public static void sendEventsBuffer() {
        C4780Rc c4780Rc = f29515a;
        c4780Rc.f30692b.getClass();
        c4780Rc.f30693c.getClass();
        AppMetrica.sendEventsBuffer();
    }

    public static void setProxy(C4780Rc c4780Rc) {
        f29515a = c4780Rc;
    }

    public static void setSessionExtra(String str, byte[] bArr) {
        C4780Rc c4780Rc = f29515a;
        c4780Rc.f30692b.f30445c.mo19211a(str);
        c4780Rc.f30693c.getClass();
        c4780Rc.f30694d.execute(new C4757Qc(c4780Rc, str, bArr));
    }

    public static void reportAdRevenue(AdRevenue adRevenue, Boolean bool) {
        C4780Rc c4780Rc = f29515a;
        boolean zBooleanValue = bool.booleanValue();
        c4780Rc.f30692b.getClass();
        c4780Rc.f30693c.getClass();
        c4780Rc.f30694d.execute(new C4685Nc(c4780Rc, adRevenue, zBooleanValue));
    }
}
