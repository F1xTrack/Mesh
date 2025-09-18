package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import com.yandex.metrica.AppMetricaInitializerJsInterface;
import com.yandex.metrica.AppMetricaJsInterface;
import io.appmetrica.analytics.reactnative.AppMetricaModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class X2 {
    private final List<Um<Im>> a = new ArrayList();
    private Im b;

    public class a implements Um<Im> {
        final /* synthetic */ String a;

        public a(X2 x2, String str) {
            this.a = str;
        }

        @Override // com.yandex.metrica.impl.ob.Um
        public void b(Im im) {
            Im im2 = im;
            if (im2.c()) {
                im2.c(this.a);
            }
        }
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void a(WebView webView, C3154vg c3154vg) {
        if (!U2.a(17)) {
            a("WebView interface is not available on Android < 17.");
            return;
        }
        try {
            if (!webView.getSettings().getJavaScriptEnabled()) {
                a("WebView interface setup failed because javascript is disabled for the WebView.");
                return;
            }
            webView.addJavascriptInterface(new AppMetricaJsInterface(c3154vg), AppMetricaModule.NAME);
            webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(c3154vg), "AppMetricaInitializer");
            W2 w2 = new W2(this, "WebView interface setup is successful.");
            synchronized (this) {
                try {
                    Im im = this.b;
                    if (im == null) {
                        this.a.add(w2);
                    } else {
                        w2.b(im);
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            Y2 y2 = new Y2(this, th, "WebView interface setup failed because of an exception.");
            synchronized (this) {
                try {
                    Im im2 = this.b;
                    if (im2 == null) {
                        this.a.add(y2);
                    } else {
                        y2.b(im2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void a(Im im) {
        synchronized (this) {
            this.b = im;
        }
        Iterator<Um<Im>> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b(im);
        }
        this.a.clear();
    }

    private void a(String str) {
        a aVar = new a(this, str);
        synchronized (this) {
            try {
                Im im = this.b;
                if (im == null) {
                    this.a.add(aVar);
                } else {
                    aVar.b(im);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
