package defpackage;

/* loaded from: classes.dex */
public final class ZQ0 {
    public static final ZQ0 c = new ZQ0(0, false);
    public final int a;
    public final boolean b;

    public ZQ0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ZQ0.class != obj.getClass()) {
            return false;
        }
        ZQ0 zq0 = (ZQ0) obj;
        return this.a == zq0.a && this.b == zq0.b;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
