package io.appmetrica.analytics.impl;

import java.util.Map;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6497nZ;

/* renamed from: io.appmetrica.analytics.impl.Uc */
/* loaded from: classes2.dex */
public final class C4852Uc extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: a */
    public final /* synthetic */ C4995ab f30809a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4852Uc(C4995ab c4995ab) {
        super(1);
        this.f30809a = c4995ab;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        C4565Ic c4565Ic = (C4565Ic) ((Map.Entry) obj).getValue();
        return c4565Ic.f30281b.parse(this.f30809a);
    }
}
