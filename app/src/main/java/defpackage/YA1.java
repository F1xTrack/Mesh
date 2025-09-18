package defpackage;

/* loaded from: classes.dex */
public abstract class YA1 {
    public static final char[] a = "0123456789abcdef".toCharArray();

    public abstract int a();

    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof YA1) {
            YA1 ya1 = (YA1) obj;
            byte[] bArr = ((UA1) this).b;
            if (bArr.length * 8 == ((UA1) ya1).b.length * 8) {
                byte[] bArr2 = ((UA1) ya1).b;
                if (bArr.length == bArr2.length) {
                    z = true;
                    for (int i = 0; i < bArr.length; i++) {
                        z &= bArr[i] == bArr2[i];
                    }
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((UA1) this).b;
        if (bArr.length * 8 >= 32) {
            return a();
        }
        int i = bArr[0] & 255;
        for (int i2 = 1; i2 < bArr.length; i2++) {
            i |= (bArr[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] bArr = ((UA1) this).b;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            char[] cArr = a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
