package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import p000.InterfaceC6434mZ;

/* renamed from: io.appmetrica.analytics.billingv6.impl.h */
/* loaded from: classes2.dex */
public final class C4298h extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C4301k f29585a;

    /* renamed from: b */
    public final /* synthetic */ BillingResult f29586b;

    /* renamed from: c */
    public final /* synthetic */ List f29587c;

    public C4298h(C4301k c4301k, BillingResult billingResult, List list) {
        this.f29585a = c4301k;
        this.f29586b = billingResult;
        this.f29587c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C4301k c4301k = this.f29585a;
        BillingResult billingResult = this.f29586b;
        List list = this.f29587c;
        c4301k.getClass();
        if (billingResult.getResponseCode() == 0 && !list.isEmpty()) {
            UtilsProvider utilsProvider = c4301k.f29594c;
            InterfaceC6434mZ interfaceC6434mZ = c4301k.f29595d;
            List list2 = c4301k.f29596e;
            C4297g c4297g = c4301k.f29597f;
            C4308r c4308r = new C4308r(utilsProvider, interfaceC6434mZ, list2, list, c4297g);
            c4297g.f29584c.add(c4308r);
            c4301k.f29594c.getUiExecutor().execute(new C4300j(c4301k, c4308r));
        }
        C4301k c4301k2 = this.f29585a;
        c4301k2.f29597f.m19153a(c4301k2);
    }
}
