package p000;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* renamed from: tH0 */
/* loaded from: classes2.dex */
public final class C11141tH0 extends FrameLayout {

    /* renamed from: a */
    public final C9733iH0 f42989a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11141tH0(S91 s91, C9733iH0 c9733iH0) {
        super(s91);
        O90.m5968f(s91, "context");
        O90.m5968f(c9733iH0, "webView");
        c9733iH0.setBackgroundColor(0);
        addView(c9733iH0);
        View childAt = getChildAt(0);
        O90.m5966d(childAt, "null cannot be cast to non-null type com.reactnativecommunity.webview.RNCWebView");
        this.f42989a = (C9733iH0) childAt;
    }

    /* renamed from: a */
    public static final int m24864a(WebView webView) {
        O90.m5968f(webView, "webView");
        Object parent = webView.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            return view.getId();
        }
        return -1;
    }

    public final C9733iH0 getWebView() {
        return this.f42989a;
    }
}
