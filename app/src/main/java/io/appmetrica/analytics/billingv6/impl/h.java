package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import defpackage.InterfaceC5908mZ;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;

/* loaded from: classes2.dex */
public final class h extends SafeRunnable {
    public final /* synthetic */ k a;
    public final /* synthetic */ BillingResult b;
    public final /* synthetic */ List c;

    public h(k kVar, BillingResult billingResult, List list) {
        this.a = kVar;
        this.b = billingResult;
        this.c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        k kVar = this.a;
        BillingResult billingResult = this.b;
        List list = this.c;
        kVar.getClass();
        if (billingResult.getResponseCode() == 0 && !list.isEmpty()) {
            UtilsProvider utilsProvider = kVar.c;
            InterfaceC5908mZ interfaceC5908mZ = kVar.d;
            List list2 = kVar.e;
            g gVar = kVar.f;
            r rVar = new r(utilsProvider, interfaceC5908mZ, list2, list, gVar);
            gVar.c.add(rVar);
            kVar.c.getUiExecutor().execute(new j(kVar, rVar));
        }
        k kVar2 = this.a;
        kVar2.f.a(kVar2);
    }
}
