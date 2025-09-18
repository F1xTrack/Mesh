package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.i3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4613i3 implements InterfaceC4702ll {
    public BillingMonitor a;
    public final Context b;
    public final Executor c;
    public final Executor d;
    public final BillingType e;
    public final BillingInfoStorage f;
    public final BillingInfoSender g;
    public final ApplicationStateProvider h;
    public final C4565g3 i;

    public C4613i3(Context context, Executor executor, Executor executor2, BillingType billingType, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender) {
        this(context, executor, executor2, billingType, billingInfoStorage, billingInfoSender, C4667ka.h().c(), new C4565g3());
    }

    public final void a(C4583gl c4583gl, Boolean bool) {
        BillingMonitor s7;
        if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
            synchronized (this) {
                try {
                    C4565g3 c4565g3 = this.i;
                    Context context = this.b;
                    Executor executor = this.c;
                    Executor executor2 = this.d;
                    BillingType billingType = this.e;
                    BillingInfoStorage billingInfoStorage = this.f;
                    BillingInfoSender billingInfoSender = this.g;
                    c4565g3.getClass();
                    if (AbstractC4541f3.a[billingType.ordinal()] == 1) {
                        s7 = new BillingLibraryMonitor(context, executor, executor2, billingInfoStorage, billingInfoSender, null, null, 96, null);
                    } else {
                        s7 = new S7();
                    }
                    this.a = s7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            s7.onBillingConfigChanged(c4583gl.x);
            if (this.h.registerStickyObserver(new C4589h3(this)) == ApplicationState.VISIBLE) {
                try {
                    BillingMonitor billingMonitor = this.a;
                    if (billingMonitor != null) {
                        billingMonitor.onSessionResumed();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public C4613i3(Context context, Executor executor, Executor executor2, BillingType billingType, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, ApplicationStateProvider applicationStateProvider, C4565g3 c4565g3) {
        this.b = context;
        this.c = executor;
        this.d = executor2;
        this.e = billingType;
        this.f = billingInfoStorage;
        this.g = billingInfoSender;
        this.h = applicationStateProvider;
        this.i = c4565g3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4702ll
    public final synchronized void a(C4583gl c4583gl) {
        BillingMonitor billingMonitor;
        synchronized (this) {
            billingMonitor = this.a;
        }
        if (billingMonitor != null) {
            billingMonitor.onBillingConfigChanged(c4583gl.x);
        }
    }
}
