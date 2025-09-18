package p000;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: J8 */
/* loaded from: classes2.dex */
public abstract class AbstractC0576J8 extends MN1 {
    /* renamed from: A */
    public static List m4170A(char[] cArr) {
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            chArr[i] = Character.valueOf(cArr[i]);
        }
        Character[] chArr2 = chArr;
        if (chArr2.length > 1) {
            Arrays.sort(chArr2);
        }
        return m4176c(chArr);
    }

    /* renamed from: B */
    public static final void m4171B(Object[] objArr, AbstractSet abstractSet) {
        O90.m5968f(objArr, "<this>");
        for (Object obj : objArr) {
            abstractSet.add(obj);
        }
    }

    /* renamed from: C */
    public static List m4172C(int[] iArr) {
        O90.m5968f(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return C0779MN.f7117a;
        }
        if (length == 1) {
            return AbstractC7230yu.m26274e(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    /* renamed from: D */
    public static List m4173D(Object[] objArr) {
        O90.m5968f(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? m4174E(objArr) : AbstractC7230yu.m26274e(objArr[0]) : C0779MN.f7117a;
    }

    /* renamed from: E */
    public static ArrayList m4174E(Object[] objArr) {
        O90.m5968f(objArr, "<this>");
        return new ArrayList(new C6407m8(objArr, false));
    }

    /* renamed from: F */
    public static Set m4175F(Object[] objArr) {
        O90.m5968f(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return C1156SN.f10705a;
        }
        if (length == 1) {
            return AbstractC11433vZ0.m25454e(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC11205tn0.m24983b(objArr.length));
        m4171B(objArr, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: c */
    public static List m4176c(Object[] objArr) {
        O90.m5968f(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        O90.m5967e(listAsList, "asList(...)");
        return listAsList;
    }

    /* renamed from: d */
    public static InterfaceC9127dY0 m4177d(Object[] objArr) {
        return objArr.length == 0 ? C1093RN.f10147a : new C0764M8(0, objArr);
    }

    /* renamed from: e */
    public static boolean m4178e(Object[] objArr, Object obj) {
        O90.m5968f(objArr, "<this>");
        return m4192s(objArr, obj) >= 0;
    }

    /* renamed from: f */
    public static boolean m4179f(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Object obj2 = objArr2[i];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!m4179f((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: g */
    public static void m4180g(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        O90.m5968f(objArr, "<this>");
        O90.m5968f(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    /* renamed from: h */
    public static void m4181h(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        O90.m5968f(bArr, "<this>");
        O90.m5968f(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    /* renamed from: i */
    public static byte[] m4182i(byte[] bArr, int i, int i2) {
        O90.m5968f(bArr, "<this>");
        MN1.m5359a(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        O90.m5967e(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    /* renamed from: j */
    public static Object[] m4183j(Object[] objArr, int i, int i2) {
        O90.m5968f(objArr, "<this>");
        MN1.m5359a(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        O90.m5967e(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    /* renamed from: k */
    public static void m4184k(Object[] objArr, int i, int i2) {
        O90.m5968f(objArr, "<this>");
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    /* renamed from: m */
    public static ArrayList m4186m(Object[] objArr) {
        O90.m5968f(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    public static Object m4187n(Object[] objArr) {
        O90.m5968f(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: o */
    public static Object m4188o(Object[] objArr) {
        O90.m5968f(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* renamed from: p */
    public static int m4189p(Object[] objArr) {
        O90.m5968f(objArr, "<this>");
        return objArr.length - 1;
    }

    /* renamed from: q */
    public static Integer m4190q(int i, int[] iArr) {
        O90.m5968f(iArr, "<this>");
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    /* renamed from: r */
    public static Object m4191r(int i, Object[] objArr) {
        O90.m5968f(objArr, "<this>");
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    /* renamed from: s */
    public static int m4192s(Object[] objArr, Object obj) {
        O90.m5968f(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: t */
    public static final void m4193t(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(objArr, "<this>");
        O90.m5968f(charSequence, "separator");
        O90.m5968f(charSequence2, "prefix");
        O90.m5968f(charSequence3, "postfix");
        O90.m5968f(charSequence4, "truncated");
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            AbstractC11501w51.m25560a(sb, obj, interfaceC6497nZ);
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    /* renamed from: u */
    public static String m4194u(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(objArr, "<this>");
        O90.m5968f(charSequence, "separator");
        O90.m5968f(charSequence2, "prefix");
        O90.m5968f(charSequence3, "postfix");
        O90.m5968f(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        m4193t(objArr, sb, charSequence, charSequence2, charSequence3, i, charSequence4, interfaceC6497nZ);
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }

    /* renamed from: v */
    public static String m4195v(byte[] bArr, InterfaceC6497nZ interfaceC6497nZ) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            sb.append((CharSequence) interfaceC6497nZ.invoke(Byte.valueOf(b)));
        }
        sb.append((CharSequence) "");
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }

    /* renamed from: w */
    public static /* synthetic */ String m4196w(Object[] objArr, String str, String str2, String str3, InterfaceC6497nZ interfaceC6497nZ, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            interfaceC6497nZ = null;
        }
        return m4194u(objArr, str4, str5, str6, -1, "...", interfaceC6497nZ);
    }

    /* renamed from: x */
    public static Object m4197x(Object[] objArr) {
        O90.m5968f(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: y */
    public static Object m4198y(Object[] objArr) {
        O90.m5968f(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* renamed from: z */
    public static void m4199z(Object[] objArr, Comparator comparator) {
        O90.m5968f(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }
}
