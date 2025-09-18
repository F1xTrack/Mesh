package p000;

/* renamed from: o22, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10471o22 {
    /* renamed from: a */
    public static boolean m23321a(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    /* renamed from: b */
    public static boolean m23322b(int i, int i2, int i3, int i4, String str) {
        int i5;
        if (i2 >= str.length() || (i5 = (i2 - i) + 1) < i3 || i5 > i4) {
            return false;
        }
        while (i <= i2) {
            if (!m23321a(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m23323c(CharSequence charSequence, int i, int i2, int i3, int i4) {
        int i5;
        if (i2 >= charSequence.length() || (i5 = (i2 - i) + 1) < i3 || i5 > i4) {
            return false;
        }
        while (i <= i2) {
            char cCharAt = charSequence.charAt(i);
            if (!m23321a(cCharAt) && (cCharAt < '0' || cCharAt > '9')) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ void m23324d(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws C10114lF1 {
        if (!m23328h(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m23328h(b3) && !m23328h(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw C10114lF1.m22372a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
  0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* bridge */ /* synthetic */ void m23325e(byte r2, byte r3, byte r4, char[] r5, int r6) throws p000.C10114lF1 {
        /*
            boolean r0 = m23328h(r3)
            if (r0 != 0) goto L2c
            r0 = -96
            r1 = -32
            if (r2 != r1) goto Lf
            if (r3 < r0) goto L2c
            r2 = r1
        Lf:
            r1 = -19
            if (r2 != r1) goto L16
            if (r3 >= r0) goto L2c
            r2 = r1
        L16:
            boolean r0 = m23328h(r4)
            if (r0 != 0) goto L2c
            r2 = r2 & 15
            r3 = r3 & 63
            r4 = r4 & 63
            int r2 = r2 << 12
            int r3 = r3 << 6
            r2 = r2 | r3
            r2 = r2 | r4
            char r2 = (char) r2
            r5[r6] = r2
            return
        L2c:
            lF1 r2 = p000.C10114lF1.m22372a()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC10471o22.m23325e(byte, byte, byte, char[], int):void");
    }

    /* renamed from: f */
    public static /* bridge */ /* synthetic */ void m23326f(byte b, byte b2, char[] cArr, int i) throws C10114lF1 {
        if (b < -62 || m23328h(b2)) {
            throw C10114lF1.m22372a();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: g */
    public static /* bridge */ /* synthetic */ boolean m23327g(byte b) {
        return b >= 0;
    }

    /* renamed from: h */
    public static boolean m23328h(byte b) {
        return b > -65;
    }
}
