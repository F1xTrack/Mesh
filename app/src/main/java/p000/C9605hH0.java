package p000;

import android.webkit.JavascriptInterface;

/* renamed from: hH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9605hH0 {

    /* renamed from: a */
    public C9733iH0 f28367a;

    @JavascriptInterface
    public void postMessage(String str) {
        C9733iH0 c9733iH0 = this.f28367a;
        if (c9733iH0.getMessagingEnabled()) {
            c9733iH0.m18997c(str, c9733iH0.getUrl());
        } else {
            AbstractC3929dS.m17683p("RNCWebViewBridge");
        }
    }
}
