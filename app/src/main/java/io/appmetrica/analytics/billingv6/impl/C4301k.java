package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import p000.InterfaceC6434mZ;

/* renamed from: io.appmetrica.analytics.billingv6.impl.k */
/* loaded from: classes2.dex */
public final class C4301k implements ProductDetailsResponseListener {

    /* renamed from: a */
    public final String f29592a;

    /* renamed from: b */
    public final BillingClient f29593b;

    /* renamed from: c */
    public final UtilsProvider f29594c;

    /* renamed from: d */
    public final InterfaceC6434mZ f29595d;

    /* renamed from: e */
    public final List f29596e;

    /* renamed from: f */
    public final C4297g f29597f;

    public C4301k(String str, BillingClient billingClient, UtilsProvider utilsProvider, C4303m c4303m, List list, C4297g c4297g) {
        this.f29592a = str;
        this.f29593b = billingClient;
        this.f29594c = utilsProvider;
        this.f29595d = c4303m;
        this.f29596e = list;
        this.f29597f = c4297g;
    }

    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public final void onProductDetailsResponse(BillingResult billingResult, List list) {
        this.f29594c.getWorkerExecutor().execute(new C4298h(this, billingResult, list));
    }
}
