package p000;

import java.util.ArrayList;

/* renamed from: t41, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11116t41 extends AbstractC8257Sd1 {

    /* renamed from: c */
    public final /* synthetic */ ArrayList f42824c;

    public C11116t41(ArrayList arrayList) {
        this.f42824c = arrayList;
    }

    @Override // p000.AbstractC8257Sd1
    /* renamed from: g */
    public final AbstractC10804qe1 mo7051g(InterfaceC8101Pd1 interfaceC8101Pd1) {
        O90.m5968f(interfaceC8101Pd1, "key");
        if (!this.f42824c.contains(interfaceC8101Pd1)) {
            return null;
        }
        InterfaceC0873Ns interfaceC0873NsMo1962a = interfaceC8101Pd1.mo1962a();
        O90.m5966d(interfaceC0873NsMo1962a, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        return AbstractC7375Be1.m792j((InterfaceC10292me1) interfaceC0873NsMo1962a);
    }
}
