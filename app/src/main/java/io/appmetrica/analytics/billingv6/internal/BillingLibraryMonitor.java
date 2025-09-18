package io.appmetrica.analytics.billingv6.internal;

import android.content.Context;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.billingv6.impl.C4295e;
import io.appmetrica.analytics.billingv6.impl.C4311u;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.O90;

@Metadata(m22266d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m22267d2 = {"Lio/appmetrica/analytics/billingv6/internal/BillingLibraryMonitor;", "Lio/appmetrica/analytics/billinginterface/internal/monitor/BillingMonitor;", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "workerExecutor", "uiExecutor", "Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoStorage;", "billingInfoStorage", "Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoSender;", "billingInfoSender", "Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoManager;", "billingInfoManager", "Lio/appmetrica/analytics/billinginterface/internal/update/UpdatePolicy;", "updatePolicy", "<init>", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoStorage;Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoSender;Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoManager;Lio/appmetrica/analytics/billinginterface/internal/update/UpdatePolicy;)V", "LTf1;", "onSessionResumed", "()V", "Lio/appmetrica/analytics/billinginterface/internal/config/BillingConfig;", "billingConfig", "onBillingConfigChanged", "(Lio/appmetrica/analytics/billinginterface/internal/config/BillingConfig;)V", "billing-v6_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class BillingLibraryMonitor implements BillingMonitor {

    /* renamed from: a */
    private final Context f29623a;

    /* renamed from: b */
    private final Executor f29624b;

    /* renamed from: c */
    private final Executor f29625c;

    /* renamed from: d */
    private final BillingInfoSender f29626d;

    /* renamed from: e */
    private final BillingInfoManager f29627e;

    /* renamed from: f */
    private final UpdatePolicy f29628f;

    /* renamed from: g */
    private BillingConfig f29629g;

    public BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy) {
        this.f29623a = context;
        this.f29624b = executor;
        this.f29625c = executor2;
        this.f29626d = billingInfoSender;
        this.f29627e = billingInfoManager;
        this.f29628f = updatePolicy;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener
    public synchronized void onBillingConfigChanged(BillingConfig billingConfig) {
        if (O90.m5963a(this.f29629g, billingConfig)) {
            return;
        }
        this.f29629g = billingConfig;
        if (billingConfig != null) {
            this.f29625c.execute(new BillingLibraryMonitor$updateBilling$1(this, billingConfig));
        }
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor
    public void onSessionResumed() {
        BillingConfig billingConfig = this.f29629g;
        if (billingConfig == null) {
            return;
        }
        this.f29625c.execute(new BillingLibraryMonitor$updateBilling$1(this, billingConfig));
    }

    public /* synthetic */ BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, executor, executor2, billingInfoStorage, billingInfoSender, (i & 32) != 0 ? new C4295e(billingInfoStorage) : billingInfoManager, (i & 64) != 0 ? new C4311u(null, 1, null) : updatePolicy);
    }
}
