package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public abstract class L9 {
    public static final byte[] a;

    static {
        int i = AbstractC0277Dh1.a;
        a = "OpusHead".getBytes(AbstractC8250yr.c);
    }

    public static H9 a(int i, C4103hA0 c4103hA0) {
        c4103hA0.G(i + 12);
        c4103hA0.H(1);
        b(c4103hA0);
        c4103hA0.H(2);
        int iU = c4103hA0.u();
        if ((iU & 128) != 0) {
            c4103hA0.H(2);
        }
        if ((iU & 64) != 0) {
            c4103hA0.H(c4103hA0.u());
        }
        if ((iU & 32) != 0) {
            c4103hA0.H(2);
        }
        c4103hA0.H(1);
        b(c4103hA0);
        String strE = AbstractC1865Xr0.e(c4103hA0.u());
        if ("audio/mpeg".equals(strE) || "audio/vnd.dts".equals(strE) || "audio/vnd.dts.hd".equals(strE)) {
            return new H9(-1L, strE, -1L, null);
        }
        c4103hA0.H(4);
        long jW = c4103hA0.w();
        long jW2 = c4103hA0.w();
        c4103hA0.H(1);
        int iB = b(c4103hA0);
        byte[] bArr = new byte[iB];
        c4103hA0.e(bArr, 0, iB);
        if (jW2 <= 0) {
            jW2 = -1;
        }
        return new H9(jW2, strE, jW > 0 ? jW : -1L, bArr);
    }

    public static int b(C4103hA0 c4103hA0) {
        int iU = c4103hA0.u();
        int i = iU & 127;
        while ((iU & 128) == 128) {
            iU = c4103hA0.u();
            i = (i << 7) | (iU & 127);
        }
        return i;
    }

    public static C2409bt0 c(C4103hA0 c4103hA0) {
        long jO;
        long jO2;
        c4103hA0.G(8);
        if (F9.s(c4103hA0.g()) == 0) {
            jO = c4103hA0.w();
            jO2 = c4103hA0.w();
        } else {
            jO = c4103hA0.o();
            jO2 = c4103hA0.o();
        }
        return new C2409bt0(jO, jO2, c4103hA0.w());
    }

    public static Pair d(C4103hA0 c4103hA0, int i, int i2) throws C5643lA0 {
        Integer num;
        C1116Ob1 c1116Ob1;
        Pair pairCreate;
        int i3;
        int i4;
        byte[] bArr;
        int i5 = c4103hA0.b;
        while (i5 - i < i2) {
            c4103hA0.G(i5);
            int iG = c4103hA0.g();
            U02.a("childAtomSize must be positive", iG > 0);
            if (c4103hA0.g() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                String strS = null;
                Integer numValueOf = null;
                while (i6 - i5 < iG) {
                    c4103hA0.G(i6);
                    int iG2 = c4103hA0.g();
                    int iG3 = c4103hA0.g();
                    if (iG3 == 1718775137) {
                        numValueOf = Integer.valueOf(c4103hA0.g());
                    } else if (iG3 == 1935894637) {
                        c4103hA0.H(4);
                        strS = c4103hA0.s(4, AbstractC8250yr.c);
                    } else if (iG3 == 1935894633) {
                        i8 = i6;
                        i7 = iG2;
                    }
                    i6 += iG2;
                }
                if ("cenc".equals(strS) || "cbc1".equals(strS) || "cens".equals(strS) || "cbcs".equals(strS)) {
                    U02.a("frma atom is mandatory", numValueOf != null);
                    U02.a("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = numValueOf;
                            c1116Ob1 = null;
                            break;
                        }
                        c4103hA0.G(i9);
                        int iG4 = c4103hA0.g();
                        if (c4103hA0.g() == 1952804451) {
                            int iS = F9.s(c4103hA0.g());
                            c4103hA0.H(1);
                            if (iS == 0) {
                                c4103hA0.H(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int iU = c4103hA0.u();
                                int i10 = (iU & 240) >> 4;
                                i3 = iU & 15;
                                i4 = i10;
                            }
                            boolean z = c4103hA0.u() == 1;
                            int iU2 = c4103hA0.u();
                            byte[] bArr2 = new byte[16];
                            c4103hA0.e(bArr2, 0, 16);
                            if (z && iU2 == 0) {
                                int iU3 = c4103hA0.u();
                                byte[] bArr3 = new byte[iU3];
                                c4103hA0.e(bArr3, 0, iU3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = numValueOf;
                            c1116Ob1 = new C1116Ob1(z, strS, iU2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += iG4;
                        }
                    }
                    U02.a("tenc atom is mandatory", c1116Ob1 != null);
                    int i11 = AbstractC0277Dh1.a;
                    pairCreate = Pair.create(num, c1116Ob1);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iG;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0ba0  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0bc6  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0d26  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0d28  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.J9 e(defpackage.C4103hA0 r62, int r63, int r64, java.lang.String r65, defpackage.JL r66, boolean r67) throws defpackage.C5643lA0 {
        /*
            Method dump skipped, instructions count: 4112
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.L9.e(hA0, int, int, java.lang.String, JL, boolean):J9");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e5, code lost:
    
        r3 = -9223372036854775807L;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05c9 A[ADDED_TO_REGION, LOOP:13: B:233:0x05c9->B:237:0x05d4, LOOP_START, PHI: r16
  0x05c9: PHI (r16v4 int) = (r16v3 int), (r16v5 int) binds: [B:232:0x05c7, B:237:0x05d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x05bc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList f(defpackage.D9 r45, defpackage.C3878g00 r46, long r47, defpackage.JL r49, boolean r50, boolean r51, defpackage.InterfaceC6290oZ r52) {
        /*
            Method dump skipped, instructions count: 2352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.L9.f(D9, g00, long, JL, boolean, boolean, oZ):java.util.ArrayList");
    }
}
