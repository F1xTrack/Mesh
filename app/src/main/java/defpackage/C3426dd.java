package defpackage;

/* renamed from: dd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3426dd extends EA {
    public final String a;
    public final String b;
    public final long c;

    public C3426dd(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EA)) {
            return false;
        }
        EA ea = (EA) obj;
        if (this.a.equals(((C3426dd) ea).a)) {
            C3426dd c3426dd = (C3426dd) ea;
            if (this.b.equals(c3426dd.b) && this.c == c3426dd.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", address=");
        return NX.i(sb, this.c, "}");
    }
}
