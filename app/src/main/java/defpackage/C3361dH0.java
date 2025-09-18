package defpackage;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* renamed from: dH0 */
/* loaded from: classes2.dex */
public final class C3361dH0 extends WebViewClient {
    public final /* synthetic */ WebView a;

    public C3361dH0(WebView webView) {
        this.a = webView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("targetUrl", str);
        WebView webView2 = this.a;
        ((C4315iH0) webView2).a(webView2, new C3622ef(C7191tH0.a(webView2), writableMapCreateMap, 15, false));
        return true;
    }
}
