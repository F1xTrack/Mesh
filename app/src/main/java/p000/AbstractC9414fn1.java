package p000;

import java.io.UnsupportedEncodingException;

/* renamed from: fn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9414fn1 {

    /* renamed from: a */
    public static boolean f27381a = false;

    /* renamed from: b */
    public static final byte[] f27382b = m18293a("RIFF");

    /* renamed from: c */
    public static final byte[] f27383c = m18293a("WEBP");

    /* renamed from: d */
    public static final byte[] f27384d = m18293a("VP8 ");

    /* renamed from: e */
    public static final byte[] f27385e = m18293a("VP8L");

    /* renamed from: f */
    public static final byte[] f27386f = m18293a("VP8X");

    /* renamed from: a */
    public static byte[] m18293a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    /* renamed from: b */
    public static boolean m18294b(int i, byte[] bArr) {
        return i >= 20 && m18295c(0, bArr, f27382b) && m18295c(8, bArr, f27383c);
    }

    /* renamed from: c */
    public static boolean m18295c(int i, byte[] bArr, byte[] bArr2) {
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
