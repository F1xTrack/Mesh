package defpackage;

import java.text.ParseException;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class D22 {
    public static L3 a(Map map) {
        String str = (String) AbstractC8390za0.b(map, "alg", String.class);
        if (str == null) {
            return null;
        }
        return new L3(str);
    }

    public static Date b(Map map) {
        if (map.get("exp") == null) {
            return null;
        }
        return new Date(AbstractC8390za0.c("exp", map) * 1000);
    }

    public static Date c(Map map) {
        if (map.get("iat") == null) {
            return null;
        }
        return new Date(AbstractC8390za0.c("iat", map) * 1000);
    }

    public static LinkedHashSet d(Map map) throws ParseException {
        EnumC0894Lf0 enumC0894Lf0;
        List<String> listE = AbstractC8390za0.e("key_ops", map);
        if (listE == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : listE) {
            if (str != null) {
                EnumC0894Lf0[] enumC0894Lf0ArrValues = EnumC0894Lf0.values();
                int length = enumC0894Lf0ArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        enumC0894Lf0 = null;
                        break;
                    }
                    enumC0894Lf0 = enumC0894Lf0ArrValues[i];
                    if (str.equals(enumC0894Lf0.a)) {
                        break;
                    }
                    i++;
                }
                if (enumC0894Lf0 == null) {
                    throw new ParseException("Invalid JWK operation: ".concat(str), 0);
                }
                linkedHashSet.add(enumC0894Lf0);
            }
        }
        return linkedHashSet;
    }

    public static C1283Qf0 e(Map map) throws ParseException {
        try {
            return C1283Qf0.a((String) AbstractC8390za0.b(map, "kty", String.class));
        } catch (IllegalArgumentException e) {
            throw new ParseException(e.getMessage(), 0);
        }
    }

    public static C1361Rf0 f(Map map) throws ParseException {
        String str = (String) AbstractC8390za0.b(map, "use", String.class);
        if (str == null) {
            return null;
        }
        C1361Rf0 c1361Rf0 = C1361Rf0.b;
        if (!str.equals(c1361Rf0.a)) {
            c1361Rf0 = C1361Rf0.c;
            if (!str.equals(c1361Rf0.a)) {
                if (str.trim().isEmpty()) {
                    throw new ParseException("JWK use value must not be empty or blank", 0);
                }
                c1361Rf0 = new C1361Rf0(str);
            }
        }
        return c1361Rf0;
    }

    public static Date g(Map map) {
        if (map.get("nbf") == null) {
            return null;
        }
        return new Date(AbstractC8390za0.c("nbf", map) * 1000);
    }

    public static LinkedList h(Map map) throws ParseException {
        LinkedList linkedListB = AbstractC6379p12.b((List) AbstractC8390za0.b(map, "x5c", List.class));
        if (linkedListB == null || !linkedListB.isEmpty()) {
            return linkedListB;
        }
        return null;
    }

    public static double i(int i, byte[] bArr) {
        return Double.longBitsToDouble(x(i, bArr));
    }

    public static int j(int i, byte[] bArr, int i2, int i3, LS1 ls1, VP1 vp1) {
        C7607vS1 c7607vS1 = (C7607vS1) ls1;
        int iV = v(bArr, i2, vp1);
        c7607vS1.i(vp1.a);
        while (iV < i3) {
            int iV2 = v(bArr, iV, vp1);
            if (i != vp1.a) {
                break;
            }
            iV = v(bArr, iV2, vp1);
            c7607vS1.i(vp1.a);
        }
        return iV;
    }

    public static int k(int i, byte[] bArr, int i2, int i3, PV1 pv1, VP1 vp1) throws VS1 {
        if ((i >>> 3) == 0) {
            throw new VS1("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iW = w(bArr, i2, vp1);
            pv1.c(i, Long.valueOf(vp1.b));
            return iW;
        }
        if (i4 == 1) {
            pv1.c(i, Long.valueOf(x(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iV = v(bArr, i2, vp1);
            int i5 = vp1.a;
            if (i5 < 0) {
                throw VS1.b();
            }
            if (i5 > bArr.length - iV) {
                throw VS1.d();
            }
            if (i5 == 0) {
                pv1.c(i, JQ1.c);
            } else {
                pv1.c(i, JQ1.h(bArr, iV, i5));
            }
            return iV + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new VS1("Protocol message contained an invalid tag (zero).");
            }
            pv1.c(i, Integer.valueOf(u(i2, bArr)));
            return i2 + 4;
        }
        PV1 pv1E = PV1.e();
        int i6 = (i & (-8)) | 4;
        int i7 = vp1.d + 1;
        vp1.d = i7;
        if (i7 >= 100) {
            throw new VS1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iV2 = v(bArr, i2, vp1);
            int i9 = vp1.a;
            i8 = i9;
            if (i9 == i6) {
                i2 = iV2;
                break;
            }
            int iK = k(i8, bArr, iV2, i3, pv1E, vp1);
            i8 = i9;
            i2 = iK;
        }
        vp1.d--;
        if (i2 > i3 || i8 != i6) {
            throw VS1.c();
        }
        pv1.c(i, pv1E);
        return i2;
    }

    public static int l(int i, byte[] bArr, int i2, VP1 vp1) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            vp1.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            vp1.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            vp1.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            vp1.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                vp1.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int m(Object obj, InterfaceC3404dV1 interfaceC3404dV1, byte[] bArr, int i, int i2, int i3, VP1 vp1) throws VS1 {
        C6277oU1 c6277oU1 = (C6277oU1) interfaceC3404dV1;
        int i4 = vp1.d + 1;
        vp1.d = i4;
        if (i4 >= 100) {
            throw new VS1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iJ = c6277oU1.j(obj, bArr, i, i2, i3, vp1);
        vp1.d--;
        vp1.c = obj;
        return iJ;
    }

    public static int n(Object obj, InterfaceC3404dV1 interfaceC3404dV1, byte[] bArr, int i, int i2, VP1 vp1) throws VS1 {
        int iL = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iL = l(i3, bArr, iL, vp1);
            i3 = vp1.a;
        }
        int i4 = iL;
        if (i3 < 0 || i3 > i2 - i4) {
            throw VS1.d();
        }
        int i5 = vp1.d + 1;
        vp1.d = i5;
        if (i5 >= 100) {
            throw new VS1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i3 + i4;
        interfaceC3404dV1.c(obj, bArr, i4, i6, vp1);
        vp1.d--;
        vp1.c = obj;
        return i6;
    }

    public static int o(InterfaceC3404dV1 interfaceC3404dV1, int i, byte[] bArr, int i2, int i3, LS1 ls1, VP1 vp1) throws VS1 {
        int i4 = (i & (-8)) | 4;
        AbstractC6843rS1 abstractC6843rS1Zza = interfaceC3404dV1.zza();
        int iM = m(abstractC6843rS1Zza, interfaceC3404dV1, bArr, i2, i3, i4, vp1);
        interfaceC3404dV1.d(abstractC6843rS1Zza);
        vp1.c = abstractC6843rS1Zza;
        ls1.add(abstractC6843rS1Zza);
        while (iM < i3) {
            int iV = v(bArr, iM, vp1);
            if (i != vp1.a) {
                break;
            }
            AbstractC6843rS1 abstractC6843rS1Zza2 = interfaceC3404dV1.zza();
            int iM2 = m(abstractC6843rS1Zza2, interfaceC3404dV1, bArr, iV, i3, i4, vp1);
            interfaceC3404dV1.d(abstractC6843rS1Zza2);
            vp1.c = abstractC6843rS1Zza2;
            ls1.add(abstractC6843rS1Zza2);
            iM = iM2;
        }
        return iM;
    }

    public static int p(byte[] bArr, int i, VP1 vp1) throws VS1 {
        int iV = v(bArr, i, vp1);
        int i2 = vp1.a;
        if (i2 < 0) {
            throw VS1.b();
        }
        if (i2 > bArr.length - iV) {
            throw VS1.d();
        }
        if (i2 == 0) {
            vp1.c = JQ1.c;
            return iV;
        }
        vp1.c = JQ1.h(bArr, iV, i2);
        return iV + i2;
    }

    public static int q(byte[] bArr, int i, LS1 ls1, VP1 vp1) throws VS1 {
        C7607vS1 c7607vS1 = (C7607vS1) ls1;
        int iV = v(bArr, i, vp1);
        int i2 = vp1.a + iV;
        while (iV < i2) {
            iV = v(bArr, iV, vp1);
            c7607vS1.i(vp1.a);
        }
        if (iV == i2) {
            return iV;
        }
        throw VS1.d();
    }

    public static float r(int i, byte[] bArr) {
        return Float.intBitsToFloat(u(i, bArr));
    }

    public static int s(InterfaceC3404dV1 interfaceC3404dV1, int i, byte[] bArr, int i2, int i3, LS1 ls1, VP1 vp1) throws VS1 {
        AbstractC6843rS1 abstractC6843rS1Zza = interfaceC3404dV1.zza();
        int iN = n(abstractC6843rS1Zza, interfaceC3404dV1, bArr, i2, i3, vp1);
        interfaceC3404dV1.d(abstractC6843rS1Zza);
        vp1.c = abstractC6843rS1Zza;
        ls1.add(abstractC6843rS1Zza);
        while (iN < i3) {
            int iV = v(bArr, iN, vp1);
            if (i != vp1.a) {
                break;
            }
            AbstractC6843rS1 abstractC6843rS1Zza2 = interfaceC3404dV1.zza();
            int iN2 = n(abstractC6843rS1Zza2, interfaceC3404dV1, bArr, iV, i3, vp1);
            interfaceC3404dV1.d(abstractC6843rS1Zza2);
            vp1.c = abstractC6843rS1Zza2;
            ls1.add(abstractC6843rS1Zza2);
            iN = iN2;
        }
        return iN;
    }

    public static int t(byte[] bArr, int i, VP1 vp1) throws VS1 {
        int iV = v(bArr, i, vp1);
        int i2 = vp1.a;
        if (i2 < 0) {
            throw VS1.b();
        }
        if (i2 == 0) {
            vp1.c = "";
            return iV;
        }
        AbstractC4170hW1.a.getClass();
        if ((iV | i2 | ((bArr.length - iV) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(iV), Integer.valueOf(i2)));
        }
        int i3 = iV + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (iV < i3) {
            byte b = bArr[iV];
            if (b < 0) {
                break;
            }
            iV++;
            cArr[i4] = (char) b;
            i4++;
        }
        while (iV < i3) {
            int i5 = iV + 1;
            byte b2 = bArr[iV];
            if (b2 >= 0) {
                int i6 = i4 + 1;
                cArr[i4] = (char) b2;
                while (i5 < i3) {
                    byte b3 = bArr[i5];
                    if (b3 < 0) {
                        break;
                    }
                    i5++;
                    cArr[i6] = (char) b3;
                    i6++;
                }
                i4 = i6;
                iV = i5;
            } else if (b2 < -32) {
                if (i5 >= i3) {
                    throw VS1.a();
                }
                iV += 2;
                byte b4 = bArr[i5];
                int i7 = i4 + 1;
                if (b2 < -62 || N22.a(b4)) {
                    throw VS1.a();
                }
                cArr[i4] = (char) ((b4 & 63) | ((b2 & 31) << 6));
                i4 = i7;
            } else if (b2 < -16) {
                if (i5 >= i3 - 1) {
                    throw VS1.a();
                }
                int i8 = iV + 2;
                byte b5 = bArr[i5];
                iV += 3;
                byte b6 = bArr[i8];
                int i9 = i4 + 1;
                if (N22.a(b5) || ((b2 == -32 && b5 < -96) || ((b2 == -19 && b5 >= -96) || N22.a(b6)))) {
                    throw VS1.a();
                }
                cArr[i4] = (char) (((b5 & 63) << 6) | ((b2 & 15) << 12) | (b6 & 63));
                i4 = i9;
            } else {
                if (i5 >= i3 - 2) {
                    throw VS1.a();
                }
                byte b7 = bArr[i5];
                int i10 = iV + 3;
                byte b8 = bArr[iV + 2];
                iV += 4;
                byte b9 = bArr[i10];
                int i11 = i4 + 1;
                if (N22.a(b7) || (((b7 + 112) + (b2 << 28)) >> 30) != 0 || N22.a(b8) || N22.a(b9)) {
                    throw VS1.a();
                }
                int i12 = ((b7 & 63) << 12) | ((b2 & 7) << 18) | ((b8 & 63) << 6) | (b9 & 63);
                cArr[i4] = (char) ((i12 >>> 10) + 55232);
                cArr[i11] = (char) ((i12 & 1023) + 56320);
                i4 += 2;
            }
        }
        vp1.c = new String(cArr, 0, i4);
        return i3;
    }

    public static int u(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int v(byte[] bArr, int i, VP1 vp1) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return l(b, bArr, i2, vp1);
        }
        vp1.a = b;
        return i2;
    }

    public static int w(byte[] bArr, int i, VP1 vp1) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            vp1.b = j;
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
        vp1.b = j2;
        return i3;
    }

    public static long x(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
