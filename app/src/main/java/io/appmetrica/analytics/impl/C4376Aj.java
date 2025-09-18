package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import p000.AbstractC0246Du;
import p000.AbstractC11077sn0;
import p000.AbstractC11205tn0;
import p000.C0779MN;
import p000.C8313Tf1;
import p000.I02;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.Aj */
/* loaded from: classes2.dex */
public final class C4376Aj implements InterfaceC4369Ac, InterfaceC5280ll, AskForPermissionStrategyModuleProvider {

    /* renamed from: a */
    public final String f29865a = "rp";

    /* renamed from: b */
    public final CopyOnWriteArrayList f29866b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public volatile AskForPermissionStrategyModuleProvider f29867c = new C4389B7();

    @Override // io.appmetrica.analytics.impl.InterfaceC5280ll
    /* renamed from: a */
    public final void mo19206a(C5155gl c5155gl) {
        SdkIdentifiers sdkIdentifiers = new SdkIdentifiers(c5155gl.m20469e(), c5155gl.m20465a(), c5155gl.m20466b());
        C5025bg c5025bg = new C5025bg(c5155gl.m20467c(), c5155gl.m20468d());
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.f29866b) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
            if (remoteConfigExtensionConfiguration != null) {
                remoteConfigExtensionConfiguration.getRemoteConfigUpdateListener().onRemoteConfigUpdated(new C5628zj(sdkIdentifiers, c5025bg, c5155gl.f31780B.get(moduleServiceEntryPoint.getIdentifier())));
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4369Ac
    /* renamed from: b */
    public final Map<String, C4565Ic> mo19191b() {
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f29866b;
        ArrayList arrayList = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
            Pair pair = remoteConfigExtensionConfiguration != null ? new Pair(moduleServiceEntryPoint.getIdentifier(), new C4565Ic(remoteConfigExtensionConfiguration)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return AbstractC11077sn0.m24786n(arrayList);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4369Ac
    /* renamed from: c */
    public final Map<String, Integer> mo19192c() {
        Map<String, Integer> blocks;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f29866b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = ((ModuleServiceEntryPoint) it.next()).getRemoteConfigExtensionConfiguration();
            AbstractC0246Du.m1920m(arrayList, (remoteConfigExtensionConfiguration == null || (blocks = remoteConfigExtensionConfiguration.getBlocks()) == null) ? C0779MN.f7117a : AbstractC11077sn0.m24785m(blocks));
        }
        return AbstractC11077sn0.m24786n(arrayList);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4369Ac
    /* renamed from: d */
    public final List<Consumer<Location>> mo19193d() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f29866b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            LocationServiceExtension locationServiceExtension = ((ModuleServiceEntryPoint) it.next()).getLocationServiceExtension();
            Consumer<Location> locationConsumer = locationServiceExtension != null ? locationServiceExtension.getLocationConsumer() : null;
            if (locationConsumer != null) {
                arrayList.add(locationConsumer);
            }
        }
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4369Ac
    /* renamed from: e */
    public final ModuleLocationSourcesServiceController mo19194e() {
        ModuleLocationSourcesServiceController locationSourcesController;
        Iterator it = this.f29866b.iterator();
        do {
            locationSourcesController = null;
            if (!it.hasNext()) {
                break;
            }
            LocationServiceExtension locationServiceExtension = ((ModuleServiceEntryPoint) it.next()).getLocationServiceExtension();
            if (locationServiceExtension != null) {
                locationSourcesController = locationServiceExtension.getLocationSourcesController();
            }
        } while (locationSourcesController == null);
        return locationSourcesController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4369Ac
    /* renamed from: f */
    public final Toggle mo19195f() {
        Toggle locationControllerAppStateToggle;
        Iterator it = this.f29866b.iterator();
        do {
            locationControllerAppStateToggle = null;
            if (!it.hasNext()) {
                break;
            }
            LocationServiceExtension locationServiceExtension = ((ModuleServiceEntryPoint) it.next()).getLocationServiceExtension();
            if (locationServiceExtension != null) {
                locationControllerAppStateToggle = locationServiceExtension.getLocationControllerAppStateToggle();
            }
        } while (locationControllerAppStateToggle == null);
        return locationControllerAppStateToggle;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4369Ac
    /* renamed from: g */
    public final List<String> mo19196g() {
        List<String> features;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f29866b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = ((ModuleServiceEntryPoint) it.next()).getRemoteConfigExtensionConfiguration();
            if (remoteConfigExtensionConfiguration == null || (features = remoteConfigExtensionConfiguration.getFeatures()) == null) {
                features = C0779MN.f7117a;
            }
            AbstractC0246Du.m1920m(arrayList, features);
        }
        return arrayList;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.f29867c.getAskForPermissionStrategy();
    }

    /* renamed from: h */
    public final Bundle m19209h() {
        Bundle bundle = new Bundle();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.f29866b) {
            ClientConfigProvider clientConfigProvider = moduleServiceEntryPoint.getClientConfigProvider();
            Bundle configBundleForClient = clientConfigProvider != null ? clientConfigProvider.getConfigBundleForClient() : null;
            if (configBundleForClient != null) {
                bundle.putBundle(moduleServiceEntryPoint.getIdentifier(), configBundleForClient);
            }
        }
        return bundle;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4369Ac
    /* renamed from: a */
    public final List<ModuleServicesDatabase> mo19190a() {
        Object objValueOf;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f29866b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                ModuleServicesDatabase moduleServicesDatabase = moduleServiceEntryPoint.getModuleServicesDatabase();
                objValueOf = moduleServicesDatabase != null ? Boolean.valueOf(arrayList.add(moduleServicesDatabase)) : null;
            } catch (Throwable th) {
                hashSet.add(moduleServiceEntryPoint);
                String identifier = moduleServiceEntryPoint.getIdentifier();
                C5128fj c5128fj = AbstractC4499Fi.f30148a;
                Map mapM24984c = AbstractC11205tn0.m24984c(new Pair(identifier, AbstractC11205tn0.m24984c(new Pair("db", I02.m3691e(th)))));
                c5128fj.getClass();
                c5128fj.m20394a(new C5078dj("service_module_errors", mapM24984c));
                objValueOf = C8313Tf1.f11463a;
            }
            if (objValueOf != null) {
                arrayList2.add(objValueOf);
            }
        }
        this.f29866b.removeAll(hashSet);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void m19207a(ModuleServiceEntryPoint<Object> moduleServiceEntryPoint) {
        this.f29866b.add(moduleServiceEntryPoint);
        if (O90.m5963a(this.f29865a, moduleServiceEntryPoint.getIdentifier()) && (moduleServiceEntryPoint instanceof AskForPermissionStrategyModuleProvider)) {
            this.f29867c = (AskForPermissionStrategyModuleProvider) moduleServiceEntryPoint;
        }
    }

    /* renamed from: a */
    public final void m19208a(ServiceContext serviceContext, C5155gl c5155gl) {
        HashSet hashSet = new HashSet();
        Iterator it = this.f29866b.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                moduleServiceEntryPoint.initServiceSide(serviceContext, new C5628zj(new SdkIdentifiers(c5155gl.f31785d, c5155gl.f31782a, c5155gl.f31783b), new C5025bg(c5155gl.f31803v, c5155gl.f31802u), c5155gl.f31780B.get(moduleServiceEntryPoint.getIdentifier())));
                ModuleEventServiceHandlerFactory moduleEventServiceHandlerFactory = moduleServiceEntryPoint.getModuleEventServiceHandlerFactory();
                if (moduleEventServiceHandlerFactory != null) {
                    C4469Ec c4469Ec = C5244ka.f32038C.f32060t;
                    String identifier = moduleServiceEntryPoint.getIdentifier();
                    synchronized (c4469Ec) {
                        c4469Ec.f30068a.put(identifier, moduleEventServiceHandlerFactory);
                    }
                } else {
                    continue;
                }
            } catch (Throwable th) {
                String identifier2 = moduleServiceEntryPoint.getIdentifier();
                C5128fj c5128fj = AbstractC4499Fi.f30148a;
                Map mapM24984c = AbstractC11205tn0.m24984c(new Pair(identifier2, AbstractC11205tn0.m24984c(new Pair("init", I02.m3691e(th)))));
                c5128fj.getClass();
                c5128fj.m20394a(new C5078dj("service_module_errors", mapM24984c));
                hashSet.add(moduleServiceEntryPoint);
            }
        }
        this.f29866b.removeAll(hashSet);
    }
}
