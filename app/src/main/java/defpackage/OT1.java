package defpackage;

/* loaded from: classes.dex */
public abstract class OT1 {
    public static boolean a(String str, String str2) {
        O90.f(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt != '(') {
                        if (cCharAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i2++;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    String strSubstring = str.substring(1, str.length() - 1);
                    O90.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return O90.a(AbstractC7538v51.Y(strSubstring).toString(), str2);
                }
            }
        }
        return false;
    }

    public String b() {
        return null;
    }

    public String c() {
        return null;
    }
}
