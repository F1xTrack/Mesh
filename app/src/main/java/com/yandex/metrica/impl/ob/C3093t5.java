package com.yandex.metrica.impl.ob;

import com.yandex.metrica.IReporter;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.t5 */
/* loaded from: classes2.dex */
public class C3093t5 extends AbstractC3068s5 {
    private final IReporter b;

    public C3093t5(C2744f4 c2744f4, IReporter iReporter) {
        super(c2744f4);
        this.b = iReporter;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2944n5
    public boolean a(C2864k0 c2864k0) {
        Z6 z6A = Z6.a(c2864k0.n());
        HashMap map = new HashMap();
        map.put("type", z6A.a);
        map.put("delivery_method", z6A.b);
        this.b.reportEvent("crash_saved", map);
        return false;
    }
}
