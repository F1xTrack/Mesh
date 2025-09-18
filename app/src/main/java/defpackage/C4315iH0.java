package defpackage;

import android.annotation.SuppressLint;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.reactnativecommunity.webview.RNCWebViewMessagingModule;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* renamed from: iH0 */
/* loaded from: classes2.dex */
public final class C4315iH0 extends WebView implements LifecycleEventListener {
    public String a;
    public String b;
    public C4124hH0 c;
    public C0136Bm1 d;
    public boolean e;
    public String f;
    public RNCWebViewMessagingModule g;
    public C5282jH0 h;
    public boolean i;
    public C2423by0 j;
    public boolean k;
    public boolean l;
    public FC m;
    public List n;
    public WebChromeClient o;
    public String p;

    public final void a(WebView webView, AbstractC6260oP abstractC6260oP) {
        OZ1.b(getThemedReactContext(), C7191tH0.a(webView)).g(abstractC6260oP);
    }

    public final void b() {
        if (getSettings().getJavaScriptEnabled()) {
            StringBuilder sb = new StringBuilder("(function(){\n    window.ReactNativeWebView = window.ReactNativeWebView || {};\n    window.ReactNativeWebView.injectedObjectJson = function () { return ");
            sb.append(this.p == null ? null : AbstractC1705Vq.l(new StringBuilder("`"), this.p, "`"));
            sb.append("; };\n})();");
            evaluateJavascript(sb.toString(), null);
        }
    }

    public final void c(String str, String str2) {
        getThemedReactContext();
        if (this.h != null) {
            post(new RunnableC6720qp(this, this, str2, str, 2, false));
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("data", str);
        if (this.g == null) {
            a(this, new C3622ef(C7191tH0.a(this), writableMapCreateMap, 14, false));
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMapCreateMap);
        writableNativeMap.putString("messagingModuleName", this.f);
        this.g.onMessage(writableNativeMap);
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        WebChromeClient webChromeClient = this.o;
        if (webChromeClient != null) {
            webChromeClient.onHideCustomView();
        }
        super.destroy();
    }

    public boolean getMessagingEnabled() {
        return this.e;
    }

    public C5282jH0 getRNCWebViewClient() {
        return this.h;
    }

    public ReactApplicationContext getReactApplicationContext() {
        return getThemedReactContext().a;
    }

    public S91 getThemedReactContext() {
        return (S91) getContext();
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.o;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        setWebViewClient(null);
        destroy();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.k) {
            if (this.j == null) {
                this.j = new C2423by0();
            }
            if (this.j.a(i, i2)) {
                C2423by0 c2423by0 = this.j;
                float f = c2423by0.c;
                float f2 = c2423by0.d;
                int iComputeHorizontalScrollRange = computeHorizontalScrollRange();
                int iComputeVerticalScrollRange = computeVerticalScrollRange();
                int width = getWidth();
                int height = getHeight();
                C5649lC0 c5649lC0 = JW0.k;
                a(this, AbstractC8364zR1.a(-1, C7191tH0.a(this), MW0.d, i, i2, f, f2, iComputeHorizontalScrollRange, iComputeVerticalScrollRange, width, height, false));
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.i) {
            a(this, new C0482Fy(C7191tH0.a(this), i, i2));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.l) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBasicAuthCredential(C2295bH0 c2295bH0) {
        this.h.d = c2295bH0;
    }

    public void setHasScrollEvent(boolean z) {
        this.k = z;
    }

    public void setIgnoreErrFailedForThisURL(String str) {
        this.h.c = str;
    }

    public void setInjectedJavaScriptObject(String str) {
        this.p = str;
        b();
    }

    public void setMenuCustomItems(List<Map<String, String>> list) {
        this.n = list;
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void setMessagingEnabled(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        if (z) {
            if (AbstractC2055a12.a("WEB_MESSAGE_LISTENER")) {
                if (this.d == null) {
                    this.d = new C0136Bm1(27, this);
                    HashSet hashSet = new HashSet(1);
                    Object obj = new Object[]{"*"}[0];
                    Objects.requireNonNull(obj);
                    if (!hashSet.add(obj)) {
                        throw new IllegalArgumentException("duplicate element: " + obj);
                    }
                    Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
                    C0136Bm1 c0136Bm1 = this.d;
                    int i = AbstractC0838Km1.a;
                    if (!EnumC0993Mm1.WEB_MESSAGE_LISTENER.a()) {
                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                    }
                    WebViewProviderBoundaryInterface webViewProviderBoundaryInterfaceU = AbstractC1149Om1.a.u(this);
                    String[] strArr = (String[]) setUnmodifiableSet.toArray(new String[0]);
                    C0136Bm1 c0136Bm12 = new C0136Bm1(0, false);
                    c0136Bm12.b = c0136Bm1;
                    webViewProviderBoundaryInterfaceU.addWebMessageListener("ReactNativeWebView", strArr, new C1915Yi(0, c0136Bm12));
                }
            } else if (this.c == null) {
                C4124hH0 c4124hH0 = new C4124hH0();
                c4124hH0.a = this;
                this.c = c4124hH0;
                addJavascriptInterface(c4124hH0, "ReactNativeWebView");
            }
            b();
        }
    }

    public void setNestedScrollEnabled(boolean z) {
        this.l = z;
    }

    public void setSendContentSizeChangeEvents(boolean z) {
        this.i = z;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.o = webChromeClient;
        super.setWebChromeClient(webChromeClient);
        if (webChromeClient instanceof AbstractC3551eH0) {
            ((AbstractC3551eH0) webChromeClient).j = this.m;
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C5282jH0) {
            C5282jH0 c5282jH0 = (C5282jH0) webViewClient;
            this.h = c5282jH0;
            c5282jH0.b = this.m;
        }
    }

    @Override // android.view.View
    public final ActionMode startActionMode(ActionMode.Callback callback, int i) {
        return this.n == null ? super.startActionMode(callback, i) : super.startActionMode(new C3933gH0(this, callback), i);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
    }
}
