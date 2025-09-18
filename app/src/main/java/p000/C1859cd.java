package p000;

import java.util.List;

/* renamed from: cd */
/* loaded from: classes.dex */
public final class C1859cd extends AbstractC0200DA {

    /* renamed from: a */
    public final String f17654a;

    /* renamed from: b */
    public final String f17655b;

    /* renamed from: c */
    public final List f17656c;

    /* renamed from: d */
    public final AbstractC0200DA f17657d;

    /* renamed from: e */
    public final int f17658e;

    public C1859cd(String str, String str2, List list, AbstractC0200DA abstractC0200DA, int i) {
        this.f17654a = str;
        this.f17655b = str2;
        this.f17656c = list;
        this.f17657d = abstractC0200DA;
        this.f17658e = i;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0200DA)) {
            return false;
        }
        AbstractC0200DA abstractC0200DA = (AbstractC0200DA) obj;
        if (this.f17654a.equals(((C1859cd) abstractC0200DA).f17654a) && ((str = this.f17655b) != null ? str.equals(((C1859cd) abstractC0200DA).f17655b) : ((C1859cd) abstractC0200DA).f17655b == null)) {
            C1859cd c1859cd = (C1859cd) abstractC0200DA;
            if (this.f17656c.equals(c1859cd.f17656c)) {
                AbstractC0200DA abstractC0200DA2 = c1859cd.f17657d;
                AbstractC0200DA abstractC0200DA3 = this.f17657d;
                if (abstractC0200DA3 != null ? abstractC0200DA3.equals(abstractC0200DA2) : abstractC0200DA2 == null) {
                    if (this.f17658e == c1859cd.f17658e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f17654a.hashCode() ^ 1000003) * 1000003;
        String str = this.f17655b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f17656c.hashCode()) * 1000003;
        AbstractC0200DA abstractC0200DA = this.f17657d;
        return ((iHashCode2 ^ (abstractC0200DA != null ? abstractC0200DA.hashCode() : 0)) * 1000003) ^ this.f17658e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.f17654a);
        sb.append(", reason=");
        sb.append(this.f17655b);
        sb.append(", frames=");
        sb.append(this.f17656c);
        sb.append(", causedBy=");
        sb.append(this.f17657d);
        sb.append(", overflowCount=");
        return AbstractC1374Vq.m8591j(sb, this.f17658e, "}");
    }
}
