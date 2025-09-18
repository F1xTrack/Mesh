package io.appmetrica.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.AbstractC4357A0;
import io.appmetrica.analytics.impl.AbstractC5210j1;
import io.appmetrica.analytics.impl.C5185i1;
import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class AppMetrica {
    public static void activate(Context context, AppMetricaConfig appMetricaConfig) {
        AbstractC5210j1.f31954a.m20526a(context, appMetricaConfig);
    }

    public static void activateReporter(Context context, ReporterConfig reporterConfig) {
        AbstractC5210j1.f31954a.m20527a(context, reporterConfig);
    }

    public static void clearAppEnvironment() {
        AbstractC5210j1.f31954a.m20523a();
    }

    public static void enableActivityAutoTracking(Application application) {
        AbstractC5210j1.f31954a.m20525a(application);
    }

    public static String getDeviceId(Context context) {
        return AbstractC5210j1.f31954a.m20547b();
    }

    public static int getLibraryApiLevel() {
        return BuildConfig.API_LEVEL;
    }

    public static String getLibraryVersion() {
        return "7.2.0";
    }

    public static AppMetricaPlugins getPluginExtension() {
        return AbstractC4357A0.f29836a;
    }

    public static IReporter getReporter(Context context, String str) {
        return AbstractC5210j1.f31954a.m20521a(context, str);
    }

    public static String getUuid(Context context) {
        return AbstractC5210j1.f31954a.m20522a(context).f32948id;
    }

    public static void initWebViewReporting(WebView webView) {
        AbstractC5210j1.f31954a.m20531a(webView);
    }

    public static void pauseSession(Activity activity) {
        AbstractC5210j1.f31954a.m20524a(activity);
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        AbstractC5210j1.f31954a.m20541a(str, str2);
    }

    public static void putErrorEnvironmentValue(String str, String str2) {
        AbstractC5210j1.f31954a.m20551b(str, str2);
    }

    public static void registerAnrListener(AnrListener anrListener) {
        AbstractC5210j1.f31954a.m20533a(anrListener);
    }

    public static void reportAdRevenue(AdRevenue adRevenue) {
        AbstractC5210j1.f31954a.m20532a(adRevenue);
    }

    public static void reportAppOpen(Activity activity) {
        AbstractC5210j1.f31954a.m20548b(activity);
    }

    public static void reportECommerce(ECommerceEvent eCommerceEvent) {
        AbstractC5210j1.f31954a.m20538a(eCommerceEvent);
    }

    public static void reportError(String str, String str2) {
        AbstractC5210j1.f31954a.m20542a(str, str2, (Throwable) null);
    }

    public static void reportEvent(String str) {
        AbstractC5210j1.f31954a.m20550b(str);
    }

    public static void reportExternalAdRevenue(Object... objArr) {
        AbstractC5210j1.f31954a.m20553b(objArr);
    }

    public static void reportExternalAttribution(ExternalAttribution externalAttribution) {
        AbstractC5210j1.f31954a.m20536a(externalAttribution);
    }

    public static void reportReferralUrl(String str) {
        AbstractC5210j1.f31954a.m20558d(str);
    }

    public static void reportRevenue(Revenue revenue) {
        AbstractC5210j1.f31954a.m20537a(revenue);
    }

    public static void reportUnhandledException(Throwable th) {
        AbstractC5210j1.f31954a.m20545a(th);
    }

    public static void reportUserProfile(UserProfile userProfile) {
        AbstractC5210j1.f31954a.m20539a(userProfile);
    }

    public static void requestDeferredDeeplink(DeferredDeeplinkListener deferredDeeplinkListener) {
        AbstractC5210j1.f31954a.m20534a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        AbstractC5210j1.f31954a.m20535a(deferredDeeplinkParametersListener);
    }

    public static void requestStartupParams(Context context, StartupParamsCallback startupParamsCallback, List<String> list) {
        C5185i1 c5185i1 = AbstractC5210j1.f31954a;
        if (list.isEmpty()) {
            list = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_device_id_hash");
        }
        c5185i1.m20528a(context, startupParamsCallback, list);
    }

    public static void resumeSession(Activity activity) {
        AbstractC5210j1.f31954a.m20554c(activity);
    }

    public static void sendEventsBuffer() {
        AbstractC5210j1.f31954a.m20562f();
    }

    public static void setDataSendingEnabled(boolean z) {
        AbstractC5210j1.f31954a.m20546a(z);
    }

    public static void setLocation(Location location) {
        AbstractC5210j1.f31954a.m20530a(location);
    }

    public static void setLocationTracking(boolean z) {
        AbstractC5210j1.f31954a.m20552b(z);
    }

    public static void setUserProfileID(String str) {
        AbstractC5210j1.f31954a.m20561e(str);
    }

    public static void reportAppOpen(Intent intent) {
        AbstractC5210j1.f31954a.m20529a(intent);
    }

    public static void reportError(String str, String str2, Throwable th) {
        AbstractC5210j1.f31954a.m20542a(str, str2, th);
    }

    public static void reportEvent(String str, String str2) {
        AbstractC5210j1.f31954a.m20556c(str, str2);
    }

    public static void reportAppOpen(String str) {
        AbstractC5210j1.f31954a.m20540a(str);
    }

    public static void reportError(String str, Throwable th) {
        AbstractC5210j1.f31954a.m20543a(str, th);
    }

    public static void reportEvent(String str, Map<String, Object> map) {
        AbstractC5210j1.f31954a.m20544a(str, map);
    }
}
