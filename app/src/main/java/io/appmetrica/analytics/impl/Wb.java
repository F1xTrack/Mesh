package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import defpackage.O90;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientConfig;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Wb extends Q2 implements Fa {
    public static final Am q = new Am(new C4909ud("Referral url"));
    public static final Long r = Long.valueOf(TimeUnit.SECONDS.toMillis(1));
    public final C4574gc o;
    public final Xb p;

    public Wb(C4574gc c4574gc) {
        super(c4574gc.b(), c4574gc.i(), c4574gc.h(), c4574gc.d(), c4574gc.f(), c4574gc.j(), c4574gc.g(), c4574gc.c(), c4574gc.a(), c4574gc.e());
        this.o = c4574gc;
        this.p = new Xb(this);
        m();
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(String str, boolean z) {
        this.c.info("App opened via deeplink: " + WrapUtils.wrapToTag(str), new Object[0]);
        Nh nh = this.h;
        PublicLogger publicLogger = this.c;
        Set set = AbstractC4857s9.a;
        HashMap map = new HashMap();
        map.put("type", "open");
        map.put("link", str);
        map.put("auto", Boolean.valueOf(z));
        String strB = AbstractC4450bb.b(map);
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        C4443b4 c4443b4 = new C4443b4(strB, "", 8208, 0, publicLogger);
        Yg yg = this.b;
        nh.getClass();
        nh.a(Nh.a(c4443b4, yg), yg, 1, null);
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void b(String str) {
        q.a(str);
        Nh nh = this.h;
        PublicLogger publicLogger = this.c;
        Set set = AbstractC4857s9.a;
        HashMap map = new HashMap();
        map.put("type", "referral");
        map.put("link", str);
        map.put("auto", Boolean.FALSE);
        String strB = AbstractC4450bb.b(map);
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        C4443b4 c4443b4 = new C4443b4(strB, "", 8208, 0, publicLogger);
        Yg yg = this.b;
        nh.getClass();
        nh.a(Nh.a(c4443b4, yg), yg, 1, null);
        this.c.info("Referral URL received: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void c() {
        Xb xb = this.p;
        synchronized (xb) {
            xb.b.a(xb.a);
        }
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final List<String> g() {
        return this.b.a.b();
    }

    @Override // io.appmetrica.analytics.impl.Q2
    public final String k() {
        return "[MainReporter]";
    }

    @Override // io.appmetrica.analytics.impl.Q2
    public final void l() {
        super.l();
        C4805q4.h().j().b();
    }

    public final void m() {
        Nh nh = this.h;
        nh.c.a(this.b.a);
        C4540f2 c4540f2 = this.o.f;
        Vb vb = new Vb(this);
        long jLongValue = r.longValue();
        synchronized (c4540f2) {
            c4540f2.a(vb, jLongValue);
        }
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(EnumC4752o enumC4752o) {
        if (enumC4752o == EnumC4752o.b) {
            this.c.info("Enable activity auto tracking", new Object[0]);
            return;
        }
        this.c.warning("Could not enable activity auto tracking. " + enumC4752o.a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void b(Activity activity) {
        if (this.o.h.a(activity, EnumC4800q.PAUSED)) {
            this.c.info("Pause session", new Object[0]);
            c(activity != null ? activity.getClass().getSimpleName() : null);
            C4540f2 c4540f2 = this.o.f;
            synchronized (c4540f2) {
                for (C4516e2 c4516e2 : c4540f2.a) {
                    if (!c4516e2.d) {
                        c4516e2.d = true;
                        c4516e2.b.executeDelayed(c4516e2.e, c4516e2.c);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(Activity activity) {
        if (this.o.h.a(activity, EnumC4800q.RESUMED)) {
            this.c.info("Resume session", new Object[0]);
            d(activity != null ? activity.getClass().getSimpleName() : null);
            C4540f2 c4540f2 = this.o.f;
            synchronized (c4540f2) {
                for (C4516e2 c4516e2 : c4540f2.a) {
                    if (c4516e2.d) {
                        c4516e2.d = false;
                        c4516e2.b.remove(c4516e2.e);
                        Wb wb = c4516e2.a.a;
                        wb.h.c.b(wb.b.a);
                    }
                }
            }
        }
    }

    public final void a(AppMetricaConfig appMetricaConfig, boolean z) {
        if (z) {
            clearAppEnvironment();
        }
        a(appMetricaConfig.appEnvironment);
        b(appMetricaConfig.errorEnvironment);
        Boolean bool = (Boolean) WrapUtils.getOrDefault(appMetricaConfig.nativeCrashReporting, Boolean.TRUE);
        boolean zBooleanValue = bool.booleanValue();
        this.c.info("native crash reporting enabled: %b", bool);
        if (zBooleanValue) {
            C4527ed c4527ed = this.o.c;
            Context context = this.a;
            c4527ed.d = new C4968x0(this.b.b.getApiKey(), c4527ed.a.a.getAsString("PROCESS_CFG_PACKAGE_NAME"), CounterConfigurationReporterType.MAIN, c4527ed.a.a.getAsInteger("PROCESS_CFG_PROCESS_ID").intValue(), c4527ed.a.a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), this.b.d());
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                NativeCrashClientModule nativeCrashClientModule = c4527ed.b;
                C4992y0 c4992y0 = c4527ed.c;
                C4968x0 c4968x0 = c4527ed.d;
                if (c4968x0 != null) {
                    c4992y0.getClass();
                    nativeCrashClientModule.initHandling(context, new NativeCrashClientConfig(absolutePath, C4992y0.a(c4968x0)));
                } else {
                    O90.o("nativeCrashMetadata");
                    throw null;
                }
            }
        }
        Xb xb = this.p;
        synchronized (xb) {
            try {
                Integer num = appMetricaConfig.anrMonitoringTimeout;
                xb.a = num != null ? num.intValue() : 5;
                Boolean bool2 = appMetricaConfig.anrMonitoring;
                if (bool2 == null) {
                    bool2 = Boolean.FALSE;
                }
                if (bool2.booleanValue()) {
                    xb.b.a(xb.a);
                } else {
                    xb.b.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Fa, io.appmetrica.analytics.impl.InterfaceC4860sc
    public final void a(Location location) {
        this.b.b.setManualLocation(location);
        this.c.info("Set location: %s", location);
    }

    @Override // io.appmetrica.analytics.impl.Fa, io.appmetrica.analytics.impl.InterfaceC4860sc
    public final void a(boolean z) {
        this.b.b.setLocationTracking(z);
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(Cn cn) {
        PublicLogger publicLogger = this.c;
        synchronized (cn) {
            cn.b = publicLogger;
        }
        Iterator it = cn.a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(publicLogger);
        }
        cn.a.clear();
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(AnrListener anrListener) {
        this.p.a(anrListener);
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(ExternalAttribution externalAttribution) {
        this.c.info("External attribution received: %s", externalAttribution);
        Nh nh = this.h;
        byte[] bytes = externalAttribution.toBytes();
        PublicLogger publicLogger = this.c;
        Set set = AbstractC4857s9.a;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        C4443b4 c4443b4 = new C4443b4(bytes, "", 42, publicLogger);
        Yg yg = this.b;
        nh.getClass();
        nh.a(Nh.a(c4443b4, yg), yg, 1, null);
    }

    @Override // io.appmetrica.analytics.impl.Q2, io.appmetrica.analytics.impl.Fa, io.appmetrica.analytics.impl.InterfaceC4860sc
    public final void a(String str, String str2) {
        super.a(str, str2);
        C4527ed c4527ed = this.o.c;
        String strD = this.b.d();
        C4968x0 c4968x0 = c4527ed.d;
        if (c4968x0 != null) {
            C4968x0 c4968x02 = new C4968x0(c4968x0.a, c4968x0.b, c4968x0.c, c4968x0.d, c4968x0.e, strD);
            c4527ed.d = c4968x02;
            NativeCrashClientModule nativeCrashClientModule = c4527ed.b;
            c4527ed.c.getClass();
            nativeCrashClientModule.updateAppMetricaMetadata(C4992y0.a(c4968x02));
        }
    }
}
