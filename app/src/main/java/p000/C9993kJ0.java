package p000;

/* renamed from: kJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9993kJ0 {

    /* renamed from: a */
    public final AbstractC0568J0 f36421a;

    /* renamed from: b */
    public final String f36422b;

    /* renamed from: c */
    public final Object[] f36423c;

    /* renamed from: d */
    public final int f36424d;

    public C9993kJ0(AbstractC0568J0 abstractC0568J0, String str, Object[] objArr) {
        this.f36421a = abstractC0568J0;
        this.f36422b = str;
        this.f36423c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f36424d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f36424d = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    /* renamed from: a */
    public final AbstractC0568J0 m22186a() {
        return this.f36421a;
    }

    /* renamed from: b */
    public final Object[] m22187b() {
        return this.f36423c;
    }

    /* renamed from: c */
    public final String m22188c() {
        return this.f36422b;
    }

    /* renamed from: d */
    public final int m22189d() {
        int i = this.f36424d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
