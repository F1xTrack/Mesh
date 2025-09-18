package p000;

/* loaded from: classes.dex */
public final class NH1 {

    /* renamed from: a */
    public final DB1 f7715a;

    /* renamed from: b */
    public final String f7716b;

    /* renamed from: c */
    public final Object[] f7717c;

    /* renamed from: d */
    public final int f7718d;

    public NH1(DB1 db1, String str, Object[] objArr) {
        this.f7715a = db1;
        this.f7716b = str;
        this.f7717c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f7718d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f7718d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    /* renamed from: a */
    public final DB1 m5615a() {
        return this.f7715a;
    }

    /* renamed from: b */
    public final int m5616b() {
        int i = this.f7718d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }

    /* renamed from: c */
    public final String m5617c() {
        return this.f7716b;
    }

    /* renamed from: d */
    public final Object[] m5618d() {
        return this.f7717c;
    }
}
