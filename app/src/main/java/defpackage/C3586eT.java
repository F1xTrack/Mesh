package defpackage;

/* renamed from: eT, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3586eT implements SR {
    @Override // defpackage.SR
    public QR a() {
        return QR.c;
    }

    @Override // defpackage.SR
    public RR b(InterfaceC7662vl interfaceC7662vl, InterfaceC7662vl interfaceC7662vl2, InterfaceC7492us interfaceC7492us) {
        O90.f(interfaceC7662vl, "superDescriptor");
        O90.f(interfaceC7662vl2, "subDescriptor");
        boolean z = interfaceC7662vl2 instanceof CE0;
        RR rr = RR.c;
        if (!z || !(interfaceC7662vl instanceof CE0)) {
            return rr;
        }
        CE0 ce0 = (CE0) interfaceC7662vl2;
        CE0 ce02 = (CE0) interfaceC7662vl;
        return !O90.a(ce0.getName(), ce02.getName()) ? rr : (H22.a(ce0) && H22.a(ce02)) ? RR.a : (H22.a(ce0) || H22.a(ce02)) ? RR.b : rr;
    }
}
