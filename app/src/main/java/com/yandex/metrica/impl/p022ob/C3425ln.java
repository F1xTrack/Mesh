package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.ln */
/* loaded from: classes2.dex */
public class C3425ln {

    /* renamed from: a */
    private final C2614Fm<EnumC3451mn, InterfaceC3399kn> f24231a;

    /* renamed from: b */
    private final C2614Fm<EnumC3377k1, InterfaceC3399kn> f24232b;

    public C3425ln() {
        this(new C3347in(), new C3477nn(), new C3269fn());
    }

    /* renamed from: a */
    public InterfaceC3399kn m16422a(EnumC3451mn enumC3451mn) {
        return this.f24231a.m14144a(enumC3451mn);
    }

    public C3425ln(InterfaceC3399kn interfaceC3399kn, InterfaceC3399kn interfaceC3399kn2, InterfaceC3399kn interfaceC3399kn3) {
        C2614Fm<EnumC3451mn, InterfaceC3399kn> c2614Fm = new C2614Fm<>(interfaceC3399kn);
        this.f24231a = c2614Fm;
        c2614Fm.m14146a(EnumC3451mn.NONE, interfaceC3399kn);
        c2614Fm.m14146a(EnumC3451mn.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, interfaceC3399kn2);
        c2614Fm.m14146a(EnumC3451mn.AES_VALUE_ENCRYPTION, interfaceC3399kn3);
        C2614Fm<EnumC3377k1, InterfaceC3399kn> c2614Fm2 = new C2614Fm<>(interfaceC3399kn);
        this.f24232b = c2614Fm2;
        c2614Fm2.m14146a(EnumC3377k1.EVENT_TYPE_IDENTITY, interfaceC3399kn3);
    }

    /* renamed from: a */
    public InterfaceC3399kn m16421a(C3376k0 c3376k0) {
        return this.f24232b.m14144a(EnumC3377k1.m16248a(c3376k0.m16244n()));
    }
}
