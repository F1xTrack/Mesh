package com.yandex.metrica;

import android.webkit.JavascriptInterface;
import com.yandex.metrica.impl.p022ob.C3678vg;

/* loaded from: classes2.dex */
public class AppMetricaJsInterface {

    /* renamed from: a */
    public final C3678vg f20724a;

    public AppMetricaJsInterface(C3678vg c3678vg) {
        this.f20724a = c3678vg;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f20724a.m17009c(str, str2);
    }
}
