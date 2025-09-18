package defpackage;

import kotlin.KotlinVersion;

/* renamed from: b30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2252b30 {
    public static final char[] a = "0123456789ABCDEF".toCharArray();

    public static byte[] a(String str) {
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
                throw new IllegalArgumentException(AbstractC7209tN0.u(i, "Illegal hexadecimal character at index "));
            }
            int i3 = i + 1;
            int iDigit2 = Character.digit(charArray[i3], 16);
            if (iDigit2 == -1) {
                throw new IllegalArgumentException(AbstractC7209tN0.u(i3, "Illegal hexadecimal character at index "));
            }
            i += 2;
            bArr[i2] = (byte) (((iDigit << 4) | iDigit2) & KotlinVersion.MAX_COMPONENT_VALUE);
            i2++;
        }
        return bArr;
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
