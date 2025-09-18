package p000;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: jH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9861jH0 extends WebViewClient {

    /* renamed from: a */
    public boolean f35015a;

    /* renamed from: b */
    public C0328FC f35016b;

    /* renamed from: c */
    public String f35017c;

    /* renamed from: d */
    public C8832bH0 f35018d;

    /* renamed from: a */
    public final WritableMap m22011a(WebView webView, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("target", C11141tH0.m24864a(webView));
        writableMapCreateMap.putString("url", str);
        writableMapCreateMap.putBoolean("loading", (this.f35015a || webView.getProgress() == 100) ? false : true);
        writableMapCreateMap.putString("title", webView.getTitle());
        writableMapCreateMap.putBoolean("canGoBack", webView.canGoBack());
        writableMapCreateMap.putBoolean("canGoForward", webView.canGoForward());
        return writableMapCreateMap;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        ((C9733iH0) webView).m18995a(webView, new C4004ef(C11141tH0.m24864a(webView), m22011a(webView, str), 13, false));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        String str2;
        super.onPageFinished(webView, str);
        if (CookieManager.getInstance().getCookie(str) != null) {
            CookieManager.getInstance().flush();
        }
        if (this.f35015a) {
            return;
        }
        C9733iH0 c9733iH0 = (C9733iH0) webView;
        if (c9733iH0.getSettings().getJavaScriptEnabled() && (str2 = c9733iH0.f29029a) != null && !TextUtils.isEmpty(str2)) {
            c9733iH0.evaluateJavascript("(function() {\n" + c9733iH0.f29029a + ";\n})();", null);
            c9733iH0.m18996b();
        }
        int iM24864a = C11141tH0.m24864a(webView);
        OZ1.m6091b((ReactContext) webView.getContext(), iM24864a).mo11046g(new C4004ef(iM24864a, m22011a(webView, str), 11, false));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String str2;
        super.onPageStarted(webView, str, bitmap);
        this.f35015a = false;
        C9733iH0 c9733iH0 = (C9733iH0) webView;
        if (!c9733iH0.getSettings().getJavaScriptEnabled() || (str2 = c9733iH0.f29030b) == null || TextUtils.isEmpty(str2)) {
            return;
        }
        c9733iH0.evaluateJavascript("(function() {\n" + c9733iH0.f29030b + ";\n})();", null);
        c9733iH0.m18996b();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String str3 = this.f35017c;
        if (str3 != null && str2.equals(str3) && i == -1 && str.equals("net::ERR_FAILED")) {
            this.f35017c = null;
            return;
        }
        super.onReceivedError(webView, i, str, str2);
        this.f35015a = true;
        int iM24864a = C11141tH0.m24864a(webView);
        OZ1.m6091b((ReactContext) webView.getContext(), iM24864a).mo11046g(new C4004ef(iM24864a, m22011a(webView, str2), 11, false));
        WritableMap writableMapM22011a = m22011a(webView, str2);
        writableMapM22011a.putDouble("code", i);
        writableMapM22011a.putString("description", str);
        int iM24864a2 = C11141tH0.m24864a(webView);
        OZ1.m6091b((ReactContext) webView.getContext(), iM24864a2).mo11046g(new C4004ef(iM24864a2, writableMapM22011a, 10, false));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        C8832bH0 c8832bH0 = this.f35018d;
        if (c8832bH0 != null) {
            httpAuthHandler.proceed(c8832bH0.f16926a, c8832bH0.f16927b);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.isForMainFrame()) {
            WritableMap writableMapM22011a = m22011a(webView, webResourceRequest.getUrl().toString());
            writableMapM22011a.putInt(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, webResourceResponse.getStatusCode());
            writableMapM22011a.putString("description", webResourceResponse.getReasonPhrase());
            int iM24864a = C11141tH0.m24864a(webView);
            OZ1.m6091b((ReactContext) webView.getContext(), iM24864a).mo11046g(new C4004ef(iM24864a, writableMapM22011a, 9, false));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String url = webView.getUrl();
        String url2 = sslError.getUrl();
        sslErrorHandler.cancel();
        if (url.equalsIgnoreCase(url2)) {
            int primaryError = sslError.getPrimaryError();
            onReceivedError(webView, primaryError, "SSL error: ".concat(primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? "Unknown SSL Error" : "A generic error occurred" : "The date of the certificate is invalid" : "The certificate authority is not trusted" : "Hostname mismatch" : "The certificate has expired" : "The certificate is not yet valid"), url2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        super.onRenderProcessGone(webView, renderProcessGoneDetail);
        renderProcessGoneDetail.didCrash();
        if (webView == null) {
            return true;
        }
        WritableMap writableMapM22011a = m22011a(webView, webView.getUrl());
        writableMapM22011a.putBoolean("didCrash", renderProcessGoneDetail.didCrash());
        int iM24864a = C11141tH0.m24864a(webView);
        OZ1.m6091b((ReactContext) webView.getContext(), iM24864a).mo11046g(new C4004ef(iM24864a, writableMapM22011a, 16, false));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C9733iH0 c9733iH0 = (C9733iH0) webView;
        if (c9733iH0.getReactApplicationContext().getJavaScriptContextHolder().get() == 0 || c9733iH0.f29035g == null) {
            AbstractC3929dS.m17683p("RNCWebViewClient");
            this.f35016b.f3086a = true;
            int iM24864a = C11141tH0.m24864a(webView);
            OZ1.m6091b((ReactContext) webView.getContext(), iM24864a).mo11046g(new C4004ef(iM24864a, m22011a(webView, str), 17));
            return true;
        }
        C8664Zz0 c8664Zz0M23962b = C10885rH0.f41409g.m23962b();
        Double d = (Double) c8664Zz0M23962b.f15267a;
        double dDoubleValue = d.doubleValue();
        AtomicReference atomicReference = (AtomicReference) c8664Zz0M23962b.f15268b;
        WritableMap writableMapM22011a = m22011a(webView, str);
        writableMapM22011a.putDouble("lockIdentifier", dDoubleValue);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMapM22011a);
        writableNativeMap.putString("messagingModuleName", c9733iH0.f29034f);
        c9733iH0.f29035g.onShouldStartLoadWithRequest(writableNativeMap);
        try {
            synchronized (atomicReference) {
                try {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    while (atomicReference.get() == EnumC10629pH0.f39996a) {
                        if (SystemClock.elapsedRealtime() - jElapsedRealtime > 250) {
                            AbstractC3929dS.m17683p("RNCWebViewClient");
                            C10885rH0.f41409g.m23963c(d);
                            return false;
                        }
                        atomicReference.wait(250L);
                    }
                    boolean z = atomicReference.get() == EnumC10629pH0.f39997b;
                    C10885rH0.f41409g.m23963c(d);
                    return z;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException unused) {
            AbstractC3929dS.m17675h("RNCWebViewClient");
            C10885rH0.f41409g.m23963c(d);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }
}
