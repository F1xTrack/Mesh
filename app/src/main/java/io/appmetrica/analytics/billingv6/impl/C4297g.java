package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1$runSafety$1;
import java.util.LinkedHashSet;

/* renamed from: io.appmetrica.analytics.billingv6.impl.g */
/* loaded from: classes2.dex */
public final class C4297g {

    /* renamed from: a */
    public final BillingClient f29582a;

    /* renamed from: b */
    public final UtilsProvider f29583b;

    /* renamed from: c */
    public final LinkedHashSet f29584c = new LinkedHashSet();

    public C4297g(BillingClient billingClient, BillingLibraryMonitor$updateBilling$1$runSafety$1 billingLibraryMonitor$updateBilling$1$runSafety$1) {
        this.f29582a = billingClient;
        this.f29583b = billingLibraryMonitor$updateBilling$1$runSafety$1;
    }

    /* renamed from: a */
    public final void m19153a(Object obj) {
        this.f29584c.remove(obj);
        if (this.f29584c.size() == 0) {
            this.f29583b.getUiExecutor().execute(new C4296f(this));
        }
    }
}
