package p000;

import java.util.List;

/* renamed from: ad */
/* loaded from: classes.dex */
public final class C1676ad extends AbstractC0452HA {

    /* renamed from: a */
    public final List f15589a;

    /* renamed from: b */
    public final C1859cd f15590b;

    /* renamed from: c */
    public final AbstractC6995vA f15591c;

    /* renamed from: d */
    public final C3940dd f15592d;

    /* renamed from: e */
    public final List f15593e;

    public C1676ad(List list, C1859cd c1859cd, AbstractC6995vA abstractC6995vA, C3940dd c3940dd, List list2) {
        this.f15589a = list;
        this.f15590b = c1859cd;
        this.f15591c = abstractC6995vA;
        this.f15592d = c3940dd;
        this.f15593e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0452HA)) {
            return false;
        }
        AbstractC0452HA abstractC0452HA = (AbstractC0452HA) obj;
        List list = this.f15589a;
        if (list != null ? list.equals(((C1676ad) abstractC0452HA).f15589a) : ((C1676ad) abstractC0452HA).f15589a == null) {
            C1859cd c1859cd = this.f15590b;
            if (c1859cd != null ? c1859cd.equals(((C1676ad) abstractC0452HA).f15590b) : ((C1676ad) abstractC0452HA).f15590b == null) {
                AbstractC6995vA abstractC6995vA = this.f15591c;
                if (abstractC6995vA != null ? abstractC6995vA.equals(((C1676ad) abstractC0452HA).f15591c) : ((C1676ad) abstractC0452HA).f15591c == null) {
                    C1676ad c1676ad = (C1676ad) abstractC0452HA;
                    if (this.f15592d.equals(c1676ad.f15592d) && this.f15593e.equals(c1676ad.f15593e)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f15589a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        C1859cd c1859cd = this.f15590b;
        int iHashCode2 = (iHashCode ^ (c1859cd == null ? 0 : c1859cd.hashCode())) * 1000003;
        AbstractC6995vA abstractC6995vA = this.f15591c;
        return (((((abstractC6995vA != null ? abstractC6995vA.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f15592d.hashCode()) * 1000003) ^ this.f15593e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f15589a + ", exception=" + this.f15590b + ", appExitInfo=" + this.f15591c + ", signal=" + this.f15592d + ", binaries=" + this.f15593e + "}";
    }
}
