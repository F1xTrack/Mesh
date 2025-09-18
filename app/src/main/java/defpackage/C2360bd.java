package defpackage;

/* renamed from: bd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2360bd extends CA {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public C2360bd(String str, String str2, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CA)) {
            return false;
        }
        CA ca = (CA) obj;
        if (this.a == ((C2360bd) ca).a) {
            C2360bd c2360bd = (C2360bd) ca;
            if (this.b == c2360bd.b && this.c.equals(c2360bd.c)) {
                String str = c2360bd.d;
                String str2 = this.d;
                if (str2 == null) {
                    if (str == null) {
                        return true;
                    }
                } else if (str2.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", uuid=");
        return AbstractC1705Vq.l(sb, this.d, "}");
    }
}
