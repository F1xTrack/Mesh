package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.ba */
/* loaded from: classes2.dex */
public final class C5019ba {

    /* renamed from: d */
    public static final C5019ba f31313d = new C5019ba();

    /* renamed from: a */
    public final C4900Wc f31314a = new C4900Wc();

    /* renamed from: b */
    public final ServiceComponentsInitializer f31315b = AbstractC5303mj.m20757a();

    /* renamed from: c */
    public boolean f31316c = false;

    /* renamed from: a */
    public final void m20166a(Context context) {
        C5244ka.m20613a(context);
        this.f31315b.onCreate(context);
        this.f31314a.getClass();
        Iterator it = C5244ka.f32038C.f32059s.m19269a().iterator();
        while (it.hasNext()) {
            Object objLoadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor((String) it.next(), ModuleServiceEntryPoint.class);
            if (objLoadAndInstantiateClassWithDefaultConstructor != null) {
                C5244ka.f32038C.m20628m().m19207a((ModuleServiceEntryPoint<Object>) objLoadAndInstantiateClassWithDefaultConstructor);
            }
        }
        new C5553wj(C5244ka.m20614h().m20615A().m21190b()).m21129a(context);
        C5244ka.f32038C.m20629n().m20034a();
    }

    /* renamed from: b */
    public final void m20167b(Context context) {
        if (this.f31316c) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f31316c) {
                    m20166a(context);
                    this.f31316c = true;
                }
            } finally {
            }
        }
    }
}
