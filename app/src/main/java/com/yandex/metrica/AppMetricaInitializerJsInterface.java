package com.yandex.metrica;

import android.webkit.JavascriptInterface;
import com.yandex.metrica.impl.p022ob.C3678vg;

/* loaded from: classes2.dex */
public class AppMetricaInitializerJsInterface {

    /* renamed from: a */
    public final C3678vg f20723a;

    public AppMetricaInitializerJsInterface(C3678vg c3678vg) {
        this.f20723a = c3678vg;
    }

    @JavascriptInterface
    public void init(String str) {
        this.f20723a.m17008c(str);
    }
}
