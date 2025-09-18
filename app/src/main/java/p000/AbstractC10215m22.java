package p000;

/* renamed from: m22, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10215m22 {
    /* renamed from: a */
    public static int m22643a(int i, int i2) {
        long j = i + i2;
        int i3 = (int) j;
        if (j == ((long) i3)) {
            return i3;
        }
        throw new ArithmeticException(AbstractC7222ym.m26233j("overflow: checkedAdd(", ", ", i, i2, ")"));
    }

    /* renamed from: b */
    public static String m22644b(C11769yC1 c11769yC1) {
        StringBuilder sb = new StringBuilder(c11769yC1.mo23955h());
        for (int i = 0; i < c11769yC1.mo23955h(); i++) {
            byte bMo23953b = c11769yC1.mo23953b(i);
            if (bMo23953b == 34) {
                sb.append("\\\"");
            } else if (bMo23953b == 39) {
                sb.append("\\'");
            } else if (bMo23953b != 92) {
                switch (bMo23953b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo23953b < 32 || bMo23953b > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo23953b >>> 6) & 3) + 48));
                            sb.append((char) (((bMo23953b >>> 3) & 7) + 48));
                            sb.append((char) ((bMo23953b & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bMo23953b);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
