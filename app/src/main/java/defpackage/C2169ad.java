package defpackage;

import java.util.List;

/* renamed from: ad, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2169ad extends HA {
    public final List a;
    public final C2550cd b;
    public final AbstractC7551vA c;
    public final C3426dd d;
    public final List e;

    public C2169ad(List list, C2550cd c2550cd, AbstractC7551vA abstractC7551vA, C3426dd c3426dd, List list2) {
        this.a = list;
        this.b = c2550cd;
        this.c = abstractC7551vA;
        this.d = c3426dd;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HA)) {
            return false;
        }
        HA ha = (HA) obj;
        List list = this.a;
        if (list != null ? list.equals(((C2169ad) ha).a) : ((C2169ad) ha).a == null) {
            C2550cd c2550cd = this.b;
            if (c2550cd != null ? c2550cd.equals(((C2169ad) ha).b) : ((C2169ad) ha).b == null) {
                AbstractC7551vA abstractC7551vA = this.c;
                if (abstractC7551vA != null ? abstractC7551vA.equals(((C2169ad) ha).c) : ((C2169ad) ha).c == null) {
                    C2169ad c2169ad = (C2169ad) ha;
                    if (this.d.equals(c2169ad.d) && this.e.equals(c2169ad.e)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        C2550cd c2550cd = this.b;
        int iHashCode2 = (iHashCode ^ (c2550cd == null ? 0 : c2550cd.hashCode())) * 1000003;
        AbstractC7551vA abstractC7551vA = this.c;
        return (((((abstractC7551vA != null ? abstractC7551vA.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }
}
