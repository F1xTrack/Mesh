package p000;

import java.util.HashMap;

/* renamed from: we */
/* loaded from: classes.dex */
public final class C7088we {

    /* renamed from: a */
    public final InterfaceC6645pt f45008a;

    /* renamed from: b */
    public final HashMap f45009b;

    public C7088we(InterfaceC6645pt interfaceC6645pt, HashMap map) {
        this.f45008a = interfaceC6645pt;
        this.f45009b = map;
    }

    /* renamed from: a */
    public final long m25658a(EnumC11261uD0 enumC11261uD0, long j, int i) {
        long jMo2451d = j - this.f45008a.mo2451d();
        C7151xe c7151xe = (C7151xe) this.f45009b.get(enumC11261uD0);
        long j2 = c7151xe.f45722a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r12))), jMo2451d), c7151xe.f45723b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7088we)) {
            return false;
        }
        C7088we c7088we = (C7088we) obj;
        return this.f45008a.equals(c7088we.f45008a) && this.f45009b.equals(c7088we.f45009b);
    }

    public final int hashCode() {
        return ((this.f45008a.hashCode() ^ 1000003) * 1000003) ^ this.f45009b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f45008a + ", values=" + this.f45009b + "}";
    }
}
