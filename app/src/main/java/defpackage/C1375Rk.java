package defpackage;

import java.util.List;

/* renamed from: Rk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1375Rk {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final int e;

    public C1375Rk(List list, List list2, List list3, List list4, int i) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1375Rk)) {
            return false;
        }
        C1375Rk c1375Rk = (C1375Rk) obj;
        return this.a.equals(c1375Rk.a) && this.b.equals(c1375Rk.b) && this.c.equals(c1375Rk.c) && this.d.equals(c1375Rk.d) && this.e == c1375Rk.e;
    }

    public final int hashCode() {
        return ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CMCDProps(cmcdObject=");
        sb.append(this.a);
        sb.append(", cmcdRequest=");
        sb.append(this.b);
        sb.append(", cmcdSession=");
        sb.append(this.c);
        sb.append(", cmcdStatus=");
        sb.append(this.d);
        sb.append(", mode=");
        return AbstractC1705Vq.j(sb, this.e, ")");
    }
}
