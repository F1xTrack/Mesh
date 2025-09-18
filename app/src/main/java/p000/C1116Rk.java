package p000;

import java.util.List;

/* renamed from: Rk */
/* loaded from: classes.dex */
public final class C1116Rk {

    /* renamed from: a */
    public final Object f10403a;

    /* renamed from: b */
    public final Object f10404b;

    /* renamed from: c */
    public final Object f10405c;

    /* renamed from: d */
    public final Object f10406d;

    /* renamed from: e */
    public final int f10407e;

    public C1116Rk(List list, List list2, List list3, List list4, int i) {
        this.f10403a = list;
        this.f10404b = list2;
        this.f10405c = list3;
        this.f10406d = list4;
        this.f10407e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1116Rk)) {
            return false;
        }
        C1116Rk c1116Rk = (C1116Rk) obj;
        return this.f10403a.equals(c1116Rk.f10403a) && this.f10404b.equals(c1116Rk.f10404b) && this.f10405c.equals(c1116Rk.f10405c) && this.f10406d.equals(c1116Rk.f10406d) && this.f10407e == c1116Rk.f10407e;
    }

    public final int hashCode() {
        return ((this.f10406d.hashCode() + ((this.f10405c.hashCode() + ((this.f10404b.hashCode() + (this.f10403a.hashCode() * 31)) * 31)) * 31)) * 31) + this.f10407e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CMCDProps(cmcdObject=");
        sb.append(this.f10403a);
        sb.append(", cmcdRequest=");
        sb.append(this.f10404b);
        sb.append(", cmcdSession=");
        sb.append(this.f10405c);
        sb.append(", cmcdStatus=");
        sb.append(this.f10406d);
        sb.append(", mode=");
        return AbstractC1374Vq.m8591j(sb, this.f10407e, ")");
    }
}
