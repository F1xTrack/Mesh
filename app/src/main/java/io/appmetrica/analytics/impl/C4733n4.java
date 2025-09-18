package io.appmetrica.analytics.impl;

import android.os.Bundle;
import defpackage.AbstractC7287tn0;
import defpackage.I02;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.impl.n4 */
/* loaded from: classes2.dex */
public final class C4733n4 {
    public final C4709m4 a = new C4709m4();
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public L5 c;

    public static void a(String str, String str2, Throwable th) {
        C4557fj c4557fj = Fi.a;
        Map mapC = AbstractC7287tn0.c(new Pair(str, AbstractC7287tn0.c(new Pair(str2, I02.e(th)))));
        c4557fj.getClass();
        c4557fj.a(new C4508dj("client_module_errors", mapC));
    }

    public final void b() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.onActivated();
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "onActivated", th);
            }
        }
    }

    public final void a(ModuleClientEntryPoint<Object> moduleClientEntryPoint) {
        this.b.add(moduleClientEntryPoint);
    }

    public final void a(L5 l5) {
        this.c = l5;
        HashSet hashSet = new HashSet();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.initClientSide(l5);
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "initClientSide", th);
                hashSet.add(moduleClientEntryPoint);
            }
        }
        this.b.removeAll(hashSet);
    }

    public final ModuleAdRevenueProcessor a() {
        O5 o5;
        L5 l5 = this.c;
        if (l5 == null || (o5 = ((Z3) l5).b) == null) {
            return null;
        }
        return o5.b;
    }

    public final void a(Bundle bundle, SdkIdentifiers sdkIdentifiers) {
        if (bundle == null) {
            return;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                ServiceConfigExtensionConfiguration serviceConfigExtensionConfiguration = moduleClientEntryPoint.getServiceConfigExtensionConfiguration();
                if (serviceConfigExtensionConfiguration != null) {
                    ServiceConfigUpdateListener serviceConfigUpdateListener = serviceConfigExtensionConfiguration.getServiceConfigUpdateListener();
                    C4709m4 c4709m4 = this.a;
                    String identifier = moduleClientEntryPoint.getIdentifier();
                    c4709m4.getClass();
                    Bundle bundle2 = bundle.getBundle(identifier);
                    C4685l4 c4685l4 = bundle2 != null ? new C4685l4(sdkIdentifiers, serviceConfigExtensionConfiguration.getBundleConverter().fromBundle(bundle2)) : null;
                    if (c4685l4 != null) {
                        serviceConfigUpdateListener.onServiceConfigUpdated(c4685l4);
                    }
                }
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "notifyModulesWithConfig", th);
            }
        }
    }
}
