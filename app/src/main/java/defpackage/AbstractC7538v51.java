package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: v51 */
/* loaded from: classes2.dex */
public abstract class AbstractC7538v51 extends D51 {
    public static /* synthetic */ int A(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return y(i, charSequence, str, z);
    }

    public static final int B(CharSequence charSequence, char[] cArr, int i, boolean z) {
        O90.f(charSequence, "<this>");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int iX = x(charSequence);
        if (i > iX) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (HS1.c(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iX) {
                return -1;
            }
            i++;
        }
    }

    public static boolean C(CharSequence charSequence) {
        O90.f(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!HS1.d(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char D(CharSequence charSequence) {
        O90.f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(x(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int E(int i, String str, String str2) {
        int iX = (i & 2) != 0 ? x(str) : 0;
        O90.f(str, "<this>");
        O90.f(str2, "string");
        return str.lastIndexOf(str2, iX);
    }

    public static int F(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = x(str);
        }
        O90.f(str, "<this>");
        return str.lastIndexOf(c, i);
    }

    public static final List G(String str) {
        O90.f(str, "<this>");
        return AbstractC4175hY0.n(AbstractC4175hY0.l(H(str, new String[]{"\r\n", "\n", "\r"}, false, 0), new C7558vC0(str, 21)));
    }

    public static PH H(CharSequence charSequence, String[] strArr, boolean z, int i) {
        L(i);
        return new PH(charSequence, 0, i, new E51(J8.c(strArr), z, 1));
    }

    public static final boolean I(String str, int i, CharSequence charSequence, int i2, int i3, boolean z) {
        O90.f(str, "<this>");
        O90.f(charSequence, "other");
        if (i2 < 0 || i < 0 || i > str.length() - i3 || i2 > charSequence.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!HS1.c(str.charAt(i + i4), charSequence.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String J(CharSequence charSequence, String str) {
        O90.f(str, "<this>");
        O90.f(charSequence, "prefix");
        if (!Q(charSequence, str)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        O90.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String K(CharSequence charSequence, String str) {
        O90.f(str, "<this>");
        O90.f(charSequence, "suffix");
        if (!u(charSequence, str)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - charSequence.length());
        O90.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void L(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC7209tN0.u(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static StringBuilder M(CharSequence charSequence) {
        O90.f(charSequence, "<this>");
        StringBuilder sbReverse = new StringBuilder(charSequence).reverse();
        O90.e(sbReverse, "reverse(...)");
        return sbReverse;
    }

    public static final List N(int i, CharSequence charSequence, String str, boolean z) {
        L(i);
        int length = 0;
        int iY = y(0, charSequence, str, z);
        if (iY == -1 || i == 1) {
            return AbstractC8259yu.e(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i2 = 10;
        if (z2 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        do {
            arrayList.add(charSequence.subSequence(length, iY).toString());
            length = str.length() + iY;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iY = y(length, charSequence, str, z);
        } while (iY != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List O(CharSequence charSequence, String[] strArr, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        O90.f(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return N(i, charSequence, str, false);
            }
        }
        PH phH = H(charSequence, strArr, false, i);
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(new L8(2, phH)));
        Iterator it = phH.iterator();
        while (it.hasNext()) {
            arrayList.add(R(charSequence, (C3909g90) it.next()));
        }
        return arrayList;
    }

    public static List P(String str, char[] cArr) {
        O90.f(str, "<this>");
        if (cArr.length == 1) {
            return N(0, str, String.valueOf(cArr[0]), false);
        }
        L(0);
        PH ph = new PH(str, 0, 0, new E51(cArr, false, 0));
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(new L8(2, ph)));
        Iterator it = ph.iterator();
        while (it.hasNext()) {
            arrayList.add(R(str, (C3909g90) it.next()));
        }
        return arrayList;
    }

    public static boolean Q(CharSequence charSequence, String str) {
        O90.f(str, "<this>");
        O90.f(charSequence, "prefix");
        return charSequence instanceof String ? D51.o(str, (String) charSequence, false) : I(str, 0, charSequence, 0, charSequence.length(), false);
    }

    public static final String R(CharSequence charSequence, C3909g90 c3909g90) {
        O90.f(charSequence, "<this>");
        O90.f(c3909g90, "range");
        return charSequence.subSequence(c3909g90.a, c3909g90.b + 1).toString();
    }

    public static String S(String str, String str2, String str3) {
        O90.f(str2, "delimiter");
        O90.f(str3, "missingDelimiterValue");
        int iA = A(str, str2, 0, false, 6);
        if (iA == -1) {
            return str3;
        }
        String strSubstring = str.substring(str2.length() + iA, str.length());
        O90.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String T(String str) {
        int iZ = z(str, '$', 0, false, 6);
        if (iZ == -1) {
            return str;
        }
        String strSubstring = str.substring(iZ + 1, str.length());
        O90.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String U(char c, String str, String str2) {
        O90.f(str, "<this>");
        O90.f(str2, "missingDelimiterValue");
        int iF = F(str, c, 0, 6);
        if (iF == -1) {
            return str2;
        }
        String strSubstring = str.substring(iF + 1, str.length());
        O90.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String V(String str, String str2) {
        O90.f(str, "<this>");
        O90.f(str, "missingDelimiterValue");
        int iA = A(str, str2, 0, false, 6);
        if (iA == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iA);
        O90.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String W(String str, String str2) {
        O90.f(str, "<this>");
        O90.f(str2, "missingDelimiterValue");
        int iE = E(6, str, ".");
        if (iE == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iE);
        O90.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String X(int i, String str) {
        O90.f(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC8235ym.g(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        O90.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence Y(CharSequence charSequence) {
        O90.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zD = HS1.d(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zD) {
                    break;
                }
                length--;
            } else if (zD) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static boolean p(CharSequence charSequence, String str, boolean z) {
        O90.f(charSequence, "<this>");
        O90.f(str, "other");
        return A(charSequence, str, 0, z, 2) >= 0;
    }

    public static boolean q(CharSequence charSequence, char c) {
        O90.f(charSequence, "<this>");
        return z(charSequence, c, 0, false, 2) >= 0;
    }

    public static String s(int i, String str) {
        O90.f(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC8235ym.g(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(i);
        O90.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String t(String str) {
        O90.f(str, "<this>");
        int length = str.length() - 1;
        if (length < 0) {
            length = 0;
        }
        return X(length, str);
    }

    public static boolean u(CharSequence charSequence, String str) {
        O90.f(str, "<this>");
        O90.f(charSequence, "suffix");
        return charSequence instanceof String ? D51.i(str, (String) charSequence) : I(str, str.length() - charSequence.length(), charSequence, 0, charSequence.length(), false);
    }

    public static boolean v(String str, char c) {
        O90.f(str, "<this>");
        return str.length() > 0 && HS1.c(str.charAt(x(str)), c, false);
    }

    public static char w(String str) {
        if (str.length() != 0) {
            return str.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int x(CharSequence charSequence) {
        O90.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int y(int i, CharSequence charSequence, String str, boolean z) {
        O90.f(charSequence, "<this>");
        O90.f(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        C3909g90 c3909g90 = new C3909g90(i, length, 1);
        boolean z2 = charSequence instanceof String;
        int i2 = c3909g90.c;
        int i3 = c3909g90.b;
        int i4 = c3909g90.a;
        if (!z2 || !(str instanceof String)) {
            if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
                while (!I(str, 0, charSequence, i4, str.length(), z)) {
                    if (i4 != i3) {
                        i4 += i2;
                    }
                }
                return i4;
            }
            return -1;
        }
        if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
            while (!D51.k(0, i4, str.length(), str, (String) charSequence, z)) {
                if (i4 != i3) {
                    i4 += i2;
                }
            }
            return i4;
        }
        return -1;
    }

    public static int z(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        O90.f(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? B(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }
}
