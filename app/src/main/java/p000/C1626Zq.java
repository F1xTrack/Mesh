package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: Zq */
/* loaded from: classes2.dex */
public final class C1626Zq {

    /* renamed from: c */
    public static final C1626Zq f15146c = new C1626Zq(AbstractC7167xu.m25987g0(new ArrayList()), null);

    /* renamed from: a */
    public final Set f15147a;

    /* renamed from: b */
    public final AbstractC11164tS1 f15148b;

    public C1626Zq(Set set, AbstractC11164tS1 abstractC11164tS1) {
        this.f15147a = set;
        this.f15148b = abstractC11164tS1;
    }

    /* renamed from: a */
    public final void m9613a(String str, InterfaceC6434mZ interfaceC6434mZ) {
        O90.m5968f(str, "hostname");
        Iterator it = this.f15147a.iterator();
        if (it.hasNext()) {
            throw AbstractC7222ym.m26227d(it);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1626Zq) {
            C1626Zq c1626Zq = (C1626Zq) obj;
            if (O90.m5963a(c1626Zq.f15147a, this.f15147a) && O90.m5963a(c1626Zq.f15148b, this.f15148b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f15147a.hashCode() + 1517) * 41;
        AbstractC11164tS1 abstractC11164tS1 = this.f15148b;
        return iHashCode + (abstractC11164tS1 != null ? abstractC11164tS1.hashCode() : 0);
    }
}
