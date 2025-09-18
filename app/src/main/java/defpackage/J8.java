package defpackage;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class J8 extends MN1 {
    public static List A(char[] cArr) {
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            chArr[i] = Character.valueOf(cArr[i]);
        }
        Character[] chArr2 = chArr;
        if (chArr2.length > 1) {
            Arrays.sort(chArr2);
        }
        return c(chArr);
    }

    public static final void B(Object[] objArr, AbstractSet abstractSet) {
        O90.f(objArr, "<this>");
        for (Object obj : objArr) {
            abstractSet.add(obj);
        }
    }

    public static List C(int[] iArr) {
        O90.f(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return MN.a;
        }
        if (length == 1) {
            return AbstractC8259yu.e(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static List D(Object[] objArr) {
        O90.f(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? E(objArr) : AbstractC8259yu.e(objArr[0]) : MN.a;
    }

    public static ArrayList E(Object[] objArr) {
        O90.f(objArr, "<this>");
        return new ArrayList(new C5827m8(objArr, false));
    }

    public static Set F(Object[] objArr) {
        O90.f(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return SN.a;
        }
        if (length == 1) {
            return AbstractC7627vZ0.e(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC7287tn0.b(objArr.length));
        B(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static List c(Object[] objArr) {
        O90.f(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        O90.e(listAsList, "asList(...)");
        return listAsList;
    }

    public static InterfaceC3412dY0 d(Object[] objArr) {
        return objArr.length == 0 ? RN.a : new M8(0, objArr);
    }

    public static boolean e(Object[] objArr, Object obj) {
        O90.f(objArr, "<this>");
        return s(objArr, obj) >= 0;
    }

    public static boolean f(Object[] objArr, Object[] objArr2) {
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
                    if (!f((Object[]) obj, (Object[]) obj2)) {
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

    public static void g(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        O90.f(objArr, "<this>");
        O90.f(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void h(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        O90.f(bArr, "<this>");
        O90.f(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static byte[] i(byte[] bArr, int i, int i2) {
        O90.f(bArr, "<this>");
        MN1.a(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        O90.e(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] j(Object[] objArr, int i, int i2) {
        O90.f(objArr, "<this>");
        MN1.a(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        O90.e(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void k(Object[] objArr, int i, int i2) {
        O90.f(objArr, "<this>");
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static ArrayList m(Object[] objArr) {
        O90.f(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object n(Object[] objArr) {
        O90.f(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object o(Object[] objArr) {
        O90.f(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static int p(Object[] objArr) {
        O90.f(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Integer q(int i, int[] iArr) {
        O90.f(iArr, "<this>");
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static Object r(int i, Object[] objArr) {
        O90.f(objArr, "<this>");
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int s(Object[] objArr, Object obj) {
        O90.f(objArr, "<this>");
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

    public static final void t(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(objArr, "<this>");
        O90.f(charSequence, "separator");
        O90.f(charSequence2, "prefix");
        O90.f(charSequence3, "postfix");
        O90.f(charSequence4, "truncated");
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
            AbstractC7728w51.a(sb, obj, interfaceC6099nZ);
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String u(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(objArr, "<this>");
        O90.f(charSequence, "separator");
        O90.f(charSequence2, "prefix");
        O90.f(charSequence3, "postfix");
        O90.f(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        t(objArr, sb, charSequence, charSequence2, charSequence3, i, charSequence4, interfaceC6099nZ);
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }

    public static String v(byte[] bArr, InterfaceC6099nZ interfaceC6099nZ) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            sb.append((CharSequence) interfaceC6099nZ.invoke(Byte.valueOf(b)));
        }
        sb.append((CharSequence) "");
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String w(Object[] objArr, String str, String str2, String str3, InterfaceC6099nZ interfaceC6099nZ, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            interfaceC6099nZ = null;
        }
        return u(objArr, str4, str5, str6, -1, "...", interfaceC6099nZ);
    }

    public static Object x(Object[] objArr) {
        O90.f(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object y(Object[] objArr) {
        O90.f(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static void z(Object[] objArr, Comparator comparator) {
        O90.f(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }
}
