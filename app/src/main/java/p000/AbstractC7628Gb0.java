package p000;

/* renamed from: Gb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7628Gb0 {

    /* renamed from: a */
    public static final int f3815a;

    static {
        int i;
        String property = System.getProperty("java.version");
        try {
            String[] strArrSplit = property.split("[._]");
            i = Integer.parseInt(strArrSplit[0]);
            if (i == 1 && strArrSplit.length > 1) {
                i = Integer.parseInt(strArrSplit[1]);
            }
        } catch (NumberFormatException unused) {
            i = -1;
        }
        if (i == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < property.length(); i2++) {
                    char cCharAt = property.charAt(i2);
                    if (!Character.isDigit(cCharAt)) {
                        break;
                    }
                    sb.append(cCharAt);
                }
                i = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i = -1;
            }
        }
        if (i == -1) {
            i = 6;
        }
        f3815a = i;
    }
}
