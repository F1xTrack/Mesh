package defpackage;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* renamed from: tH0 */
/* loaded from: classes2.dex */
public final class C7191tH0 extends FrameLayout {
    public final C4315iH0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7191tH0(S91 s91, C4315iH0 c4315iH0) {
        super(s91);
        O90.f(s91, "context");
        O90.f(c4315iH0, "webView");
        c4315iH0.setBackgroundColor(0);
        addView(c4315iH0);
        View childAt = getChildAt(0);
        O90.d(childAt, "null cannot be cast to non-null type com.reactnativecommunity.webview.RNCWebView");
        this.a = (C4315iH0) childAt;
    }

    public static final int a(WebView webView) {
        O90.f(webView, "webView");
        Object parent = webView.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            return view.getId();
        }
        return -1;
    }

    public final C4315iH0 getWebView() {
        return this.a;
    }
}
