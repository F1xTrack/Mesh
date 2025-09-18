package p000;

import java.util.List;

/* renamed from: Zc */
/* loaded from: classes.dex */
public final class C1612Zc extends AbstractC0578JA {

    /* renamed from: a */
    public final C1676ad f15012a;

    /* renamed from: b */
    public final List f15013b;

    /* renamed from: c */
    public final List f15014c;

    /* renamed from: d */
    public final Boolean f15015d;

    /* renamed from: e */
    public final AbstractC0515IA f15016e;

    /* renamed from: f */
    public final List f15017f;

    /* renamed from: g */
    public final int f15018g;

    public C1612Zc(C1676ad c1676ad, List list, List list2, Boolean bool, AbstractC0515IA abstractC0515IA, List list3, int i) {
        this.f15012a = c1676ad;
        this.f15013b = list;
        this.f15014c = list2;
        this.f15015d = bool;
        this.f15016e = abstractC0515IA;
        this.f15017f = list3;
        this.f15018g = i;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        AbstractC0515IA abstractC0515IA;
        List list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0578JA)) {
            return false;
        }
        C1612Zc c1612Zc = (C1612Zc) ((AbstractC0578JA) obj);
        return this.f15012a.equals(c1612Zc.f15012a) && ((list = this.f15013b) != null ? list.equals(c1612Zc.f15013b) : c1612Zc.f15013b == null) && ((list2 = this.f15014c) != null ? list2.equals(c1612Zc.f15014c) : c1612Zc.f15014c == null) && ((bool = this.f15015d) != null ? bool.equals(c1612Zc.f15015d) : c1612Zc.f15015d == null) && ((abstractC0515IA = this.f15016e) != null ? abstractC0515IA.equals(c1612Zc.f15016e) : c1612Zc.f15016e == null) && ((list3 = this.f15017f) != null ? list3.equals(c1612Zc.f15017f) : c1612Zc.f15017f == null) && this.f15018g == c1612Zc.f15018g;
    }

    public final int hashCode() {
        int iHashCode = (this.f15012a.hashCode() ^ 1000003) * 1000003;
        List list = this.f15013b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f15014c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f15015d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        AbstractC0515IA abstractC0515IA = this.f15016e;
        int iHashCode5 = (iHashCode4 ^ (abstractC0515IA == null ? 0 : abstractC0515IA.hashCode())) * 1000003;
        List list3 = this.f15017f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f15018g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.f15012a);
        sb.append(", customAttributes=");
        sb.append(this.f15013b);
        sb.append(", internalKeys=");
        sb.append(this.f15014c);
        sb.append(", background=");
        sb.append(this.f15015d);
        sb.append(", currentProcessDetails=");
        sb.append(this.f15016e);
        sb.append(", appProcessDetails=");
        sb.append(this.f15017f);
        sb.append(", uiOrientation=");
        return AbstractC1374Vq.m8591j(sb, this.f15018g, "}");
    }
}
