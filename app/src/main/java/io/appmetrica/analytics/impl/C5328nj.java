package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;

/* renamed from: io.appmetrica.analytics.impl.nj */
/* loaded from: classes2.dex */
public final class C5328nj implements ServiceContext {

    /* renamed from: a */
    public final ModuleServiceLifecycleController f32299a;

    /* renamed from: b */
    public final C5322nd f32300b = new C5322nd(getContext());

    /* renamed from: c */
    public final C4589Jc f32301c = new C4589Jc();

    /* renamed from: d */
    public final C4500Fj f32302d = new C4500Fj(getContext(), new C4476Ej(new C4674N1()));

    /* renamed from: e */
    public final C4401Bj f32303e = new C4401Bj(getContext(), C5244ka.m20614h().m20638w(), C4966Z6.m20064a(getContext()).m20075h());

    /* renamed from: f */
    public final C5518v9 f32304f = new C5518v9();

    /* renamed from: g */
    public final C5415r6 f32305g = new C5415r6();

    public C5328nj(ModuleServiceLifecycleController moduleServiceLifecycleController) {
        this.f32299a = moduleServiceLifecycleController;
    }

    /* renamed from: a */
    public final C5322nd m20836a() {
        return this.f32300b;
    }

    /* renamed from: b */
    public final C4589Jc m20837b() {
        return this.f32301c;
    }

    /* renamed from: c */
    public final C4401Bj m20838c() {
        return this.f32303e;
    }

    /* renamed from: d */
    public final C4500Fj m20839d() {
        return this.f32302d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ActivationBarrier getActivationBarrier() {
        return C5244ka.f32038C.f32040B.getActivationBarrier();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ApplicationStateProvider getApplicationStateProvider() {
        return C5244ka.f32038C.m20624i().f32918b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ChargeTypeProvider getChargeTypeProvider() {
        C5244ka c5244ka = C5244ka.f32038C;
        C4962Z2 c4962z2 = c5244ka.f32045e;
        if (c4962z2 == null) {
            synchronized (c5244ka) {
                try {
                    c4962z2 = c5244ka.f32045e;
                    if (c4962z2 == null) {
                        c4962z2 = new C4962Z2(c5244ka.f32044d.m21138a(), c5244ka.m20624i().f32917a);
                        c5244ka.f32045e = c4962z2;
                    }
                } finally {
                }
            }
        }
        return c4962z2;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final Context getContext() {
        return C5244ka.f32038C.f32041a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final CryptoProvider getCryptoProvider() {
        return this.f32305g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final DataSendingRestrictionController getDataSendingRestrictionController() {
        return C5244ka.f32038C.m20622f();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ExecutorProvider getExecutorProvider() {
        return this.f32304f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final FirstExecutionConditionService getFirstExecutionConditionService() {
        return C5244ka.f32038C.f32040B.getFirstExecutionService();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final LocationServiceApi getLocationServiceApi() {
        return C5244ka.f32038C.m20625j();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ModuleServiceLifecycleController getModuleServiceLifecycleController() {
        return this.f32299a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceNetworkContext getNetworkContext() {
        return this.f32300b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final PlatformIdentifiers getPlatformIdentifiers() {
        return C5244ka.f32038C.m20631p();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final SdkEnvironmentProvider getSdkEnvironmentProvider() {
        return C5244ka.f32038C.m20634s();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ModuleSelfReporter getSelfReporter() {
        return this.f32301c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceStorageProvider getServiceStorageProvider() {
        return this.f32303e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceWakeLock getServiceWakeLock() {
        return this.f32302d;
    }
}
