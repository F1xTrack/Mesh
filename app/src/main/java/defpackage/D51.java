package defpackage;

/* loaded from: classes2.dex */
public abstract class D51 extends C51 {
    public static String h(byte[] bArr) {
        O90.f(bArr, "<this>");
        return new String(bArr, AbstractC7680vr.a);
    }

    public static boolean i(String str, String str2) {
        O90.f(str, "<this>");
        O90.f(str2, "suffix");
        return str.endsWith(str2);
    }

    public static boolean j(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final boolean k(int i, int i2, int i3, String str, String str2, boolean z) {
        O90.f(str, "<this>");
        O90.f(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static String l(String str, char c, char c2) {
        O90.f(str, "<this>");
        String strReplace = str.replace(c, c2);
        O90.e(strReplace, "replace(...)");
        return strReplace;
    }

    public static String m(String str, String str2, String str3) {
        O90.f(str, "<this>");
        O90.f(str2, "oldValue");
        O90.f(str3, "newValue");
        int iY = AbstractC7538v51.y(0, str, str2, false);
        if (iY < 0) {
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
            sb.append((CharSequence) str, i2, iY);
            sb.append(str3);
            i2 = iY + length;
            if (iY >= str.length()) {
                break;
            }
            iY = AbstractC7538v51.y(iY + i, str, str2, false);
        } while (iY > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }

    public static boolean n(String str, String str2, int i, boolean z) {
        O90.f(str, "<this>");
        return !z ? str.startsWith(str2, i) : k(i, 0, str2.length(), str, str2, z);
    }

    public static boolean o(String str, String str2, boolean z) {
        O90.f(str, "<this>");
        O90.f(str2, "prefix");
        return !z ? str.startsWith(str2) : k(0, 0, str2.length(), str, str2, z);
    }
}
