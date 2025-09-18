package io.appmetrica.analytics.impl;

import android.os.Bundle;
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
import p000.AbstractC11205tn0;
import p000.I02;

/* renamed from: io.appmetrica.analytics.impl.n4 */
/* loaded from: classes2.dex */
public final class C5313n4 {

    /* renamed from: a */
    public final C5288m4 f32240a = new C5288m4();

    /* renamed from: b */
    public final CopyOnWriteArrayList f32241b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public InterfaceC4630L5 f32242c;

    /* renamed from: a */
    public static void m20795a(String str, String str2, Throwable th) {
        C5128fj c5128fj = AbstractC4499Fi.f30148a;
        Map mapM24984c = AbstractC11205tn0.m24984c(new Pair(str, AbstractC11205tn0.m24984c(new Pair(str2, I02.m3691e(th)))));
        c5128fj.getClass();
        c5128fj.m20394a(new C5078dj("client_module_errors", mapM24984c));
    }

    /* renamed from: b */
    public final void m20800b() {
        Iterator it = this.f32241b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.onActivated();
            } catch (Throwable th) {
                m20795a(moduleClientEntryPoint.getIdentifier(), "onActivated", th);
            }
        }
    }

    /* renamed from: a */
    public final void m20799a(ModuleClientEntryPoint<Object> moduleClientEntryPoint) {
        this.f32241b.add(moduleClientEntryPoint);
    }

    /* renamed from: a */
    public final void m20798a(InterfaceC4630L5 interfaceC4630L5) {
        this.f32242c = interfaceC4630L5;
        HashSet hashSet = new HashSet();
        Iterator it = this.f32241b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.initClientSide(interfaceC4630L5);
            } catch (Throwable th) {
                m20795a(moduleClientEntryPoint.getIdentifier(), "initClientSide", th);
                hashSet.add(moduleClientEntryPoint);
            }
        }
        this.f32241b.removeAll(hashSet);
    }

    /* renamed from: a */
    public final ModuleAdRevenueProcessor m20796a() {
        C4702O5 c4702o5;
        InterfaceC4630L5 interfaceC4630L5 = this.f32242c;
        if (interfaceC4630L5 == null || (c4702o5 = ((C4963Z3) interfaceC4630L5).f31142b) == null) {
            return null;
        }
        return c4702o5.f30549b;
    }

    /* renamed from: a */
    public final void m20797a(Bundle bundle, SdkIdentifiers sdkIdentifiers) {
        if (bundle == null) {
            return;
        }
        Iterator it = this.f32241b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                ServiceConfigExtensionConfiguration serviceConfigExtensionConfiguration = moduleClientEntryPoint.getServiceConfigExtensionConfiguration();
                if (serviceConfigExtensionConfiguration != null) {
                    ServiceConfigUpdateListener serviceConfigUpdateListener = serviceConfigExtensionConfiguration.getServiceConfigUpdateListener();
                    C5288m4 c5288m4 = this.f32240a;
                    String identifier = moduleClientEntryPoint.getIdentifier();
                    c5288m4.getClass();
                    Bundle bundle2 = bundle.getBundle(identifier);
                    C5263l4 c5263l4 = bundle2 != null ? new C5263l4(sdkIdentifiers, serviceConfigExtensionConfiguration.getBundleConverter().fromBundle(bundle2)) : null;
                    if (c5263l4 != null) {
                        serviceConfigUpdateListener.onServiceConfigUpdated(c5263l4);
                    }
                }
            } catch (Throwable th) {
                m20795a(moduleClientEntryPoint.getIdentifier(), "notifyModulesWithConfig", th);
            }
        }
    }
}
