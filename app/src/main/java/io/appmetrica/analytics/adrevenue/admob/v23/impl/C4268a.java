package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.adrevenue.admob.v23.impl.a */
/* loaded from: classes2.dex */
public final class C4268a implements ModuleAdRevenueProcessor {

    /* renamed from: a */
    public final ArrayList f29547a;

    public C4268a(C4269b c4269b, ClientContext clientContext) {
        ArrayList arrayList = new ArrayList();
        this.f29547a = arrayList;
        arrayList.add(new C4271d(c4269b, clientContext));
        arrayList.add(new C4273f(c4269b, clientContext));
        arrayList.add(new C4274g(c4269b, clientContext));
        arrayList.add(new C4275h(c4269b, clientContext));
        arrayList.add(new C4276i(c4269b, clientContext));
        arrayList.add(new C4270c(c4269b, clientContext));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final String getDescription() {
        return "AdMob";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        Iterator it = this.f29547a.iterator();
        while (it.hasNext()) {
            if (((ModuleAdRevenueProcessor) it.next()).process(objArr)) {
                return true;
            }
        }
        return false;
    }
}
