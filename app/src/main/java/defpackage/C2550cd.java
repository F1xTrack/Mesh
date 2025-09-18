package defpackage;

import java.util.List;

/* renamed from: cd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2550cd extends DA {
    public final String a;
    public final String b;
    public final List c;
    public final DA d;
    public final int e;

    public C2550cd(String str, String str2, List list, DA da, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = da;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DA)) {
            return false;
        }
        DA da = (DA) obj;
        if (this.a.equals(((C2550cd) da).a) && ((str = this.b) != null ? str.equals(((C2550cd) da).b) : ((C2550cd) da).b == null)) {
            C2550cd c2550cd = (C2550cd) da;
            if (this.c.equals(c2550cd.c)) {
                DA da2 = c2550cd.d;
                DA da3 = this.d;
                if (da3 != null ? da3.equals(da2) : da2 == null) {
                    if (this.e == c2550cd.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        DA da = this.d;
        return ((iHashCode2 ^ (da != null ? da.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return AbstractC1705Vq.j(sb, this.e, "}");
    }
}
