package defpackage;

/* renamed from: gd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3998gd extends FA {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    public C3998gd(long j, String str, String str2, long j2, int i) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FA)) {
            return false;
        }
        FA fa = (FA) obj;
        if (this.a == ((C3998gd) fa).a) {
            C3998gd c3998gd = (C3998gd) fa;
            if (this.b.equals(c3998gd.b)) {
                String str = c3998gd.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.d == c3998gd.d && this.e == c3998gd.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.d;
        return ((iHashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.a);
        sb.append(", symbol=");
        sb.append(this.b);
        sb.append(", file=");
        sb.append(this.c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        return AbstractC1705Vq.j(sb, this.e, "}");
    }
}
