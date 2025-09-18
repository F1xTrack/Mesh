package p000;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* renamed from: dH0 */
/* loaded from: classes2.dex */
public final class C9093dH0 extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ WebView f25930a;

    public C9093dH0(WebView webView) {
        this.f25930a = webView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("targetUrl", str);
        WebView webView2 = this.f25930a;
        ((C9733iH0) webView2).m18995a(webView2, new C4004ef(C11141tH0.m24864a(webView2), writableMapCreateMap, 15, false));
        return true;
    }
}
