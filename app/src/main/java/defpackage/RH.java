package defpackage;

/* loaded from: classes.dex */
public final class RH {
    public final C6997sG0 a;
    public final int b;
    public final int c;

    public RH(int i, int i2, Class cls) {
        this(C6997sG0.a(cls), i, i2);
    }

    public static RH a(Class cls) {
        return new RH(0, 1, cls);
    }

    public static RH b(C6997sG0 c6997sG0) {
        return new RH(c6997sG0, 1, 0);
    }

    public static RH c(Class cls) {
        return new RH(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RH)) {
            return false;
        }
        RH rh = (RH) obj;
        return this.a.equals(rh.a) && this.b == rh.b && this.c == rh.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(AbstractC7209tN0.u(i2, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return AbstractC1705Vq.l(sb, str, "}");
    }

    public RH(C6997sG0 c6997sG0, int i, int i2) {
        RL1.a(c6997sG0, "Null dependency anInterface.");
        this.a = c6997sG0;
        this.b = i;
        this.c = i2;
    }
}
