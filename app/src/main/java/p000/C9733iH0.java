package p000;

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
public final class C9733iH0 extends WebView implements LifecycleEventListener {

    /* renamed from: a */
    public String f29029a;

    /* renamed from: b */
    public String f29030b;

    /* renamed from: c */
    public C9605hH0 f29031c;

    /* renamed from: d */
    public C7391Bm1 f29032d;

    /* renamed from: e */
    public boolean f29033e;

    /* renamed from: f */
    public String f29034f;

    /* renamed from: g */
    public RNCWebViewMessagingModule f29035g;

    /* renamed from: h */
    public C9861jH0 f29036h;

    /* renamed from: i */
    public boolean f29037i;

    /* renamed from: j */
    public C8918by0 f29038j;

    /* renamed from: k */
    public boolean f29039k;

    /* renamed from: l */
    public boolean f29040l;

    /* renamed from: m */
    public C0328FC f29041m;

    /* renamed from: n */
    public List f29042n;

    /* renamed from: o */
    public WebChromeClient f29043o;

    /* renamed from: p */
    public String f29044p;

    /* renamed from: a */
    public final void m18995a(WebView webView, AbstractC6550oP abstractC6550oP) {
        OZ1.m6091b(getThemedReactContext(), C11141tH0.m24864a(webView)).mo11046g(abstractC6550oP);
    }

    /* renamed from: b */
    public final void m18996b() {
        if (getSettings().getJavaScriptEnabled()) {
            StringBuilder sb = new StringBuilder("(function(){\n    window.ReactNativeWebView = window.ReactNativeWebView || {};\n    window.ReactNativeWebView.injectedObjectJson = function () { return ");
            sb.append(this.f29044p == null ? null : AbstractC1374Vq.m8593l(new StringBuilder("`"), this.f29044p, "`"));
            sb.append("; };\n})();");
            evaluateJavascript(sb.toString(), null);
        }
    }

    /* renamed from: c */
    public final void m18997c(String str, String str2) {
        getThemedReactContext();
        if (this.f29036h != null) {
            post(new RunnableC6704qp(this, this, str2, str, 2, false));
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("data", str);
        if (this.f29035g == null) {
            m18995a(this, new C4004ef(C11141tH0.m24864a(this), writableMapCreateMap, 14, false));
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMapCreateMap);
        writableNativeMap.putString("messagingModuleName", this.f29034f);
        this.f29035g.onMessage(writableNativeMap);
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        WebChromeClient webChromeClient = this.f29043o;
        if (webChromeClient != null) {
            webChromeClient.onHideCustomView();
        }
        super.destroy();
    }

    public boolean getMessagingEnabled() {
        return this.f29033e;
    }

    public C9861jH0 getRNCWebViewClient() {
        return this.f29036h;
    }

    public ReactApplicationContext getReactApplicationContext() {
        return getThemedReactContext().f10602a;
    }

    public S91 getThemedReactContext() {
        return (S91) getContext();
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.f29043o;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        setWebViewClient(null);
        destroy();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f29039k) {
            if (this.f29038j == null) {
                this.f29038j = new C8918by0();
            }
            if (this.f29038j.m10548a(i, i2)) {
                C8918by0 c8918by0 = this.f29038j;
                float f = c8918by0.f17244c;
                float f2 = c8918by0.f17245d;
                int iComputeHorizontalScrollRange = computeHorizontalScrollRange();
                int iComputeVerticalScrollRange = computeVerticalScrollRange();
                int width = getWidth();
                int height = getHeight();
                C10107lC0 c10107lC0 = JW0.f5565k;
                m18995a(this, AbstractC11926zR1.m26436a(-1, C11141tH0.m24864a(this), MW0.f7205d, i, i2, f, f2, iComputeHorizontalScrollRange, iComputeVerticalScrollRange, width, height, false));
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f29037i) {
            m18995a(this, new C0376Fy(C11141tH0.m24864a(this), i, i2));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f29040l) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBasicAuthCredential(C8832bH0 c8832bH0) {
        this.f29036h.f35018d = c8832bH0;
    }

    public void setHasScrollEvent(boolean z) {
        this.f29039k = z;
    }

    public void setIgnoreErrFailedForThisURL(String str) {
        this.f29036h.f35017c = str;
    }

    public void setInjectedJavaScriptObject(String str) {
        this.f29044p = str;
        m18996b();
    }

    public void setMenuCustomItems(List<Map<String, String>> list) {
        this.f29042n = list;
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void setMessagingEnabled(boolean z) {
        if (this.f29033e == z) {
            return;
        }
        this.f29033e = z;
        if (z) {
            if (AbstractC8671a12.m9662a("WEB_MESSAGE_LISTENER")) {
                if (this.f29032d == null) {
                    this.f29032d = new C7391Bm1(27, this);
                    HashSet hashSet = new HashSet(1);
                    Object obj = new Object[]{"*"}[0];
                    Objects.requireNonNull(obj);
                    if (!hashSet.add(obj)) {
                        throw new IllegalArgumentException("duplicate element: " + obj);
                    }
                    Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
                    C7391Bm1 c7391Bm1 = this.f29032d;
                    int i = AbstractC7859Km1.f6284a;
                    if (!EnumC7963Mm1.WEB_MESSAGE_LISTENER.m5435a()) {
                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                    }
                    WebViewProviderBoundaryInterface webViewProviderBoundaryInterfaceMo6427u = AbstractC8067Om1.f8614a.mo6427u(this);
                    String[] strArr = (String[]) setUnmodifiableSet.toArray(new String[0]);
                    C7391Bm1 c7391Bm12 = new C7391Bm1(0, false);
                    c7391Bm12.f1022b = c7391Bm1;
                    webViewProviderBoundaryInterfaceMo6427u.addWebMessageListener("ReactNativeWebView", strArr, new C1555Yi(0, c7391Bm12));
                }
            } else if (this.f29031c == null) {
                C9605hH0 c9605hH0 = new C9605hH0();
                c9605hH0.f28367a = this;
                this.f29031c = c9605hH0;
                addJavascriptInterface(c9605hH0, "ReactNativeWebView");
            }
            m18996b();
        }
    }

    public void setNestedScrollEnabled(boolean z) {
        this.f29040l = z;
    }

    public void setSendContentSizeChangeEvents(boolean z) {
        this.f29037i = z;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f29043o = webChromeClient;
        super.setWebChromeClient(webChromeClient);
        if (webChromeClient instanceof AbstractC9221eH0) {
            ((AbstractC9221eH0) webChromeClient).f26645j = this.f29041m;
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C9861jH0) {
            C9861jH0 c9861jH0 = (C9861jH0) webViewClient;
            this.f29036h = c9861jH0;
            c9861jH0.f35016b = this.f29041m;
        }
    }

    @Override // android.view.View
    public final ActionMode startActionMode(ActionMode.Callback callback, int i) {
        return this.f29042n == null ? super.startActionMode(callback, i) : super.startActionMode(new C9477gH0(this, callback), i);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
    }
}
