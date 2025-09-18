package io.appmetrica.analytics.impl;

import defpackage.AbstractC8259yu;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;

/* loaded from: classes2.dex */
public final class Gm {
    public final V3 a;
    public final yn b;
    public final ConjunctiveCompositeThreadSafeToggle c;

    public Gm(Toggle toggle) {
        V3 v3 = new V3(C4667ka.h().w());
        this.a = v3;
        yn ynVar = new yn();
        this.b = ynVar;
        this.c = new ConjunctiveCompositeThreadSafeToggle(AbstractC8259yu.f(v3, ynVar, toggle == null ? new rn() : toggle), "loc-def");
    }
}
