package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* renamed from: io.appmetrica.analytics.billingv6.impl.p */
/* loaded from: classes2.dex */
public final class C4306p implements PurchaseHistoryResponseListener {

    /* renamed from: a */
    public final BillingConfig f29609a;

    /* renamed from: b */
    public final BillingClient f29610b;

    /* renamed from: c */
    public final UtilsProvider f29611c;

    /* renamed from: d */
    public final String f29612d;

    /* renamed from: e */
    public final C4297g f29613e;

    public C4306p(BillingConfig billingConfig, BillingClient billingClient, UtilsProvider utilsProvider, String str, C4297g c4297g) {
        this.f29609a = billingConfig;
        this.f29610b = billingClient;
        this.f29611c = utilsProvider;
        this.f29612d = str;
        this.f29613e = c4297g;
    }

    @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
    public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
        this.f29611c.getWorkerExecutor().execute(new C4302l(this, billingResult, list));
    }
}
