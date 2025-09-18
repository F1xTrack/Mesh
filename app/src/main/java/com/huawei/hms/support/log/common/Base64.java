package com.huawei.hms.support.log.common;

/* loaded from: classes2.dex */
public final class Base64 {

    /* renamed from: a */
    private static final char[] f19570a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/', '='};

    /* renamed from: b */
    private static final byte[] f19571b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    private Base64() {
    }

    /* renamed from: a */
    private static int m12624a(String str) {
        int length = str.length();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt > 255 || f19571b[cCharAt] < 0) {
                length--;
            }
        }
        return length;
    }

    public static byte[] decode(String str) {
        if (str == null) {
            return new byte[0];
        }
        int iM12624a = m12624a(str);
        int i = (iM12624a / 4) * 3;
        int i2 = iM12624a % 4;
        if (i2 == 3) {
            i += 2;
        }
        if (i2 == 2) {
            i++;
        }
        byte[] bArr = new byte[i];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < str.length(); i6++) {
            char cCharAt = str.charAt(i6);
            byte b = cCharAt > 255 ? (byte) -1 : f19571b[cCharAt];
            if (b >= 0) {
                int i7 = i5 + 6;
                i4 = (i4 << 6) | b;
                if (i7 >= 8) {
                    i5 -= 2;
                    bArr[i3] = (byte) (255 & (i4 >> i5));
                    i3++;
                } else {
                    i5 = i7;
                }
            }
        }
        return i3 != i ? new byte[0] : bArr;
    }

    public static String encode(byte[] bArr) {
        return bArr == null ? "" : encode(bArr, bArr.length);
    }

    public static String encode(byte[] bArr, int i) {
        boolean z;
        if (bArr == null) {
            return "";
        }
        char[] cArr = new char[((i + 2) / 3) * 4];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = (bArr[i2] & 255) << 8;
            int i5 = i2 + 1;
            boolean z2 = true;
            if (i5 < i) {
                i4 |= bArr[i5] & 255;
                z = true;
            } else {
                z = false;
            }
            int i6 = i4 << 8;
            int i7 = i2 + 2;
            if (i7 < i) {
                i6 |= bArr[i7] & 255;
            } else {
                z2 = false;
            }
            int i8 = i3 + 3;
            char[] cArr2 = f19570a;
            int i9 = 64;
            cArr[i8] = cArr2[z2 ? i6 & 63 : 64];
            int i10 = i6 >> 6;
            int i11 = i3 + 2;
            if (z) {
                i9 = i10 & 63;
            }
            cArr[i11] = cArr2[i9];
            cArr[i3 + 1] = cArr2[(i6 >> 12) & 63];
            cArr[i3] = cArr2[(i6 >> 18) & 63];
            i2 += 3;
            i3 += 4;
        }
        return new String(cArr);
    }
}
