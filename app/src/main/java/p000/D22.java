package p000;

import java.text.ParseException;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class D22 {
    /* renamed from: a */
    public static C0697L3 m1499a(Map map) {
        String str = (String) AbstractC11943za0.m26468b(map, "alg", String.class);
        if (str == null) {
            return null;
        }
        return new C0697L3(str);
    }

    /* renamed from: b */
    public static Date m1500b(Map map) {
        if (map.get("exp") == null) {
            return null;
        }
        return new Date(AbstractC11943za0.m26469c("exp", map) * 1000);
    }

    /* renamed from: c */
    public static Date m1501c(Map map) {
        if (map.get("iat") == null) {
            return null;
        }
        return new Date(AbstractC11943za0.m26469c("iat", map) * 1000);
    }

    /* renamed from: d */
    public static LinkedHashSet m1502d(Map map) throws ParseException {
        EnumC7896Lf0 enumC7896Lf0;
        List<String> listM26471e = AbstractC11943za0.m26471e("key_ops", map);
        if (listM26471e == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : listM26471e) {
            if (str != null) {
                EnumC7896Lf0[] enumC7896Lf0ArrValues = EnumC7896Lf0.values();
                int length = enumC7896Lf0ArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        enumC7896Lf0 = null;
                        break;
                    }
                    enumC7896Lf0 = enumC7896Lf0ArrValues[i];
                    if (str.equals(enumC7896Lf0.f6790a)) {
                        break;
                    }
                    i++;
                }
                if (enumC7896Lf0 == null) {
                    throw new ParseException("Invalid JWK operation: ".concat(str), 0);
                }
                linkedHashSet.add(enumC7896Lf0);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: e */
    public static C8156Qf0 m1503e(Map map) throws ParseException {
        try {
            return C8156Qf0.m6741a((String) AbstractC11943za0.m26468b(map, "kty", String.class));
        } catch (IllegalArgumentException e) {
            throw new ParseException(e.getMessage(), 0);
        }
    }

    /* renamed from: f */
    public static C8208Rf0 m1504f(Map map) throws ParseException {
        String str = (String) AbstractC11943za0.m26468b(map, "use", String.class);
        if (str == null) {
            return null;
        }
        C8208Rf0 c8208Rf0 = C8208Rf0.f10369b;
        if (!str.equals(c8208Rf0.f10371a)) {
            c8208Rf0 = C8208Rf0.f10370c;
            if (!str.equals(c8208Rf0.f10371a)) {
                if (str.trim().isEmpty()) {
                    throw new ParseException("JWK use value must not be empty or blank", 0);
                }
                c8208Rf0 = new C8208Rf0(str);
            }
        }
        return c8208Rf0;
    }

    /* renamed from: g */
    public static Date m1505g(Map map) {
        if (map.get("nbf") == null) {
            return null;
        }
        return new Date(AbstractC11943za0.m26469c("nbf", map) * 1000);
    }

    /* renamed from: h */
    public static LinkedList m1506h(Map map) throws ParseException {
        LinkedList linkedListM23593b = AbstractC10596p12.m23593b((List) AbstractC11943za0.m26468b(map, "x5c", List.class));
        if (linkedListM23593b == null || !linkedListM23593b.isEmpty()) {
            return linkedListM23593b;
        }
        return null;
    }

    /* renamed from: i */
    public static double m1507i(int i, byte[] bArr) {
        return Double.longBitsToDouble(m1522x(i, bArr));
    }

    /* renamed from: j */
    public static int m1508j(int i, byte[] bArr, int i2, int i3, LS1 ls1, VP1 vp1) {
        C11420vS1 c11420vS1 = (C11420vS1) ls1;
        int iM1520v = m1520v(bArr, i2, vp1);
        c11420vS1.m25426i(vp1.f12550a);
        while (iM1520v < i3) {
            int iM1520v2 = m1520v(bArr, iM1520v, vp1);
            if (i != vp1.f12550a) {
                break;
            }
            iM1520v = m1520v(bArr, iM1520v2, vp1);
            c11420vS1.m25426i(vp1.f12550a);
        }
        return iM1520v;
    }

    /* renamed from: k */
    public static int m1509k(int i, byte[] bArr, int i2, int i3, PV1 pv1, VP1 vp1) throws VS1 {
        if ((i >>> 3) == 0) {
            throw new VS1("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM1521w = m1521w(bArr, i2, vp1);
            pv1.m6380c(i, Long.valueOf(vp1.f12551b));
            return iM1521w;
        }
        if (i4 == 1) {
            pv1.m6380c(i, Long.valueOf(m1522x(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM1520v = m1520v(bArr, i2, vp1);
            int i5 = vp1.f12550a;
            if (i5 < 0) {
                throw VS1.m8440b();
            }
            if (i5 > bArr.length - iM1520v) {
                throw VS1.m8442d();
            }
            if (i5 == 0) {
                pv1.m6380c(i, JQ1.f5516c);
            } else {
                pv1.m6380c(i, JQ1.m4318h(bArr, iM1520v, i5));
            }
            return iM1520v + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new VS1("Protocol message contained an invalid tag (zero).");
            }
            pv1.m6380c(i, Integer.valueOf(m1519u(i2, bArr)));
            return i2 + 4;
        }
        PV1 pv1M6377e = PV1.m6377e();
        int i6 = (i & (-8)) | 4;
        int i7 = vp1.f12553d + 1;
        vp1.f12553d = i7;
        if (i7 >= 100) {
            throw new VS1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iM1520v2 = m1520v(bArr, i2, vp1);
            int i9 = vp1.f12550a;
            i8 = i9;
            if (i9 == i6) {
                i2 = iM1520v2;
                break;
            }
            int iM1509k = m1509k(i8, bArr, iM1520v2, i3, pv1M6377e, vp1);
            i8 = i9;
            i2 = iM1509k;
        }
        vp1.f12553d--;
        if (i2 > i3 || i8 != i6) {
            throw VS1.m8441c();
        }
        pv1.m6380c(i, pv1M6377e);
        return i2;
    }

    /* renamed from: l */
    public static int m1510l(int i, byte[] bArr, int i2, VP1 vp1) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            vp1.f12550a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            vp1.f12550a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            vp1.f12550a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            vp1.f12550a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                vp1.f12550a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* renamed from: m */
    public static int m1511m(Object obj, InterfaceC9122dV1 interfaceC9122dV1, byte[] bArr, int i, int i2, int i3, VP1 vp1) throws VS1 {
        C10528oU1 c10528oU1 = (C10528oU1) interfaceC9122dV1;
        int i4 = vp1.f12553d + 1;
        vp1.f12553d = i4;
        if (i4 >= 100) {
            throw new VS1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iM23481j = c10528oU1.m23481j(obj, bArr, i, i2, i3, vp1);
        vp1.f12553d--;
        vp1.f12552c = obj;
        return iM23481j;
    }

    /* renamed from: n */
    public static int m1512n(Object obj, InterfaceC9122dV1 interfaceC9122dV1, byte[] bArr, int i, int i2, VP1 vp1) throws VS1 {
        int iM1510l = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM1510l = m1510l(i3, bArr, iM1510l, vp1);
            i3 = vp1.f12550a;
        }
        int i4 = iM1510l;
        if (i3 < 0 || i3 > i2 - i4) {
            throw VS1.m8442d();
        }
        int i5 = vp1.f12553d + 1;
        vp1.f12553d = i5;
        if (i5 >= 100) {
            throw new VS1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i3 + i4;
        interfaceC9122dV1.mo17695c(obj, bArr, i4, i6, vp1);
        vp1.f12553d--;
        vp1.f12552c = obj;
        return i6;
    }

    /* renamed from: o */
    public static int m1513o(InterfaceC9122dV1 interfaceC9122dV1, int i, byte[] bArr, int i2, int i3, LS1 ls1, VP1 vp1) throws VS1 {
        int i4 = (i & (-8)) | 4;
        AbstractC10908rS1 abstractC10908rS1Zza = interfaceC9122dV1.zza();
        int iM1511m = m1511m(abstractC10908rS1Zza, interfaceC9122dV1, bArr, i2, i3, i4, vp1);
        interfaceC9122dV1.mo17696d(abstractC10908rS1Zza);
        vp1.f12552c = abstractC10908rS1Zza;
        ls1.add(abstractC10908rS1Zza);
        while (iM1511m < i3) {
            int iM1520v = m1520v(bArr, iM1511m, vp1);
            if (i != vp1.f12550a) {
                break;
            }
            AbstractC10908rS1 abstractC10908rS1Zza2 = interfaceC9122dV1.zza();
            int iM1511m2 = m1511m(abstractC10908rS1Zza2, interfaceC9122dV1, bArr, iM1520v, i3, i4, vp1);
            interfaceC9122dV1.mo17696d(abstractC10908rS1Zza2);
            vp1.f12552c = abstractC10908rS1Zza2;
            ls1.add(abstractC10908rS1Zza2);
            iM1511m = iM1511m2;
        }
        return iM1511m;
    }

    /* renamed from: p */
    public static int m1514p(byte[] bArr, int i, VP1 vp1) throws VS1 {
        int iM1520v = m1520v(bArr, i, vp1);
        int i2 = vp1.f12550a;
        if (i2 < 0) {
            throw VS1.m8440b();
        }
        if (i2 > bArr.length - iM1520v) {
            throw VS1.m8442d();
        }
        if (i2 == 0) {
            vp1.f12552c = JQ1.f5516c;
            return iM1520v;
        }
        vp1.f12552c = JQ1.m4318h(bArr, iM1520v, i2);
        return iM1520v + i2;
    }

    /* renamed from: q */
    public static int m1515q(byte[] bArr, int i, LS1 ls1, VP1 vp1) throws VS1 {
        C11420vS1 c11420vS1 = (C11420vS1) ls1;
        int iM1520v = m1520v(bArr, i, vp1);
        int i2 = vp1.f12550a + iM1520v;
        while (iM1520v < i2) {
            iM1520v = m1520v(bArr, iM1520v, vp1);
            c11420vS1.m25426i(vp1.f12550a);
        }
        if (iM1520v == i2) {
            return iM1520v;
        }
        throw VS1.m8442d();
    }

    /* renamed from: r */
    public static float m1516r(int i, byte[] bArr) {
        return Float.intBitsToFloat(m1519u(i, bArr));
    }

    /* renamed from: s */
    public static int m1517s(InterfaceC9122dV1 interfaceC9122dV1, int i, byte[] bArr, int i2, int i3, LS1 ls1, VP1 vp1) throws VS1 {
        AbstractC10908rS1 abstractC10908rS1Zza = interfaceC9122dV1.zza();
        int iM1512n = m1512n(abstractC10908rS1Zza, interfaceC9122dV1, bArr, i2, i3, vp1);
        interfaceC9122dV1.mo17696d(abstractC10908rS1Zza);
        vp1.f12552c = abstractC10908rS1Zza;
        ls1.add(abstractC10908rS1Zza);
        while (iM1512n < i3) {
            int iM1520v = m1520v(bArr, iM1512n, vp1);
            if (i != vp1.f12550a) {
                break;
            }
            AbstractC10908rS1 abstractC10908rS1Zza2 = interfaceC9122dV1.zza();
            int iM1512n2 = m1512n(abstractC10908rS1Zza2, interfaceC9122dV1, bArr, iM1520v, i3, vp1);
            interfaceC9122dV1.mo17696d(abstractC10908rS1Zza2);
            vp1.f12552c = abstractC10908rS1Zza2;
            ls1.add(abstractC10908rS1Zza2);
            iM1512n = iM1512n2;
        }
        return iM1512n;
    }

    /* renamed from: t */
    public static int m1518t(byte[] bArr, int i, VP1 vp1) throws VS1 {
        int iM1520v = m1520v(bArr, i, vp1);
        int i2 = vp1.f12550a;
        if (i2 < 0) {
            throw VS1.m8440b();
        }
        if (i2 == 0) {
            vp1.f12552c = "";
            return iM1520v;
        }
        AbstractC9636hW1.f28443a.getClass();
        if ((iM1520v | i2 | ((bArr.length - iM1520v) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(iM1520v), Integer.valueOf(i2)));
        }
        int i3 = iM1520v + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (iM1520v < i3) {
            byte b = bArr[iM1520v];
            if (b < 0) {
                break;
            }
            iM1520v++;
            cArr[i4] = (char) b;
            i4++;
        }
        while (iM1520v < i3) {
            int i5 = iM1520v + 1;
            byte b2 = bArr[iM1520v];
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
                iM1520v = i5;
            } else if (b2 < -32) {
                if (i5 >= i3) {
                    throw VS1.m8439a();
                }
                iM1520v += 2;
                byte b4 = bArr[i5];
                int i7 = i4 + 1;
                if (b2 < -62 || N22.m5528a(b4)) {
                    throw VS1.m8439a();
                }
                cArr[i4] = (char) ((b4 & 63) | ((b2 & 31) << 6));
                i4 = i7;
            } else if (b2 < -16) {
                if (i5 >= i3 - 1) {
                    throw VS1.m8439a();
                }
                int i8 = iM1520v + 2;
                byte b5 = bArr[i5];
                iM1520v += 3;
                byte b6 = bArr[i8];
                int i9 = i4 + 1;
                if (N22.m5528a(b5) || ((b2 == -32 && b5 < -96) || ((b2 == -19 && b5 >= -96) || N22.m5528a(b6)))) {
                    throw VS1.m8439a();
                }
                cArr[i4] = (char) (((b5 & 63) << 6) | ((b2 & 15) << 12) | (b6 & 63));
                i4 = i9;
            } else {
                if (i5 >= i3 - 2) {
                    throw VS1.m8439a();
                }
                byte b7 = bArr[i5];
                int i10 = iM1520v + 3;
                byte b8 = bArr[iM1520v + 2];
                iM1520v += 4;
                byte b9 = bArr[i10];
                int i11 = i4 + 1;
                if (N22.m5528a(b7) || (((b7 + 112) + (b2 << 28)) >> 30) != 0 || N22.m5528a(b8) || N22.m5528a(b9)) {
                    throw VS1.m8439a();
                }
                int i12 = ((b7 & 63) << 12) | ((b2 & 7) << 18) | ((b8 & 63) << 6) | (b9 & 63);
                cArr[i4] = (char) ((i12 >>> 10) + 55232);
                cArr[i11] = (char) ((i12 & 1023) + 56320);
                i4 += 2;
            }
        }
        vp1.f12552c = new String(cArr, 0, i4);
        return i3;
    }

    /* renamed from: u */
    public static int m1519u(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: v */
    public static int m1520v(byte[] bArr, int i, VP1 vp1) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m1510l(b, bArr, i2, vp1);
        }
        vp1.f12550a = b;
        return i2;
    }

    /* renamed from: w */
    public static int m1521w(byte[] bArr, int i, VP1 vp1) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            vp1.f12551b = j;
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
        vp1.f12551b = j2;
        return i3;
    }

    /* renamed from: x */
    public static long m1522x(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
