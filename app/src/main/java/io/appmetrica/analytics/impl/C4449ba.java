package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.ba */
/* loaded from: classes2.dex */
public final class C4449ba {
    public static final C4449ba d = new C4449ba();
    public final Wc a = new Wc();
    public final ServiceComponentsInitializer b = AbstractC4724mj.a();
    public boolean c = false;

    public final void a(Context context) {
        C4667ka.a(context);
        this.b.onCreate(context);
        this.a.getClass();
        Iterator it = C4667ka.C.s.a().iterator();
        while (it.hasNext()) {
            Object objLoadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor((String) it.next(), ModuleServiceEntryPoint.class);
            if (objLoadAndInstantiateClassWithDefaultConstructor != null) {
                C4667ka.C.m().a((ModuleServiceEntryPoint<Object>) objLoadAndInstantiateClassWithDefaultConstructor);
            }
        }
        new C4963wj(C4667ka.h().A().b()).a(context);
        C4667ka.C.n().a();
    }

    public final void b(Context context) {
        if (this.c) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.c) {
                    a(context);
                    this.c = true;
                }
            } finally {
            }
        }
    }
}
