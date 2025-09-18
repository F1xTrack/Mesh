package p000;

/* renamed from: eT */
/* loaded from: classes2.dex */
public final class C3992eT implements InterfaceC1160SR {
    @Override // p000.InterfaceC1160SR
    /* renamed from: a */
    public EnumC1035QR mo7369a() {
        return EnumC1035QR.f9623c;
    }

    @Override // p000.InterfaceC1160SR
    /* renamed from: b */
    public EnumC1097RR mo7370b(InterfaceC7032vl interfaceC7032vl, InterfaceC7032vl interfaceC7032vl2, InterfaceC6976us interfaceC6976us) {
        O90.m5968f(interfaceC7032vl, "superDescriptor");
        O90.m5968f(interfaceC7032vl2, "subDescriptor");
        boolean z = interfaceC7032vl2 instanceof CE0;
        EnumC1097RR enumC1097RR = EnumC1097RR.f10177c;
        if (!z || !(interfaceC7032vl instanceof CE0)) {
            return enumC1097RR;
        }
        CE0 ce0 = (CE0) interfaceC7032vl2;
        CE0 ce02 = (CE0) interfaceC7032vl;
        return !O90.m5963a(ce0.getName(), ce02.getName()) ? enumC1097RR : (H22.m3245a(ce0) && H22.m3245a(ce02)) ? EnumC1097RR.f10175a : (H22.m3245a(ce0) || H22.m3245a(ce02)) ? EnumC1097RR.f10176b : enumC1097RR;
    }
}
