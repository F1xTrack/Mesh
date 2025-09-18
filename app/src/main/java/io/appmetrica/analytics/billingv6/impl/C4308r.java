package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import p000.InterfaceC6434mZ;

/* renamed from: io.appmetrica.analytics.billingv6.impl.r */
/* loaded from: classes2.dex */
public final class C4308r implements PurchasesResponseListener {

    /* renamed from: a */
    public final UtilsProvider f29617a;

    /* renamed from: b */
    public final InterfaceC6434mZ f29618b;

    /* renamed from: c */
    public final List f29619c;

    /* renamed from: d */
    public final List f29620d;

    /* renamed from: e */
    public final C4297g f29621e;

    public C4308r(UtilsProvider utilsProvider, InterfaceC6434mZ interfaceC6434mZ, List list, List list2, C4297g c4297g) {
        this.f29617a = utilsProvider;
        this.f29618b = interfaceC6434mZ;
        this.f29619c = list;
        this.f29620d = list2;
        this.f29621e = c4297g;
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f29617a.getWorkerExecutor().execute(new C4307q(this, billingResult, list));
    }
}
