package p000;

/* loaded from: classes.dex */
public final class YU1 {

    /* renamed from: a */
    public final IP1 f14318a;

    /* renamed from: b */
    public final String f14319b;

    /* renamed from: c */
    public final Object[] f14320c;

    /* renamed from: d */
    public final int f14321d;

    public YU1(IP1 ip1, String str, Object[] objArr) {
        this.f14318a = ip1;
        this.f14319b = str;
        this.f14320c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f14321d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f14321d = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    /* renamed from: a */
    public final IP1 m9300a() {
        return this.f14318a;
    }

    /* renamed from: b */
    public final int m9301b() {
        int i = this.f14321d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }

    /* renamed from: c */
    public final String m9302c() {
        return this.f14319b;
    }

    /* renamed from: d */
    public final Object[] m9303d() {
        return this.f14320c;
    }
}
