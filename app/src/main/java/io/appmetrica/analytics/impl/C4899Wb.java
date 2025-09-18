package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.p028io.FileUtils;
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
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.Wb */
/* loaded from: classes2.dex */
public final class C4899Wb extends AbstractC4747Q2 implements InterfaceC4491Fa {

    /* renamed from: q */
    public static final C4379Am f30976q = new C4379Am(new C5497ud("Referral url"));

    /* renamed from: r */
    public static final Long f30977r = Long.valueOf(TimeUnit.SECONDS.toMillis(1));

    /* renamed from: o */
    public final C5146gc f30978o;

    /* renamed from: p */
    public final C4923Xb f30979p;

    public C4899Wb(C5146gc c5146gc) {
        super(c5146gc.m20453b(), c5146gc.m20460i(), c5146gc.m20459h(), c5146gc.m20455d(), c5146gc.m20457f(), c5146gc.m20461j(), c5146gc.m20458g(), c5146gc.m20454c(), c5146gc.m20451a(), c5146gc.m20456e());
        this.f30978o = c5146gc;
        this.f30979p = new C4923Xb(this);
        m19949m();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa
    /* renamed from: a */
    public final void mo19407a(String str, boolean z) {
        this.f30645c.info("App opened via deeplink: " + WrapUtils.wrapToTag(str), new Object[0]);
        C4690Nh c4690Nh = this.f30650h;
        PublicLogger publicLogger = this.f30645c;
        Set set = AbstractC5443s9.f32553a;
        HashMap map = new HashMap();
        map.put("type", "open");
        map.put("link", str);
        map.put("auto", Boolean.valueOf(z));
        String strM20174b = AbstractC5020bb.m20174b(map);
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        C5013b4 c5013b4 = new C5013b4(strM20174b, "", 8208, 0, publicLogger);
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        c4690Nh.m19663a(C4690Nh.m19660a(c5013b4, c4952Yg), c4952Yg, 1, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa
    /* renamed from: b */
    public final void mo19409b(String str) {
        f30976q.mo19211a(str);
        C4690Nh c4690Nh = this.f30650h;
        PublicLogger publicLogger = this.f30645c;
        Set set = AbstractC5443s9.f32553a;
        HashMap map = new HashMap();
        map.put("type", "referral");
        map.put("link", str);
        map.put("auto", Boolean.FALSE);
        String strM20174b = AbstractC5020bb.m20174b(map);
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        C5013b4 c5013b4 = new C5013b4(strM20174b, "", 8208, 0, publicLogger);
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        c4690Nh.m19663a(C4690Nh.m19660a(c5013b4, c4952Yg), c4952Yg, 1, null);
        this.f30645c.info("Referral URL received: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa
    /* renamed from: c */
    public final void mo19410c() {
        C4923Xb c4923Xb = this.f30979p;
        synchronized (c4923Xb) {
            c4923Xb.f31030b.m20299a(c4923Xb.f31029a);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa
    /* renamed from: g */
    public final List<String> mo19411g() {
        return this.f30644b.f31089a.m19764b();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4747Q2
    /* renamed from: k */
    public final String mo19738k() {
        return "[MainReporter]";
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4747Q2
    /* renamed from: l */
    public final void mo19739l() {
        super.mo19739l();
        C5388q4.m20928h().m20939j().m20800b();
    }

    /* renamed from: m */
    public final void m19949m() {
        C4690Nh c4690Nh = this.f30650h;
        c4690Nh.f30524c.m19696a(this.f30644b.f31089a);
        C5111f2 c5111f2 = this.f30978o.f31764f;
        C4875Vb c4875Vb = new C4875Vb(this);
        long jLongValue = f30977r.longValue();
        synchronized (c5111f2) {
            c5111f2.m20360a(c4875Vb, jLongValue);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa
    /* renamed from: a */
    public final void mo19406a(EnumC5333o enumC5333o) {
        if (enumC5333o == EnumC5333o.f32310b) {
            this.f30645c.info("Enable activity auto tracking", new Object[0]);
            return;
        }
        this.f30645c.warning("Could not enable activity auto tracking. " + enumC5333o.f32314a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa
    /* renamed from: b */
    public final void mo19408b(Activity activity) {
        if (this.f30978o.f31766h.m20986a(activity, EnumC5383q.PAUSED)) {
            this.f30645c.info("Pause session", new Object[0]);
            m19736c(activity != null ? activity.getClass().getSimpleName() : null);
            C5111f2 c5111f2 = this.f30978o.f31764f;
            synchronized (c5111f2) {
                for (C5086e2 c5086e2 : c5111f2.f31650a) {
                    if (!c5086e2.f31520d) {
                        c5086e2.f31520d = true;
                        c5086e2.f31518b.executeDelayed(c5086e2.f31521e, c5086e2.f31519c);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa
    /* renamed from: a */
    public final void mo19402a(Activity activity) {
        if (this.f30978o.f31766h.m20986a(activity, EnumC5383q.RESUMED)) {
            this.f30645c.info("Resume session", new Object[0]);
            m19737d(activity != null ? activity.getClass().getSimpleName() : null);
            C5111f2 c5111f2 = this.f30978o.f31764f;
            synchronized (c5111f2) {
                for (C5086e2 c5086e2 : c5111f2.f31650a) {
                    if (c5086e2.f31520d) {
                        c5086e2.f31520d = false;
                        c5086e2.f31518b.remove(c5086e2.f31521e);
                        C4899Wb c4899Wb = c5086e2.f31517a.f30856a;
                        c4899Wb.f30650h.f30524c.m19698b(c4899Wb.f30644b.f31089a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void m19948a(AppMetricaConfig appMetricaConfig, boolean z) {
        if (z) {
            clearAppEnvironment();
        }
        m19734a(appMetricaConfig.appEnvironment);
        m19735b(appMetricaConfig.errorEnvironment);
        Boolean bool = (Boolean) WrapUtils.getOrDefault(appMetricaConfig.nativeCrashReporting, Boolean.TRUE);
        boolean zBooleanValue = bool.booleanValue();
        this.f30645c.info("native crash reporting enabled: %b", bool);
        if (zBooleanValue) {
            C5097ed c5097ed = this.f30978o.f31761c;
            Context context = this.f30643a;
            c5097ed.f31593d = new C5559x0(this.f30644b.f31090b.getApiKey(), c5097ed.f31590a.f30696a.getAsString("PROCESS_CFG_PACKAGE_NAME"), CounterConfigurationReporterType.MAIN, c5097ed.f31590a.f30696a.getAsInteger("PROCESS_CFG_PROCESS_ID").intValue(), c5097ed.f31590a.f30696a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), this.f30644b.m20039d());
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                NativeCrashClientModule nativeCrashClientModule = c5097ed.f31591b;
                C5584y0 c5584y0 = c5097ed.f31592c;
                C5559x0 c5559x0 = c5097ed.f31593d;
                if (c5559x0 != null) {
                    c5584y0.getClass();
                    nativeCrashClientModule.initHandling(context, new NativeCrashClientConfig(absolutePath, C5584y0.m21215a(c5559x0)));
                } else {
                    O90.m5977o("nativeCrashMetadata");
                    throw null;
                }
            }
        }
        C4923Xb c4923Xb = this.f30979p;
        synchronized (c4923Xb) {
            try {
                Integer num = appMetricaConfig.anrMonitoringTimeout;
                c4923Xb.f31029a = num != null ? num.intValue() : 5;
                Boolean bool2 = appMetricaConfig.anrMonitoring;
                if (bool2 == null) {
                    bool2 = Boolean.FALSE;
                }
                if (bool2.booleanValue()) {
                    c4923Xb.f31030b.m20299a(c4923Xb.f31029a);
                } else {
                    c4923Xb.f31030b.m20300b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa, io.appmetrica.analytics.impl.InterfaceC5446sc
    /* renamed from: a */
    public final void mo19312a(Location location) {
        this.f30644b.f31090b.setManualLocation(location);
        this.f30645c.info("Set location: %s", location);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa, io.appmetrica.analytics.impl.InterfaceC5446sc
    /* renamed from: a */
    public final void mo19315a(boolean z) {
        this.f30644b.f31090b.setLocationTracking(z);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa
    /* renamed from: a */
    public final void mo19405a(C4430Cn c4430Cn) {
        PublicLogger publicLogger = this.f30645c;
        synchronized (c4430Cn) {
            c4430Cn.f29980b = publicLogger;
        }
        Iterator it = c4430Cn.f29979a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(publicLogger);
        }
        c4430Cn.f29979a.clear();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa
    /* renamed from: a */
    public final void mo19403a(AnrListener anrListener) {
        this.f30979p.m19975a(anrListener);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa
    /* renamed from: a */
    public final void mo19404a(ExternalAttribution externalAttribution) {
        this.f30645c.info("External attribution received: %s", externalAttribution);
        C4690Nh c4690Nh = this.f30650h;
        byte[] bytes = externalAttribution.toBytes();
        PublicLogger publicLogger = this.f30645c;
        Set set = AbstractC5443s9.f32553a;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        C5013b4 c5013b4 = new C5013b4(bytes, "", 42, publicLogger);
        C4952Yg c4952Yg = this.f30644b;
        c4690Nh.getClass();
        c4690Nh.m19663a(C4690Nh.m19660a(c5013b4, c4952Yg), c4952Yg, 1, null);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4747Q2, io.appmetrica.analytics.impl.InterfaceC4491Fa, io.appmetrica.analytics.impl.InterfaceC5446sc
    /* renamed from: a */
    public final void mo19314a(String str, String str2) {
        super.mo19314a(str, str2);
        C5097ed c5097ed = this.f30978o.f31761c;
        String strM20039d = this.f30644b.m20039d();
        C5559x0 c5559x0 = c5097ed.f31593d;
        if (c5559x0 != null) {
            C5559x0 c5559x02 = new C5559x0(c5559x0.f32787a, c5559x0.f32788b, c5559x0.f32789c, c5559x0.f32790d, c5559x0.f32791e, strM20039d);
            c5097ed.f31593d = c5559x02;
            NativeCrashClientModule nativeCrashClientModule = c5097ed.f31591b;
            c5097ed.f31592c.getClass();
            nativeCrashClientModule.updateAppMetricaMetadata(C5584y0.m21215a(c5559x02));
        }
    }
}
