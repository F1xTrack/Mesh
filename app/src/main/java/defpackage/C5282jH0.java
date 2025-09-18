package defpackage;

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
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: jH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5282jH0 extends WebViewClient {
    public boolean a;
    public FC b;
    public String c;
    public C2295bH0 d;

    public final WritableMap a(WebView webView, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("target", C7191tH0.a(webView));
        writableMapCreateMap.putString("url", str);
        writableMapCreateMap.putBoolean("loading", (this.a || webView.getProgress() == 100) ? false : true);
        writableMapCreateMap.putString("title", webView.getTitle());
        writableMapCreateMap.putBoolean("canGoBack", webView.canGoBack());
        writableMapCreateMap.putBoolean("canGoForward", webView.canGoForward());
        return writableMapCreateMap;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        ((C4315iH0) webView).a(webView, new C3622ef(C7191tH0.a(webView), a(webView, str), 13, false));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        String str2;
        super.onPageFinished(webView, str);
        if (CookieManager.getInstance().getCookie(str) != null) {
            CookieManager.getInstance().flush();
        }
        if (this.a) {
            return;
        }
        C4315iH0 c4315iH0 = (C4315iH0) webView;
        if (c4315iH0.getSettings().getJavaScriptEnabled() && (str2 = c4315iH0.a) != null && !TextUtils.isEmpty(str2)) {
            c4315iH0.evaluateJavascript("(function() {\n" + c4315iH0.a + ";\n})();", null);
            c4315iH0.b();
        }
        int iA = C7191tH0.a(webView);
        OZ1.b((ReactContext) webView.getContext(), iA).g(new C3622ef(iA, a(webView, str), 11, false));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String str2;
        super.onPageStarted(webView, str, bitmap);
        this.a = false;
        C4315iH0 c4315iH0 = (C4315iH0) webView;
        if (!c4315iH0.getSettings().getJavaScriptEnabled() || (str2 = c4315iH0.b) == null || TextUtils.isEmpty(str2)) {
            return;
        }
        c4315iH0.evaluateJavascript("(function() {\n" + c4315iH0.b + ";\n})();", null);
        c4315iH0.b();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String str3 = this.c;
        if (str3 != null && str2.equals(str3) && i == -1 && str.equals("net::ERR_FAILED")) {
            this.c = null;
            return;
        }
        super.onReceivedError(webView, i, str, str2);
        this.a = true;
        int iA = C7191tH0.a(webView);
        OZ1.b((ReactContext) webView.getContext(), iA).g(new C3622ef(iA, a(webView, str2), 11, false));
        WritableMap writableMapA = a(webView, str2);
        writableMapA.putDouble("code", i);
        writableMapA.putString("description", str);
        int iA2 = C7191tH0.a(webView);
        OZ1.b((ReactContext) webView.getContext(), iA2).g(new C3622ef(iA2, writableMapA, 10, false));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        C2295bH0 c2295bH0 = this.d;
        if (c2295bH0 != null) {
            httpAuthHandler.proceed(c2295bH0.a, c2295bH0.b);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.isForMainFrame()) {
            WritableMap writableMapA = a(webView, webResourceRequest.getUrl().toString());
            writableMapA.putInt(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, webResourceResponse.getStatusCode());
            writableMapA.putString("description", webResourceResponse.getReasonPhrase());
            int iA = C7191tH0.a(webView);
            OZ1.b((ReactContext) webView.getContext(), iA).g(new C3622ef(iA, writableMapA, 9, false));
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
        WritableMap writableMapA = a(webView, webView.getUrl());
        writableMapA.putBoolean("didCrash", renderProcessGoneDetail.didCrash());
        int iA = C7191tH0.a(webView);
        OZ1.b((ReactContext) webView.getContext(), iA).g(new C3622ef(iA, writableMapA, 16, false));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C4315iH0 c4315iH0 = (C4315iH0) webView;
        if (c4315iH0.getReactApplicationContext().getJavaScriptContextHolder().get() == 0 || c4315iH0.g == null) {
            AbstractC3393dS.p("RNCWebViewClient");
            this.b.a = true;
            int iA = C7191tH0.a(webView);
            OZ1.b((ReactContext) webView.getContext(), iA).g(new C3622ef(iA, a(webView, str), 17));
            return true;
        }
        C2045Zz0 c2045Zz0B = C6809rH0.g.b();
        Double d = (Double) c2045Zz0B.a;
        double dDoubleValue = d.doubleValue();
        AtomicReference atomicReference = (AtomicReference) c2045Zz0B.b;
        WritableMap writableMapA = a(webView, str);
        writableMapA.putDouble("lockIdentifier", dDoubleValue);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMapA);
        writableNativeMap.putString("messagingModuleName", c4315iH0.f);
        c4315iH0.g.onShouldStartLoadWithRequest(writableNativeMap);
        try {
            synchronized (atomicReference) {
                try {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    while (atomicReference.get() == EnumC6428pH0.a) {
                        if (SystemClock.elapsedRealtime() - jElapsedRealtime > 250) {
                            AbstractC3393dS.p("RNCWebViewClient");
                            C6809rH0.g.c(d);
                            return false;
                        }
                        atomicReference.wait(250L);
                    }
                    boolean z = atomicReference.get() == EnumC6428pH0.b;
                    C6809rH0.g.c(d);
                    return z;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException unused) {
            AbstractC3393dS.h("RNCWebViewClient");
            C6809rH0.g.c(d);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }
}
