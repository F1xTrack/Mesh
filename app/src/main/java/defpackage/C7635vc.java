package defpackage;

/* renamed from: vc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7635vc {
    public final int a;
    public final long b;

    public C7635vc(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7635vc)) {
            return false;
        }
        C7635vc c7635vc = (C7635vc) obj;
        return this.a == c7635vc.a && this.b == c7635vc.b;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        long j = this.b;
        return i ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PacketInfo{sizeInBytes=");
        sb.append(this.a);
        sb.append(", timestampNs=");
        return NX.i(sb, this.b, "}");
    }
}
