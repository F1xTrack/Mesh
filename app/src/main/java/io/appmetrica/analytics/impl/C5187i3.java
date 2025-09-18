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

/* renamed from: io.appmetrica.analytics.impl.i3 */
/* loaded from: classes2.dex */
public final class C5187i3 implements InterfaceC5280ll {

    /* renamed from: a */
    public BillingMonitor f31890a;

    /* renamed from: b */
    public final Context f31891b;

    /* renamed from: c */
    public final Executor f31892c;

    /* renamed from: d */
    public final Executor f31893d;

    /* renamed from: e */
    public final BillingType f31894e;

    /* renamed from: f */
    public final BillingInfoStorage f31895f;

    /* renamed from: g */
    public final BillingInfoSender f31896g;

    /* renamed from: h */
    public final ApplicationStateProvider f31897h;

    /* renamed from: i */
    public final C5137g3 f31898i;

    public C5187i3(Context context, Executor executor, Executor executor2, BillingType billingType, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender) {
        this(context, executor, executor2, billingType, billingInfoStorage, billingInfoSender, C5244ka.m20614h().m20619c(), new C5137g3());
    }

    /* renamed from: a */
    public final void m20563a(C5155gl c5155gl, Boolean bool) {
        BillingMonitor c4799s7;
        if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
            synchronized (this) {
                try {
                    C5137g3 c5137g3 = this.f31898i;
                    Context context = this.f31891b;
                    Executor executor = this.f31892c;
                    Executor executor2 = this.f31893d;
                    BillingType billingType = this.f31894e;
                    BillingInfoStorage billingInfoStorage = this.f31895f;
                    BillingInfoSender billingInfoSender = this.f31896g;
                    c5137g3.getClass();
                    if (AbstractC5112f3.f31651a[billingType.ordinal()] == 1) {
                        c4799s7 = new BillingLibraryMonitor(context, executor, executor2, billingInfoStorage, billingInfoSender, null, null, 96, null);
                    } else {
                        c4799s7 = new C4799S7();
                    }
                    this.f31890a = c4799s7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c4799s7.onBillingConfigChanged(c5155gl.f31805x);
            if (this.f31897h.registerStickyObserver(new C5162h3(this)) == ApplicationState.VISIBLE) {
                try {
                    BillingMonitor billingMonitor = this.f31890a;
                    if (billingMonitor != null) {
                        billingMonitor.onSessionResumed();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public C5187i3(Context context, Executor executor, Executor executor2, BillingType billingType, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, ApplicationStateProvider applicationStateProvider, C5137g3 c5137g3) {
        this.f31891b = context;
        this.f31892c = executor;
        this.f31893d = executor2;
        this.f31894e = billingType;
        this.f31895f = billingInfoStorage;
        this.f31896g = billingInfoSender;
        this.f31897h = applicationStateProvider;
        this.f31898i = c5137g3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5280ll
    /* renamed from: a */
    public final synchronized void mo19206a(C5155gl c5155gl) {
        BillingMonitor billingMonitor;
        synchronized (this) {
            billingMonitor = this.f31890a;
        }
        if (billingMonitor != null) {
            billingMonitor.onBillingConfigChanged(c5155gl.f31805x);
        }
    }
}
