package p000;

/* loaded from: classes.dex */
public final class EX0 {

    /* renamed from: c */
    public static final EX0 f2737c = new EX0(0, 0);

    /* renamed from: a */
    public final long f2738a;

    /* renamed from: b */
    public final long f2739b;

    public EX0(long j, long j2) {
        this.f2738a = j;
        this.f2739b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EX0.class != obj.getClass()) {
            return false;
        }
        EX0 ex0 = (EX0) obj;
        return this.f2738a == ex0.f2738a && this.f2739b == ex0.f2739b;
    }

    public final int hashCode() {
        return (((int) this.f2738a) * 31) + ((int) this.f2739b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f2738a);
        sb.append(", position=");
        return AbstractC0852NX.m5760i(sb, this.f2739b, "]");
    }
}
