package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import defpackage.AbstractC0314Du;
import defpackage.AbstractC7096sn0;
import defpackage.AbstractC7287tn0;
import defpackage.C1518Tf1;
import defpackage.I02;
import defpackage.MN;
import defpackage.O90;
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

/* loaded from: classes2.dex */
public final class Aj implements Ac, InterfaceC4702ll, AskForPermissionStrategyModuleProvider {
    public final String a = "rp";
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public volatile AskForPermissionStrategyModuleProvider c = new B7();

    @Override // io.appmetrica.analytics.impl.InterfaceC4702ll
    public final void a(C4583gl c4583gl) {
        SdkIdentifiers sdkIdentifiers = new SdkIdentifiers(c4583gl.e(), c4583gl.a(), c4583gl.b());
        C4455bg c4455bg = new C4455bg(c4583gl.c(), c4583gl.d());
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.b) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
            if (remoteConfigExtensionConfiguration != null) {
                remoteConfigExtensionConfiguration.getRemoteConfigUpdateListener().onRemoteConfigUpdated(new C5035zj(sdkIdentifiers, c4455bg, c4583gl.B.get(moduleServiceEntryPoint.getIdentifier())));
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ac
    public final Map<String, Ic> b() {
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.b;
        ArrayList arrayList = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
            Pair pair = remoteConfigExtensionConfiguration != null ? new Pair(moduleServiceEntryPoint.getIdentifier(), new Ic(remoteConfigExtensionConfiguration)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return AbstractC7096sn0.n(arrayList);
    }

    @Override // io.appmetrica.analytics.impl.Ac
    public final Map<String, Integer> c() {
        Map<String, Integer> blocks;
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = ((ModuleServiceEntryPoint) it.next()).getRemoteConfigExtensionConfiguration();
            AbstractC0314Du.m(arrayList, (remoteConfigExtensionConfiguration == null || (blocks = remoteConfigExtensionConfiguration.getBlocks()) == null) ? MN.a : AbstractC7096sn0.m(blocks));
        }
        return AbstractC7096sn0.n(arrayList);
    }

    @Override // io.appmetrica.analytics.impl.Ac
    public final List<Consumer<Location>> d() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
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

    @Override // io.appmetrica.analytics.impl.Ac
    public final ModuleLocationSourcesServiceController e() {
        ModuleLocationSourcesServiceController locationSourcesController;
        Iterator it = this.b.iterator();
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

    @Override // io.appmetrica.analytics.impl.Ac
    public final Toggle f() {
        Toggle locationControllerAppStateToggle;
        Iterator it = this.b.iterator();
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

    @Override // io.appmetrica.analytics.impl.Ac
    public final List<String> g() {
        List<String> features;
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = ((ModuleServiceEntryPoint) it.next()).getRemoteConfigExtensionConfiguration();
            if (remoteConfigExtensionConfiguration == null || (features = remoteConfigExtensionConfiguration.getFeatures()) == null) {
                features = MN.a;
            }
            AbstractC0314Du.m(arrayList, features);
        }
        return arrayList;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.c.getAskForPermissionStrategy();
    }

    public final Bundle h() {
        Bundle bundle = new Bundle();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.b) {
            ClientConfigProvider clientConfigProvider = moduleServiceEntryPoint.getClientConfigProvider();
            Bundle configBundleForClient = clientConfigProvider != null ? clientConfigProvider.getConfigBundleForClient() : null;
            if (configBundleForClient != null) {
                bundle.putBundle(moduleServiceEntryPoint.getIdentifier(), configBundleForClient);
            }
        }
        return bundle;
    }

    @Override // io.appmetrica.analytics.impl.Ac
    public final List<ModuleServicesDatabase> a() {
        Object objValueOf;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
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
                C4557fj c4557fj = Fi.a;
                Map mapC = AbstractC7287tn0.c(new Pair(identifier, AbstractC7287tn0.c(new Pair("db", I02.e(th)))));
                c4557fj.getClass();
                c4557fj.a(new C4508dj("service_module_errors", mapC));
                objValueOf = C1518Tf1.a;
            }
            if (objValueOf != null) {
                arrayList2.add(objValueOf);
            }
        }
        this.b.removeAll(hashSet);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ModuleServiceEntryPoint<Object> moduleServiceEntryPoint) {
        this.b.add(moduleServiceEntryPoint);
        if (O90.a(this.a, moduleServiceEntryPoint.getIdentifier()) && (moduleServiceEntryPoint instanceof AskForPermissionStrategyModuleProvider)) {
            this.c = (AskForPermissionStrategyModuleProvider) moduleServiceEntryPoint;
        }
    }

    public final void a(ServiceContext serviceContext, C4583gl c4583gl) {
        HashSet hashSet = new HashSet();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                moduleServiceEntryPoint.initServiceSide(serviceContext, new C5035zj(new SdkIdentifiers(c4583gl.d, c4583gl.a, c4583gl.b), new C4455bg(c4583gl.v, c4583gl.u), c4583gl.B.get(moduleServiceEntryPoint.getIdentifier())));
                ModuleEventServiceHandlerFactory moduleEventServiceHandlerFactory = moduleServiceEntryPoint.getModuleEventServiceHandlerFactory();
                if (moduleEventServiceHandlerFactory != null) {
                    Ec ec = C4667ka.C.t;
                    String identifier = moduleServiceEntryPoint.getIdentifier();
                    synchronized (ec) {
                        ec.a.put(identifier, moduleEventServiceHandlerFactory);
                    }
                } else {
                    continue;
                }
            } catch (Throwable th) {
                String identifier2 = moduleServiceEntryPoint.getIdentifier();
                C4557fj c4557fj = Fi.a;
                Map mapC = AbstractC7287tn0.c(new Pair(identifier2, AbstractC7287tn0.c(new Pair("init", I02.e(th)))));
                c4557fj.getClass();
                c4557fj.a(new C4508dj("service_module_errors", mapC));
                hashSet.add(moduleServiceEntryPoint);
            }
        }
        this.b.removeAll(hashSet);
    }
}
