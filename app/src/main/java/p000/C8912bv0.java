package p000;

/* renamed from: bv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8912bv0 {

    /* renamed from: a */
    public final boolean f17225a;

    /* renamed from: b */
    public final boolean f17226b;

    /* renamed from: c */
    public final boolean f17227c;

    /* renamed from: d */
    public final boolean f17228d;

    public C8912bv0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f17225a = z;
        this.f17226b = z2;
        this.f17227c = z3;
        this.f17228d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8912bv0)) {
            return false;
        }
        C8912bv0 c8912bv0 = (C8912bv0) obj;
        return this.f17225a == c8912bv0.f17225a && this.f17226b == c8912bv0.f17226b && this.f17227c == c8912bv0.f17227c && this.f17228d == c8912bv0.f17228d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z = this.f17225a;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = i * 31;
        boolean z2 = this.f17226b;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f17227c;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.f17228d;
        return i6 + (z4 ? 1 : z4 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkState(isConnected=");
        sb.append(this.f17225a);
        sb.append(", isValidated=");
        sb.append(this.f17226b);
        sb.append(", isMetered=");
        sb.append(this.f17227c);
        sb.append(", isNotRoaming=");
        return F91.m2540w(sb, this.f17228d, ')');
    }
}
