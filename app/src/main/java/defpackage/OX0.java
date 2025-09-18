package defpackage;

/* loaded from: classes.dex */
public final class OX0 {
    public final long a;
    public final long b;

    public OX0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OX0.class != obj.getClass()) {
            return false;
        }
        OX0 ox0 = (OX0) obj;
        return this.a == ox0.a && this.b == ox0.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
