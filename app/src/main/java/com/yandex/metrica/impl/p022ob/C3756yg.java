package com.yandex.metrica.impl.p022ob;

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
public class C3756yg extends C2508Bg {

    /* renamed from: i */
    private static final InterfaceC3660uo<YandexMetricaConfig> f25315i = new C3582ro(new C3556qo("Config"));

    /* renamed from: j */
    private static final InterfaceC3660uo<String> f25316j = new C3582ro(new C3530po("Native crash"));

    /* renamed from: k */
    private static final InterfaceC3660uo<Activity> f25317k = new C3582ro(new C3556qo("Activity"));

    /* renamed from: l */
    private static final InterfaceC3660uo<Intent> f25318l = new C3582ro(new C3556qo("Intent"));

    /* renamed from: m */
    private static final InterfaceC3660uo<Application> f25319m = new C3582ro(new C3556qo("Application"));

    /* renamed from: n */
    private static final InterfaceC3660uo<Context> f25320n = new C3582ro(new C3556qo("Context"));

    /* renamed from: o */
    private static final InterfaceC3660uo<Object> f25321o = new C3582ro(new C3556qo("Deeplink listener"));

    /* renamed from: p */
    private static final InterfaceC3660uo<AppMetricaDeviceIDListener> f25322p = new C3582ro(new C3556qo("DeviceID listener"));

    /* renamed from: q */
    private static final InterfaceC3660uo<ReporterConfig> f25323q = new C3582ro(new C3556qo("Reporter Config"));

    /* renamed from: r */
    private static final InterfaceC3660uo<String> f25324r = new C3582ro(new C3530po("Deeplink"));

    /* renamed from: s */
    private static final InterfaceC3660uo<String> f25325s = new C3582ro(new C3530po("Referral url"));

    /* renamed from: t */
    private static final InterfaceC3660uo<String> f25326t = new C3582ro(new C3686vo());

    /* renamed from: u */
    private static final InterfaceC3660uo<String> f25327u = new C3582ro(new C3556qo("Key"));

    /* renamed from: v */
    private static final InterfaceC3660uo<WebView> f25328v = new C3582ro(new C3556qo("WebView"));

    /* renamed from: w */
    private static final InterfaceC3660uo<String> f25329w = new C3530po("value");

    /* renamed from: x */
    private static final InterfaceC3660uo<String> f25330x = new C3530po("name");

    /* renamed from: a */
    public void m17243a(Application application) {
        ((C3582ro) f25319m).mo14391a(application);
    }

    /* renamed from: b */
    public void m17254b(Context context) {
        ((C3582ro) f25320n).mo14391a(context);
    }

    /* renamed from: c */
    public void m17256c(String str) {
        ((C3582ro) f25316j).mo14391a(str);
    }

    /* renamed from: d */
    public void m17257d(String str) {
        ((C3582ro) f25327u).mo14391a(str);
    }

    /* renamed from: e */
    public void m17258e(String str) {
        ((C3582ro) f25324r).mo14391a(str);
    }

    /* renamed from: f */
    public boolean m17259f(String str) {
        return ((C3530po) f25330x).mo14391a(str).m16805b();
    }

    /* renamed from: g */
    public boolean m17260g(String str) {
        return ((C3530po) f25329w).mo14391a(str).m16805b();
    }

    /* renamed from: a */
    public void m17248a(Intent intent) {
        ((C3582ro) f25318l).mo14391a(intent);
    }

    /* renamed from: c */
    public void m17255c(Activity activity) {
        ((C3582ro) f25317k).mo14391a(activity);
    }

    /* renamed from: a */
    public void m17253a(String str) {
        ((C3582ro) f25325s).mo14391a(str);
    }

    /* renamed from: a */
    public void m17244a(Context context) {
        ((C3582ro) f25320n).mo14391a(context);
    }

    /* renamed from: a */
    public void m17252a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        ((C3582ro) f25321o).mo14391a(deferredDeeplinkParametersListener);
    }

    /* renamed from: a */
    public void m17251a(DeferredDeeplinkListener deferredDeeplinkListener) {
        ((C3582ro) f25321o).mo14391a(deferredDeeplinkListener);
    }

    /* renamed from: a */
    public void m17250a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        ((C3582ro) f25322p).mo14391a(appMetricaDeviceIDListener);
    }

    /* renamed from: a */
    public void m17247a(Context context, String str) {
        ((C3582ro) f25320n).mo14391a(context);
        ((C3582ro) f25326t).mo14391a(str);
    }

    /* renamed from: a */
    public void m17245a(Context context, ReporterConfig reporterConfig) {
        ((C3582ro) f25320n).mo14391a(context);
        ((C3582ro) f25323q).mo14391a(reporterConfig);
    }

    /* renamed from: a */
    public void m17246a(Context context, YandexMetricaConfig yandexMetricaConfig) {
        ((C3582ro) f25320n).mo14391a(context);
        ((C3582ro) f25315i).mo14391a(yandexMetricaConfig);
    }

    /* renamed from: a */
    public void m17249a(WebView webView) {
        ((C3582ro) f25328v).mo14391a(webView);
    }
}
