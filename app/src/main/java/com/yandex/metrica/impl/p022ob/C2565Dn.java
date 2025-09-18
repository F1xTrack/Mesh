package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.Dn */
/* loaded from: classes2.dex */
public class C2565Dn extends AbstractC2540Cn<byte[]> {
    public C2565Dn(int i, String str, C2689Im c2689Im) {
        super(i, str, c2689Im);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2865Pn
    /* renamed from: a */
    public Object mo14016a(Object obj) {
        byte[] bArr = (byte[]) obj;
        if (bArr == null || bArr.length <= super.m13974b()) {
            return bArr;
        }
        byte[] bArr2 = new byte[super.m13974b()];
        System.arraycopy(bArr, 0, bArr2, 0, super.m13974b());
        if (this.f20990c.m17370c()) {
            this.f20990c.m17369c("\"%s\" %s exceeded limit of %d bytes", super.m13973a(), bArr, Integer.valueOf(super.m13974b()));
        }
        return bArr2;
    }
}
