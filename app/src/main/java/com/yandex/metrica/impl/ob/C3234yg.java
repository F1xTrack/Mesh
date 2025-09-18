package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.YandexMetricaConfig;

/* renamed from: com.yandex.metrica.impl.ob.yg */
/* loaded from: classes2.dex */
public class C3234yg extends Bg {
    private static final uo<YandexMetricaConfig> i = new ro(new qo("Config"));
    private static final uo<String> j = new ro(new po("Native crash"));
    private static final uo<Activity> k = new ro(new qo("Activity"));
    private static final uo<Intent> l = new ro(new qo("Intent"));
    private static final uo<Application> m = new ro(new qo("Application"));
    private static final uo<Context> n = new ro(new qo("Context"));
    private static final uo<Object> o = new ro(new qo("Deeplink listener"));
    private static final uo<AppMetricaDeviceIDListener> p = new ro(new qo("DeviceID listener"));
    private static final uo<ReporterConfig> q = new ro(new qo("Reporter Config"));
    private static final uo<String> r = new ro(new po("Deeplink"));
    private static final uo<String> s = new ro(new po("Referral url"));
    private static final uo<String> t = new ro(new vo());
    private static final uo<String> u = new ro(new qo("Key"));
    private static final uo<WebView> v = new ro(new qo("WebView"));
    private static final uo<String> w = new po("value");
    private static final uo<String> x = new po("name");

    public void a(Application application) {
        ((ro) m).a(application);
    }

    public void b(Context context) {
        ((ro) n).a(context);
    }

    public void c(String str) {
        ((ro) j).a(str);
    }

    public void d(String str) {
        ((ro) u).a(str);
    }

    public void e(String str) {
        ((ro) r).a(str);
    }

    public boolean f(String str) {
        return ((po) x).a(str).b();
    }

    public boolean g(String str) {
        return ((po) w).a(str).b();
    }

    public void a(Intent intent) {
        ((ro) l).a(intent);
    }

    public void c(Activity activity) {
        ((ro) k).a(activity);
    }

    public void a(String str) {
        ((ro) s).a(str);
    }

    public void a(Context context) {
        ((ro) n).a(context);
    }

    public void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        ((ro) o).a(deferredDeeplinkParametersListener);
    }

    public void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        ((ro) o).a(deferredDeeplinkListener);
    }

    public void a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        ((ro) p).a(appMetricaDeviceIDListener);
    }

    public void a(Context context, String str) {
        ((ro) n).a(context);
        ((ro) t).a(str);
    }

    public void a(Context context, ReporterConfig reporterConfig) {
        ((ro) n).a(context);
        ((ro) q).a(reporterConfig);
    }

    public void a(Context context, YandexMetricaConfig yandexMetricaConfig) {
        ((ro) n).a(context);
        ((ro) i).a(yandexMetricaConfig);
    }

    public void a(WebView webView) {
        ((ro) v).a(webView);
    }
}
