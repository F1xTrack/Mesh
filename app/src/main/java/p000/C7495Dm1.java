package p000;

/* renamed from: Dm1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7495Dm1 {

    /* renamed from: a */
    public final boolean f2236a;

    /* renamed from: b */
    public final Integer f2237b;

    /* renamed from: c */
    public final boolean f2238c;

    /* renamed from: d */
    public final Integer f2239d;

    /* renamed from: e */
    public final boolean f2240e;

    /* renamed from: f */
    public final boolean f2241f;

    public C7495Dm1(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.f2236a = z;
        this.f2237b = num;
        this.f2238c = z2;
        this.f2239d = num2;
        this.f2240e = z3;
        this.f2241f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7495Dm1)) {
            return false;
        }
        C7495Dm1 c7495Dm1 = (C7495Dm1) obj;
        return this.f2236a == c7495Dm1.f2236a && O90.m5963a(this.f2237b, c7495Dm1.f2237b) && this.f2238c == c7495Dm1.f2238c && O90.m5963a(this.f2239d, c7495Dm1.f2239d) && this.f2240e == c7495Dm1.f2240e && this.f2241f == c7495Dm1.f2241f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z = this.f2236a;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = i * 31;
        Integer num = this.f2237b;
        int iHashCode = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z2 = this.f2238c;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (iHashCode + i3) * 31;
        Integer num2 = this.f2239d;
        int iHashCode2 = (i4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z3 = this.f2240e;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (iHashCode2 + i5) * 31;
        boolean z4 = this.f2241f;
        return i6 + (z4 ? 1 : z4 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb.append(this.f2236a);
        sb.append(", clientMaxWindowBits=");
        sb.append(this.f2237b);
        sb.append(", clientNoContextTakeover=");
        sb.append(this.f2238c);
        sb.append(", serverMaxWindowBits=");
        sb.append(this.f2239d);
        sb.append(", serverNoContextTakeover=");
        sb.append(this.f2240e);
        sb.append(", unknownValues=");
        return F91.m2540w(sb, this.f2241f, ')');
    }
}
