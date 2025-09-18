package p000;

/* renamed from: hW1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9636hW1 {

    /* renamed from: a */
    public static final C8959cG1 f28443a;

    static {
        if (VV1.f12600e) {
            boolean z = VV1.f12599d;
        }
        f28443a = new C8959cG1(4);
    }

    /* renamed from: a */
    public static int m18821a(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new C10148lW1(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException(AbstractC0852NX.m5758g(i3 + 4294967296L, "UTF-8 length does not fit in int: "));
    }

    /* renamed from: b */
    public static int m18822b(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char cCharAt;
        f28443a.getClass();
        int length = str.length();
        int i5 = i2 + i;
        int i6 = 0;
        while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = str.charAt(i6)) < 128) {
            bArr[i4] = (byte) cCharAt;
            i6++;
        }
        if (i6 == length) {
            return i + length;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 < 128 && i7 < i5) {
                bArr[i7] = (byte) cCharAt2;
                i7++;
            } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                i7 += 2;
                bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                    if (i7 > i5 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                            throw new C10148lW1(i6, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i7);
                    }
                    int i9 = i6 + 1;
                    if (i9 != str.length()) {
                        char cCharAt3 = str.charAt(i9);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i10 = i7 + 3;
                            bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i7 += 4;
                            bArr[i10] = (byte) ((codePoint & 63) | 128);
                            i6 = i9;
                        } else {
                            i6 = i9;
                        }
                    }
                    throw new C10148lW1(i6 - 1, length);
                }
                bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i11 = i7 + 2;
                bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i7 += 3;
                bArr[i11] = (byte) ((cCharAt2 & '?') | 128);
            }
            i6++;
        }
        return i7;
    }

    /* renamed from: c */
    public static /* synthetic */ int m18823c(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            byte b2 = bArr[i];
            if (b > -12 || b2 > -65) {
                return -1;
            }
            return (b2 << 8) ^ b;
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        byte b3 = bArr[i];
        byte b4 = bArr[i + 1];
        if (b > -12 || b3 > -65 || b4 > -65) {
            return -1;
        }
        return (b4 << 16) ^ ((b3 << 8) ^ b);
    }

    /* renamed from: d */
    public static boolean m18824d(byte[] bArr, int i, int i2) {
        int iM18823c;
        f28443a.getClass();
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            iM18823c = 0;
        } else {
            while (i < i2) {
                int i3 = i + 1;
                iM18823c = bArr[i];
                if (iM18823c < 0) {
                    if (iM18823c >= -32) {
                        if (iM18823c >= -16) {
                            if (i3 < i2 - 2) {
                                int i4 = i + 2;
                                byte b = bArr[i3];
                                if (b <= -65) {
                                    if ((((b + 112) + (iM18823c << 28)) >> 30) == 0) {
                                        int i5 = i + 3;
                                        if (bArr[i4] <= -65) {
                                            i += 4;
                                            if (bArr[i5] > -65) {
                                            }
                                        }
                                    }
                                }
                                iM18823c = -1;
                                break;
                            }
                            iM18823c = m18823c(bArr, i3, i2);
                            break;
                        }
                        if (i3 < i2 - 1) {
                            int i6 = i + 2;
                            byte b2 = bArr[i3];
                            if (b2 <= -65 && ((iM18823c != -32 || b2 >= -96) && (iM18823c != -19 || b2 < -96))) {
                                i += 3;
                                if (bArr[i6] > -65) {
                                }
                            }
                            iM18823c = -1;
                            break;
                        }
                        iM18823c = m18823c(bArr, i3, i2);
                        break;
                    }
                    if (i3 >= i2) {
                        break;
                    }
                    if (iM18823c >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    iM18823c = -1;
                    break;
                }
                i = i3;
            }
            iM18823c = 0;
        }
        return iM18823c == 0;
    }
}
