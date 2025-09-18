package com.yandex.metrica.impl.p022ob;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import com.yandex.metrica.AppMetricaInitializerJsInterface;
import com.yandex.metrica.AppMetricaJsInterface;
import io.appmetrica.analytics.reactnative.AppMetricaModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.X2 */
/* loaded from: classes2.dex */
public class C3043X2 {

    /* renamed from: a */
    private final List<InterfaceC2988Um<C2689Im>> f22745a = new ArrayList();

    /* renamed from: b */
    private C2689Im f22746b;

    /* renamed from: com.yandex.metrica.impl.ob.X2$a */
    public class a implements InterfaceC2988Um<C2689Im> {

        /* renamed from: a */
        final /* synthetic */ String f22747a;

        public a(C3043X2 c3043x2, String str) {
            this.f22747a = str;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2988Um
        /* renamed from: b */
        public void mo13904b(C2689Im c2689Im) {
            C2689Im c2689Im2 = c2689Im;
            if (c2689Im2.m17370c()) {
                c2689Im2.m17368c(this.f22747a);
            }
        }
    }

    @SuppressLint({"AddJavascriptInterface"})
    /* renamed from: a */
    public void m15411a(WebView webView, C3678vg c3678vg) {
        if (!C2968U2.m15243a(17)) {
            m15410a("WebView interface is not available on Android < 17.");
            return;
        }
        try {
            if (!webView.getSettings().getJavaScriptEnabled()) {
                m15410a("WebView interface setup failed because javascript is disabled for the WebView.");
                return;
            }
            webView.addJavascriptInterface(new AppMetricaJsInterface(c3678vg), AppMetricaModule.NAME);
            webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(c3678vg), "AppMetricaInitializer");
            C3018W2 c3018w2 = new C3018W2(this, "WebView interface setup is successful.");
            synchronized (this) {
                try {
                    C2689Im c2689Im = this.f22746b;
                    if (c2689Im == null) {
                        this.f22745a.add(c3018w2);
                    } else {
                        c3018w2.mo13904b(c2689Im);
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            C3068Y2 c3068y2 = new C3068Y2(this, th, "WebView interface setup failed because of an exception.");
            synchronized (this) {
                try {
                    C2689Im c2689Im2 = this.f22746b;
                    if (c2689Im2 == null) {
                        this.f22745a.add(c3068y2);
                    } else {
                        c3068y2.mo13904b(c2689Im2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: a */
    public void m15412a(C2689Im c2689Im) {
        synchronized (this) {
            this.f22746b = c2689Im;
        }
        Iterator<InterfaceC2988Um<C2689Im>> it = this.f22745a.iterator();
        while (it.hasNext()) {
            it.next().mo13904b(c2689Im);
        }
        this.f22745a.clear();
    }

    /* renamed from: a */
    private void m15410a(String str) {
        a aVar = new a(this, str);
        synchronized (this) {
            try {
                C2689Im c2689Im = this.f22746b;
                if (c2689Im == null) {
                    this.f22745a.add(aVar);
                } else {
                    aVar.mo13904b(c2689Im);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
