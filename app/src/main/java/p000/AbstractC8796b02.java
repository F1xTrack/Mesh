package p000;

/* renamed from: b02 */
/* loaded from: classes.dex */
public abstract class AbstractC8796b02 {
    /* renamed from: a */
    public static void m10401a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws Z90 {
        if (!m10406f(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m10406f(b3) && !m10406f(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw Z90.m9496a();
    }

    /* renamed from: b */
    public static boolean m10402b(byte b) {
        return b >= 0;
    }

    /* renamed from: c */
    public static void m10403c(byte b, byte b2, char[] cArr, int i) throws Z90 {
        if (b < -62 || m10406f(b2)) {
            throw Z90.m9496a();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: d */
    public static void m10404d(byte b, byte b2, byte b3, char[] cArr, int i) throws Z90 {
        if (m10406f(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m10406f(b3)))) {
            throw Z90.m9496a();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x00e0  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m10405e(p000.CT0 r16, p000.C9115dS0 r17, com.facebook.imagepipeline.image.EncodedImage r18, int r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC8796b02.m10405e(CT0, dS0, com.facebook.imagepipeline.image.EncodedImage, int):int");
    }

    /* renamed from: f */
    public static boolean m10406f(byte b) {
        return b > -65;
    }
}
