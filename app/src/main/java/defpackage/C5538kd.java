package defpackage;

/* renamed from: kd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5538kd extends KA {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public C5538kd(Double d, int i, boolean z, int i2, long j, long j2) {
        this.a = d;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KA)) {
            return false;
        }
        KA ka = (KA) obj;
        Double d = this.a;
        if (d != null ? d.equals(((C5538kd) ka).a) : ((C5538kd) ka).a == null) {
            if (this.b == ((C5538kd) ka).b) {
                C5538kd c5538kd = (C5538kd) ka;
                if (this.c == c5538kd.c && this.d == c5538kd.d && this.e == c5538kd.e && this.f == c5538kd.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d = this.a;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        long j2 = this.f;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.a);
        sb.append(", batteryVelocity=");
        sb.append(this.b);
        sb.append(", proximityOn=");
        sb.append(this.c);
        sb.append(", orientation=");
        sb.append(this.d);
        sb.append(", ramUsed=");
        sb.append(this.e);
        sb.append(", diskUsed=");
        return NX.i(sb, this.f, "}");
    }
}
