package com.yandex.metrica.impl.p022ob;

import android.webkit.WebView;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.yandex.metrica.impl.ob.lm */
/* loaded from: classes2.dex */
class RunnableC3424lm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3476nm f24228a;

    /* renamed from: b */
    final /* synthetic */ WebView f24229b;

    /* renamed from: c */
    final /* synthetic */ CountDownLatch f24230c;

    public RunnableC3424lm(C3450mm c3450mm, C3476nm c3476nm, WebView webView, CountDownLatch countDownLatch) {
        this.f24228a = c3476nm;
        this.f24229b = webView;
        this.f24230c = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f24228a.f24329h = this.f24229b.getUrl();
            this.f24228a.f24330i = this.f24229b.getOriginalUrl();
            this.f24230c.countDown();
        } catch (Throwable unused) {
        }
    }
}
