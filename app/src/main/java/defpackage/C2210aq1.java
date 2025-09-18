package defpackage;

import java.util.List;

/* renamed from: aq1 */
/* loaded from: classes2.dex */
public final class C2210aq1 {
    public static final NV1 d = new NV1(23);
    public static final C2210aq1 e = new C2210aq1(MN.a, false, false);
    public final boolean a;
    public final boolean b;
    public final Object c;

    public C2210aq1(List list, boolean z, boolean z2) {
        O90.f(list, "packageNames");
        this.a = z;
        this.b = z2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2210aq1)) {
            return false;
        }
        C2210aq1 c2210aq1 = (C2210aq1) obj;
        return this.a == c2210aq1.a && this.b == c2210aq1.b && O90.a(this.c, c2210aq1.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z = this.a;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = i * 31;
        boolean z2 = this.b;
        return this.c.hashCode() + ((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31);
    }

    public final String toString() {
        return "ExternalMasterHostAnalyticsConfig(isEnabled=" + this.a + ", isForce=" + this.b + ", packageNames=" + this.c + ')';
    }
}
