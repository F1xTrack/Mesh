package defpackage;

import java.util.ArrayList;

/* renamed from: t41, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7153t41 extends AbstractC1434Sd1 {
    public final /* synthetic */ ArrayList c;

    public C7153t41(ArrayList arrayList) {
        this.c = arrayList;
    }

    @Override // defpackage.AbstractC1434Sd1
    public final AbstractC6689qe1 g(InterfaceC1200Pd1 interfaceC1200Pd1) {
        O90.f(interfaceC1200Pd1, "key");
        if (!this.c.contains(interfaceC1200Pd1)) {
            return null;
        }
        InterfaceC1087Ns interfaceC1087NsA = interfaceC1200Pd1.a();
        O90.d(interfaceC1087NsA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        return AbstractC0112Be1.j((InterfaceC5925me1) interfaceC1087NsA);
    }
}
