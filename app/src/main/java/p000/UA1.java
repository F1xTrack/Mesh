package p000;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class UA1 extends YA1 implements Serializable {

    /* renamed from: b */
    public final byte[] f11672b;

    public UA1(byte[] bArr) {
        bArr.getClass();
        this.f11672b = bArr;
    }

    @Override // p000.YA1
    /* renamed from: a */
    public final int mo7926a() {
        byte[] bArr = this.f11672b;
        int length = bArr.length;
        if (length >= 4) {
            return ((bArr[1] & 255) << 8) | (bArr[0] & 255) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24);
        }
        throw new IllegalStateException(I12.m3732b("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
    }
}
