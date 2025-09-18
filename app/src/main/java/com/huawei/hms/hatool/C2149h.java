package com.huawei.hms.hatool;

/* renamed from: com.huawei.hms.hatool.h */
/* loaded from: classes.dex */
public class C2149h {

    /* renamed from: a */
    private byte[] f19196a;

    /* renamed from: b */
    private int f19197b = 0;

    public C2149h(int i) {
        this.f19196a = null;
        this.f19196a = new byte[i];
    }

    /* renamed from: a */
    public void m12036a(byte[] bArr, int i) {
        if (i <= 0) {
            return;
        }
        byte[] bArr2 = this.f19196a;
        int length = bArr2.length;
        int i2 = this.f19197b;
        if (length - i2 >= i) {
            System.arraycopy(bArr, 0, bArr2, i2, i);
        } else {
            byte[] bArr3 = new byte[(bArr2.length + i) << 1];
            System.arraycopy(bArr2, 0, bArr3, 0, i2);
            System.arraycopy(bArr, 0, bArr3, this.f19197b, i);
            this.f19196a = bArr3;
        }
        this.f19197b += i;
    }

    /* renamed from: b */
    public int m12038b() {
        return this.f19197b;
    }

    /* renamed from: a */
    public byte[] m12037a() {
        int i = this.f19197b;
        if (i <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f19196a, 0, bArr, 0, i);
        return bArr;
    }
}
