package defpackage;

/* renamed from: Dm1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0292Dm1 {
    public final boolean a;
    public final Integer b;
    public final boolean c;
    public final Integer d;
    public final boolean e;
    public final boolean f;

    public C0292Dm1(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.a = z;
        this.b = num;
        this.c = z2;
        this.d = num2;
        this.e = z3;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0292Dm1)) {
            return false;
        }
        C0292Dm1 c0292Dm1 = (C0292Dm1) obj;
        return this.a == c0292Dm1.a && O90.a(this.b, c0292Dm1.b) && this.c == c0292Dm1.c && O90.a(this.d, c0292Dm1.d) && this.e == c0292Dm1.e && this.f == c0292Dm1.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z = this.a;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = i * 31;
        Integer num = this.b;
        int iHashCode = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z2 = this.c;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (iHashCode + i3) * 31;
        Integer num2 = this.d;
        int iHashCode2 = (i4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z3 = this.e;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (iHashCode2 + i5) * 31;
        boolean z4 = this.f;
        return i6 + (z4 ? 1 : z4 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb.append(this.a);
        sb.append(", clientMaxWindowBits=");
        sb.append(this.b);
        sb.append(", clientNoContextTakeover=");
        sb.append(this.c);
        sb.append(", serverMaxWindowBits=");
        sb.append(this.d);
        sb.append(", serverNoContextTakeover=");
        sb.append(this.e);
        sb.append(", unknownValues=");
        return F91.w(sb, this.f, ')');
    }
}
