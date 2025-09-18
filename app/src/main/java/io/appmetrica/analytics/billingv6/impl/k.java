package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import defpackage.InterfaceC5908mZ;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* loaded from: classes2.dex */
public final class k implements ProductDetailsResponseListener {
    public final String a;
    public final BillingClient b;
    public final UtilsProvider c;
    public final InterfaceC5908mZ d;
    public final List e;
    public final g f;

    public k(String str, BillingClient billingClient, UtilsProvider utilsProvider, m mVar, List list, g gVar) {
        this.a = str;
        this.b = billingClient;
        this.c = utilsProvider;
        this.d = mVar;
        this.e = list;
        this.f = gVar;
    }

    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public final void onProductDetailsResponse(BillingResult billingResult, List list) {
        this.c.getWorkerExecutor().execute(new h(this, billingResult, list));
    }
}
