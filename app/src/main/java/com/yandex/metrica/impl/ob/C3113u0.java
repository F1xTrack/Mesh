package com.yandex.metrica.impl.ob;

import android.location.Location;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3113u0 implements InterfaceC3169w1 {
    private Location a;
    private Boolean b;
    private Boolean c;
    private Boolean d;
    private Map<String, String> e = new LinkedHashMap();
    private Map<String, String> f = new LinkedHashMap();
    private String g;
    private boolean h;
    private C2941n2 i;

    private static boolean a(Object obj) {
        return obj == null;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3169w1
    public void b(boolean z) {
        this.b = Boolean.valueOf(z);
        b();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3169w1
    public void c(String str, String str2) {
        this.f.put(str, str2);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3169w1
    public void setStatisticsSending(boolean z) {
        this.d = Boolean.valueOf(z);
        b();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3169w1
    public void setUserProfileID(String str) {
        this.g = str;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3169w1
    public void a(boolean z) {
        this.c = Boolean.valueOf(z);
        b();
    }

    private void b(Map<String, String> map, com.yandex.metrica.x xVar) {
        if (U2.b(map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            xVar.a.withErrorEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3169w1
    public void a(Location location) {
        this.a = location;
    }

    public com.yandex.metrica.y a(com.yandex.metrica.y yVar) {
        if (this.h) {
            return yVar;
        }
        com.yandex.metrica.x xVar = new com.yandex.metrica.x(yVar.apiKey);
        YandexMetricaConfig.Builder builder = xVar.a;
        xVar.d = yVar.a;
        builder.withPreloadInfo(yVar.preloadInfo);
        builder.withLocation(yVar.location);
        List list = yVar.b;
        if (U2.a((Object) list)) {
            xVar.b = list;
        }
        if (U2.a((Object) yVar.appVersion)) {
            builder.withAppVersion(yVar.appVersion);
        }
        Integer num = yVar.d;
        if (U2.a(num)) {
            num.getClass();
            xVar.e = num;
        }
        Integer num2 = yVar.c;
        if (U2.a(num2)) {
            if (num2.intValue() >= 0) {
                xVar.c = num2;
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
        }
        Integer num3 = yVar.e;
        if (U2.a(num3)) {
            num3.getClass();
            xVar.f = num3;
        }
        if (U2.a(yVar.logs) && yVar.logs.booleanValue()) {
            builder.withLogs();
        }
        if (U2.a(yVar.sessionTimeout)) {
            builder.withSessionTimeout(yVar.sessionTimeout.intValue());
        }
        if (U2.a(yVar.crashReporting)) {
            builder.withCrashReporting(yVar.crashReporting.booleanValue());
        }
        if (U2.a(yVar.nativeCrashReporting)) {
            builder.withNativeCrashReporting(yVar.nativeCrashReporting.booleanValue());
        }
        if (U2.a(yVar.locationTracking)) {
            builder.withLocationTracking(yVar.locationTracking.booleanValue());
        }
        U2.a((Object) null);
        if (U2.a(yVar.firstActivationAsUpdate)) {
            builder.handleFirstActivationAsUpdate(yVar.firstActivationAsUpdate.booleanValue());
        }
        if (U2.a(yVar.statisticsSending)) {
            builder.withStatisticsSending(yVar.statisticsSending.booleanValue());
        }
        Boolean bool = yVar.h;
        if (U2.a(bool)) {
            bool.getClass();
            xVar.i = bool;
        }
        if (U2.a(yVar.maxReportsInDatabaseCount)) {
            builder.withMaxReportsInDatabaseCount(yVar.maxReportsInDatabaseCount.intValue());
        }
        U2.a((Object) null);
        if (U2.a((Object) yVar.userProfileID)) {
            builder.withUserProfileID(yVar.userProfileID);
        }
        if (U2.a(yVar.revenueAutoTrackingEnabled)) {
            builder.withRevenueAutoTrackingEnabled(yVar.revenueAutoTrackingEnabled.booleanValue());
        }
        if (U2.a(yVar.appOpenTrackingEnabled)) {
            builder.withAppOpenTrackingEnabled(yVar.appOpenTrackingEnabled.booleanValue());
        }
        a(this.e, xVar);
        a(yVar.f, xVar);
        b(this.f, xVar);
        b(yVar.errorEnvironment, xVar);
        Boolean bool2 = this.b;
        if (a(yVar.locationTracking) && U2.a(bool2)) {
            builder.withLocationTracking(bool2.booleanValue());
        }
        Location location = this.a;
        if (a((Object) yVar.location) && U2.a(location)) {
            builder.withLocation(location);
        }
        Boolean bool3 = this.d;
        if (a(yVar.statisticsSending) && U2.a(bool3)) {
            builder.withStatisticsSending(bool3.booleanValue());
        }
        if (!U2.a((Object) yVar.userProfileID) && U2.a((Object) this.g)) {
            builder.withUserProfileID(this.g);
        }
        this.h = true;
        this.a = null;
        this.b = null;
        this.d = null;
        this.e.clear();
        this.f.clear();
        this.g = null;
        return new com.yandex.metrica.y(xVar);
    }

    private void b() {
        C2941n2 c2941n2 = this.i;
        if (c2941n2 != null) {
            c2941n2.a(this.b, this.d, this.c);
        }
    }

    private void a(Map<String, String> map, com.yandex.metrica.x xVar) {
        if (U2.b(map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            xVar.g.put(entry.getKey(), entry.getValue());
        }
    }

    public void a(C2941n2 c2941n2) {
        this.i = c2941n2;
    }
}
