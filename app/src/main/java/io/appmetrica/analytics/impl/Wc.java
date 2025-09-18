package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class Wc {
    public static void a() {
        Iterator it = C4805q4.h().m.a().iterator();
        while (it.hasNext()) {
            Object objLoadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor((String) it.next(), ModuleClientEntryPoint.class);
            if (objLoadAndInstantiateClassWithDefaultConstructor != null) {
                C4805q4.h().j().b.add((ModuleClientEntryPoint) objLoadAndInstantiateClassWithDefaultConstructor);
            }
        }
    }
}
