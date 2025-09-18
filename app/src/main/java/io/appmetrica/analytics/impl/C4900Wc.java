package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.Wc */
/* loaded from: classes2.dex */
public final class C4900Wc {
    /* renamed from: a */
    public static void m19950a() {
        Iterator it = C5388q4.m20928h().f32430m.m19269a().iterator();
        while (it.hasNext()) {
            Object objLoadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor((String) it.next(), ModuleClientEntryPoint.class);
            if (objLoadAndInstantiateClassWithDefaultConstructor != null) {
                C5388q4.m20928h().m20939j().f32241b.add((ModuleClientEntryPoint) objLoadAndInstantiateClassWithDefaultConstructor);
            }
        }
    }
}
