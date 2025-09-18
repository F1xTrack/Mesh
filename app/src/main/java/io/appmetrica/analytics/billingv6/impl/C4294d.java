package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1$runSafety$1;

/* renamed from: io.appmetrica.analytics.billingv6.impl.d */
/* loaded from: classes2.dex */
public final class C4294d implements BillingClientStateListener {

    /* renamed from: a */
    public final BillingConfig f29574a;

    /* renamed from: b */
    public final BillingClient f29575b;

    /* renamed from: c */
    public final UtilsProvider f29576c;

    /* renamed from: d */
    public final C4297g f29577d;

    public C4294d(BillingConfig billingConfig, BillingClient billingClient, BillingLibraryMonitor$updateBilling$1$runSafety$1 billingLibraryMonitor$updateBilling$1$runSafety$1, C4297g c4297g) {
        this.f29574a = billingConfig;
        this.f29575b = billingClient;
        this.f29576c = billingLibraryMonitor$updateBilling$1$runSafety$1;
        this.f29577d = c4297g;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(BillingResult billingResult) {
        this.f29576c.getWorkerExecutor().execute(new C4291a(this, billingResult));
    }
}
