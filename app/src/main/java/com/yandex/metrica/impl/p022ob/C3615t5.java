package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.IReporter;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.t5 */
/* loaded from: classes2.dex */
public class C3615t5 extends AbstractC3589s5 {

    /* renamed from: b */
    private final IReporter f24794b;

    public C3615t5(C3250f4 c3250f4, IReporter iReporter) {
        super(c3250f4);
        this.f24794b = iReporter;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3459n5
    /* renamed from: a */
    public boolean mo13844a(C3376k0 c3376k0) {
        C3097Z6 c3097z6M15537a = C3097Z6.m15537a(c3376k0.m16244n());
        HashMap map = new HashMap();
        map.put("type", c3097z6M15537a.f22936a);
        map.put("delivery_method", c3097z6M15537a.f22937b);
        this.f24794b.reportEvent("crash_saved", map);
        return false;
    }
}
