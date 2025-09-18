package p000;

import kotlin.KotlinVersion;

/* renamed from: b30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8803b30 {

    /* renamed from: a */
    public static final char[] f16723a = "0123456789ABCDEF".toCharArray();

    /* renamed from: a */
    public static byte[] m10418a(String str) {
        char[] charArray = str.toCharArray();
        if ((charArray.length & 1) != 0) {
            throw new IllegalArgumentException("Odd number of characters.");
        }
        byte[] bArr = new byte[charArray.length >> 1];
        int i = 0;
        int i2 = 0;
        while (i < charArray.length) {
            int iDigit = Character.digit(charArray[i], 16);
            if (iDigit == -1) {
                throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Illegal hexadecimal character at index "));
            }
            int i3 = i + 1;
            int iDigit2 = Character.digit(charArray[i3], 16);
            if (iDigit2 == -1) {
                throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i3, "Illegal hexadecimal character at index "));
            }
            i += 2;
            bArr[i2] = (byte) (((iDigit << 4) | iDigit2) & KotlinVersion.MAX_COMPONENT_VALUE);
            i2++;
        }
        return bArr;
    }

    /* renamed from: b */
    public static String m10419b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = f16723a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
