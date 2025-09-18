package p000;

/* loaded from: classes2.dex */
public abstract class D51 extends C51 {
    /* renamed from: h */
    public static String m1549h(byte[] bArr) {
        O90.m5968f(bArr, "<this>");
        return new String(bArr, AbstractC7038vr.f44561a);
    }

    /* renamed from: i */
    public static boolean m1550i(String str, String str2) {
        O90.m5968f(str, "<this>");
        O90.m5968f(str2, "suffix");
        return str.endsWith(str2);
    }

    /* renamed from: j */
    public static boolean m1551j(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    /* renamed from: k */
    public static final boolean m1552k(int i, int i2, int i3, String str, String str2, boolean z) {
        O90.m5968f(str, "<this>");
        O90.m5968f(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: l */
    public static String m1553l(String str, char c, char c2) {
        O90.m5968f(str, "<this>");
        String strReplace = str.replace(c, c2);
        O90.m5967e(strReplace, "replace(...)");
        return strReplace;
    }

    /* renamed from: m */
    public static String m1554m(String str, String str2, String str3) {
        O90.m5968f(str, "<this>");
        O90.m5968f(str2, "oldValue");
        O90.m5968f(str3, "newValue");
        int iM25360y = AbstractC11374v51.m25360y(0, str, str2, false);
        if (iM25360y < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iM25360y);
            sb.append(str3);
            i2 = iM25360y + length;
            if (iM25360y >= str.length()) {
                break;
            }
            iM25360y = AbstractC11374v51.m25360y(iM25360y + i, str, str2, false);
        } while (iM25360y > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }

    /* renamed from: n */
    public static boolean m1555n(String str, String str2, int i, boolean z) {
        O90.m5968f(str, "<this>");
        return !z ? str.startsWith(str2, i) : m1552k(i, 0, str2.length(), str, str2, z);
    }

    /* renamed from: o */
    public static boolean m1556o(String str, String str2, boolean z) {
        O90.m5968f(str, "<this>");
        O90.m5968f(str2, "prefix");
        return !z ? str.startsWith(str2) : m1552k(0, 0, str2.length(), str, str2, z);
    }
}
