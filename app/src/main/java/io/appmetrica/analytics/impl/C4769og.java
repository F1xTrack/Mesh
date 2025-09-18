package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.IReporter;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.og */
/* loaded from: classes2.dex */
public final class C4769og extends AbstractC4625ig {
    public final IReporter b;

    public C4769og(C4567g5 c4567g5, IReporter iReporter) {
        super(c4567g5);
        this.b = iReporter;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4625ig
    public final boolean a(T5 t5) {
        C4836rc c4836rc = (C4836rc) C4836rc.c.get(t5.d);
        HashMap map = new HashMap();
        map.put("type", c4836rc.a);
        map.put("delivery_method", c4836rc.b);
        this.b.reportEvent("crash_saved", map);
        return false;
    }
}
