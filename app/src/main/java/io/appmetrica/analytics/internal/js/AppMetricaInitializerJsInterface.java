package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.C4611i1;

/* loaded from: classes2.dex */
public class AppMetricaInitializerJsInterface {
    private final C4611i1 a;

    public AppMetricaInitializerJsInterface(C4611i1 c4611i1) {
        this.a = c4611i1;
    }

    @JavascriptInterface
    public void init(String str) {
        this.a.c(str);
    }
}
