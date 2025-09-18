package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.v7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3145v7 implements InterfaceC2725ea<C2996p7, byte[]> {
    private final C3175w7<C2996p7> a;

    public C3145v7() {
        this(new C3175w7(new F7()));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2996p7 a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public byte[] b(C2996p7 c2996p7) {
        return this.a.a(c2996p7);
    }

    public C3145v7(C3175w7<C2996p7> c3175w7) {
        this.a = c3175w7;
    }

    public byte[] a(C2996p7 c2996p7) {
        return this.a.a(c2996p7);
    }
}
