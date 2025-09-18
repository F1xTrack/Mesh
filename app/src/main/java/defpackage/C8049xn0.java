package defpackage;

/* renamed from: xn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8049xn0 {
    public final C7295tq a;
    public final String b;
    public final int c;
    public final boolean d;

    public C8049xn0(C7295tq c7295tq, String str, int i, boolean z) {
        O90.g(str, "extractedValue");
        this.a = c7295tq;
        this.b = str;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8049xn0)) {
            return false;
        }
        C8049xn0 c8049xn0 = (C8049xn0) obj;
        return O90.a(this.a, c8049xn0.a) && O90.a(this.b, c8049xn0.b) && this.c == c8049xn0.c && this.d == c8049xn0.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        C7295tq c7295tq = this.a;
        int iHashCode = (c7295tq != null ? c7295tq.hashCode() : 0) * 31;
        String str = this.b;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.c) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(formattedText=");
        sb.append(this.a);
        sb.append(", extractedValue=");
        sb.append(this.b);
        sb.append(", affinity=");
        sb.append(this.c);
        sb.append(", complete=");
        return AbstractC8235ym.m(sb, this.d, ")");
    }
}
