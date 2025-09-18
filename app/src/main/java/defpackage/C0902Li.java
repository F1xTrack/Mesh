package defpackage;

/* renamed from: Li, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0902Li {
    public C7463ui0 a;
    public C7463ui0 b;
    public C7463ui0 c;
    public C7463ui0 d;
    public C7463ui0 e;
    public C7463ui0 f;
    public C7463ui0 g;
    public C7463ui0 h;
    public C7463ui0 i;
    public C7463ui0 j;
    public C7463ui0 k;
    public C7463ui0 l;
    public C7463ui0 m;

    public final void a(EnumC0824Ki enumC0824Ki, C7463ui0 c7463ui0) {
        O90.f(enumC0824Ki, "property");
        switch (enumC0824Ki.ordinal()) {
            case 0:
                this.a = c7463ui0;
                break;
            case 1:
                this.b = c7463ui0;
                break;
            case 2:
                this.c = c7463ui0;
                break;
            case 3:
                this.e = c7463ui0;
                break;
            case 4:
                this.d = c7463ui0;
                break;
            case 5:
                this.f = c7463ui0;
                break;
            case 6:
                this.g = c7463ui0;
                break;
            case 7:
                this.h = c7463ui0;
                break;
            case 8:
                this.i = c7463ui0;
                break;
            case 9:
                this.m = c7463ui0;
                break;
            case 10:
                this.l = c7463ui0;
                break;
            case 11:
                this.k = c7463ui0;
                break;
            case 12:
                this.j = c7463ui0;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0902Li)) {
            return false;
        }
        C0902Li c0902Li = (C0902Li) obj;
        return O90.a(this.a, c0902Li.a) && O90.a(this.b, c0902Li.b) && O90.a(this.c, c0902Li.c) && O90.a(this.d, c0902Li.d) && O90.a(this.e, c0902Li.e) && O90.a(this.f, c0902Li.f) && O90.a(this.g, c0902Li.g) && O90.a(this.h, c0902Li.h) && O90.a(this.i, c0902Li.i) && O90.a(this.j, c0902Li.j) && O90.a(this.k, c0902Li.k) && O90.a(this.l, c0902Li.l) && O90.a(this.m, c0902Li.m);
    }

    public final int hashCode() {
        C7463ui0 c7463ui0 = this.a;
        int iHashCode = (c7463ui0 == null ? 0 : c7463ui0.hashCode()) * 31;
        C7463ui0 c7463ui02 = this.b;
        int iHashCode2 = (iHashCode + (c7463ui02 == null ? 0 : c7463ui02.hashCode())) * 31;
        C7463ui0 c7463ui03 = this.c;
        int iHashCode3 = (iHashCode2 + (c7463ui03 == null ? 0 : c7463ui03.hashCode())) * 31;
        C7463ui0 c7463ui04 = this.d;
        int iHashCode4 = (iHashCode3 + (c7463ui04 == null ? 0 : c7463ui04.hashCode())) * 31;
        C7463ui0 c7463ui05 = this.e;
        int iHashCode5 = (iHashCode4 + (c7463ui05 == null ? 0 : c7463ui05.hashCode())) * 31;
        C7463ui0 c7463ui06 = this.f;
        int iHashCode6 = (iHashCode5 + (c7463ui06 == null ? 0 : c7463ui06.hashCode())) * 31;
        C7463ui0 c7463ui07 = this.g;
        int iHashCode7 = (iHashCode6 + (c7463ui07 == null ? 0 : c7463ui07.hashCode())) * 31;
        C7463ui0 c7463ui08 = this.h;
        int iHashCode8 = (iHashCode7 + (c7463ui08 == null ? 0 : c7463ui08.hashCode())) * 31;
        C7463ui0 c7463ui09 = this.i;
        int iHashCode9 = (iHashCode8 + (c7463ui09 == null ? 0 : c7463ui09.hashCode())) * 31;
        C7463ui0 c7463ui010 = this.j;
        int iHashCode10 = (iHashCode9 + (c7463ui010 == null ? 0 : c7463ui010.hashCode())) * 31;
        C7463ui0 c7463ui011 = this.k;
        int iHashCode11 = (iHashCode10 + (c7463ui011 == null ? 0 : c7463ui011.hashCode())) * 31;
        C7463ui0 c7463ui012 = this.l;
        int iHashCode12 = (iHashCode11 + (c7463ui012 == null ? 0 : c7463ui012.hashCode())) * 31;
        C7463ui0 c7463ui013 = this.m;
        return iHashCode12 + (c7463ui013 != null ? c7463ui013.hashCode() : 0);
    }

    public final String toString() {
        return "BorderRadiusStyle(uniform=" + this.a + ", topLeft=" + this.b + ", topRight=" + this.c + ", bottomLeft=" + this.d + ", bottomRight=" + this.e + ", topStart=" + this.f + ", topEnd=" + this.g + ", bottomStart=" + this.h + ", bottomEnd=" + this.i + ", startStart=" + this.j + ", startEnd=" + this.k + ", endStart=" + this.l + ", endEnd=" + this.m + ")";
    }
}
