package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.ln */
/* loaded from: classes2.dex */
public class C2912ln {
    private final Fm<EnumC2937mn, InterfaceC2887kn> a;
    private final Fm<EnumC2865k1, InterfaceC2887kn> b;

    public C2912ln() {
        this(new C2837in(), new C2962nn(), new C2763fn());
    }

    public InterfaceC2887kn a(EnumC2937mn enumC2937mn) {
        return this.a.a(enumC2937mn);
    }

    public C2912ln(InterfaceC2887kn interfaceC2887kn, InterfaceC2887kn interfaceC2887kn2, InterfaceC2887kn interfaceC2887kn3) {
        Fm<EnumC2937mn, InterfaceC2887kn> fm = new Fm<>(interfaceC2887kn);
        this.a = fm;
        fm.a(EnumC2937mn.NONE, interfaceC2887kn);
        fm.a(EnumC2937mn.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, interfaceC2887kn2);
        fm.a(EnumC2937mn.AES_VALUE_ENCRYPTION, interfaceC2887kn3);
        Fm<EnumC2865k1, InterfaceC2887kn> fm2 = new Fm<>(interfaceC2887kn);
        this.b = fm2;
        fm2.a(EnumC2865k1.EVENT_TYPE_IDENTITY, interfaceC2887kn3);
    }

    public InterfaceC2887kn a(C2864k0 c2864k0) {
        return this.b.a(EnumC2865k1.a(c2864k0.n()));
    }
}
