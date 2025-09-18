package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import defpackage.InterfaceC5908mZ;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* loaded from: classes2.dex */
public final class r implements PurchasesResponseListener {
    public final UtilsProvider a;
    public final InterfaceC5908mZ b;
    public final List c;
    public final List d;
    public final g e;

    public r(UtilsProvider utilsProvider, InterfaceC5908mZ interfaceC5908mZ, List list, List list2, g gVar) {
        this.a = utilsProvider;
        this.b = interfaceC5908mZ;
        this.c = list;
        this.d = list2;
        this.e = gVar;
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.a.getWorkerExecutor().execute(new q(this, billingResult, list));
    }
}
