package io.appmetrica.analytics.billingv6.internal;

import com.android.billingclient.api.BillingClient;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.billingv6.impl.C4294d;
import io.appmetrica.analytics.billingv6.impl.C4297g;
import io.appmetrica.analytics.billingv6.impl.C4309s;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m22267d2 = {"io/appmetrica/analytics/billingv6/internal/BillingLibraryMonitor$updateBilling$1", "Lio/appmetrica/analytics/coreutils/internal/executors/SafeRunnable;", "LTf1;", "runSafety", "()V", "billing-v6_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class BillingLibraryMonitor$updateBilling$1 extends SafeRunnable {

    /* renamed from: a */
    final /* synthetic */ BillingLibraryMonitor f29630a;

    /* renamed from: b */
    final /* synthetic */ BillingConfig f29631b;

    public BillingLibraryMonitor$updateBilling$1(BillingLibraryMonitor billingLibraryMonitor, BillingConfig billingConfig) {
        this.f29630a = billingLibraryMonitor;
        this.f29631b = billingConfig;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1$runSafety$1] */
    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public void runSafety() {
        BillingClient billingClientBuild = BillingClient.newBuilder(this.f29630a.f29623a).setListener(new C4309s()).enablePendingPurchases().build();
        BillingConfig billingConfig = this.f29631b;
        final BillingLibraryMonitor billingLibraryMonitor = this.f29630a;
        ?? r3 = new UtilsProvider() { // from class: io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1$runSafety$1
            @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
            public BillingInfoManager getBillingInfoManager() {
                return billingLibraryMonitor.f29627e;
            }

            @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
            public BillingInfoSender getBillingInfoSender() {
                return billingLibraryMonitor.f29626d;
            }

            @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
            public Executor getUiExecutor() {
                return billingLibraryMonitor.f29625c;
            }

            @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
            public UpdatePolicy getUpdatePolicy() {
                return billingLibraryMonitor.f29628f;
            }

            @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
            public Executor getWorkerExecutor() {
                return billingLibraryMonitor.f29624b;
            }
        };
        billingClientBuild.startConnection(new C4294d(billingConfig, billingClientBuild, r3, new C4297g(billingClientBuild, r3)));
    }
}
