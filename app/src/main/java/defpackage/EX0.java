package defpackage;

/* loaded from: classes.dex */
public final class EX0 {
    public static final EX0 c = new EX0(0, 0);
    public final long a;
    public final long b;

    public EX0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EX0.class != obj.getClass()) {
            return false;
        }
        EX0 ex0 = (EX0) obj;
        return this.a == ex0.a && this.b == ex0.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return NX.i(sb, this.b, "]");
    }
}
