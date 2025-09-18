package defpackage;

import com.reactnativecommunity.clipboard.ClipboardModule;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class U50 extends AbstractC5507kS1 {
    public static final OU b = new OU(17);
    public final S50 a;

    public U50(S50 s50) {
        this.a = s50;
    }

    public static X5 f(C4103hA0 c4103hA0, int i, int i2) {
        int iX;
        String strConcat;
        int iU = c4103hA0.u();
        Charset charsetU = u(iU);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        c4103hA0.e(bArr, 0, i3);
        if (i2 == 2) {
            strConcat = "image/" + PN1.c(new String(bArr, 0, 3, AbstractC8250yr.b));
            if (ClipboardModule.MIMETYPE_JPG.equals(strConcat)) {
                strConcat = ClipboardModule.MIMETYPE_JPEG;
            }
            iX = 2;
        } else {
            iX = x(0, bArr);
            String strC = PN1.c(new String(bArr, 0, iX, AbstractC8250yr.b));
            strConcat = strC.indexOf(47) == -1 ? "image/".concat(strC) : strC;
        }
        int i4 = bArr[iX + 1] & 255;
        int i5 = iX + 2;
        int iW = w(bArr, i5, iU);
        String str = new String(bArr, i5, iW - i5, charsetU);
        int iT = t(iU) + iW;
        return new X5(strConcat, str, i4, i3 <= iT ? AbstractC0277Dh1.f : Arrays.copyOfRange(bArr, iT, i3));
    }

    public static C6535pr g(C4103hA0 c4103hA0, int i, int i2, boolean z, int i3, S50 s50) {
        int i4 = c4103hA0.b;
        int iX = x(i4, c4103hA0.a);
        String str = new String(c4103hA0.a, i4, iX - i4, AbstractC8250yr.b);
        c4103hA0.G(iX + 1);
        int iG = c4103hA0.g();
        int iG2 = c4103hA0.g();
        long jW = c4103hA0.w();
        long j = jW == 4294967295L ? -1L : jW;
        long jW2 = c4103hA0.w();
        long j2 = jW2 == 4294967295L ? -1L : jW2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (c4103hA0.b < i5) {
            V50 v50J = j(i2, c4103hA0, z, i3, s50);
            if (v50J != null) {
                arrayList.add(v50J);
            }
        }
        return new C6535pr(str, iG, iG2, j, j2, (V50[]) arrayList.toArray(new V50[0]));
    }

    public static C6726qr h(C4103hA0 c4103hA0, int i, int i2, boolean z, int i3, S50 s50) {
        int i4 = c4103hA0.b;
        int iX = x(i4, c4103hA0.a);
        String str = new String(c4103hA0.a, i4, iX - i4, AbstractC8250yr.b);
        c4103hA0.G(iX + 1);
        int iU = c4103hA0.u();
        boolean z2 = (iU & 2) != 0;
        boolean z3 = (iU & 1) != 0;
        int iU2 = c4103hA0.u();
        String[] strArr = new String[iU2];
        for (int i5 = 0; i5 < iU2; i5++) {
            int i6 = c4103hA0.b;
            int iX2 = x(i6, c4103hA0.a);
            strArr[i5] = new String(c4103hA0.a, i6, iX2 - i6, AbstractC8250yr.b);
            c4103hA0.G(iX2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (c4103hA0.b < i7) {
            V50 v50J = j(i2, c4103hA0, z, i3, s50);
            if (v50J != null) {
                arrayList.add(v50J);
            }
        }
        return new C6726qr(str, z2, z3, strArr, (V50[]) arrayList.toArray(new V50[0]));
    }

    public static C1171Ou i(int i, C4103hA0 c4103hA0) {
        if (i < 4) {
            return null;
        }
        int iU = c4103hA0.u();
        Charset charsetU = u(iU);
        byte[] bArr = new byte[3];
        c4103hA0.e(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        c4103hA0.e(bArr2, 0, i2);
        int iW = w(bArr2, 0, iU);
        String str2 = new String(bArr2, 0, iW, charsetU);
        int iT = t(iU) + iW;
        return new C1171Ou(str, str2, n(bArr2, iT, w(bArr2, iT, iU), charsetU));
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01db A[Catch: all -> 0x010d, Exception -> 0x0110, OutOfMemoryError -> 0x0113, TRY_LEAVE, TryCatch #2 {Exception -> 0x0110, OutOfMemoryError -> 0x0113, all -> 0x010d, blocks: (B:91:0x0107, B:99:0x0118, B:106:0x012e, B:108:0x0136, B:116:0x0150, B:125:0x0168, B:136:0x0183, B:143:0x0195, B:149:0x01a4, B:154:0x01bc, B:160:0x01d6, B:161:0x01db), top: B:172:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.V50 j(int r18, defpackage.C4103hA0 r19, boolean r20, int r21, defpackage.S50 r22) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.U50.j(int, hA0, boolean, int, S50):V50");
    }

    public static M00 k(int i, C4103hA0 c4103hA0) {
        int iU = c4103hA0.u();
        Charset charsetU = u(iU);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c4103hA0.e(bArr, 0, i2);
        int iX = x(0, bArr);
        String strN = AbstractC1865Xr0.n(new String(bArr, 0, iX, AbstractC8250yr.b));
        int i3 = iX + 1;
        int iW = w(bArr, i3, iU);
        String strN2 = n(bArr, i3, iW, charsetU);
        int iT = t(iU) + iW;
        int iW2 = w(bArr, iT, iU);
        String strN3 = n(bArr, iT, iW2, charsetU);
        int iT2 = t(iU) + iW2;
        return new M00(strN, strN2, strN3, i2 <= iT2 ? AbstractC0277Dh1.f : Arrays.copyOfRange(bArr, iT2, i2));
    }

    public static C3662es0 l(int i, C4103hA0 c4103hA0) {
        int iA = c4103hA0.A();
        int iX = c4103hA0.x();
        int iX2 = c4103hA0.x();
        int iU = c4103hA0.u();
        int iU2 = c4103hA0.u();
        C0848Kq c0848Kq = new C0848Kq();
        c0848Kq.s(c4103hA0);
        int i2 = ((i - 10) * 8) / (iU + iU2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iL = c0848Kq.l(iU);
            int iL2 = c0848Kq.l(iU2);
            iArr[i3] = iL;
            iArr2[i3] = iL2;
        }
        return new C3662es0(iA, iX, iX2, iArr, iArr2);
    }

    public static AD0 m(int i, C4103hA0 c4103hA0) {
        byte[] bArr = new byte[i];
        c4103hA0.e(bArr, 0, i);
        int iX = x(0, bArr);
        String str = new String(bArr, 0, iX, AbstractC8250yr.b);
        int i2 = iX + 1;
        return new AD0(str, i <= i2 ? AbstractC0277Dh1.f : Arrays.copyOfRange(bArr, i2, i));
    }

    public static String n(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static C6596q91 o(int i, C4103hA0 c4103hA0, String str) {
        if (i < 1) {
            return null;
        }
        int iU = c4103hA0.u();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c4103hA0.e(bArr, 0, i2);
        return new C6596q91(str, null, p(bArr, iU, 0));
    }

    public static C3769fQ0 p(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return P70.B("");
        }
        M70 m70T = P70.t();
        int iW = w(bArr, i2, i);
        while (i2 < iW) {
            m70T.a(new String(bArr, i2, iW - i2, u(i)));
            i2 = t(i) + iW;
            iW = w(bArr, i2, i);
        }
        C3769fQ0 c3769fQ0H = m70T.h();
        return c3769fQ0H.isEmpty() ? P70.B("") : c3769fQ0H;
    }

    public static C6596q91 q(int i, C4103hA0 c4103hA0) {
        if (i < 1) {
            return null;
        }
        int iU = c4103hA0.u();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c4103hA0.e(bArr, 0, i2);
        int iW = w(bArr, 0, iU);
        return new C6596q91("TXXX", new String(bArr, 0, iW, u(iU)), p(bArr, iU, t(iU) + iW));
    }

    public static C2564ch1 r(int i, C4103hA0 c4103hA0, String str) {
        byte[] bArr = new byte[i];
        c4103hA0.e(bArr, 0, i);
        return new C2564ch1(str, null, new String(bArr, 0, x(0, bArr), AbstractC8250yr.b));
    }

    public static C2564ch1 s(int i, C4103hA0 c4103hA0) {
        if (i < 1) {
            return null;
        }
        int iU = c4103hA0.u();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c4103hA0.e(bArr, 0, i2);
        int iW = w(bArr, 0, iU);
        String str = new String(bArr, 0, iW, u(iU));
        int iT = t(iU) + iW;
        return new C2564ch1("WXXX", str, n(bArr, iT, x(iT, bArr), AbstractC8250yr.b));
    }

    public static int t(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset u(int i) {
        return i != 1 ? i != 2 ? i != 3 ? AbstractC8250yr.b : AbstractC8250yr.c : AbstractC8250yr.d : AbstractC8250yr.f;
    }

    public static String v(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int w(byte[] bArr, int i, int i2) {
        int iX = x(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iX;
        }
        while (iX < bArr.length - 1) {
            if ((iX - i) % 2 == 0 && bArr[iX + 1] == 0) {
                return iX;
            }
            iX = x(iX + 1, bArr);
        }
        return bArr.length;
    }

    public static int x(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int y(int i, C4103hA0 c4103hA0) {
        byte[] bArr = c4103hA0.a;
        int i2 = c4103hA0.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[PHI: r3
  0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean z(defpackage.C4103hA0 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.b
        L6:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r18.g()     // Catch: java.lang.Throwable -> L20
            long r8 = r18.w()     // Catch: java.lang.Throwable -> L20
            int r10 = r18.A()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r18.x()     // Catch: java.lang.Throwable -> L20
            int r8 = r18.x()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.G(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.G(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.G(r2)
            return r6
        L99:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.G(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.H(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.G(r2)
            return r4
        Lb0:
            r1.G(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.U50.z(hA0, int, int, boolean):boolean");
    }

    @Override // defpackage.AbstractC5507kS1
    public final C0540Gr0 c(C0774Jr0 c0774Jr0, ByteBuffer byteBuffer) {
        return e(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C0540Gr0 e(int r12, byte[] r13) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.U50.e(int, byte[]):Gr0");
    }
}
