package p000;

/* renamed from: vc */
/* loaded from: classes.dex */
public final class C7023vc {

    /* renamed from: a */
    public final int f44446a;

    /* renamed from: b */
    public final long f44447b;

    public C7023vc(int i, long j) {
        this.f44446a = i;
        this.f44447b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7023vc)) {
            return false;
        }
        C7023vc c7023vc = (C7023vc) obj;
        return this.f44446a == c7023vc.f44446a && this.f44447b == c7023vc.f44447b;
    }

    public final int hashCode() {
        int i = (this.f44446a ^ 1000003) * 1000003;
        long j = this.f44447b;
        return i ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PacketInfo{sizeInBytes=");
        sb.append(this.f44446a);
        sb.append(", timestampNs=");
        return AbstractC0852NX.m5760i(sb, this.f44447b, "}");
    }
}
