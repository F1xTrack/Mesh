package io.appmetrica.analytics.impl;

import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC6099nZ;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Uc extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ C4425ab a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uc(C4425ab c4425ab) {
        super(1);
        this.a = c4425ab;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        Ic ic = (Ic) ((Map.Entry) obj).getValue();
        return ic.b.parse(this.a);
    }
}
