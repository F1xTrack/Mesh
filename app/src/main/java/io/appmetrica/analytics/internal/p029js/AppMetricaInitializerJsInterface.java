package io.appmetrica.analytics.internal.p029js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.C5185i1;

/* loaded from: classes2.dex */
public class AppMetricaInitializerJsInterface {

    /* renamed from: a */
    private final C5185i1 f32952a;

    public AppMetricaInitializerJsInterface(C5185i1 c5185i1) {
        this.f32952a = c5185i1;
    }

    @JavascriptInterface
    public void init(String str) {
        this.f32952a.m20555c(str);
    }
}
