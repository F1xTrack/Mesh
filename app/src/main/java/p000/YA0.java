package p000;

/* loaded from: classes2.dex */
public final class YA0 {

    /* renamed from: a */
    public final String f14186a;

    /* renamed from: b */
    public final int f14187b;

    /* renamed from: c */
    public final int f14188c;

    /* renamed from: d */
    public final EnumC8038Ny0 f14189d;

    /* renamed from: e */
    public final boolean f14190e;

    public YA0(String str, int i, int i2, EnumC8038Ny0 enumC8038Ny0, boolean z) {
        this.f14186a = str;
        this.f14187b = i;
        this.f14188c = i2;
        this.f14189d = enumC8038Ny0;
        this.f14190e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YA0)) {
            return false;
        }
        YA0 ya0 = (YA0) obj;
        return O90.m5963a(this.f14186a, ya0.f14186a) && this.f14187b == ya0.f14187b && this.f14188c == ya0.f14188c && this.f14189d == ya0.f14189d && this.f14190e == ya0.f14190e;
    }

    public final int hashCode() {
        return ((this.f14189d.hashCode() + (((((this.f14186a.hashCode() * 31) + this.f14187b) * 31) + this.f14188c) * 31)) * 31) + (this.f14190e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Photo(path=");
        sb.append(this.f14186a);
        sb.append(", width=");
        sb.append(this.f14187b);
        sb.append(", height=");
        sb.append(this.f14188c);
        sb.append(", orientation=");
        sb.append(this.f14189d);
        sb.append(", isMirrored=");
        return AbstractC7222ym.m26236m(sb, this.f14190e, ")");
    }
}
