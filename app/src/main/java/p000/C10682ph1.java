package p000;

import android.graphics.drawable.Drawable;

/* renamed from: ph1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10682ph1 {

    /* renamed from: a */
    public final /* synthetic */ int f40285a;

    /* renamed from: c */
    public static void m23835c(Drawable drawable, int i) {
        AbstractC4173hL.m18805g(drawable, i);
    }

    /* renamed from: d */
    public static int m23836d(long j, int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            C10682ph1 c10682ph1 = AbstractC11194th1.f43222a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return AbstractC11194th1.m24970c(i, AbstractC8003Ng1.m5805g(j, bArr));
        }
        if (i2 == 2) {
            return AbstractC11194th1.m24971d(i, AbstractC8003Ng1.m5805g(j, bArr), AbstractC8003Ng1.m5805g(j + 1, bArr));
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public final int m23837a(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char cCharAt;
        long j;
        String str2;
        String str3;
        int i5;
        char cCharAt2;
        switch (this.f40285a) {
            case 0:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length && (i4 = i7 + i) < i6 && (cCharAt = str.charAt(i7)) < 128) {
                    bArr[i4] = (byte) cCharAt;
                    i7++;
                }
                if (i7 == length) {
                    return i + length;
                }
                int i8 = i + i7;
                while (i7 < length) {
                    char cCharAt3 = str.charAt(i7);
                    if (cCharAt3 < 128 && i8 < i6) {
                        bArr[i8] = (byte) cCharAt3;
                        i8++;
                    } else if (cCharAt3 < 2048 && i8 <= i6 - 2) {
                        int i9 = i8 + 1;
                        bArr[i8] = (byte) ((cCharAt3 >>> 6) | 960);
                        i8 += 2;
                        bArr[i9] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i8 > i6 - 3) {
                            if (i8 > i6 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i3 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i3)))) {
                                    throw new C10938rh1(i7, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i8);
                            }
                            int i10 = i7 + 1;
                            if (i10 != str.length()) {
                                char cCharAt4 = str.charAt(i10);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i11 = i8 + 3;
                                    bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i8 += 4;
                                    bArr[i11] = (byte) ((codePoint & 63) | 128);
                                    i7 = i10;
                                } else {
                                    i7 = i10;
                                }
                            }
                            throw new C10938rh1(i7 - 1, length);
                        }
                        bArr[i8] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i12 = i8 + 2;
                        bArr[i8 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i8 += 3;
                        bArr[i12] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i7++;
                }
                return i8;
            default:
                long j2 = i;
                long j3 = i2 + j2;
                int length2 = str.length();
                String str4 = " at index ";
                String str5 = "Failed writing ";
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                }
                int i13 = 0;
                while (true) {
                    j = 1;
                    if (i13 < length2 && (cCharAt2 = str.charAt(i13)) < 128) {
                        AbstractC8003Ng1.m5809k(bArr, j2, (byte) cCharAt2);
                        i13++;
                        j2 = 1 + j2;
                    }
                }
                if (i13 != length2) {
                    while (i13 < length2) {
                        char cCharAt5 = str.charAt(i13);
                        if (cCharAt5 < 128 && j2 < j3) {
                            AbstractC8003Ng1.m5809k(bArr, j2, (byte) cCharAt5);
                            str3 = str5;
                            j2 += j;
                            str2 = str4;
                        } else if (cCharAt5 >= 2048 || j2 > j3 - 2) {
                            str2 = str4;
                            str3 = str5;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j2 > j3 - 3) {
                                if (j2 > j3 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i5 = i13 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i5)))) {
                                        throw new C10938rh1(i13, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException(str3 + cCharAt5 + str2 + j2);
                                }
                                int i14 = i13 + 1;
                                if (i14 != length2) {
                                    char cCharAt6 = str.charAt(i14);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        AbstractC8003Ng1.m5809k(bArr, j2, (byte) ((codePoint2 >>> 18) | 240));
                                        AbstractC8003Ng1.m5809k(bArr, j2 + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j4 = 3 + j2;
                                        AbstractC8003Ng1.m5809k(bArr, j2 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j2 += 4;
                                        AbstractC8003Ng1.m5809k(bArr, j4, (byte) ((codePoint2 & 63) | 128));
                                        i13 = i14;
                                    } else {
                                        i13 = i14;
                                    }
                                }
                                throw new C10938rh1(i13 - 1, length2);
                            }
                            AbstractC8003Ng1.m5809k(bArr, j2, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j5 = j2 + 2;
                            AbstractC8003Ng1.m5809k(bArr, j2 + 1, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j2 += 3;
                            AbstractC8003Ng1.m5809k(bArr, j5, (byte) ((cCharAt5 & '?') | 128));
                        } else {
                            str2 = str4;
                            str3 = str5;
                            long j6 = j2 + j;
                            AbstractC8003Ng1.m5809k(bArr, j2, (byte) ((cCharAt5 >>> 6) | 960));
                            j2 += 2;
                            AbstractC8003Ng1.m5809k(bArr, j6, (byte) ((cCharAt5 & '?') | 128));
                        }
                        i13++;
                        str4 = str2;
                        str5 = str3;
                        j = 1;
                    }
                }
                return (int) j2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:?, code lost:
    
        return r11;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m23838b(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10682ph1.m23838b(byte[], int, int):int");
    }
}
