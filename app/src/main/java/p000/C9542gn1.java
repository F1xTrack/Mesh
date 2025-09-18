package p000;

import java.util.regex.Pattern;

/* renamed from: gn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9542gn1 {

    /* renamed from: c */
    public static final Pattern f27995c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d */
    public static final Pattern f27996d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a */
    public final C9591hA0 f27997a = new C9591hA0();

    /* renamed from: b */
    public final StringBuilder f27998b = new StringBuilder();

    /* renamed from: a */
    public static String m18642a(C9591hA0 c9591hA0, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = c9591hA0.f28294b;
        int i2 = c9591hA0.f28295c;
        while (i < i2 && !z) {
            char c = (char) c9591hA0.f28293a[i];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c);
            }
        }
        c9591hA0.m18742H(i - c9591hA0.f28294b);
        return sb.toString();
    }

    /* renamed from: b */
    public static String m18643b(C9591hA0 c9591hA0, StringBuilder sb) {
        m18644c(c9591hA0);
        if (c9591hA0.m18743a() == 0) {
            return null;
        }
        String strM18642a = m18642a(c9591hA0, sb);
        if (!"".equals(strM18642a)) {
            return strM18642a;
        }
        return "" + ((char) c9591hA0.m18763u());
    }

    /* renamed from: c */
    public static void m18644c(C9591hA0 c9591hA0) {
        while (true) {
            for (boolean z = true; c9591hA0.m18743a() > 0 && z; z = false) {
                int i = c9591hA0.f28294b;
                byte[] bArr = c9591hA0.f28293a;
                byte b = bArr[i];
                char c = (char) b;
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    c9591hA0.m18742H(1);
                } else {
                    int i2 = c9591hA0.f28295c;
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
                            c9591hA0.m18742H(i2 - c9591hA0.f28294b);
                        }
                    }
                }
            }
            return;
        }
    }
}
