package defpackage;

/* renamed from: bv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2415bv0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public C2415bv0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2415bv0)) {
            return false;
        }
        C2415bv0 c2415bv0 = (C2415bv0) obj;
        return this.a == c2415bv0.a && this.b == c2415bv0.b && this.c == c2415bv0.c && this.d == c2415bv0.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z = this.a;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = i * 31;
        boolean z2 = this.b;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.c;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.d;
        return i6 + (z4 ? 1 : z4 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkState(isConnected=");
        sb.append(this.a);
        sb.append(", isValidated=");
        sb.append(this.b);
        sb.append(", isMetered=");
        sb.append(this.c);
        sb.append(", isNotRoaming=");
        return F91.w(sb, this.d, ')');
    }
}
