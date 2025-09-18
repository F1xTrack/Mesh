package defpackage;

import java.io.UnsupportedEncodingException;

/* renamed from: fn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3839fn1 {
    public static boolean a = false;
    public static final byte[] b = a("RIFF");
    public static final byte[] c = a("WEBP");
    public static final byte[] d = a("VP8 ");
    public static final byte[] e = a("VP8L");
    public static final byte[] f = a("VP8X");

    public static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII not found!", e2);
        }
    }

    public static boolean b(int i, byte[] bArr) {
        return i >= 20 && c(0, bArr, b) && c(8, bArr, c);
    }

    public static boolean c(int i, byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
