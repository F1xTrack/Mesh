package io.appmetrica.analytics.internal.p029js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.C5185i1;

/* loaded from: classes2.dex */
public class AppMetricaJsInterface {

    /* renamed from: a */
    private final C5185i1 f32953a;

    public AppMetricaJsInterface(C5185i1 c5185i1) {
        this.f32953a = c5185i1;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f32953a.m20559d(str, str2);
    }
}
