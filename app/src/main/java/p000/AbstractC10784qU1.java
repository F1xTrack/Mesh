package p000;

/* renamed from: qU1 */
/* loaded from: classes.dex */
public abstract class AbstractC10784qU1 {
    /* renamed from: a */
    public static String m24014a(C0299Ek c0299Ek) {
        StringBuilder sb = new StringBuilder(c0299Ek.size());
        for (int i = 0; i < c0299Ek.size(); i++) {
            byte bMo1302b = c0299Ek.mo1302b(i);
            if (bMo1302b == 34) {
                sb.append("\\\"");
            } else if (bMo1302b == 39) {
                sb.append("\\'");
            } else if (bMo1302b != 92) {
                switch (bMo1302b) {
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
                        if (bMo1302b < 32 || bMo1302b > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo1302b >>> 6) & 3) + 48));
                            sb.append((char) (((bMo1302b >>> 3) & 7) + 48));
                            sb.append((char) ((bMo1302b & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bMo1302b);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public abstract void mo3068b(C10563om0 c10563om0, float f, float f2);
}
