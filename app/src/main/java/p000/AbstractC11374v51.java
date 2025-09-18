package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: v51 */
/* loaded from: classes2.dex */
public abstract class AbstractC11374v51 extends D51 {
    /* renamed from: A */
    public static /* synthetic */ int m25326A(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m25360y(i, charSequence, str, z);
    }

    /* renamed from: B */
    public static final int m25327B(CharSequence charSequence, char[] cArr, int i, boolean z) {
        O90.m5968f(charSequence, "<this>");
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
        int iM25359x = m25359x(charSequence);
        if (i > iM25359x) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (HS1.m3432c(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iM25359x) {
                return -1;
            }
            i++;
        }
    }

    /* renamed from: C */
    public static boolean m25328C(CharSequence charSequence) {
        O90.m5968f(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!HS1.m3433d(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: D */
    public static char m25329D(CharSequence charSequence) {
        O90.m5968f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(m25359x(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: E */
    public static int m25330E(int i, String str, String str2) {
        int iM25359x = (i & 2) != 0 ? m25359x(str) : 0;
        O90.m5968f(str, "<this>");
        O90.m5968f(str2, "string");
        return str.lastIndexOf(str2, iM25359x);
    }

    /* renamed from: F */
    public static int m25331F(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = m25359x(str);
        }
        O90.m5968f(str, "<this>");
        return str.lastIndexOf(c, i);
    }

    /* renamed from: G */
    public static final List m25332G(String str) {
        O90.m5968f(str, "<this>");
        return AbstractC9639hY0.m18835n(AbstractC9639hY0.m18833l(m25333H(str, new String[]{"\r\n", "\n", "\r"}, false, 0), new C11387vC0(str, 21)));
    }

    /* renamed from: H */
    public static C0962PH m25333H(CharSequence charSequence, String[] strArr, boolean z, int i) {
        m25337L(i);
        return new C0962PH(charSequence, 0, i, new E51(AbstractC0576J8.m4176c(strArr), z, 1));
    }

    /* renamed from: I */
    public static final boolean m25334I(String str, int i, CharSequence charSequence, int i2, int i3, boolean z) {
        O90.m5968f(str, "<this>");
        O90.m5968f(charSequence, "other");
        if (i2 < 0 || i < 0 || i > str.length() - i3 || i2 > charSequence.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!HS1.m3432c(str.charAt(i + i4), charSequence.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: J */
    public static String m25335J(CharSequence charSequence, String str) {
        O90.m5968f(str, "<this>");
        O90.m5968f(charSequence, "prefix");
        if (!m25342Q(charSequence, str)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        O90.m5967e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: K */
    public static String m25336K(CharSequence charSequence, String str) {
        O90.m5968f(str, "<this>");
        O90.m5968f(charSequence, "suffix");
        if (!m25356u(charSequence, str)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - charSequence.length());
        O90.m5967e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: L */
    public static final void m25337L(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Limit must be non-negative, but was ").toString());
        }
    }

    /* renamed from: M */
    public static StringBuilder m25338M(CharSequence charSequence) {
        O90.m5968f(charSequence, "<this>");
        StringBuilder sbReverse = new StringBuilder(charSequence).reverse();
        O90.m5967e(sbReverse, "reverse(...)");
        return sbReverse;
    }

    /* renamed from: N */
    public static final List m25339N(int i, CharSequence charSequence, String str, boolean z) {
        m25337L(i);
        int length = 0;
        int iM25360y = m25360y(0, charSequence, str, z);
        if (iM25360y == -1 || i == 1) {
            return AbstractC7230yu.m26274e(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i2 = 10;
        if (z2 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        do {
            arrayList.add(charSequence.subSequence(length, iM25360y).toString());
            length = str.length() + iM25360y;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iM25360y = m25360y(length, charSequence, str, z);
        } while (iM25360y != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: O */
    public static List m25340O(CharSequence charSequence, String[] strArr, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        O90.m5968f(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return m25339N(i, charSequence, str, false);
            }
        }
        C0962PH c0962phM25333H = m25333H(charSequence, strArr, false, i);
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(new C0702L8(2, c0962phM25333H)));
        Iterator it = c0962phM25333H.iterator();
        while (it.hasNext()) {
            arrayList.add(m25343R(charSequence, (C9461g90) it.next()));
        }
        return arrayList;
    }

    /* renamed from: P */
    public static List m25341P(String str, char[] cArr) {
        O90.m5968f(str, "<this>");
        if (cArr.length == 1) {
            return m25339N(0, str, String.valueOf(cArr[0]), false);
        }
        m25337L(0);
        C0962PH c0962ph = new C0962PH(str, 0, 0, new E51(cArr, false, 0));
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(new C0702L8(2, c0962ph)));
        Iterator it = c0962ph.iterator();
        while (it.hasNext()) {
            arrayList.add(m25343R(str, (C9461g90) it.next()));
        }
        return arrayList;
    }

    /* renamed from: Q */
    public static boolean m25342Q(CharSequence charSequence, String str) {
        O90.m5968f(str, "<this>");
        O90.m5968f(charSequence, "prefix");
        return charSequence instanceof String ? D51.m1556o(str, (String) charSequence, false) : m25334I(str, 0, charSequence, 0, charSequence.length(), false);
    }

    /* renamed from: R */
    public static final String m25343R(CharSequence charSequence, C9461g90 c9461g90) {
        O90.m5968f(charSequence, "<this>");
        O90.m5968f(c9461g90, "range");
        return charSequence.subSequence(c9461g90.f26569a, c9461g90.f26570b + 1).toString();
    }

    /* renamed from: S */
    public static String m25344S(String str, String str2, String str3) {
        O90.m5968f(str2, "delimiter");
        O90.m5968f(str3, "missingDelimiterValue");
        int iM25326A = m25326A(str, str2, 0, false, 6);
        if (iM25326A == -1) {
            return str3;
        }
        String strSubstring = str.substring(str2.length() + iM25326A, str.length());
        O90.m5967e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: T */
    public static String m25345T(String str) {
        int iM25361z = m25361z(str, '$', 0, false, 6);
        if (iM25361z == -1) {
            return str;
        }
        String strSubstring = str.substring(iM25361z + 1, str.length());
        O90.m5967e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: U */
    public static String m25346U(char c, String str, String str2) {
        O90.m5968f(str, "<this>");
        O90.m5968f(str2, "missingDelimiterValue");
        int iM25331F = m25331F(str, c, 0, 6);
        if (iM25331F == -1) {
            return str2;
        }
        String strSubstring = str.substring(iM25331F + 1, str.length());
        O90.m5967e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: V */
    public static String m25347V(String str, String str2) {
        O90.m5968f(str, "<this>");
        O90.m5968f(str, "missingDelimiterValue");
        int iM25326A = m25326A(str, str2, 0, false, 6);
        if (iM25326A == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iM25326A);
        O90.m5967e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: W */
    public static String m25348W(String str, String str2) {
        O90.m5968f(str, "<this>");
        O90.m5968f(str2, "missingDelimiterValue");
        int iM25330E = m25330E(6, str, ".");
        if (iM25330E == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iM25330E);
        O90.m5967e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: X */
    public static String m25349X(int i, String str) {
        O90.m5968f(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC7222ym.m26230g(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        O90.m5967e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: Y */
    public static CharSequence m25350Y(CharSequence charSequence) {
        O90.m5968f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM3433d = HS1.m3433d(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zM3433d) {
                    break;
                }
                length--;
            } else if (zM3433d) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: p */
    public static boolean m25351p(CharSequence charSequence, String str, boolean z) {
        O90.m5968f(charSequence, "<this>");
        O90.m5968f(str, "other");
        return m25326A(charSequence, str, 0, z, 2) >= 0;
    }

    /* renamed from: q */
    public static boolean m25352q(CharSequence charSequence, char c) {
        O90.m5968f(charSequence, "<this>");
        return m25361z(charSequence, c, 0, false, 2) >= 0;
    }

    /* renamed from: s */
    public static String m25354s(int i, String str) {
        O90.m5968f(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC7222ym.m26230g(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(i);
        O90.m5967e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: t */
    public static String m25355t(String str) {
        O90.m5968f(str, "<this>");
        int length = str.length() - 1;
        if (length < 0) {
            length = 0;
        }
        return m25349X(length, str);
    }

    /* renamed from: u */
    public static boolean m25356u(CharSequence charSequence, String str) {
        O90.m5968f(str, "<this>");
        O90.m5968f(charSequence, "suffix");
        return charSequence instanceof String ? D51.m1550i(str, (String) charSequence) : m25334I(str, str.length() - charSequence.length(), charSequence, 0, charSequence.length(), false);
    }

    /* renamed from: v */
    public static boolean m25357v(String str, char c) {
        O90.m5968f(str, "<this>");
        return str.length() > 0 && HS1.m3432c(str.charAt(m25359x(str)), c, false);
    }

    /* renamed from: w */
    public static char m25358w(String str) {
        if (str.length() != 0) {
            return str.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: x */
    public static int m25359x(CharSequence charSequence) {
        O90.m5968f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: y */
    public static final int m25360y(int i, CharSequence charSequence, String str, boolean z) {
        O90.m5968f(charSequence, "<this>");
        O90.m5968f(str, "string");
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
        C9461g90 c9461g90 = new C9461g90(i, length, 1);
        boolean z2 = charSequence instanceof String;
        int i2 = c9461g90.f26571c;
        int i3 = c9461g90.f26570b;
        int i4 = c9461g90.f26569a;
        if (!z2 || !(str instanceof String)) {
            if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
                while (!m25334I(str, 0, charSequence, i4, str.length(), z)) {
                    if (i4 != i3) {
                        i4 += i2;
                    }
                }
                return i4;
            }
            return -1;
        }
        if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
            while (!D51.m1552k(0, i4, str.length(), str, (String) charSequence, z)) {
                if (i4 != i3) {
                    i4 += i2;
                }
            }
            return i4;
        }
        return -1;
    }

    /* renamed from: z */
    public static int m25361z(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        O90.m5968f(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? m25327B(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }
}
