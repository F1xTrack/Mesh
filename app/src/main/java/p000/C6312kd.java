package p000;

/* renamed from: kd */
/* loaded from: classes.dex */
public final class C6312kd extends AbstractC0641KA {

    /* renamed from: a */
    public final Double f36574a;

    /* renamed from: b */
    public final int f36575b;

    /* renamed from: c */
    public final boolean f36576c;

    /* renamed from: d */
    public final int f36577d;

    /* renamed from: e */
    public final long f36578e;

    /* renamed from: f */
    public final long f36579f;

    public C6312kd(Double d, int i, boolean z, int i2, long j, long j2) {
        this.f36574a = d;
        this.f36575b = i;
        this.f36576c = z;
        this.f36577d = i2;
        this.f36578e = j;
        this.f36579f = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0641KA)) {
            return false;
        }
        AbstractC0641KA abstractC0641KA = (AbstractC0641KA) obj;
        Double d = this.f36574a;
        if (d != null ? d.equals(((C6312kd) abstractC0641KA).f36574a) : ((C6312kd) abstractC0641KA).f36574a == null) {
            if (this.f36575b == ((C6312kd) abstractC0641KA).f36575b) {
                C6312kd c6312kd = (C6312kd) abstractC0641KA;
                if (this.f36576c == c6312kd.f36576c && this.f36577d == c6312kd.f36577d && this.f36578e == c6312kd.f36578e && this.f36579f == c6312kd.f36579f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d = this.f36574a;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f36575b) * 1000003) ^ (this.f36576c ? 1231 : 1237)) * 1000003) ^ this.f36577d) * 1000003;
        long j = this.f36578e;
        long j2 = this.f36579f;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.f36574a);
        sb.append(", batteryVelocity=");
        sb.append(this.f36575b);
        sb.append(", proximityOn=");
        sb.append(this.f36576c);
        sb.append(", orientation=");
        sb.append(this.f36577d);
        sb.append(", ramUsed=");
        sb.append(this.f36578e);
        sb.append(", diskUsed=");
        return AbstractC0852NX.m5760i(sb, this.f36579f, "}");
    }
}
