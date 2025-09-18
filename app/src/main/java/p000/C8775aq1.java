package p000;

import java.util.List;

/* renamed from: aq1 */
/* loaded from: classes2.dex */
public final class C8775aq1 {

    /* renamed from: d */
    public static final NV1 f16616d = new NV1(23);

    /* renamed from: e */
    public static final C8775aq1 f16617e = new C8775aq1(C0779MN.f7117a, false, false);

    /* renamed from: a */
    public final boolean f16618a;

    /* renamed from: b */
    public final boolean f16619b;

    /* renamed from: c */
    public final Object f16620c;

    public C8775aq1(List list, boolean z, boolean z2) {
        O90.m5968f(list, "packageNames");
        this.f16618a = z;
        this.f16619b = z2;
        this.f16620c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8775aq1)) {
            return false;
        }
        C8775aq1 c8775aq1 = (C8775aq1) obj;
        return this.f16618a == c8775aq1.f16618a && this.f16619b == c8775aq1.f16619b && O90.m5963a(this.f16620c, c8775aq1.f16620c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z = this.f16618a;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = i * 31;
        boolean z2 = this.f16619b;
        return this.f16620c.hashCode() + ((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31);
    }

    public final String toString() {
        return "ExternalMasterHostAnalyticsConfig(isEnabled=" + this.f16618a + ", isForce=" + this.f16619b + ", packageNames=" + this.f16620c + ')';
    }
}
