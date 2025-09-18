package defpackage;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: wX0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7811wX0 {
    public static volatile C8001xX0 a;
    public static final int[] b = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] c = {-1, JosStatusCodes.RTN_CODE_COMMON_ERROR, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] d = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] e = {JosStatusCodes.RTN_CODE_COMMON_ERROR, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] f = {5, 8, 10, 12};
    public static final int[] g = {6, 9, 12, 15};
    public static final int[] h = {2, 4, 6, 8};
    public static final int[] i = {9, 11, 13, 16};
    public static final int[] j = {5, 8, 10, 12};

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r9, defpackage.C7859wn0 r10) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7811wX0.a(java.lang.String, wn0):java.lang.String");
    }

    public static C0848Kq b(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == 127 || b2 == 100 || b2 == 64 || b2 == 113) {
            return new C0848Kq(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = bArrCopyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b4 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b4;
            }
        }
        C0848Kq c0848Kq = new C0848Kq(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            C0848Kq c0848Kq2 = new C0848Kq(bArrCopyOf, bArrCopyOf.length);
            while (c0848Kq2.c() >= 16) {
                c0848Kq2.w(2);
                int iL = c0848Kq2.l(14) & 16383;
                int iMin = Math.min(8 - c0848Kq.d, 14);
                int i4 = c0848Kq.d;
                int i5 = (8 - i4) - iMin;
                byte[] bArr2 = c0848Kq.b;
                int i6 = c0848Kq.c;
                byte b5 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr2[i6]);
                bArr2[i6] = b5;
                int i7 = 14 - iMin;
                bArr2[i6] = (byte) (b5 | ((iL >>> i7) << i5));
                int i8 = i6 + 1;
                while (i7 > 8) {
                    c0848Kq.b[i8] = (byte) (iL >>> (i7 - 8));
                    i7 -= 8;
                    i8++;
                }
                int i9 = 8 - i7;
                byte[] bArr3 = c0848Kq.b;
                byte b6 = (byte) (bArr3[i8] & ((1 << i9) - 1));
                bArr3[i8] = b6;
                bArr3[i8] = (byte) (((iL & ((1 << i7) - 1)) << i9) | b6);
                c0848Kq.w(14);
                c0848Kq.b();
            }
        }
        c0848Kq.r(bArrCopyOf.length, bArrCopyOf);
        return c0848Kq;
    }

    public static int c(C0848Kq c0848Kq, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && c0848Kq.k(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return c0848Kq.l(iArr[i2]) + i4;
    }

    public static String d(String str, C7859wn0 c7859wn0) {
        O90.f(str, "text");
        O90.f(c7859wn0, "options");
        String str2 = AbstractC8239yn0.b;
        String strK = AbstractC7538v51.K(c7859wn0.d, AbstractC7538v51.J(c7859wn0.c, D51.m(str, c7859wn0.b, str2)));
        String str3 = "[^\\d\\" + str2 + "]";
        O90.f(str3, "pattern");
        Pattern patternCompile = Pattern.compile(str3);
        O90.e(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(strK).replaceAll("");
        O90.e(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }
}
