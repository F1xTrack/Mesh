package p000;

import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: wX0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC11556wX0 {

    /* renamed from: a */
    public static volatile C11683xX0 f44937a;

    /* renamed from: b */
    public static final int[] f44938b = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: c */
    public static final int[] f44939c = {-1, JosStatusCodes.RTN_CODE_COMMON_ERROR, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: d */
    public static final int[] f44940d = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: e */
    public static final int[] f44941e = {JosStatusCodes.RTN_CODE_COMMON_ERROR, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: f */
    public static final int[] f44942f = {5, 8, 10, 12};

    /* renamed from: g */
    public static final int[] f44943g = {6, 9, 12, 15};

    /* renamed from: h */
    public static final int[] f44944h = {2, 4, 6, 8};

    /* renamed from: i */
    public static final int[] f44945i = {9, 11, 13, 16};

    /* renamed from: j */
    public static final int[] f44946j = {5, 8, 10, 12};

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m25644a(java.lang.String r9, p000.C11588wn0 r10) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC11556wX0.m25644a(java.lang.String, wn0):java.lang.String");
    }

    /* renamed from: b */
    public static C0683Kq m25645b(byte[] bArr) {
        byte b = bArr[0];
        if (b == 127 || b == 100 || b == 64 || b == 113) {
            return new C0683Kq(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b2 = bArrCopyOf[0];
        if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b3 = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b3;
            }
        }
        C0683Kq c0683Kq = new C0683Kq(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            C0683Kq c0683Kq2 = new C0683Kq(bArrCopyOf, bArrCopyOf.length);
            while (c0683Kq2.m4743c() >= 16) {
                c0683Kq2.m4763w(2);
                int iM4752l = c0683Kq2.m4752l(14) & 16383;
                int iMin = Math.min(8 - c0683Kq.f6327d, 14);
                int i3 = c0683Kq.f6327d;
                int i4 = (8 - i3) - iMin;
                byte[] bArr2 = c0683Kq.f6325b;
                int i5 = c0683Kq.f6326c;
                byte b4 = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr2[i5]);
                bArr2[i5] = b4;
                int i6 = 14 - iMin;
                bArr2[i5] = (byte) (b4 | ((iM4752l >>> i6) << i4));
                int i7 = i5 + 1;
                while (i6 > 8) {
                    c0683Kq.f6325b[i7] = (byte) (iM4752l >>> (i6 - 8));
                    i6 -= 8;
                    i7++;
                }
                int i8 = 8 - i6;
                byte[] bArr3 = c0683Kq.f6325b;
                byte b5 = (byte) (bArr3[i7] & ((1 << i8) - 1));
                bArr3[i7] = b5;
                bArr3[i7] = (byte) (((iM4752l & ((1 << i6) - 1)) << i8) | b5);
                c0683Kq.m4763w(14);
                c0683Kq.m4742b();
            }
        }
        c0683Kq.m4758r(bArrCopyOf.length, bArrCopyOf);
        return c0683Kq;
    }

    /* renamed from: c */
    public static int m25646c(C0683Kq c0683Kq, int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 3 && c0683Kq.m4751k(); i2++) {
            i++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += 1 << iArr[i4];
        }
        return c0683Kq.m4752l(iArr[i]) + i3;
    }

    /* renamed from: d */
    public static String m25647d(String str, C11588wn0 c11588wn0) {
        O90.m5968f(str, "text");
        O90.m5968f(c11588wn0, "options");
        String str2 = AbstractC11842yn0.f46458b;
        String strM25336K = AbstractC11374v51.m25336K(c11588wn0.f45101d, AbstractC11374v51.m25335J(c11588wn0.f45100c, D51.m1554m(str, c11588wn0.f45099b, str2)));
        String str3 = "[^\\d\\" + str2 + "]";
        O90.m5968f(str3, "pattern");
        Pattern patternCompile = Pattern.compile(str3);
        O90.m5967e(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(strM25336K).replaceAll("");
        O90.m5967e(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }
}
