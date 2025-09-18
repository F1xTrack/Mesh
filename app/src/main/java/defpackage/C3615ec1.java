package defpackage;

/* renamed from: ec1 */
/* loaded from: classes.dex */
public final class C3615ec1 {
    public static final C3615ec1 b;
    public final P70 a;

    static {
        N70 n70 = P70.b;
        b = new C3615ec1(C3769fQ0.e);
        AbstractC0277Dh1.L(0);
    }

    public C3615ec1(P70 p70) {
        this.a = P70.u(p70);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            P70 p70 = this.a;
            if (i2 >= p70.size()) {
                return false;
            }
            C3425dc1 c3425dc1 = (C3425dc1) p70.get(i2);
            boolean[] zArr = c3425dc1.e;
            int length = zArr.length;
            boolean z = false;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (zArr[i3]) {
                    z = true;
                    break;
                }
                i3++;
            }
            if (z && c3425dc1.b.c == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3615ec1.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((C3615ec1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
