package defpackage;

/* loaded from: classes.dex */
public final class JF {
    public static final byte[] b = {-1, -40, -1};
    public static final int c = 3;
    public static final byte[] d = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final int e = 8;
    public static final byte[] f = AbstractC2440c22.a("GIF87a");
    public static final byte[] g = AbstractC2440c22.a("GIF89a");
    public static final byte[] h;
    public static final int i;
    public static final byte[] j;
    public static final int k;
    public static final byte[] l;
    public static final byte[][] m;
    public static final byte[] n;
    public static final byte[] o;
    public static final int p;
    public final int a;

    static {
        byte[] bArrA = AbstractC2440c22.a("BM");
        h = bArrA;
        i = bArrA.length;
        j = new byte[]{0, 0, 1, 0};
        k = 4;
        l = AbstractC2440c22.a("ftyp");
        m = new byte[][]{AbstractC2440c22.a("heic"), AbstractC2440c22.a("heix"), AbstractC2440c22.a("hevc"), AbstractC2440c22.a("hevx"), AbstractC2440c22.a("mif1"), AbstractC2440c22.a("msf1")};
        n = new byte[]{73, 73, 42, 0};
        o = new byte[]{77, 77, 0, 42};
        p = 4;
    }

    public JF() {
        Integer num;
        Integer[] numArr = {21, 20, Integer.valueOf(c), Integer.valueOf(e), 6, Integer.valueOf(i), Integer.valueOf(k), 12};
        if (numArr.length == 0) {
            num = null;
        } else {
            Integer num2 = numArr[0];
            int length = numArr.length - 1;
            if (1 <= length) {
                int i2 = 1;
                while (true) {
                    Integer num3 = numArr[i2];
                    num2 = num2.compareTo(num3) < 0 ? num3 : num2;
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            num = num2;
        }
        if (num == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.a = num.intValue();
    }
}
