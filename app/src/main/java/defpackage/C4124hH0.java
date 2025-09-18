package defpackage;

import android.webkit.JavascriptInterface;

/* renamed from: hH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4124hH0 {
    public C4315iH0 a;

    @JavascriptInterface
    public void postMessage(String str) {
        C4315iH0 c4315iH0 = this.a;
        if (c4315iH0.getMessagingEnabled()) {
            c4315iH0.c(str, c4315iH0.getUrl());
        } else {
            AbstractC3393dS.p("RNCWebViewBridge");
        }
    }
}
