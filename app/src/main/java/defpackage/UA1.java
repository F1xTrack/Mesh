package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class UA1 extends YA1 implements Serializable {
    public final byte[] b;

    public UA1(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    @Override // defpackage.YA1
    public final int a() {
        byte[] bArr = this.b;
        int length = bArr.length;
        if (length >= 4) {
            return ((bArr[1] & 255) << 8) | (bArr[0] & 255) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24);
        }
        throw new IllegalStateException(I12.b("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
    }
}
