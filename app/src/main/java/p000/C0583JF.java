package p000;

/* renamed from: JF */
/* loaded from: classes.dex */
public final class C0583JF {

    /* renamed from: b */
    public static final byte[] f5404b = {-1, -40, -1};

    /* renamed from: c */
    public static final int f5405c = 3;

    /* renamed from: d */
    public static final byte[] f5406d = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: e */
    public static final int f5407e = 8;

    /* renamed from: f */
    public static final byte[] f5408f = AbstractC8930c22.m10573a("GIF87a");

    /* renamed from: g */
    public static final byte[] f5409g = AbstractC8930c22.m10573a("GIF89a");

    /* renamed from: h */
    public static final byte[] f5410h;

    /* renamed from: i */
    public static final int f5411i;

    /* renamed from: j */
    public static final byte[] f5412j;

    /* renamed from: k */
    public static final int f5413k;

    /* renamed from: l */
    public static final byte[] f5414l;

    /* renamed from: m */
    public static final byte[][] f5415m;

    /* renamed from: n */
    public static final byte[] f5416n;

    /* renamed from: o */
    public static final byte[] f5417o;

    /* renamed from: p */
    public static final int f5418p;

    /* renamed from: a */
    public final int f5419a;

    static {
        byte[] bArrM10573a = AbstractC8930c22.m10573a("BM");
        f5410h = bArrM10573a;
        f5411i = bArrM10573a.length;
        f5412j = new byte[]{0, 0, 1, 0};
        f5413k = 4;
        f5414l = AbstractC8930c22.m10573a("ftyp");
        f5415m = new byte[][]{AbstractC8930c22.m10573a("heic"), AbstractC8930c22.m10573a("heix"), AbstractC8930c22.m10573a("hevc"), AbstractC8930c22.m10573a("hevx"), AbstractC8930c22.m10573a("mif1"), AbstractC8930c22.m10573a("msf1")};
        f5416n = new byte[]{73, 73, 42, 0};
        f5417o = new byte[]{77, 77, 0, 42};
        f5418p = 4;
    }

    public C0583JF() {
        Integer num;
        Integer[] numArr = {21, 20, Integer.valueOf(f5405c), Integer.valueOf(f5407e), 6, Integer.valueOf(f5411i), Integer.valueOf(f5413k), 12};
        if (numArr.length == 0) {
            num = null;
        } else {
            Integer num2 = numArr[0];
            int length = numArr.length - 1;
            if (1 <= length) {
                int i = 1;
                while (true) {
                    Integer num3 = numArr[i];
                    num2 = num2.compareTo(num3) < 0 ? num3 : num2;
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            num = num2;
        }
        if (num == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f5419a = num.intValue();
    }
}
