package defpackage;

/* renamed from: On, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1150On {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public C1150On(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1150On)) {
            return false;
        }
        C1150On c1150On = (C1150On) obj;
        return this.a == c1150On.a && this.b == c1150On.b && this.c == c1150On.c && this.d == c1150On.d && this.e == c1150On.e && this.f == c1150On.f;
    }

    public final int hashCode() {
        return ((((((((((this.a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        return "Difference(deviceChanged=" + this.a + ", outputsChanged=" + this.b + ", sidePropsChanged=" + this.c + ", isActiveChanged=" + this.d + ", orientationChanged=" + this.e + ", locationChanged=" + this.f + ")";
    }
}
