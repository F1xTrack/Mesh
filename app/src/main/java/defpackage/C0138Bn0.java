package defpackage;

/* renamed from: Bn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0138Bn0 {
    public final C8429zn0 a;
    public final int b;

    public C0138Bn0(C8429zn0 c8429zn0, int i) {
        this.a = c8429zn0;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0138Bn0)) {
            return false;
        }
        C0138Bn0 c0138Bn0 = (C0138Bn0) obj;
        return O90.a(this.a, c0138Bn0.a) && this.b == c0138Bn0.b;
    }

    public final int hashCode() {
        C8429zn0 c8429zn0 = this.a;
        return ((c8429zn0 != null ? c8429zn0.hashCode() : 0) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaskAffinity(mask=");
        sb.append(this.a);
        sb.append(", affinity=");
        return AbstractC1705Vq.j(sb, this.b, ")");
    }
}
