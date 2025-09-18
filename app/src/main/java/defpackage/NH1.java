package defpackage;

/* loaded from: classes.dex */
public final class NH1 {
    public final DB1 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public NH1(DB1 db1, String str, Object[] objArr) {
        this.a = db1;
        this.b = str;
        this.c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    public final DB1 a() {
        return this.a;
    }

    public final int b() {
        int i = this.d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }

    public final String c() {
        return this.b;
    }

    public final Object[] d() {
        return this.c;
    }
}
