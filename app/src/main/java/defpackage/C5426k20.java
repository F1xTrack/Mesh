package defpackage;

import android.util.Size;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: k20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5426k20 {
    public static final byte[] e = {0, 0, 1};
    public int a;
    public int b;
    public boolean c;
    public Serializable d;

    public Size a(Y60 y60) {
        int iN0 = y60.n0(0);
        Size sizeS = y60.S();
        if (sizeS == null) {
            return sizeS;
        }
        int iB = AbstractC4346iR1.b(AbstractC4346iR1.d(iN0), this.a, 1 == this.b);
        return (iB == 90 || iB == 270) ? new Size(sizeS.getHeight(), sizeS.getWidth()) : sizeS;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [byte[], java.io.Serializable] */
    public void b(byte[] bArr, int i, int i2) {
        if (this.c) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.d;
            int length = bArr2.length;
            int i4 = this.a + i3;
            if (length < i4) {
                this.d = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.d, this.a, i3);
            this.a += i3;
        }
    }
}
