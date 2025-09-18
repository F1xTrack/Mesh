package p000;

/* renamed from: tU1 */
/* loaded from: classes.dex */
public abstract class AbstractC11168tU1 {
    /* renamed from: a */
    public static C0489Hl m24937a(C6353lH c6353lH) {
        return AbstractC11797yQ1.m26149b(new C0424Gj(c6353lH, 11, "Deferred.asListenableFuture"));
    }

    /* renamed from: b */
    public static String m24938b(C0362Fk c0362Fk) {
        StringBuilder sb = new StringBuilder(c0362Fk.size());
        for (int i = 0; i < c0362Fk.size(); i++) {
            byte b = c0362Fk.f3406b[i];
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
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
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b);
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
}
