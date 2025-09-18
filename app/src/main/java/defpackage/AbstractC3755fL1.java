package defpackage;

/* renamed from: fL1 */
/* loaded from: classes.dex */
public abstract class AbstractC3755fL1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003e  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(com.facebook.react.bridge.ReactApplicationContext r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r8 == 0) goto L29
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L27
            if (r9 == 0) goto L29
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L27
            java.lang.String r7 = r8.getString(r9)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L27
            goto L29
        L24:
            r9 = move-exception
            r7 = r8
            goto L3c
        L27:
            r9 = move-exception
            goto L33
        L29:
            if (r8 == 0) goto L2e
            r8.close()
        L2e:
            return r7
        L2f:
            r9 = move-exception
            goto L3c
        L31:
            r9 = move-exception
            r8 = r7
        L33:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L24
            if (r8 == 0) goto L3b
            r8.close()
        L3b:
            return r7
        L3c:
            if (r7 == 0) goto L41
            r7.close()
        L41:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3755fL1.a(com.facebook.react.bridge.ReactApplicationContext, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static int b(byte[] bArr, int i, C0779Jt c0779Jt) throws DH1 {
        int iJ = j(bArr, i, c0779Jt);
        int i2 = c0779Jt.a;
        if (i2 < 0) {
            throw new DH1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iJ) {
            throw new DH1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            c0779Jt.d = JE1.b;
            return iJ;
        }
        c0779Jt.d = JE1.C(bArr, iJ, i2);
        return iJ + i2;
    }

    public static int c(int i, byte[] bArr, int i2, int i3, AbstractC8331zG1 abstractC8331zG1, HG1 hg1, C0779Jt c0779Jt) {
        SF1 sf1 = abstractC8331zG1.zzb;
        hg1.getClass();
        throw null;
    }

    public static int d(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int e(InterfaceC8153yK1 interfaceC8153yK1, byte[] bArr, int i, int i2, int i3, C0779Jt c0779Jt) throws DH1 {
        Object objZze = interfaceC8153yK1.zze();
        int iN = n(objZze, interfaceC8153yK1, bArr, i, i2, i3, c0779Jt);
        interfaceC8153yK1.a(objZze);
        c0779Jt.d = objZze;
        return iN;
    }

    public static int f(InterfaceC8153yK1 interfaceC8153yK1, int i, byte[] bArr, int i2, int i3, InterfaceC7383uH1 interfaceC7383uH1, C0779Jt c0779Jt) throws DH1 {
        Object objZze = interfaceC8153yK1.zze();
        int iO = o(objZze, interfaceC8153yK1, bArr, i2, i3, c0779Jt);
        interfaceC8153yK1.a(objZze);
        c0779Jt.d = objZze;
        interfaceC7383uH1.add(objZze);
        while (iO < i3) {
            int iJ = j(bArr, iO, c0779Jt);
            if (i != c0779Jt.a) {
                break;
            }
            Object objZze2 = interfaceC8153yK1.zze();
            int iO2 = o(objZze2, interfaceC8153yK1, bArr, iJ, i3, c0779Jt);
            interfaceC8153yK1.a(objZze2);
            c0779Jt.d = objZze2;
            interfaceC7383uH1.add(objZze2);
            iO = iO2;
        }
        return iO;
    }

    public static int g(byte[] bArr, int i, InterfaceC7383uH1 interfaceC7383uH1, C0779Jt c0779Jt) throws DH1 {
        UG1 ug1 = (UG1) interfaceC7383uH1;
        int iJ = j(bArr, i, c0779Jt);
        int i2 = c0779Jt.a + iJ;
        while (iJ < i2) {
            iJ = j(bArr, iJ, c0779Jt);
            ug1.i(c0779Jt.a);
        }
        if (iJ == i2) {
            return iJ;
        }
        throw new DH1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int h(byte[] bArr, int i, C0779Jt c0779Jt) throws DH1 {
        int iJ = j(bArr, i, c0779Jt);
        int i2 = c0779Jt.a;
        if (i2 < 0) {
            throw new DH1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            c0779Jt.d = "";
            return iJ;
        }
        c0779Jt.d = new String(bArr, iJ, i2, AbstractC7574vH1.a);
        return iJ + i2;
    }

    public static int i(int i, byte[] bArr, int i2, int i3, C3949gM1 c3949gM1, C0779Jt c0779Jt) throws DH1 {
        if ((i >>> 3) == 0) {
            throw new DH1("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM = m(bArr, i2, c0779Jt);
            c3949gM1.c(i, Long.valueOf(c0779Jt.c));
            return iM;
        }
        if (i4 == 1) {
            c3949gM1.c(i, Long.valueOf(q(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iJ = j(bArr, i2, c0779Jt);
            int i5 = c0779Jt.a;
            if (i5 < 0) {
                throw new DH1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - iJ) {
                throw new DH1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                c3949gM1.c(i, JE1.b);
            } else {
                c3949gM1.c(i, JE1.C(bArr, iJ, i5));
            }
            return iJ + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new DH1("Protocol message contained an invalid tag (zero).");
            }
            c3949gM1.c(i, Integer.valueOf(d(i2, bArr)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        C3949gM1 c3949gM1B = C3949gM1.b();
        int i7 = c0779Jt.b + 1;
        c0779Jt.b = i7;
        if (i7 >= 100) {
            throw new DH1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iJ2 = j(bArr, i2, c0779Jt);
            i8 = c0779Jt.a;
            if (i8 == i6) {
                i2 = iJ2;
                break;
            }
            i2 = i(i8, bArr, iJ2, i3, c3949gM1B, c0779Jt);
        }
        c0779Jt.b--;
        if (i2 > i3 || i8 != i6) {
            throw new DH1("Failed to parse the message.");
        }
        c3949gM1.c(i, c3949gM1B);
        return i2;
    }

    public static int j(byte[] bArr, int i, C0779Jt c0779Jt) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return k(b, bArr, i2, c0779Jt);
        }
        c0779Jt.a = b;
        return i2;
    }

    public static int k(int i, byte[] bArr, int i2, C0779Jt c0779Jt) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            c0779Jt.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            c0779Jt.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c0779Jt.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c0779Jt.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c0779Jt.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int l(int i, byte[] bArr, int i2, int i3, InterfaceC7383uH1 interfaceC7383uH1, C0779Jt c0779Jt) {
        UG1 ug1 = (UG1) interfaceC7383uH1;
        int iJ = j(bArr, i2, c0779Jt);
        ug1.i(c0779Jt.a);
        while (iJ < i3) {
            int iJ2 = j(bArr, iJ, c0779Jt);
            if (i != c0779Jt.a) {
                break;
            }
            iJ = j(bArr, iJ2, c0779Jt);
            ug1.i(c0779Jt.a);
        }
        return iJ;
    }

    public static int m(byte[] bArr, int i, C0779Jt c0779Jt) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            c0779Jt.c = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & 127) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & 127) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        c0779Jt.c = j2;
        return i3;
    }

    public static int n(Object obj, InterfaceC8153yK1 interfaceC8153yK1, byte[] bArr, int i, int i2, int i3, C0779Jt c0779Jt) throws DH1 {
        TI1 ti1 = (TI1) interfaceC8153yK1;
        int i4 = c0779Jt.b + 1;
        c0779Jt.b = i4;
        if (i4 >= 100) {
            throw new DH1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iS = ti1.s(obj, bArr, i, i2, i3, c0779Jt);
        c0779Jt.b--;
        c0779Jt.d = obj;
        return iS;
    }

    public static int o(Object obj, InterfaceC8153yK1 interfaceC8153yK1, byte[] bArr, int i, int i2, C0779Jt c0779Jt) throws DH1 {
        int iK = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iK = k(i3, bArr, iK, c0779Jt);
            i3 = c0779Jt.a;
        }
        int i4 = iK;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new DH1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = c0779Jt.b + 1;
        c0779Jt.b = i5;
        if (i5 >= 100) {
            throw new DH1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i3 + i4;
        interfaceC8153yK1.g(obj, bArr, i4, i6, c0779Jt);
        c0779Jt.b--;
        c0779Jt.d = obj;
        return i6;
    }

    public static int p(int i, byte[] bArr, int i2, int i3, C0779Jt c0779Jt) throws DH1 {
        if ((i >>> 3) == 0) {
            throw new DH1("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return m(bArr, i2, c0779Jt);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return j(bArr, i2, c0779Jt) + c0779Jt.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new DH1("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = j(bArr, i2, c0779Jt);
            i6 = c0779Jt.a;
            if (i6 == i5) {
                break;
            }
            i2 = p(i6, bArr, i2, i3, c0779Jt);
        }
        if (i2 > i3 || i6 != i5) {
            throw new DH1("Failed to parse the message.");
        }
        return i2;
    }

    public static long q(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
