package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import p000.AbstractC7230yu;

/* renamed from: io.appmetrica.analytics.billingv6.impl.a */
/* loaded from: classes2.dex */
public final class C4291a extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C4294d f29567a;

    /* renamed from: b */
    public final /* synthetic */ BillingResult f29568b;

    public C4291a(C4294d c4294d, BillingResult billingResult) {
        this.f29567a = c4294d;
        this.f29568b = billingResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C4294d c4294d = this.f29567a;
        BillingResult billingResult = this.f29568b;
        c4294d.getClass();
        if (billingResult.getResponseCode() != 0) {
            return;
        }
        for (String str : AbstractC7230yu.m26275f("inapp", "subs")) {
            BillingConfig billingConfig = c4294d.f29574a;
            BillingClient billingClient = c4294d.f29575b;
            UtilsProvider utilsProvider = c4294d.f29576c;
            C4297g c4297g = c4294d.f29577d;
            C4306p c4306p = new C4306p(billingConfig, billingClient, utilsProvider, str, c4297g);
            c4297g.f29584c.add(c4306p);
            c4294d.f29576c.getUiExecutor().execute(new C4293c(c4294d, str, c4306p));
        }
    }
}
