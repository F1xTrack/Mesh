package p000;

/* renamed from: lJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10121lJ0 {

    /* renamed from: a */
    public final B00 f37003a;

    /* renamed from: b */
    public final String f37004b;

    /* renamed from: c */
    public final Object[] f37005c;

    /* renamed from: d */
    public final int f37006d;

    public C10121lJ0(B00 b00, String str, Object[] objArr) {
        this.f37003a = b00;
        this.f37004b = str;
        this.f37005c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f37006d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f37006d = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    /* renamed from: a */
    public final AbstractC0694L0 m22382a() {
        return this.f37003a;
    }

    /* renamed from: b */
    public final Object[] m22383b() {
        return this.f37005c;
    }

    /* renamed from: c */
    public final String m22384c() {
        return this.f37004b;
    }

    /* renamed from: d */
    public final int m22385d() {
        return (this.f37006d & 1) == 1 ? 1 : 2;
    }
}
