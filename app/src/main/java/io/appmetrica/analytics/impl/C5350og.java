package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.IReporter;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.og */
/* loaded from: classes2.dex */
public final class C5350og extends AbstractC5200ig {

    /* renamed from: b */
    public final IReporter f32350b;

    public C5350og(C5139g5 c5139g5, IReporter iReporter) {
        super(c5139g5);
        this.f32350b = iReporter;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5200ig
    /* renamed from: a */
    public final boolean mo19341a(C4821T5 c4821t5) {
        C5421rc c5421rc = (C5421rc) C5421rc.f32505c.get(c4821t5.f30764d);
        HashMap map = new HashMap();
        map.put("type", c5421rc.f32506a);
        map.put("delivery_method", c5421rc.f32507b);
        this.f32350b.reportEvent("crash_saved", map);
        return false;
    }
}
