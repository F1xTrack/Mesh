package com.yandex.metrica.impl.p022ob;

import android.location.Location;
import com.yandex.metrica.C3805x;
import com.yandex.metrica.C3806y;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.u0 */
/* loaded from: classes2.dex */
public class C3636u0 implements InterfaceC3689w1 {

    /* renamed from: a */
    private Location f24873a;

    /* renamed from: b */
    private Boolean f24874b;

    /* renamed from: c */
    private Boolean f24875c;

    /* renamed from: d */
    private Boolean f24876d;

    /* renamed from: e */
    private Map<String, String> f24877e = new LinkedHashMap();

    /* renamed from: f */
    private Map<String, String> f24878f = new LinkedHashMap();

    /* renamed from: g */
    private String f24879g;

    /* renamed from: h */
    private boolean f24880h;

    /* renamed from: i */
    private C3456n2 f24881i;

    /* renamed from: a */
    private static boolean m16883a(Object obj) {
        return obj == null;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3689w1
    /* renamed from: b */
    public void mo14493b(boolean z) {
        this.f24874b = Boolean.valueOf(z);
        m16884b();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3689w1
    /* renamed from: c */
    public void mo14385c(String str, String str2) {
        this.f24878f.put(str, str2);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3689w1
    public void setStatisticsSending(boolean z) {
        this.f24876d = Boolean.valueOf(z);
        m16884b();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3689w1
    public void setUserProfileID(String str) {
        this.f24879g = str;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3689w1
    /* renamed from: a */
    public void mo14490a(boolean z) {
        this.f24875c = Boolean.valueOf(z);
        m16884b();
    }

    /* renamed from: b */
    private void m16885b(Map<String, String> map, C3805x c3805x) {
        if (C2968U2.m15250b(map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            c3805x.f25532a.withErrorEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3689w1
    /* renamed from: a */
    public void mo14483a(Location location) {
        this.f24873a = location;
    }

    /* renamed from: a */
    public C3806y m16886a(C3806y c3806y) {
        if (this.f24880h) {
            return c3806y;
        }
        C3805x c3805x = new C3805x(c3806y.apiKey);
        YandexMetricaConfig.Builder builder = c3805x.f25532a;
        c3805x.f25535d = c3806y.f25541a;
        builder.withPreloadInfo(c3806y.preloadInfo);
        builder.withLocation(c3806y.location);
        List list = c3806y.f25542b;
        if (C2968U2.m15244a((Object) list)) {
            c3805x.f25533b = list;
        }
        if (C2968U2.m15244a((Object) c3806y.appVersion)) {
            builder.withAppVersion(c3806y.appVersion);
        }
        Integer num = c3806y.f25544d;
        if (C2968U2.m15244a(num)) {
            num.getClass();
            c3805x.f25536e = num;
        }
        Integer num2 = c3806y.f25543c;
        if (C2968U2.m15244a(num2)) {
            if (num2.intValue() >= 0) {
                c3805x.f25534c = num2;
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
        }
        Integer num3 = c3806y.f25545e;
        if (C2968U2.m15244a(num3)) {
            num3.getClass();
            c3805x.f25537f = num3;
        }
        if (C2968U2.m15244a(c3806y.logs) && c3806y.logs.booleanValue()) {
            builder.withLogs();
        }
        if (C2968U2.m15244a(c3806y.sessionTimeout)) {
            builder.withSessionTimeout(c3806y.sessionTimeout.intValue());
        }
        if (C2968U2.m15244a(c3806y.crashReporting)) {
            builder.withCrashReporting(c3806y.crashReporting.booleanValue());
        }
        if (C2968U2.m15244a(c3806y.nativeCrashReporting)) {
            builder.withNativeCrashReporting(c3806y.nativeCrashReporting.booleanValue());
        }
        if (C2968U2.m15244a(c3806y.locationTracking)) {
            builder.withLocationTracking(c3806y.locationTracking.booleanValue());
        }
        C2968U2.m15244a((Object) null);
        if (C2968U2.m15244a(c3806y.firstActivationAsUpdate)) {
            builder.handleFirstActivationAsUpdate(c3806y.firstActivationAsUpdate.booleanValue());
        }
        if (C2968U2.m15244a(c3806y.statisticsSending)) {
            builder.withStatisticsSending(c3806y.statisticsSending.booleanValue());
        }
        Boolean bool = c3806y.f25548h;
        if (C2968U2.m15244a(bool)) {
            bool.getClass();
            c3805x.f25540i = bool;
        }
        if (C2968U2.m15244a(c3806y.maxReportsInDatabaseCount)) {
            builder.withMaxReportsInDatabaseCount(c3806y.maxReportsInDatabaseCount.intValue());
        }
        C2968U2.m15244a((Object) null);
        if (C2968U2.m15244a((Object) c3806y.userProfileID)) {
            builder.withUserProfileID(c3806y.userProfileID);
        }
        if (C2968U2.m15244a(c3806y.revenueAutoTrackingEnabled)) {
            builder.withRevenueAutoTrackingEnabled(c3806y.revenueAutoTrackingEnabled.booleanValue());
        }
        if (C2968U2.m15244a(c3806y.appOpenTrackingEnabled)) {
            builder.withAppOpenTrackingEnabled(c3806y.appOpenTrackingEnabled.booleanValue());
        }
        m16882a(this.f24877e, c3805x);
        m16882a(c3806y.f25546f, c3805x);
        m16885b(this.f24878f, c3805x);
        m16885b(c3806y.errorEnvironment, c3805x);
        Boolean bool2 = this.f24874b;
        if (m16883a(c3806y.locationTracking) && C2968U2.m15244a(bool2)) {
            builder.withLocationTracking(bool2.booleanValue());
        }
        Location location = this.f24873a;
        if (m16883a((Object) c3806y.location) && C2968U2.m15244a(location)) {
            builder.withLocation(location);
        }
        Boolean bool3 = this.f24876d;
        if (m16883a(c3806y.statisticsSending) && C2968U2.m15244a(bool3)) {
            builder.withStatisticsSending(bool3.booleanValue());
        }
        if (!C2968U2.m15244a((Object) c3806y.userProfileID) && C2968U2.m15244a((Object) this.f24879g)) {
            builder.withUserProfileID(this.f24879g);
        }
        this.f24880h = true;
        this.f24873a = null;
        this.f24874b = null;
        this.f24876d = null;
        this.f24877e.clear();
        this.f24878f.clear();
        this.f24879g = null;
        return new C3806y(c3805x);
    }

    /* renamed from: b */
    private void m16884b() {
        C3456n2 c3456n2 = this.f24881i;
        if (c3456n2 != null) {
            c3456n2.m16455a(this.f24874b, this.f24876d, this.f24875c);
        }
    }

    /* renamed from: a */
    private void m16882a(Map<String, String> map, C3805x c3805x) {
        if (C2968U2.m15250b(map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            c3805x.f25538g.put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    public void m16887a(C3456n2 c3456n2) {
        this.f24881i = c3456n2;
    }
}
