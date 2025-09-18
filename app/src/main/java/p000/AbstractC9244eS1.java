package p000;

/* renamed from: eS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9244eS1 {
    /* renamed from: a */
    public static final String m17991a(String str) {
        char cCharAt;
        O90.m5968f(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        String strSubstring = str.substring(1);
        O90.m5967e(strSubstring, "substring(...)");
        return upperCase + strSubstring;
    }

    /* renamed from: b */
    public static int m17992b(int i, int i2) {
        if (i2 != 1) {
            if (i2 == 2) {
                if (i != 3) {
                    if (i == 4) {
                        return 0;
                    }
                    if (i != 5) {
                        throw new IllegalArgumentException(AbstractC7222ym.m26229f(i, "[RNScreens] Invalid state ", i2, " for detentCount "));
                    }
                }
                return 1;
            }
            if (i2 != 3) {
                throw new IllegalArgumentException(AbstractC7222ym.m26229f(i, "[RNScreens] Invalid state ", i2, " for detentCount "));
            }
            if (i == 3) {
                return 2;
            }
            if (i == 4) {
                return 0;
            }
            if (i != 5) {
                if (i != 6) {
                    throw new IllegalArgumentException(AbstractC7222ym.m26229f(i, "[RNScreens] Invalid state ", i2, " for detentCount "));
                }
                return 1;
            }
        } else {
            if (i == 3) {
                return 0;
            }
            if (i != 5) {
                throw new IllegalArgumentException(AbstractC7222ym.m26229f(i, "[RNScreens] Invalid state ", i2, " for detentCount "));
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static final boolean m17993c(int i, String str) {
        char cCharAt = str.charAt(i);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    /* renamed from: d */
    public static int m17994d(int i, int i2) {
        if (i2 != 1) {
            if (i2 == 2) {
                if (i == -1) {
                    return 5;
                }
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalArgumentException(AbstractC7222ym.m26229f(i2, "[RNScreens] Invalid detentCount/index combination ", i, " / "));
                    }
                }
                return 4;
            }
            if (i2 != 3) {
                throw new IllegalArgumentException(AbstractC7222ym.m26229f(i2, "[RNScreens] Invalid detentCount/index combination ", i, " / "));
            }
            if (i == -1) {
                return 5;
            }
            if (i != 0) {
                if (i == 1) {
                    return 6;
                }
                if (i != 2) {
                    throw new IllegalArgumentException(AbstractC7222ym.m26229f(i2, "[RNScreens] Invalid detentCount/index combination ", i, " / "));
                }
            }
            return 4;
        }
        if (i == -1) {
            return 5;
        }
        if (i != 0) {
            throw new IllegalArgumentException(AbstractC7222ym.m26229f(i2, "[RNScreens] Invalid detentCount/index combination ", i, " / "));
        }
        return 3;
    }

    /* renamed from: e */
    public static final String m17995e(String str) {
        O90.m5968f(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }
}
