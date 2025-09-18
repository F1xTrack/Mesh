package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2845P3;
import java.util.Map;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.O3 */
/* loaded from: classes2.dex */
public final class C2820O3 implements InterfaceC3246f0<Map<String, ? extends String>> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3246f0, p000.InterfaceC6497nZ
    public Object invoke(Object obj) {
        C2842P0 c2842p0M14728i = C2842P0.m14728i();
        O90.m5967e(c2842p0M14728i, "GlobalServiceLocator.getInstance()");
        return Boolean.valueOf(c2842p0M14728i.m14735e().m13876b(new C2845P3.a((Map) obj, EnumC2567E0.RETAIL)));
    }
}
