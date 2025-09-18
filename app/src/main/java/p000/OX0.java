package p000;

/* loaded from: classes.dex */
public final class OX0 {

    /* renamed from: a */
    public final long f8474a;

    /* renamed from: b */
    public final long f8475b;

    public OX0(long j, long j2) {
        this.f8474a = j;
        this.f8475b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OX0.class != obj.getClass()) {
            return false;
        }
        OX0 ox0 = (OX0) obj;
        return this.f8474a == ox0.f8474a && this.f8475b == ox0.f8475b;
    }

    public final int hashCode() {
        return (((int) this.f8474a) * 31) + ((int) this.f8475b);
    }
}
