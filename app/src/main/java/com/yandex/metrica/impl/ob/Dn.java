package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class Dn extends Cn<byte[]> {
    public Dn(int i, String str, Im im) {
        super(i, str, im);
    }

    @Override // com.yandex.metrica.impl.ob.Pn
    public Object a(Object obj) {
        byte[] bArr = (byte[]) obj;
        if (bArr == null || bArr.length <= super.b()) {
            return bArr;
        }
        byte[] bArr2 = new byte[super.b()];
        System.arraycopy(bArr, 0, bArr2, 0, super.b());
        if (this.c.c()) {
            this.c.c("\"%s\" %s exceeded limit of %d bytes", super.a(), bArr, Integer.valueOf(super.b()));
        }
        return bArr2;
    }
}
