package com.yandex.metrica.impl.ob;

import android.webkit.WebView;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.yandex.metrica.impl.ob.lm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class RunnableC2911lm implements Runnable {
    final /* synthetic */ C2961nm a;
    final /* synthetic */ WebView b;
    final /* synthetic */ CountDownLatch c;

    public RunnableC2911lm(C2936mm c2936mm, C2961nm c2961nm, WebView webView, CountDownLatch countDownLatch) {
        this.a = c2961nm;
        this.b = webView;
        this.c = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.a.h = this.b.getUrl();
            this.a.i = this.b.getOriginalUrl();
            this.c.countDown();
        } catch (Throwable unused) {
        }
    }
}
