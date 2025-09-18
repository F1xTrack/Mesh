package defpackage;

import java.util.regex.Pattern;

/* renamed from: gn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4030gn1 {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final C4103hA0 a = new C4103hA0();
    public final StringBuilder b = new StringBuilder();

    public static String a(C4103hA0 c4103hA0, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = c4103hA0.b;
        int i2 = c4103hA0.c;
        while (i < i2 && !z) {
            char c2 = (char) c4103hA0.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        c4103hA0.H(i - c4103hA0.b);
        return sb.toString();
    }

    public static String b(C4103hA0 c4103hA0, StringBuilder sb) {
        c(c4103hA0);
        if (c4103hA0.a() == 0) {
            return null;
        }
        String strA = a(c4103hA0, sb);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) c4103hA0.u());
    }

    public static void c(C4103hA0 c4103hA0) {
        while (true) {
            for (boolean z = true; c4103hA0.a() > 0 && z; z = false) {
                int i = c4103hA0.b;
                byte[] bArr = c4103hA0.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    c4103hA0.H(1);
                } else {
                    int i2 = c4103hA0.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            c4103hA0.H(i2 - c4103hA0.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
