package p000;

/* renamed from: ec1 */
/* loaded from: classes.dex */
public final class C9264ec1 {

    /* renamed from: b */
    public static final C9264ec1 f26778b;

    /* renamed from: a */
    public final P70 f26779a;

    static {
        N70 n70 = P70.f8867b;
        f26778b = new C9264ec1(C9367fQ0.f27184e);
        AbstractC7485Dh1.m1797L(0);
    }

    public C9264ec1(P70 p70) {
        this.f26779a = P70.m6234u(p70);
    }

    /* renamed from: a */
    public final boolean m18017a(int i) {
        int i2 = 0;
        while (true) {
            P70 p70 = this.f26779a;
            if (i2 >= p70.size()) {
                return false;
            }
            C9136dc1 c9136dc1 = (C9136dc1) p70.get(i2);
            boolean[] zArr = c9136dc1.f26165e;
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
            if (z && c9136dc1.f26162b.f9689c == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9264ec1.class != obj.getClass()) {
            return false;
        }
        return this.f26779a.equals(((C9264ec1) obj).f26779a);
    }

    public final int hashCode() {
        return this.f26779a.hashCode();
    }
}
