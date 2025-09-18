package p000;

/* renamed from: zJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11910zJ1 {

    /* renamed from: a */
    public final DD1 f46787a;

    /* renamed from: b */
    public final String f46788b;

    /* renamed from: c */
    public final Object[] f46789c;

    /* renamed from: d */
    public final int f46790d;

    public C11910zJ1(DD1 dd1, String str, Object[] objArr) {
        this.f46787a = dd1;
        this.f46788b = str;
        this.f46789c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f46790d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f46790d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    /* renamed from: a */
    public final DD1 m26370a() {
        return this.f46787a;
    }

    /* renamed from: b */
    public final int m26371b() {
        int i = this.f46790d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }

    /* renamed from: c */
    public final String m26372c() {
        return this.f46788b;
    }

    /* renamed from: d */
    public final Object[] m26373d() {
        return this.f46789c;
    }
}
