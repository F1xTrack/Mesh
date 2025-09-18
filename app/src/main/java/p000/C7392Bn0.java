package p000;

/* renamed from: Bn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7392Bn0 {

    /* renamed from: a */
    public final C11969zn0 f1025a;

    /* renamed from: b */
    public final int f1026b;

    public C7392Bn0(C11969zn0 c11969zn0, int i) {
        this.f1025a = c11969zn0;
        this.f1026b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7392Bn0)) {
            return false;
        }
        C7392Bn0 c7392Bn0 = (C7392Bn0) obj;
        return O90.m5963a(this.f1025a, c7392Bn0.f1025a) && this.f1026b == c7392Bn0.f1026b;
    }

    public final int hashCode() {
        C11969zn0 c11969zn0 = this.f1025a;
        return ((c11969zn0 != null ? c11969zn0.hashCode() : 0) * 31) + this.f1026b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaskAffinity(mask=");
        sb.append(this.f1025a);
        sb.append(", affinity=");
        return AbstractC1374Vq.m8591j(sb, this.f1026b, ")");
    }
}
