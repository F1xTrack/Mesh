package com.yandex.metrica;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.impl.p022ob.C3535q3;
import com.yandex.metrica.impl.p022ob.C3704wg;
import com.yandex.metrica.plugins.YandexMetricaPlugins;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;

/* loaded from: classes2.dex */
public final class YandexMetrica {
    public static void activate(Context context, YandexMetricaConfig yandexMetricaConfig) {
        C3704wg.m17143a().m16985a(context, yandexMetricaConfig);
    }

    public static void activateReporter(Context context, ReporterConfig reporterConfig) {
        C3704wg.m17143a().m16984a(context, reporterConfig);
    }

    public static void enableActivityAutoTracking(Application application) {
        C3704wg.m17143a().m16983a(application);
    }

    public static int getLibraryApiLevel() {
        return 105;
    }

    public static String getLibraryVersion() {
        return "5.0.0";
    }

    public static YandexMetricaPlugins getPluginExtension() {
        return C3535q3.m16600a();
    }

    public static IReporter getReporter(Context context, String str) {
        return C3704wg.m17143a().m16981a(context, str);
    }

    public static void initWebViewReporting(WebView webView) {
        C3704wg.m17143a().m16989a(webView);
    }

    public static void pauseSession(Activity activity) {
        C3704wg.m17143a().m16982a(activity);
    }

    public static void putErrorEnvironmentValue(String str, String str2) {
        C3704wg.m17143a().m16997a(str, str2);
    }

    public static void reportAppOpen(Activity activity) {
        C3704wg.m17143a().m17003b(activity);
    }

    public static void reportECommerce(ECommerceEvent eCommerceEvent) {
        C3704wg.m17143a().m16994a(eCommerceEvent);
    }

    public static void reportError(String str, Throwable th) throws ValidationException {
        C3704wg.m17143a().m16999a(str, th);
    }

    public static void reportEvent(String str) throws ValidationException {
        C3704wg.m17143a().m17005b(str);
    }

    @Deprecated
    public static void reportNativeCrash(String str) {
        C3704wg.m17143a().m17010d(str);
    }

    public static void reportReferralUrl(String str) {
        C3704wg.m17143a().m17011e(str);
    }

    public static void reportRevenue(Revenue revenue) throws ValidationException {
        C3704wg.m17143a().m16993a(revenue);
    }

    public static void reportUnhandledException(Throwable th) throws ValidationException {
        C3704wg.m17143a().m17001a(th);
    }

    public static void reportUserProfile(UserProfile userProfile) throws ValidationException {
        C3704wg.m17143a().m16995a(userProfile);
    }

    public static void requestAppMetricaDeviceID(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        C3704wg.m17143a().m16990a(appMetricaDeviceIDListener);
    }

    public static void requestDeferredDeeplink(DeferredDeeplinkListener deferredDeeplinkListener) {
        C3704wg.m17143a().m16991a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        C3704wg.m17143a().m16992a(deferredDeeplinkParametersListener);
    }

    public static void resumeSession(Activity activity) {
        C3704wg.m17143a().m17007c(activity);
    }

    public static void sendEventsBuffer() {
        C3704wg.m17143a().m17013i();
    }

    public static void setLocation(Location location) {
        C3704wg.m17143a().m16988a(location);
    }

    public static void setLocationTracking(boolean z) {
        C3704wg.m17143a().m17002a(z);
    }

    public static void setStatisticsSending(Context context, boolean z) {
        C3704wg.m17143a().m17004b(context, z);
    }

    public static void setUserProfileID(String str) {
        C3704wg.m17143a().m17012f(str);
    }

    public static void reportAppOpen(String str) {
        C3704wg.m17143a().m16996a(str);
    }

    public static void reportError(String str, String str2) {
        C3704wg.m17143a().m16998a(str, str2, null);
    }

    public static void reportEvent(String str, String str2) throws ValidationException {
        C3704wg.m17143a().m17006b(str, str2);
    }

    public static void setLocationTracking(Context context, boolean z) {
        C3704wg.m17143a().m16986a(context, z);
    }

    public static void reportAppOpen(Intent intent) {
        C3704wg.m17143a().m16987a(intent);
    }

    public static void reportError(String str, String str2, Throwable th) {
        C3704wg.m17143a().m16998a(str, str2, th);
    }

    public static void reportEvent(String str, Map<String, Object> map) throws ValidationException {
        C3704wg.m17143a().m17000a(str, map);
    }
}
