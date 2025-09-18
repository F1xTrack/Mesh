package p000;

/* loaded from: classes.dex */
public final class ZQ0 {

    /* renamed from: c */
    public static final ZQ0 f14889c = new ZQ0(0, false);

    /* renamed from: a */
    public final int f14890a;

    /* renamed from: b */
    public final boolean f14891b;

    public ZQ0(int i, boolean z) {
        this.f14890a = i;
        this.f14891b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ZQ0.class != obj.getClass()) {
            return false;
        }
        ZQ0 zq0 = (ZQ0) obj;
        return this.f14890a == zq0.f14890a && this.f14891b == zq0.f14891b;
    }

    public final int hashCode() {
        return (this.f14890a << 1) + (this.f14891b ? 1 : 0);
    }
}
