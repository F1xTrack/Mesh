package defpackage;

/* renamed from: tU1 */
/* loaded from: classes.dex */
public abstract class AbstractC7231tU1 {
    public static C0599Hl a(C5663lH c5663lH) {
        return AbstractC8171yQ1.b(new C0515Gj(c5663lH, 11, "Deferred.asListenableFuture"));
    }

    public static String b(C0440Fk c0440Fk) {
        StringBuilder sb = new StringBuilder(c0440Fk.size());
        for (int i = 0; i < c0440Fk.size(); i++) {
            byte b = c0440Fk.b[i];
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
