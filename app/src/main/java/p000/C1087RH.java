package p000;

/* renamed from: RH */
/* loaded from: classes.dex */
public final class C1087RH {

    /* renamed from: a */
    public final C11011sG0 f10104a;

    /* renamed from: b */
    public final int f10105b;

    /* renamed from: c */
    public final int f10106c;

    public C1087RH(int i, int i2, Class cls) {
        this(C11011sG0.m24687a(cls), i, i2);
    }

    /* renamed from: a */
    public static C1087RH m6927a(Class cls) {
        return new C1087RH(0, 1, cls);
    }

    /* renamed from: b */
    public static C1087RH m6928b(C11011sG0 c11011sG0) {
        return new C1087RH(c11011sG0, 1, 0);
    }

    /* renamed from: c */
    public static C1087RH m6929c(Class cls) {
        return new C1087RH(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1087RH)) {
            return false;
        }
        C1087RH c1087rh = (C1087RH) obj;
        return this.f10104a.equals(c1087rh.f10104a) && this.f10105b == c1087rh.f10105b && this.f10106c == c1087rh.f10106c;
    }

    public final int hashCode() {
        return ((((this.f10104a.hashCode() ^ 1000003) * 1000003) ^ this.f10105b) * 1000003) ^ this.f10106c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f10104a);
        sb.append(", type=");
        int i = this.f10105b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.f10106c;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(AbstractC11153tN0.m24909u(i2, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return AbstractC1374Vq.m8593l(sb, str, "}");
    }

    public C1087RH(C11011sG0 c11011sG0, int i, int i2) {
        RL1.m7000a(c11011sG0, "Null dependency anInterface.");
        this.f10104a = c11011sG0;
        this.f10105b = i;
        this.f10106c = i2;
    }
}
