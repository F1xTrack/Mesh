package defpackage;

import java.util.List;

/* renamed from: Zc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1975Zc extends JA {
    public final C2169ad a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final IA e;
    public final List f;
    public final int g;

    public C1975Zc(C2169ad c2169ad, List list, List list2, Boolean bool, IA ia, List list3, int i) {
        this.a = c2169ad;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = ia;
        this.f = list3;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        IA ia;
        List list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JA)) {
            return false;
        }
        C1975Zc c1975Zc = (C1975Zc) ((JA) obj);
        return this.a.equals(c1975Zc.a) && ((list = this.b) != null ? list.equals(c1975Zc.b) : c1975Zc.b == null) && ((list2 = this.c) != null ? list2.equals(c1975Zc.c) : c1975Zc.c == null) && ((bool = this.d) != null ? bool.equals(c1975Zc.d) : c1975Zc.d == null) && ((ia = this.e) != null ? ia.equals(c1975Zc.e) : c1975Zc.e == null) && ((list3 = this.f) != null ? list3.equals(c1975Zc.f) : c1975Zc.f == null) && this.g == c1975Zc.g;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        List list = this.b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        IA ia = this.e;
        int iHashCode5 = (iHashCode4 ^ (ia == null ? 0 : ia.hashCode())) * 1000003;
        List list3 = this.f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append(this.e);
        sb.append(", appProcessDetails=");
        sb.append(this.f);
        sb.append(", uiOrientation=");
        return AbstractC1705Vq.j(sb, this.g, "}");
    }
}
