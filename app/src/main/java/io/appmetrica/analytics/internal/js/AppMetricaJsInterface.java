package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.C4611i1;

/* loaded from: classes2.dex */
public class AppMetricaJsInterface {
    private final C4611i1 a;

    public AppMetricaJsInterface(C4611i1 c4611i1) {
        this.a = c4611i1;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.a.d(str, str2);
    }
}
