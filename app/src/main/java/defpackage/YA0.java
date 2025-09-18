package defpackage;

/* loaded from: classes2.dex */
public final class YA0 {
    public final String a;
    public final int b;
    public final int c;
    public final EnumC1106Ny0 d;
    public final boolean e;

    public YA0(String str, int i, int i2, EnumC1106Ny0 enumC1106Ny0, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = enumC1106Ny0;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YA0)) {
            return false;
        }
        YA0 ya0 = (YA0) obj;
        return O90.a(this.a, ya0.a) && this.b == ya0.b && this.c == ya0.c && this.d == ya0.d && this.e == ya0.e;
    }

    public final int hashCode() {
        return ((this.d.hashCode() + (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31)) * 31) + (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Photo(path=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", orientation=");
        sb.append(this.d);
        sb.append(", isMirrored=");
        return AbstractC8235ym.m(sb, this.e, ")");
    }
}
